(ns algosclj.smallest-not-possible-sum)

;; Given a collection of positive numbers,
;; find the smallest positive integer value
;; that cannot be represented as the sum of
;; elements of any subset of a given set.

(defn smallest-not-possible-sum [coll]
  (let [sorted-coll (sort coll)]
    (loop [xs sorted-coll result 1]
      (if (or (empty? xs) (> (first xs) result))
        result
        (let [[head & tail] xs]
          (recur tail (+ head result)))))))