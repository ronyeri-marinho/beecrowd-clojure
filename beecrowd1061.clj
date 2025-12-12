(require '[clojure.string :as str])

(defn parse-day [s]
  (Integer/parseInt (second (str/split s #"\s+"))))

(defn parse-time [s]
  (mapv #(Integer/parseInt %) (str/split s #"\s+:?\s*")))

(defn to-seconds [[day hour minute second]]
  (+ second (* minute 60) (* hour 3600) (* day 86400)))

(defn split-duration [total-seconds]
  (let [days (quot total-seconds 86400)
        r1 (mod  total-seconds 86400)
        hours (quot r1 3600)
        r2 (mod  r1 3600)
        minutes (quot r2 60)
        seconds (mod  r2 60)]
    {:days days :hours hours :minutes minutes :seconds seconds}))

(let [start-day  (parse-day (read-line))
      start-time (parse-time (read-line))
      end-day    (parse-day (read-line))
      end-time   (parse-time (read-line))

      start-seconds (to-seconds (cons start-day start-time))
      end-seconds   (to-seconds (cons end-day   end-time))
      duration       (split-duration (- end-seconds start-seconds))]

  (println (:days duration)    "dia(s)")
  (println (:hours duration)   "hora(s)")
  (println (:minutes duration) "minuto(s)")
  (println (:seconds duration) "segundo(s)"))