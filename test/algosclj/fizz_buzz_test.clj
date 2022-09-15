(ns algosclj.fizz-buzz-test
  (:require [clojure.test :refer [deftest is]]
            [algosclj.fizz-buzz :refer [build-fizzbuzz]]))

(deftest twosum-test
  (is (= (build-fizzbuzz 5) '[1 2 "Fizz" 4 "Buzz"])))