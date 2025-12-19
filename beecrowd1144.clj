(let [n (Integer/parseInt (read-line))]
  (doseq [i (range 1 (inc n))]
    (println i (* i i) (* i i i))
    (println i (inc (* i i)) (inc (* i i i)))))