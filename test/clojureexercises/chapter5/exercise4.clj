;;Program to Implementing update-in

(def users [{:name "Pruthvi" :age 26}  {:name "Vinod" :age 43}])
(update-in users [1 :age] inc)

(update-in {:a 3} [:a] / 4 5)
