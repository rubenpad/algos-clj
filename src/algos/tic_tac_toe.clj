(ns algos.tic-tac-toe)

;; A tic-tac-toe board is represented by a two dimensional vector.
;; X is represented by :x, O is represented by :o, and empty is
;; represented by :e. A player wins by placing three Xs or three Os in a
;; horizontal, vertical, or diagonal row. Write a function which analyzes
;; a tic-tac-toe board and returns :x if X has won, :o if O has won, and nil if neither player has won.

(defn tic-tac-toe [colls]
  (letfn [(get-winner [colls]
            (ffirst (filter (fn [row]
                              (let [rset (set row)]
                                (and (= 1 (count rset)) (not= :e (first rset))))) colls)))
          (match-board [colls]
            (let [idx (range 3)]
              (for [x idx
                    y idx
                    z idx
                    :when (or (= x y z) (< x y z) (< z y x))]
                    (map get colls [x y z]))))]
    (or (get-winner colls) (get-winner (match-board colls)))))

