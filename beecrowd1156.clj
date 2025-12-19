(let [nums (range 1 40 2)
      dens (iterate #(* 2 %) 1)
      s    (reduce + (map / nums dens))]
  (println (format "%.2f" (double s))))