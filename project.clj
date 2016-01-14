(defproject diamond "0.1.0-SNAPSHOT"
  :description "TW coding challenge - generates an ASCII diamond"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]]
  :aot [diamond.core]
  :main diamond.core)
