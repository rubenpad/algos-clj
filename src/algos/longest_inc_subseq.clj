(ns algos.longest-inc-subseq)

;; From https://4clojure.oxal.org/#/problem/53
;; Given a vector of integers, find the longest
;; consecutive sub-sequence of increasing numbers.
;; If two sub-sequences have the same length,
;; use the one that occurs first. An increasing
;; sub-sequence must have a length of 2 or greater to qualify.

(defn longest-inc-subseq [coll]
  (:max (reduce (fn [final v]
                  (let [cmax (:max final)
                        xs (:ssq final)
                        lxs (last xs)]
                    (if (or (empty? xs) (not= 1 (- v (last lxs))))
                      (assoc final :ssq (conj xs [v]))
                    (let [xs-idx (- (count xs) 1) n-lxs (conj lxs v)]
                      (assoc
                        final
                        :ssq (assoc xs xs-idx n-lxs)
                        :max (if (> (count cmax) (count n-lxs)) cmax n-lxs))))))
                {:max [] :ssq []}
                coll)))

