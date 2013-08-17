(ns dna)

(let [thymine \T uracil \U]
  (defn to-rna [dna] 
    (clojure.string/replace dna thymine uracil)
  )
)
