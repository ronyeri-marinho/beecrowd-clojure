(defn ^:private collect-input
  []
  (Integer/parseInt (read-line)))

(defn ^:private is-input-invalid?
  [input]
  (not (#{1 2 3 4} input)))

(defn ^:private continue?
  [input]
  (not (= input 4)))

(defn ^:private update-stats
  [input stats]
  (cond
    (= input 1) (update stats :alcohol inc)
    (= input 2) (update stats :gasoline inc)
    (= input 3) (update stats :diesel inc)
    :else stats))

(defn ^:private process
  []
  (loop [again? true
         stats {:alcohol 0
                :gasoline 0
                :diesel 0}]
    (if again?
      (let [input (collect-input)]
        (if (is-input-invalid? input)
          (recur (continue? input) stats)
          (recur (continue? input) (update-stats input stats))))
      stats)))

(let [stats (process)
      {:keys [alcohol gasoline diesel]} stats]
  (println "MUITO OBRIGADO")
  (println "Alcool:" alcohol)
  (println "Gasolina:" gasoline)
  (println "Diesel:" diesel))