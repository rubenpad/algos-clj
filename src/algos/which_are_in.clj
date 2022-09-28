(ns algos.which-are-in
  (:require [clojure.string :as string]))

;; Given two collections of strings coll1 and coll2
;; return a sorted collection in lexicographical
;; order of the strings of coll1 which are substrings of strings of coll2

(defn in-array [coll1 coll2]
  (sort (dedupe (for [x1 coll1 x2 coll2 :when (string/includes? x2 x1)] x1))))