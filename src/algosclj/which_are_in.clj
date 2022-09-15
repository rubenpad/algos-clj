(ns algosclj.which-are-in
  (:require [clojure.string :as string]))

;; Given two arrays of strings v1 and v2
;; return a sorted array r in lexicographical
;; order of the strings of v1 which are substrings of strings of v2
(defn in-array [v1 v2]
  (sort (dedupe (for [x1 v1 x2 v2 :when (string/includes? x2 x1)] x1))))