FROM openjdk:11
EXPOSE 8090
ADD target/springdata-jpa.jar springdata-jpa.jar
ENTRYPOINT [ "java","-jar","/springdata-jpa.jar" ]