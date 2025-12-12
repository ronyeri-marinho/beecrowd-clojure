(let [n (Integer/parseInt (read-line))]
  (doseq [i (range 1 10000)
          :when (= 2 (mod i n))]
    (println i)))