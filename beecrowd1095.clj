(loop [i 1 j 60]
  (when (>= j 0)
    (println (format "I=%d J=%d" i j))
    (recur (+ i 3) (- j 5))))