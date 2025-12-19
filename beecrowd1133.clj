(let [[a b] (map #(Integer/parseInt %) (repeatedly 2 read-line))
      x (min a b)
      y (max a b)]
  (doseq [i (range (inc x) y)
          :let [rest (mod i 5)]]
    (when (or (= rest 2) (= rest 3)) (println i))))