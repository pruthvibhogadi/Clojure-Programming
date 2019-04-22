(defn mapset
  [fxn vec]
"Program to illustrate exercise4 - behavior of multiple functions(map , set and inc)"
  (set (map fxn vec)))

(mapset inc [1 1 2 2 33 33 45 54 45])