(let [values (doall (map #(Integer/parseInt %) (repeatedly 100 read-line)))
      max-value      (apply max values)
      idx    (inc (first (keep-indexed #(when (= %2 max-value) %1) values)))]
  (println max-value)
  (println idx))
