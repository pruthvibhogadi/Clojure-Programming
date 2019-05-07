;;Implementing 'update-in'

(def users [{:name "James" :age 26}  {:name "John" :age 43}])
(update-in users [1 :age] inc)

(update-in {:a 3} [:a] / 4 5

(defn my-update-in
  [m [k & ks] f & args]
  (if ks
    (assoc m k (my-update-in (get m k) ks f args))
    (assoc m k (apply f (get m k) args))))
