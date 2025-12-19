(defn read-z [x]
  (first (drop-while #(<= % x)
                     (repeatedly #(Integer/parseInt (read-line))))))

(let [x (Integer/parseInt (read-line))
      z (read-z x)]
  (loop [sum 0 n x count 0]
    (if (< sum z)
      (recur (+ sum n) (inc n) (inc count))
      (println count))))