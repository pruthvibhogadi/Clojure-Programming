(ns pegthing.core
  (require [clojure.set :as set])
  (:gen-class))


  (def character
               {:name "Smooches McCutes"
                :attributes {:intelligence 10
                             :strength 4
                             :dexterity 5}})
             (def c-int (comp :intelligence :attributes))
             (def c-str (comp :strength :attributes))
             (def c-dex (comp :dexterity :attributes))



  (defn attr
  [k]
  (comp k :attribute))


;;(c-int character)
