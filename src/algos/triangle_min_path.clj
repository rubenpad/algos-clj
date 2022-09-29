(ns algos.triangle-min-path)

;; From https://4clojure.oxal.org/#/problem/79
;; Write a function which calculates the sum of
;; the minimal path through a triangle. The triangle
;; is represented as a vector of vectors. The path
;; should start at the top of the triangle
;; and move to an adjacent number on the next row
;; until the bottom of the triangle is reached.

(defn triangle-min-path [triangle]
  (first (let [len (count triangle)]
    (loop [triangle triangle
           current-idx (- len 2)
           result (get triangle (- len 1))]
      (if (< current-idx 0)
        result
        (let [current-coll (get triangle current-idx)]
          (recur triangle
                 (- current-idx 1)
                 (vec (for [idx (range (count current-coll))
                            :let [current-val (get current-coll idx)]]
                        (min (+ current-val (get result idx)) (+ current-val (get result (+ idx 1)))))))))))))
