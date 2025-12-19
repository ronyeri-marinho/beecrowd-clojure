(require '[clojure.string :as str])

(let [values (map #(Integer/parseInt %)
                  (str/split (read-line) #"\s+"))
      a (first values)
      n (first (filter pos? (rest values)))]
  (println (reduce + (range a (+ a n)))))