(ns algosclj.rotate-collection)

(defn rotate-collection [coll steps]
  (let [len (count coll) k (mod steps len)]
    (as-> coll v
      (rseq v)
      (rseq (subvec v 0 k))
      (rseq (subvec v k len)))))