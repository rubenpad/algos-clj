(ns algos.sorted-squares)

(defn sorted-squares [sorted-coll]
  (sort (map #(* % %) sorted-coll)))