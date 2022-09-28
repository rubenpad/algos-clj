(ns algos.smallest-not-possible-sum-test
  (:require [clojure.test :as t :refer [deftest is]]
            [algos.smallest-not-possible-sum :refer [smallest-not-possible-sum]]))

(deftest smallest-not-possible-sum-test
  (is (= (smallest-not-possible-sum [1 1 3 4]) 10))
  (is (= (smallest-not-possible-sum [5 7 1 1 3 2 22]) 20))
  (is (= (smallest-not-possible-sum [1 1 1 1]) 5))
  (is (= (smallest-not-possible-sum [1 2 3 4 5 6]) 22)))