(loop [i 1 recalc-j 7 block 1]
  (when (< block 6)
    (loop [j recalc-j line 0]
      (when (< line 3)
        (println (format "I=%d J=%d" i j))
        (recur (dec j) (inc line))))
    (recur (+ i 2) (+ 7 (* block 2)) (inc block))))

(comment
  ;; forma idiomática
  (doseq [i (range 1 10 2)
          j (range (+ i 6) (+ i 3) -1)]
    (println (format "I=%d J=%d" i j)))
  )