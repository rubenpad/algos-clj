(ns algosclj.line-numbers)

;; Given a collection of code lines, add
;; the corresponding line number starting at 1

(defn line-numbers [lines]
  (map #(str (inc %1) ": " %2) (range (count lines)) lines))