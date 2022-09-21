(ns algosclj.two-sum)

;; Given a collection of integers nums and an integer target,
;; return indices of the two numbers such that they add up to target.

(defn two-sum [nums target]
  (first (for [x (range (count nums))
               y (range (count nums))
               :when (< x y)
               :when (= (+ (get nums x) (get nums y)) target)]
           [x y])))