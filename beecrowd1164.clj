(defn ^:private read-integer
  []
  (Integer/parseInt (read-line)))

(defn ^:private is-perfect?
  [x]
  (= x (reduce + (filter #(= (mod x %) 0) (range 1 x)))))

(let [n (read-integer)]
  (loop [count 0]
    (when (not (= count n))
      (let [x (read-integer)]
        (println x (if (is-perfect? x) "eh perfeito" "nao eh perfeito"))
        (recur (inc count))))))