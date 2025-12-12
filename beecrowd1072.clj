(let [n (Integer/parseInt (read-line))
      values (map #(Integer/parseInt %) (repeatedly n read-line))]
  (println (count (filter #(<= 10 % 20) values)) "in")
  (println (count (filter #(not (<= 10 % 20)) values)) "out"))