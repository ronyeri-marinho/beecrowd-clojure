(defn ^:private factorial [n]
  (reduce * (range 1 (inc n))))

(println (factorial (Integer/parseInt (read-line))))
