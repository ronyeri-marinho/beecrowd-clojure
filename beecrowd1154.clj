(defn ^:private read-ages
  []
  (loop [ages []]
    (let [age (Integer/parseInt (read-line))]
      (if (pos-int? age)
        (recur (conj ages age))
        ages))))

(let [ages (read-ages)]
  (println (format "%.2f" (/ (reduce + ages) (double (count ages))))))