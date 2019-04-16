(ns clojureexercises.exercise1
  (:require [clojure.test :refer :all]
            [clojureexercises.core :refer :all]))

(defn sample-exercise1 [name]
  "Program to illustrate str, vector, lists, hash-map and hash-set..."
  (println (str "Hi " name ","" Welcome!!"))
  (println "Enter your Input digits: ")
  (let [vectorIs (read-line)]
  (def newVector (conj[vectorIs] 999))
  (println "This is your new vector" newVector)
  (def newList (conj '(dummy) 999 ))
  (println "This is your new list" newList)
  (def hashMap (hash-map :z 20 :x 30 :c 30 :v 40 :b 40))
  (println "hashMap is : " hashMap)
  (set[vectorIs]))
)
(sample-exercise1 "Clojurian")