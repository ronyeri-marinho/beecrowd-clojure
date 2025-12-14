(defn format-numbers [x]
  (if (== x (Math/floor x))
    (format "%.0f" x)
    (format "%.1f" x)))

(doseq [i (range 0 21 2)
        j (range 1 4)]
  (let [i-val (/ i 10.0)
        j-val (+ j i-val)]
    (println (str "I=" (format-numbers i-val) " J=" (format-numbers j-val)))))