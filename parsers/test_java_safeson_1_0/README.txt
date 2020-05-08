javac -cp safeson-parser-1.0-SNAPSHOT.jar TestJSONParsing.java

jar cvfm TestJSONParsing.jar META-INF/MANIFEST.MF safeson-parser-1.0-SNAPSHOT.jar TestJSONParsing.class

java -jar TestJSONParsing.jar
