;;; roots.clj
;;
;; Written by William Ersing
;;
;; Assignment 5
;; roots.clj is the fourth part of assignment 5. It is a
;; program written in Clojure, and its purpose is to help
;; us learn basic syntax and functionality of the language.


;;; Part 4 (bonus section)
;; takes in a vector of polynomial roots (in decreasing
;; exponential order) and returns two lists (both in
;; increasing exponential order):
;;    1)  even-factors
;;    2)  odd-factors
;;
;;
;; sample polynomial from assignment specs
(def roots [1 2 4 10 24 50 100 150])


;; returns the odd factors of the given polynomial
(defn odd-factors [polynomial]
  ;; determine if the polynomial has an odd or even numeber of roots
  (if (odd? (count polynomial))
    (for [idx (into () (range 1 (count polynomial) 2))] (polynomial idx))
    (for [idx (into () (range 0 (count polynomial) 2))] (polynomial idx))))

;; returns the even factors of the given polynomial
(defn even-factors [polynomial]
  ;; determine if the polynomial has an odd or even numeber of roots
  (if (odd? (count polynomial))
    (for [idx (into () (range 0 (count polynomial) 2))] (polynomial idx))
    (for [idx (into () (range 1 (count polynomial) 2))] (polynomial idx))))
