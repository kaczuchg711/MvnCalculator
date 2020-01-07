echo "plugin"
mvn -f Plugin_outside_the_project/pom.xml clean install
echo "MvnCalculator"
mvn clean install
java -jar Main/target/Main-1.0-SNAPSHOT-jar-with-dependencies.jar