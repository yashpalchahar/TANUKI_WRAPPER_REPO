https://wrapper.tanukisoftware.com/doc/english/integrate-simple-win.html

https://www.krenger.ch/blog/tag/java-service-wrapper/

{WRAPPER_HOME}\bin\wrapper.exe
{WRAPPER_HOME}\src\bin\App.bat.in
{WRAPPER_HOME}\src\bin\InstallApp-NT.bat.in
{WRAPPER_HOME}\src\bin\UninstallApp-NT.bat.in

wrapper.java.command=%JAVA_HOME%/bin/java

C:\study\tanuki\helloworld> javac -d target src/com/chahar/*.java
C:\study\tanuki\helloworld> jar cf bin\helloworld.jar target/com/chahar/HelloWorld.class

java -classpath "C:\study\tanuki\helloworld\lib\myjar.jar" -Xms128M -Xmx512M com.chahar.HelloWorld arg1 arg2

java -cp lib\myjar.jar com.chahar.HelloWorld


jvm 1    | WrapperSimpleApp Error: java.lang.OutOfMemoryError: Requested array size exceeds VM limit

Feature:
1)Restart app in new JVM when java process killed from Task Manager

https://wrapper.tanukisoftware.com/doc/english/qna-service.html

Install/Remove Service:
	bin\wrapper.exe -i ..\conf\helloworld_wrapper.conf
	bin\wrapper.exe -r ..\conf\helloworld_wrapper.conf

Start/Stop Service:
	bin\wrapper.exe -t ..\conf\helloworld_wrapper.conf
	bin\wrapper.exe -p ..\conf\helloworld_wrapper.conf

https://wrapper.tanukisoftware.com/doc/english/integrate-simple-win.html
