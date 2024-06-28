ANTLR_V3_JAR:=antlr-3.5.3-complete-no-st3.jar
JAVA:=java
JC:=javac

all: compile

compile: myCompiler_test.java myCompiler.g
	$(JAVA) -cp $(ANTLR_V3_JAR)  org.antlr.Tool myCompiler.g && \
	$(JC) -cp $(ANTLR_V3_JAR):. *.java 
