;;; mines.cl
;;
;; Written by William Ersing
;;
;; Assignment 5
;; mines.clj is the third part of assignment 5. It is a
;; program written in Clojure, and its purpose is to help
;; us learn basic syntax and functionality of the language.

;;; Part 3
;; solves the "three towers" puzzle using the 'loop' special form
(defn three-towers [disks a b c]
  (loop [n disks x a y b z c]
    (if (= n 1)
      (printf "Moved disk %s from %s to %s\n" n x z)
      (do (three-towers (dec n) x z y)
          (printf "Moved disk %s from %s to %s\n" n x z)
          (recur (dec n) y x z)))))
