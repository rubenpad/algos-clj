(ns algosclj.rotate-collection-test
  (:require [clojure.test :refer [deftest is]]
            [algosclj.rotate-collection :refer [rotate-collection]]))

(deftest rotate-collection-test
  (is (= (rotate-collection [1 2 3 4] 2) [3 4 1 2]))
  (is (= (rotate-collection [1 2 3 4 5 6 7] 3) [5 6 7 1 2 3 4])))