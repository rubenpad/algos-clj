(ns algos.triangle-min-path)

(defn triangle-min-path [triangle]
  (first (let [len (count triangle)]
    (loop [triangle triangle
           current-idx (- len 2)
           result (get triangle (- len 1))]
      (if (< current-idx 0)
        result
        (let [current-coll (get triangle current-idx)]
          (recur triangle
                 (- current-idx 1)
                 (vec (for [idx (range (count current-coll))
                            :let [current-val (get current-coll idx)]]
                        (min (+ current-val (get result idx)) (+ current-val (get result (+ idx 1)))))))))))))
