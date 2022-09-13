(ns algosclj.twosum-test
  (:require [clojure.test :as t :refer [deftest is]]
            [algosclj.twosum :refer [twosum]]))

(deftest twosum-test
  (is (= (sort < (twosum '[1 2 3] 4)) '[0 2]))
  (is (= (sort < (twosum '[1234 5678 9012] 14690)) '[1 2]))
  (is (= (sort < (twosum '[2 2 3] 4)) '[0 1]))
  (is (= (sort < (twosum '[2 1] 3)) '[0 1]))
  (is (= (sort < (twosum '[777 854 478 855 955 129 168 525 195 6 951 261 34 828 286 543 18 780] 1116)) '[3 11])))