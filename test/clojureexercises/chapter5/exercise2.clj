

;; Implementing comp

(defn attr
  [k]
  (comp k :attribute))

  (defn my-comp
  [& fs]
  (fn [& args]
    (let [fns (reverse fs)
          result (apply (first fns) args)]
      (if (empty? fns)
        result
        (reduce
          (fn [r f] (f r))
          result
          (rest fns))))))
