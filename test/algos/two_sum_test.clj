(ns algos.two-sum-test
  (:require [clojure.test :as t :refer [deftest is]]
            [algos.two-sum :refer [two-sum]]))

(deftest two-sum-test
  (is (= (sort < (two-sum '[1 2 3] 4)) '[0 2]))
  (is (= (sort < (two-sum '[1234 5678 9012] 14690)) '[1 2]))
  (is (= (sort < (two-sum '[2 2 3] 4)) '[0 1]))
  (is (= (sort < (two-sum '[2 1] 3)) '[0 1]))
  (is (= (sort < (two-sum '[777 854 478 855 955 129 168 525 195 6 951 261 34 828 286 543 18 780] 1116)) '[3 11])))