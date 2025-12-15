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
  (println (format "media = %.2f" (/ (reduce + valid-notes) 2))))
