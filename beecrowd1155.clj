(let [s (reduce + (map #(/ 1 %) (range 1 101)))]
  (println (format "%.2f" (double s))))