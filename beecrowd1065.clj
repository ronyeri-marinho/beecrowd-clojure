(let [even-values (count (filter even? (map #(Integer/parseInt %) (repeatedly 5 read-line))))]
  (println even-values "valores pares"))