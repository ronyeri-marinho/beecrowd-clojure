(require '[clojure.string :as str])

(loop []
  (let [[a b] (map #(Integer/parseInt %) (str/split (read-line) #"\s+"))
        x (min a b)
        y (max a b)
        values (range x (inc y))]
    (when (and (pos? x) (pos? y))
      (println (str/join " " values) (str "Sum=" (reduce + values)))
      (recur))))