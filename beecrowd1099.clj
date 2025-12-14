(require '[clojure.string :as str])

(defn ^:private process
  [values]
  (doseq [value values
          :let [[a b] (map #(Integer/parseInt %) (str/split value #"\s+"))
          x (min a b)
          y (max a b)
          result (reduce + (filter odd? (range (inc x) y)))]]
    (println result)))

(let [n (Integer/parseInt (read-line))
      values (doall (repeatedly n read-line))]
  (process values))