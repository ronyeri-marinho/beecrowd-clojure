(let [[a b] (map #(Integer/parseInt %) (repeatedly 2 read-line))
      x (if (> b a) a b)
      y (if (> b a) b a)]
  (println (reduce + (filter odd? (range (inc x) y)))))

(comment
  ;; Descobri uma solução mais idiomática depois, com a sort function

  (let [[a b] (map #(Integer/parseInt %) (repeatedly 2 read-line))
        [x y] (sort [a b])]
    (println (reduce + (filter odd? (range (inc x) y))))))