(ns algosclj.fizzbuzz-test
  (:require [clojure.test :refer [deftest is]]
            [algosclj.fizzbuzz :refer [build-fizzbuzz]]))

(deftest twosum-test
  (is (= (build-fizzbuzz 5) '[1 2 "Fizz" 4 "Buzz"])))