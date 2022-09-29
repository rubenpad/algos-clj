(ns algos.longest-increasing-subseq-test
  (:require [clojure.test :refer [deftest is]]
            [algos.longest-inc-subseq :refer [longest-inc-subseq]]))

(deftest longest-inc-subseq-test
  (is (= (longest-inc-subseq [1 0 1 2 3 0 4 5]) [0 1 2 3]))
  (is (= (longest-inc-subseq [5 6 1 3 2 7]) [5 6]))
  (is (= (longest-inc-subseq [2 3 3 4 5]) [3 4 5]))
  (is (= (longest-inc-subseq [7 6 5 4]) [])))
