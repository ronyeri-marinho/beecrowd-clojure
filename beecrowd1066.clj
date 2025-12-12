(let [values (map #(Integer/parseInt %) (repeatedly 5 read-line))]
  (println (count (filter even? values)) "valor(es) par(es)")
  (println (count (filter odd? values)) "valor(es) impar(es)")
  (println (count (filter pos? values)) "valor(es) positivo(s)")
  (println (count (filter neg? values)) "valor(es) negativo(s)"))