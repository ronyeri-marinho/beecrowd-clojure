(defn ^:private calculate-tax
  [salary]
  (let [tax    (+ (if (> salary 4500)
                          (* 0.28 (- salary 4500))
                          0)
                        (if (> salary 3000)
                          (* 0.18 (- (min salary 4500) 3000))
                          0)
                        (if (> salary 2000)
                          (* 0.08 (- (min salary 3000) 2000))
                          0))]
    tax))

(let [salary (Double/parseDouble (read-line))
      tax (calculate-tax salary)]

  (if (zero? tax)
    (println "Isento")
    (println (format "R$ %.2f" tax))))
