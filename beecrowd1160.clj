(require '[clojure.string :as str])
(defn next-year [[pa pb] g1 g2]
  [(+ pa (long (* pa g1)))
   (+ pb (long (* pb g2)))])

(defn years-to-surpass [pa pb g1 g2]
  (let [years (->> (iterate #(next-year % g1 g2) [pa pb])
                   (take 101)
                   (take-while (fn [[a b]] (<= a b)))
                   count)]
    (if (> years 100)
      "Mais de 1 seculo."
      (str years " anos."))))

(let [t (Integer/parseInt (read-line))]
  (dotimes [_ t]
    (let [[pa pb g1 g2] (str/split (read-line) #"\s+")
          pa (Long/parseLong pa)
          pb (Long/parseLong pb)
          g1 (/ (Double/parseDouble g1) 100.0)
          g2 (/ (Double/parseDouble g2) 100.0)]
      (println (years-to-surpass pa pb g1 g2)))))
