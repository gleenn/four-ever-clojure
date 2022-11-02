(ns four-ever-clojure.problem-79-test
  (:require [clojure.test :refer :all]
            [four-ever-clojure.problem-79 :refer :all]))

(deftest solve-test
  (is (= 0 (solve [])))

  (is (= 1 (solve [[1]])))

  (is (= 2 (solve [[1] [1 2]])))

  (is (= 4
         (+ 1 2 1)
         (solve [[1]
                 [2 4]
                 [5 1 4]])))

  (is (= 7
         (+ 1 2 1 3)
         (solve [[1]
                 [2 4]
                 [5 1 4]
                 [2 3 4 5]])))

  (is (= 20
         (+ 3 4 3 2 7 1)
         (solve [[3]
                 [2 4]
                 [1 9 3]
                 [9 9 2 4]
                 [4 6 6 7 8]
                 [5 7 3 5 1 4]]))))
