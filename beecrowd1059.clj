(doseq [n (range 1 101)
        :when (even? n)]
  (println n))