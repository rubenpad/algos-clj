(ns algos.line-numbers-test
  (:require [clojure.test :refer [deftest is testing]]
            [algos.line-numbers :refer [line-numbers]]))

(defn tester [lines exp]
  (testing (str "Testing for " lines)
    (is (= (line-numbers lines) exp))))
(deftest basic-tests
  (tester [] [])
  (tester ["a" "b" "c"] ["1: a" "2: b" "3: c"])
  (tester ["" "" "" "" ""] ["1: " "2: " "3: " "4: " "5: "]))