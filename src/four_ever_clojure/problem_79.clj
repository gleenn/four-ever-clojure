(ns four-ever-clojure.problem-79)

(defn solve
  "Problem 79, Triangle Minimal Path
   https://4clojure.oxal.org/#/problem/79"
  ([triangle]
   (solve 0 0 triangle))
  ([row-idx col-idx triangle]
   (if (< row-idx (count triangle))
     (+ (min (solve (inc row-idx) col-idx triangle)
             (solve (inc row-idx) (inc col-idx) triangle))
        (get-in triangle [row-idx col-idx]))
     (get-in triangle [row-idx col-idx] 0))))

