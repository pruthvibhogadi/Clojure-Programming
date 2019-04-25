
(defn custom-alien-symmetrize-body-parts
  [asym-body-parts number-of-parts]
  (reduce (fn [final-body-parts part]
           (into final-body-parts (set
                                   (custom-alien-matching-parts
                                    part
                                    number-of-parts))))
          []
          asym-body-parts))
                             
(defn custom-alien-matching-parts
  [part number-of-parts]
  (map (fn [arg]
        {:name (clojure.string/replace
                (:name part) #"^left-" arg)
         :size (:size part)})
       (into []
            (map
             (comp #(str % "-") inc)
             (range number-of-parts)))))
                                 

(def asym-alien-hobbit-body-parts [{:name "head" :size 3}
                             {:name "left-eye" :size 1}
                             {:name "left-ear" :size 1}
                             {:name "mouth" :size 1}
                             {:name "nose" :size 1}
                             {:name "neck" :size 2}
                             {:name "left-shoulder" :size 3}
                             {:name "left-upper-arm" :size 3}
                             {:name "chest" :size 10}
                             {:name "back" :size 10}
                             {:name "left-forearm" :size 3}
                             {:name "abdomen" :size 6}
                             {:name "left-kidney" :size 1}
                             {:name "left-hand" :size 2}
                             {:name "left-knee" :size 2}
                             {:name "left-thigh" :size 4}
                             {:name "left-lower-leg" :size 3}
                             {:name "left-achilles" :size 1}
                             {:name "left-foot" :size 2}])


(custom-alien-symmetrize-body-parts asym-alien-hobbit-body-parts 4)


