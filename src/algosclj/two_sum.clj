(ns algosclj.two-sum)

(defn two-sum [nums target]
  (first (for [x (range (count nums))
               y (range (count nums))
               :when (< x y)
               :when (= (+ (get nums x) (get nums y)) target)]
           [x y])))