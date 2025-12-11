(require '[clojure.string :as str])

(def animals
  {"vertebrado ave carnivoro"       "aguia"
   "vertebrado ave onivoro"         "pomba"
   "vertebrado mamifero onivoro"    "homem"
   "vertebrado mamifero herbivoro"  "vaca"
   "invertebrado inseto hematofago" "pulga"
   "invertebrado inseto herbivoro"  "lagarta"
   "invertebrado anelideo hematofago" "sanguessuga"
   "invertebrado anelideo onivoro"    "minhoca"})

(let [inputs (repeatedly 3 read-line)
      key    (str/join " " inputs)]
  (println (animals key)))