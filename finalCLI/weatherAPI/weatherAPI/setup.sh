#!/bin/zsh
mkdir -p out
rm -f ./out/production/weatherAPI/Main.class
javac -cp ./lib/json-simple-1.1.1.jar -d ./out/production/weatherAPI ./src/Main.java
java -cp ./lib/json-simple-1.1.1.jar:./out/production/weatherAPI Main
