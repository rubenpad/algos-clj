(ns algos.rotate-collection)

;; Given a collection, rotate it to the right by n steps, where steps is not negative

(defn rotate-collection [coll steps]
  (let [len (count coll) n-first (mod steps len) n-last (- len n-first)]
    (as-> coll v
      (reverse v)
      (concat (reverse (take n-first v)) (reverse (take-last n-last v))))))