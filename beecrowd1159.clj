(defn ^:private even-from
  "Iterates over all even numbers and ensures that the value of n is even before starting."
  [n]
  (iterate #(+ % 2)
           (if (even? n) n (inc n))))

(loop []
  (let [x (Integer/parseInt (read-line))]
    (when (not (= x 0))
      (println (reduce + (take 5 (even-from x))))
      (recur))))