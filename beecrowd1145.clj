(require '[clojure.string :as str])

(let [[x y] (map #(Integer/parseInt %) (str/split (read-line) #"\s+"))]
  (doseq [chunk (partition x (range 1 (inc y)))]
    (println (str/join " " chunk))))