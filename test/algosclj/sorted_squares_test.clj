(ns algosclj.sorted-squares-test
  (:require [clojure.test :refer [deftest is]]
            [algosclj.sorted-squares :refer [sorted-squares]]))

(deftest sorted-squares-test
  (is (= (sorted-squares '[-5 -4 -3 -2 -1]) '[1 4 9 16 25]))
  (is (= (sorted-squares '[-4 -1 0 3 10]) '[0 1 9 16 100])))