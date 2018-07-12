# Hadoop simple example

This project contains a very simple project using hadoop.
Use as a reference for newcomers :)

## How to use

- run "mvn install". This command creates a .jar into the target folder.

- cd into the newly created target folder

- setup your environment by setting JAVA_HOME:
  export JAVA_HOME=/usr/lib/jvm/java-8-openjdk-amd64/

- run Hadoop from the bin folder where it is installed:
  ~/Tools/hadoop-2.7.3/bin/hadoop jar WordCount-1.0-SNAPSHOT.jar com.javacodegeeks.examples.wordcount.WordCount ../input/input.txt output-folder

- the folder called "output-folder" will be created, containing the
  results of the computation (cat output.txt/part-r-00000)