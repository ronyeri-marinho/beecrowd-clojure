(require '[clojure.string :as str])

(def BASE_MINUTES 60)

(defn ^:private hours-to-minutes
  [hours]
  (* hours BASE_MINUTES))

(defn ^:private calculate-hours
  [start-time-in-minutes end-time-in-minutes]
  (let [day (* 24 60)]
    (cond
      (> end-time-in-minutes start-time-in-minutes) (- end-time-in-minutes start-time-in-minutes)
      (> start-time-in-minutes end-time-in-minutes) (+ (- day start-time-in-minutes) end-time-in-minutes)
      :else day)))

(defn ^:private calculate-minutes
  [hours]
  (mod hours BASE_MINUTES))

(let [[start-hours start-minutes end-hours end-minutes] (map #(Integer/parseInt %) (str/split (read-line) #"\s+"))
      start-time-in-minutes (+ (hours-to-minutes start-hours) start-minutes)
      end-time-in-minutes (+ (hours-to-minutes end-hours) end-minutes)
      hours-as-minutes (calculate-hours start-time-in-minutes end-time-in-minutes)
      hours (quot hours-as-minutes BASE_MINUTES)
      minutes (calculate-minutes hours-as-minutes)]
  (println "O JOGO DUROU" hours "HORA(S) E" minutes "MINUTO(S)"))