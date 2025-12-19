(let [n (Integer/parseInt (read-line))]
  (loop [value 1 limit n]
    (when (not (zero? limit))
      (println value (inc value) (+ value 2) "PUM")
      (recur (+ value 4) (dec limit)))))