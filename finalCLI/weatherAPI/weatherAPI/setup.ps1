# Create directory if not exists
if (-not (Test-Path -Path "./out")) {
    New-Item -ItemType Directory -Path "./out"
}

# Remove existing Main.class file
Remove-Item -Path "./out/production/weatherAPI/Main.class" -ErrorAction SilentlyContinue

# Compile Java code
javac -cp "../../lib/json-simple-1.1.1.jar" -d "./out/production/weatherAPI" "./src/Main.java"

# Run Java program
java -cp "../../lib/json-simple-1.1.1.jar;./out/production/weatherAPI" Main