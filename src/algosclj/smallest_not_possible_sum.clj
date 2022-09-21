(ns algosclj.smallest-not-possible-sum)

(defn smallest-not-possible-sum [v]
  (let [sorted-v (sort v)]
    (loop [xs sorted-v result 1]
      (if (or (empty? xs) (> (first xs) result))
        result
        (let [[head & tail] xs]
          (recur tail (+ head result)))))))