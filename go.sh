#!/usr/bin/env bash
if ! [ -x "$(command -v lein)" ]; then
    echo 'Please run "brew install leiningen" to install leiningen on your machine'
    exit
fi

if [ $# -eq 0 ]; then
    echo "Usage:"
    echo "Run program: ./go.sh run <letter>"
    echo "Run tests: ./go.sh test"
    exit 1
fi
if [ $1 == "run" ]; then
    lein run $2
fi

if [ $1 == "test" ]; then
    lein test
fi

