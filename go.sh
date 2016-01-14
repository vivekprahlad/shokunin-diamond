#!/usr/bin/env bash
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
