;;; company.clj
;;
;; Written by William Ersing
;;
;; Assignment 5
;; company.clj is the first part of assignment 5. It is a
;; program written in Clojure, and its purpose is to help
;; us learn basic syntax and functionality of the language.


;;; Part 0
;; #1 - hello - a simple string binding
(def hello "Hello Middle Earth")


;;; Part 1
;; #1 - dwarves - a list of dwarf names
(def dwarves ["Thorin"
              "Balin"
              "Bifur"
              "Bofur"
              "Bombur"
              "Dori"
              "Dwalin"
              "Fili"
              "Gloin"
              "Kili"
              "Nori"
              "Oin"
              "Ori"])

;; #2a - leader - the first dwarf is the leader
(def leader (first dwarves))

;; #2b - company - the list of dwarves sans leader
(def company (rest dwarves))

;; #3 - full-company - the list of company members plus Bilbo
(def full-company (conj dwarves "Bilbo"))

;; #4 - locations - list of Middle Earth location/temp maps
(def locations [{:place "The Shire"           :temp 74 }
                {:place "The Misty Mountains" :temp 12 }
                {:place "Fangorn Forest"      :temp 58 }
                {:place "Mordor"              :temp 117}
                {:place "Rivendell"           :temp 71 }])

;; #5 - warm-locations - list of locations with temp > 70
(def warm-locations (map :place
                         (filter #(>= (:temp %) 70) locations)))
