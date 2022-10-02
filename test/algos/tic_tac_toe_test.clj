(ns algos.tic-tac-toe-test
  (:require [clojure.test :refer [deftest is]]
            [algos.tic-tac-toe :refer [tic-tac-toe]]))

(deftest tic-tac-toe-test
  (is (= (tic-tac-toe [[:e :e :e] [:e :e :e] [:e :e :e]]) nil))
  (is (= (tic-tac-toe [[:x :e :o] [:x :e :e] [:x :e :o]]) :x))
  (is (= (tic-tac-toe [[:e :x :e] [:o :o :o] [:x :e :x]]) :o))
  (is (= (tic-tac-toe [[:x :e :o] [:x :x :e] [:o :x :o]]) nil))
  (is (= (tic-tac-toe [[:x :e :e] [:o :x :e] [:o :e :x]]) :x))
  (is (= (tic-tac-toe [[:x :e :o] [:x :o :e] [:o :e :x]]) :o))
  (is (= (tic-tac-toe [[:x :o :x] [:x :o :x] [:o :x :o]]) nil)))
