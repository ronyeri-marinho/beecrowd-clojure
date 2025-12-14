(require '[clojure.string :as str])

(loop []
  (let [[x y] (map #(Integer/parseInt %) (str/split (read-line) #"\s+"))]
    (when (not (= x y))
      (println (if (> x y) "Decrescente" "Crescente"))
      (recur))))