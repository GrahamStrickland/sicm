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
;; **a.** Since we can assume that the positions and orientations of the three juggling pins
;; are independent, we must have 18 degrees of freedom, i.e., 6 for each pin with no 
;; constraints on the relative positions or orientations between the 3 pins.
;; 
;; **b.** There are 5 degrees of freedom of the configuration space, 2 for the position
;; of the bob, since it is constrained to be a fixed distance from the fixed support, and 3 
;; for its velocity.
;;
;; **c.** There are 10 degrees of freedom, 5 for the position and velocity of the top bob,
;; as in **b**, and 5 more; 3 for the velocity of the bottom bob and 2 for its position, 
;; since we have the constraint that its distance from the top bob is fixed in space. 
;;
;; **d.** There are 2 degrees of freedom, one for the distance along the wire and another
;; for its velocity.
;;
;; **e.** Ther are 4 degrees of freedom, 3 from the description provided in **d** and one
;; more for the angle of the widest part of the top relative to the attachment linking it
;; to the fixed support.
