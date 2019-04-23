
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

(defn alien-matching-part
"Function to replace the asymmetric body parts to radical symmetric parts.... Star Fish :) "
[part]
(map 
(fn [arg]
    {:name (clojure.string/replace
            (:name part) #"^left-" arg)
     :size (:size part)})
  ["1st-" "2nd-" "3rd-" "4th-" "5th-"]))


(defn alien-symmetrize-body-parts
"Expects a seq of maps that have a :name and :size"
[asym-body-parts]
(loop [remaining-asym-parts asym-body-parts
final-body-parts []]
(if (empty? remaining-asym-parts)
final-body-parts
(let [[part & remaining] remaining-asym-parts]
(recur remaining
(into final-body-parts
(set [part (alien-matching-part part)])))))))
;;Now invoking the function with alien body parts...
(alien-symmetrize-body-parts asym-alien-hobbit-body-parts)
