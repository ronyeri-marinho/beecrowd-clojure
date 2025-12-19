(require '[clojure.string :as str])

(loop []
  (let [value (Integer/parseInt (read-line))]
    (when (pos? value)
      (println (str/join " " (range 1 (inc value))))
      (recur))))