#Base image
FROM openjdk:17
#Application jar file
COPY target/Spring-24-Docker-0.0.1-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app
# this is the command how we run jar file in comman line  vvvvv
ENTRYPOINT ["java","-jar","Spring-24-Docker-0.0.1-SNAPSHOT.jar"]

