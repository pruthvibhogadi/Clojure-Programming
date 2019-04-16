(ns clojureexercises.exercise2
  (:require [clojure.test :refer :all]
            [clojureexercises.core :refer :all]))

(def number 100)
;;A program to add a given integer with 100.
(println "Enter the number : ")
(let [n (Long/parseLong(read-line))] (def total (+ number n )))
(println(str "After additiona, Total is " total))

