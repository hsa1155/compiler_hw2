all:testParser.class testParser.class myparserLexer.java myparser.tokens myparserParser.java


myparserLexer.class:myparserLexer.java myparserParser.java testParser.java
	javac -cp ./antlr-3.5.2-complete-no-st3.jar  testParser.java myparserLexer.java myparserParser.java

myparserParser.class:myparserLexer.java myparserParser.java testParser.java
	javac -cp ./antlr-3.5.2-complete-no-st3.jar  testParser.java myparserLexer.java myparserParser.java

testParser.class:myparserLexer.java myparserParser.java testParser.java
	javac -cp ./antlr-3.5.2-complete-no-st3.jar  testParser.java myparserLexer.java myparserParser.java

myparserLexer.java:myparser.g
	java -jar antlr-3.5.2-complete-no-st3.jar myparser.g

myparserParser.java:myparser.g
	java -jar antlr-3.5.2-complete-no-st3.jar myparser.g

run1:testParser.class
	java -cp ./antlr-3.5.2-complete-no-st3.jar:. testParser input1.c

run2:testParser.class
	java -cp ./antlr-3.5.2-complete-no-st3.jar:. testParser input2.c

run3:testParser.class
	java -cp ./antlr-3.5.2-complete-no-st3.jar:. testParser input3.c

clean:
	rm -rf myparser.tokens myparserLexer.java myparserParser.java *.class