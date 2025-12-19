(let [n (Integer/parseInt (read-line))]
  (doseq [i (range 1 (inc n))]
    (when (= (mod n i) 0)
      (println i))))