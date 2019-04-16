(ns clojureexercises.exercise1
  (:require [clojure.test :refer :all]
            [clojureexercises.core :refer :all]))

(defn dec-maker
"creating a function of decrementing an integer"
[dec-by]
#(- % dec-by))
(def dec9 (dec-maker 9))
(dec9 10)