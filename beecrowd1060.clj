(let [values (map #(Double/parseDouble %) (repeatedly 6 read-line))]
  (println (count (filter pos? values)) "valores positivos"))