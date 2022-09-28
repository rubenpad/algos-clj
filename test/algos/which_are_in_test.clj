(ns algos.which-are-in-test
  (:require [clojure.test :refer [deftest testing is]]
            [algos.which-are-in :refer [in-array]]))

(deftest which-are-in-test
  (testing "Test 1"
    (let [ur ["olp" "love" "string"]
          vr ["ulove" "alove" "holp" "sholp" "vfmstring"]
          rr ["love" "olp" "string"]]
      (is (= (in-array ur vr) rr)))))
