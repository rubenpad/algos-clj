(ns algos.transitive-test
  (:require [clojure.test :refer [deftest is]]
            [algos.transitive :refer [divides]]))

(deftest transitive-test
  (is (= (divides #{[8 4] [9 3] [4 2] [27 9]}) #{[4 2] [8 4] [8 2] [9 3] [27 9] [27 3]}))
  (is (= (divides #{["cat" "man"] ["man" "snake"] ["spider" "cat"]}) #{["cat" "man"] ["cat" "snake"] ["man" "snake"]
                                                                       ["spider" "cat"] ["spider" "man"] ["spider" "snake"]}))
  (is (= (divides #{["father" "son"] ["uncle" "cousin"] ["son" "grandson"]}) #{["father" "son"] ["father" "grandson"]
                                                                               ["uncle" "cousin"] ["son" "grandson"]})))

