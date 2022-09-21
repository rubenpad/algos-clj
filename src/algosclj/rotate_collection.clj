(ns algosclj.rotate-collection)

(defn rotate-collection [coll steps]
  (let [len (count coll) k (mod steps len)]
    (as-> coll v
      (into '() v)
      (concat (into '() (take k v)) (into '() (take-last (- len k) v))))))