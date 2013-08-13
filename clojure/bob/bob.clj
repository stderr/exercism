(ns bob
  (use [clojure.string :only (blank? split upper-case)]))

(defn quiet? [message] (blank? message))
(defn question? [message] (= \? (last message)))
(defn loud? [message] (= (upper-case message) message))


(defn response-for [message]
  (cond
    (quiet? message) "Fine. Be that way."
    (loud? message) "Woah, chill out!"
    (question? message) "Sure."
    :else "Whatever."))
