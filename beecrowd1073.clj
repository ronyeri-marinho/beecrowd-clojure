(let [n (Integer/parseInt (read-line))]
  (doseq [i (range 1 (inc n))
          :when (even? i)]
    (println (str i "^2 = " (* i i)))))