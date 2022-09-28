(ns algos.fizz-buzz-test
  (:require [clojure.test :refer [deftest is]]
            [algos.fizz-buzz :refer [build-fizzbuzz]]))

(deftest fizz-buzz-test
  (is (= (build-fizzbuzz 5) '[1 2 "Fizz" 4 "Buzz"])))