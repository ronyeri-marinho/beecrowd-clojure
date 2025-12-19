(require '[clojure.string :as str])

(defn ^:private generate-fibonacci-sequence
  [n]
  (take n
        (map first
             (iterate (fn [[a b]] [b (+ a b)])
                      [0 1]))))

(let [n (Integer/parseInt (read-line))
      sequence (generate-fibonacci-sequence n)]
  (println (str/join " " sequence)))