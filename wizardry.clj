;;; wizardry.clj
;;
;; Written by William Ersing
;;
;; Assignment 5
;; wizardry.clj is the second part of assignment 5. It is a
;; program written in Clojure, and its purpose is to help
;; us learn basic syntax and functionality of the language.

;; clojure.string must be imported if string ops are used
(require '[clojure.string :as string])
;; company must be imported for #1 and #2
(require 'company)

;;; Part 2
;; this is the complete fellowship
(def fellowship [{:name "Frodo"   :race "Hobbit"}
                 {:name "Sam"     :race "Hobbit"}
                 {:name "Pippen"  :race "Hobbit"}
                 {:name "Merry"   :race "Hobbit"}
                 {:name "Gandolf" :race "Wizard"}
                 {:name "Aragorn" :race "Man"   }
                 {:name "Boromir" :race "Man"   }
                 {:name "Gimli"   :race "Dwarf" }
                 {:name "Legolas" :race "Elf"   }])

;; #1 - lengths of names for members of company
(def heights (for [x company] (count x)))

;; #2 - total length of all members in company
(def heights-total (reduce + heights))

;; #3 - members of fellowship with name length > 5
(def long-names (filter #(> (count (:name %)) 5) fellowship))

;; #4 - same as #3 except list only contains names
(def names-only (map :name long-names))

;; #5 - converts the names of every member in fellowship to pig-latin
;;
;; a set of character literal vowels - used in pig-latin
(def vowel? (set "aeiou"))
;;
;; pig-latin converts a string to pig-latin
(defn pig-latin [word]
  (let [first-letter (first word)]
    (if (vowel? first-letter)
      (str word "-ay")
      (str (subs word 1) "-" first-letter "ay"))))
;;
;; a list of all members of fellowship with their
;; names converted to pig-latin
(def disguises (for [m fellowship]
                 (assoc m :name (string/capitalize
                                  (string/lower-case
                                    (pig-latin (:name m)))))))
