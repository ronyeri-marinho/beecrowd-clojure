(defn ^:private is-even?
  [value]
  (if (even? value) "EVEN" "ODD"))

(defn ^:private is-positive?
  [value]
  (if (pos? value) "POSITIVE" "NEGATIVE"))

(let [n (Integer/parseInt (read-line))
      values (doall (map #(Integer/parseInt %) (repeatedly n read-line)))]
  (doseq [i values]
    (if (= 0 i)
      (println "NULL")
      (println (is-even? i) (is-positive? i)))))