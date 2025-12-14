(loop []
  (let [password (Integer/parseInt (read-line))]
    (when (not (= password 2002))
      (println "Senha Invalida")
      (recur))))

(println "Acesso Permitido")