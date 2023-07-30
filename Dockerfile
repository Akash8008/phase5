From openjdk:8
EXPOSE 8088
ADD target/com.example-0.0.1-SNAPSHOT.war  com.example-0.0.1-SNAPSHOT.war
ENTRYPOINT [ "java","-jar","/com.example-0.0.1-SNAPSHOT.war" ]
