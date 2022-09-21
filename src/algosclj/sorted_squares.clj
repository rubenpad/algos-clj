(ns algosclj.sorted-squares)

(defn sorted-squares [sorted-v]
  (sort (map #(* % %) sorted-v)))