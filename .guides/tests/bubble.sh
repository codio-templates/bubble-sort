#!/bin/bash
cd ~/workspace

javac Bubble.java
if [ $? -ne 0 ]; then
  exit 1
fi

RES1="$(java Bubble 1 4 6 7 8 3)"
RES2="$(java Bubble 3 6 7 2 9 1)"
RES3="$(java Bubble 3 3 3 4 2 3)"

if [ "$RES1" == "1 3 4 6 7 8 " -a "$RES2" == "1 2 3 6 7 9 " -a "$RES3" == "2 3 3 3 3 4 " ]
then
  exit 0
fi

exit 1