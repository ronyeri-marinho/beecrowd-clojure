(defn ^:private collect-and-calc
  []
  (let [valid-notes
        (loop [notes []]
          (if (= 2 (count notes))
            notes
            (let [n (Double/parseDouble (read-line))]
              (if (<= 0.0 n 10.0)
                (recur (conj notes n))
                (do
                  (println "nota invalida")
                  (recur notes))))))]
    (println (format "media = %.2f" (/ (reduce + valid-notes) 2)))))

(defn ^:private execute-again?
  []
  (loop []
    (println "novo calculo (1-sim 2-nao)")
    (let [new-calc (Integer/parseInt (read-line))]
      (cond
        (= new-calc 1) true
        (= new-calc 2) false
        :else (recur)))))

(loop [again? true]
  (when again?
    (collect-and-calc)
    (recur (execute-again?))))