(require '[clojure.string :as str])

(defn ^:private average
  [a b c]
  (/ (+ (* 2 a) (* 3 b) (* 5 c)) 10.0))

(let [n (Integer/parseInt (read-line))
      values (doall (repeatedly n read-line))]
  (doseq [value values
          :let [[a b c] (map #(Double/parseDouble %) (str/split value #"\s+"))]]
    (println (format "%.1f" (average a b c)))))