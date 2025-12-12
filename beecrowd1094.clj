(require '[clojure.string :as str])

(defn ^:private transform-data
  "Transforms raw data into a collection of integers and keywords"
  [entries]
  (map (fn [[amount type]] [(Integer/parseInt amount) (keyword type)])
       entries))

(defn ^:private summarize-data
  "Sums the samples of the same keyword and returns them as a map"
  [data]
  (reduce (fn [acc [amount type]]
            (update acc type + amount))
          {:C 0 :R 0 :S 0}
          data))

(defn ^:private calculate-percentage
  [total total-of-x-animal]
  (* (/ total-of-x-animal total) 100.0))

(let [n (Integer/parseInt (read-line))
      entries (repeatedly n #(str/split (read-line) #"\s+"))
      data (transform-data entries)
      result (summarize-data data)
      total (reduce + (vals result))
      total-of-rabbits (get result :C)
      total-of-rats (get result :R)
      total-of-frogs (get result :S)]
  (println "Total:" total "cobaias")
  (println "Total de coelhos:" total-of-rabbits)
  (println "Total de ratos:" total-of-rats)
  (println "Total de sapos:" total-of-frogs)
  (println (format "Percentual de coelhos: %.2f %%" (calculate-percentage total total-of-rabbits)))
  (println (format "Percentual de ratos: %.2f %%" (calculate-percentage total total-of-rats)))
  (println (format "Percentual de sapos: %.2f %%" (calculate-percentage total total-of-frogs))))