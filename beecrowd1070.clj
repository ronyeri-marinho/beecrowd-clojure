(let [value (Integer/parseInt (read-line))]
  (doseq [n (take 6 (filter odd? (iterate inc value)))]
    (println n)))