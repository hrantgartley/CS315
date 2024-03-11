# Create directory if it doesn't exist
mkdir -p out

# Remove Main.class file if it exists
rm -f ./out/production/weatherAPI/Main.class

# Compile Main.java with json-simple library in classpath
javac -cp "../../lib/json-simple-1.1.1.jar" -d "./out/production/weatherAPI" "./src/Main.java"

# Execute Main class with json-simple library in classpath
java -cp "../../lib/json-simple-1.1.1.jar;./out/production/weatherAPI" Main
