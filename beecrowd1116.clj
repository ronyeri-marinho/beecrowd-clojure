(require '[clojure.string :as str])

(let [n (Integer/parseInt (read-line))]
  (loop [i n]
    (when (pos? i)
      (let [[x y] (map #(Double/parseDouble %) (str/split (read-line) #"\s+"))]
        (try
          (println (/ x y))
          (catch ArithmeticException e
            (println "divisao impossivel"))))
      (recur (dec i)))))