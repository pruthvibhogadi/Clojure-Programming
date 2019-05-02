(ns fwpd.core)
(def filename "suspects.csv")

(def vamp-keys [:name :glitter-index])

(defn str->int [str]
                   (Integer. str))
(def conversions {:name identity :glitter-index str->int})

(defn convert [vamp-key value]
                   ((get conversions vamp-key) value))

(defn parse
  "Convert a CSV into rows of columns"
  [string]
  (map #(clojure.string/split % #",")
       (clojure.string/split string #"\n")))

(defn mapify
  "Return a seq of maps like {:name \"Edward Cullen\" :glitter-index 10}"
  [rows]
   (map (fn [unmapped-row]
         (reduce (fn [row-map [vamp-key value]]
                   (assoc row-map vamp-key (convert vamp-key value)))
                 {}
                 (map vector vamp-keys unmapped-row)))
rows))

 (defn glitter-filter
               [minimum-glitter records]
               (filter #(>= (:glitter-index %) minimum-glitter) records))


(defn has-name
"To check if a keyword is available"
[m]
(contains? m :name))

(defn has-glitter-index
"To check if a keyword is available"
[m]
(contains? m :glitter-index))

(def validations {:name has-name :glitter-index has-glitter-index})

(defn validate
  "Validate if a particular record has requried keys/values"
[validations record]
(every? true? (map #((get validations %) record) vamp-keys)))
