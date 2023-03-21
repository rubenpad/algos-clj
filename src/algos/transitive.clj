(ns algos.transitive
  (:require [clojure.set :as set]))

;; From https://4clojure.oxal.org/#/problem/84
;; Write a function which generates the transitive
;; closure of a binary relation. The relation will
;; be represented as a set of 2 item vectors.
;;
;; (let [divides #{[8 4] [9 3] [4 2] [27 9]}]
;;(= (__ divides) #{[4 2] [8 4] [8 2] [9 3] [27 9] [27 3]}))

(defn divides [relations]
  (loop [tuples relations]
    (let [final (set/union tuples (into #{} (for [a tuples
                                                  b tuples
                                                  :when (= (second a) (first b))]
                                              [(first a) (second b)])))]
      (if (= final tuples)
        final
        (recur final)))))
