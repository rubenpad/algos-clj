(ns algos.word-chains-test
  (:require [clojure.test :refer [deftest is]]
            [algos.word-chains :refer [word-chains]]))

(deftest word-chains-test
  (is (= (word-chains #{"cot" "hot" "bat" "fat"}) false))
  (is (= (word-chains #{"share" "hares" "hare" "are"}) false))
  (is (= (word-chains #{"to" "top" "stop" "tops" "toss"}) false))
  (is (= (word-chains #{"share" "hares" "shares" "hare" "are"}) true))
  (is (= (word-chains #{"spout" "do" "pot" "pout" "spot" "dot"}) true))
  (is (= (word-chains #{"hat" "coat" "dog" "cat" "oat" "cot" "hot" "hog"}) true)))
