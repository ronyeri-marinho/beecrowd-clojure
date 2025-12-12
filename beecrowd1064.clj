(let [values (filter pos? (map #(Double/parseDouble %) (repeatedly 6 read-line)))]
  (println (count values) "valores positivos")
  (println (format "%.1f" (/ (reduce + values) (count values)))))