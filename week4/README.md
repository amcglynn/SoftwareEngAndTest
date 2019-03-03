# Build project manually

Create the build directory 
> mkdir -p build/classes

Compile the project

> javac -sourcepath src -d build/classes src/ie/gmit/softwareeng/week4/App.java

Run the program
> java -cp build/classes ie.gmit.softwareeng.week4.App

Create a manifest file
> echo Main-Class: ie.gmit.softwareeng.week4.App > manifest.mf

Create the build directory for the jar file
> mkdir build/jar

Build the jar file
> jar cfm build/jar/week4.jar manifest.mf -C build/classes .

Run the program
> java -jar build/jar/week4.jar

# Build project with ANT

Run the ant script

> ant clean compile jar run
