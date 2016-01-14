(ns diamond.core
  (:require clojure.string))

(defn- diamond-seq [c]
  "Generates a sequence of characters from A to the supplied character to A"
  (let [y (int c)
        a-to-character-seq (range (int \A) y)]
    (map char (concat a-to-character-seq [y] (reverse a-to-character-seq)))))

(defn- diamond-line [max-char c]
  (let [padding (clojure.string/join (repeat (dec (* 2 (- (int c) (int \A)))) \space))
        margin (clojure.string/join (repeat (- (int max-char) (int c)) \space))]
    (if (= \A c)
      (str margin "A")
      (str margin c padding c))))

(defn diamond-lines [c]
  (let [character (Character/toUpperCase c)]
    (map (partial diamond-line character) (diamond-seq character))))

(defn- print-diamond [c]
  (doseq [line (diamond-lines c)]
    (println line)))

(defn valid-args? [args]
  (boolean (and (= 1 (count args)) (re-matches #"(?i)[a-z]" (first args))))) ;(?i) allows case insensitive matching

(defn -main [& args]
  (if (valid-args? args)
    (print-diamond (first (seq (first args))))
    (println "INVALID INPUT")))