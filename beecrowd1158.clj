(require '[clojure.string :as str])

(defn ^:private odd-from
  "Iterates over all odd numbers and ensures that the value of n is odd before starting."
  [n]
  (iterate #(+ % 2)
           (if (odd? n) n (inc n))))

(let [n (Integer/parseInt (read-line))]
  (loop [count 0]
    (when (not (= count n))
      (let [[x y] (map #(Integer/parseInt %) (str/split (read-line) #"\s+"))]
        (println (reduce + (take y (odd-from x))))
        (recur (inc count))))))