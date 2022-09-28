(ns algos.triangle-min-path-test
  (:require [clojure.test :refer [deftest is]]
            [algos.triangle-min-path :refer [triangle-min-path]]))

(deftest triangle-min-path-test
  (is (= (triangle-min-path [[1] [2 4] [5 1 4] [2 3 4 5]]) 7))
  (is (= (triangle-min-path [[3] [2 4] [1 9 3] [9 9 2 4] [4 6 6 7 8] [5 7 3 5 1 4]]) 20)))
