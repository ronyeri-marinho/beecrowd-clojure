(require '[clojure.string :as str])

(loop []
  (let [[x y] (map #(Integer/parseInt %) (str/split (read-line) #"\s+"))]
    (when (and (not (= x 0)) (not (= y 0)))
      (cond
        (and (pos-int? x) (neg-int? y)) (println "quarto")
        (and (pos-int? x) (pos-int? y)) (println "primeiro")
        (and (neg-int? x) (neg-int? y)) (println "terceiro")
        (and (neg-int? x) (pos-int? y)) (println "segundo"))
      (recur))))