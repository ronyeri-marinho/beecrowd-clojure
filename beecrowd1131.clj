(require '[clojure.string :as str])

(defn ^:private execute-again?
  []
  (println "Novo grenal (1-sim 2-nao)")
  (let [new-grenal (Integer/parseInt (read-line))]
    (= new-grenal 1)))

(defn ^:private process-score [inter gremio stats]
  (cond-> (update stats :grenais inc)
    (= inter gremio) (update :draws inc)
    (> inter gremio) (update :inter-wins inc)
    (> gremio inter) (update :gremio-wins inc)))

(defn ^:private who-win-more
  [inter-wins gremio-wins]
  (cond
    (> inter-wins gremio-wins) "Inter venceu mais"
    (> gremio-wins inter-wins) "Gremio venceu mais"
    :else "Nao houve vencedor"))

(defn ^:private process
  []
  (loop [again? true
         stats {:grenais 0
                :inter-wins 0
                :gremio-wins 0
                :draws 0}]
    (if again?
      (let [[inter-score gremio-score] (map #(Integer/parseInt %) (str/split (read-line) #"\s+"))
            stats-with-score (process-score inter-score gremio-score stats)]
        (recur (execute-again?) stats-with-score))
      stats)))

(let [final-stats (process)
      {:keys [grenais inter-wins gremio-wins draws]} final-stats]
  (println grenais "grenais")
  (println (str "Inter:" inter-wins))
  (println (str "Gremio:" gremio-wins))
  (println (str "Empates:" draws))
  (println (who-win-more inter-wins gremio-wins)))