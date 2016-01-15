(ns diamond.core-test
  (:require [clojure.test :refer :all]
            [diamond.core :refer :all]))

(deftest diamond-lines-test
  (testing "Should display A when a is passed in"
    (is (= (diamond-lines \a) '("A"))))
  (testing "Should display A when capital a is passed in"
    (is (= (diamond-lines \A) '("A"))))
  (testing "Should show a diamond when capital E is passed in"
    (is (= (diamond-lines \E) '("    A"
                                "   B B"
                                "  C   C"
                                " D     D"
                                "E       E"
                                " D     D"
                                "  C   C"
                                "   B B"
                                "    A"  ))))
  (testing "Should show a full diamond when Z is passed in"
    (is (= (diamond-lines \Z) '( "                         A"
                                 "                        B B"
                                 "                       C   C"
                                 "                      D     D"
                                 "                     E       E"
                                 "                    F         F"
                                 "                   G           G"
                                 "                  H             H"
                                 "                 I               I"
                                 "                J                 J"
                                 "               K                   K"
                                 "              L                     L"
                                 "             M                       M"
                                 "            N                         N"
                                 "           O                           O"
                                 "          P                             P"
                                 "         Q                               Q"
                                 "        R                                 R"
                                 "       S                                   S"
                                 "      T                                     T"
                                 "     U                                       U"
                                 "    V                                         V"
                                 "   W                                           W"
                                 "  X                                             X"
                                 " Y                                               Y"
                                 "Z                                                 Z"
                                 " Y                                               Y"
                                 "  X                                             X"
                                 "   W                                           W"
                                 "    V                                         V"
                                 "     U                                       U"
                                 "      T                                     T"
                                 "       S                                   S"
                                 "        R                                 R"
                                 "         Q                               Q"
                                 "          P                             P"
                                 "           O                           O"
                                 "            N                         N"
                                 "             M                       M"
                                 "              L                     L"
                                 "               K                   K"
                                 "                J                 J"
                                 "                 I               I"
                                 "                  H             H"
                                 "                   G           G"
                                 "                    F         F"
                                 "                     E       E"
                                 "                      D     D"
                                 "                       C   C"
                                 "                        B B"
                                 "                         A")))))

(deftest commandline-args-test
  (testing "should accept single alphabet argument"
    (is (true? (valid-args? ["A"])))
    (is (true? (valid-args? ["Z"])))
    (is (true? (valid-args? ["a"])))
    (is (true? (valid-args? ["z"]))))
  (testing "should not accept non alphabetic arguments"
    (is (false? (valid-args? '["1"])))
    (is (false? (valid-args? '["$"]))))
  (testing "should not accept multialphabet arguments"
    (is (false? (valid-args? '["AA"])))
    (is (false? (valid-args? '["Zz"]))))
  (testing "should not accept multiple arguments"
    (is (false? (valid-args? '("A" "B"))))))
