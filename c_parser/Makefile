ANTLR_V3_JAR:=antlr-3.5.3-complete-no-st3.jar
JAVA:=java
JC:=javac

all: compile

compile: testParser.java myparser.g
	$(JAVA) -cp $(ANTLR_V3_JAR)  org.antlr.Tool myparser.g && \
	$(JC) -cp $(ANTLR_V3_JAR):. *.java 

