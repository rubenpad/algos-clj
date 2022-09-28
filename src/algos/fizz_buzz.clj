(ns algos.fizz-buzz)

(defn divisible-by? [divisor number]
  (zero? (mod number divisor)))

(defn fizzbuzz [n]
  (cond-> nil
    (divisible-by? 3 n) (str "Fizz")
    (divisible-by? 5 n) (str "Buzz")
    :always (or n)))

(defn build-fizzbuzz [n]
  (for [x (range n)] (fizzbuzz (inc x))))

