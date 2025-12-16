(let [[x y] (map #(Integer/parseInt %) (repeatedly 2 read-line))
      start (min x y)
      end (max x y)]
  (println (reduce + (filter #(not (zero? (mod % 13))) (range start (inc end))))))