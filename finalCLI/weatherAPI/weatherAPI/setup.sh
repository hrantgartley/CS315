rm -f "./out/production/weatherAPI/Main.class"

# Compile Java code
javac -cp "../../lib/json-simple-1.1.1.jar" -d "./out/production/weatherAPI" "./src/Main.java"

# Run Java program
java -cp "../../lib/json-simple-1.1.1.jar:./out/production/weatherAPI" Main
