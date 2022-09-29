(ns algos.sorted-squares)

;; Given a sorted collection return a
;; sorted collection of its squares

(defn sorted-squares [sorted-coll]
  (sort (map #(* % %) sorted-coll)))
