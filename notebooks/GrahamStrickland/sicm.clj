;; # Structure and Interpretation of Classical Mechanics - Gerald Jay Sussman and Jack Wisdom

^{:nextjournal.clerk/toc true}
(ns GrahamStrickland.sicm
    (:refer-clojure
     :exclude [+ - * / zero? compare divide numerator denominator
               infinite? abs ref partial =])
    (:require [emmy.env :as e :refer :all]
              [nextjournal.clerk :as clerk]))

;; ## 1.1 Configuration Spaces

;; ### Exercise 1.1: Degrees of freedom
;; **a.** 
