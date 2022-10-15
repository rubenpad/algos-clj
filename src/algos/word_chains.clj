(ns algos.word-chains)

;; From https://4clojure.oxal.org/#/problem/82
;; A word chain consists of a set of words ordered so that
;; each word differs by only one letter from the words
;; directly before and after it. The one letter difference
;; can be either an insertion, a deletion, or a substitution.
;; Here is an example word chain:
;; cat -> cot -> coat -> oat -> hat -> hot -> hog -> dog
;; Write a function which takes a sequence of words,
;; and returns true if they can be arranged into one
;; continous word chain, and false if they cannot.

(defn count-diff [xw yw]
  (if (= (count xw) (count yw))
           (count (for [idx (range (count xw)) :when (not= (get xw idx) (get yw idx))] idx))
           (- (count yw) (count (filter #(clojure.string/includes? yw (str %)) xw)))))

(defn chainable? [xword yword]
  (let [[xw yw] (sort #(< (count %1) (count %2)) [xword yword])
        xlen (count xw)
        ylen (count yw)]
    (when (<= (- ylen xlen) 1) (= 1 (count-diff xw yw)))))

(defn findnodes [word words]
  (filter #(chainable? word %) words))

(defn build-wordnodes [word words]
  (let [filteredwords (disj words word) nodes (findnodes word filteredwords)]
    (map #(hash-map :word % :words (disj filteredwords %)) nodes)))

(defn word-chains [words]
  (loop [allwords words nodes '() chained false sentinel 0]
    (let [stop (or chained (= sentinel (count allwords)))]
     (if stop
       chained
       (if (empty? nodes)
        (let [word (first (drop sentinel allwords))
              nodes (build-wordnodes word allwords)]
          (recur allwords nodes chained (inc sentinel)))
        (let [{:keys [word words]} (first nodes)
              chained (empty? words)
              nodes (if chained '() (apply conj (next nodes) (build-wordnodes word words)))]
          (recur allwords nodes chained sentinel)))))))

