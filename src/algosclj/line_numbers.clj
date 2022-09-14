(ns algosclj.line-numbers)

(defn line-numbers [lines]
  (map #(str (inc %1) ": " %2) (range (count lines)) lines))