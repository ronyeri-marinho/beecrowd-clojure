(let [value (Integer/parseInt (read-line))]
  (doseq [n (range 1 (inc value))
          :when (odd? n)]
    (println n)))