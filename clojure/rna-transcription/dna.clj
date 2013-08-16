(ns dna)
(defn to-rna [dna] (clojure.string/replace dna #"T" "U"))
