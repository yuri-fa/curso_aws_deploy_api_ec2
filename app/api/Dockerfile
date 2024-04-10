FROM openjdk:21-jdk
LABEL MANTAINER="YURI"
WORKDIR /usr/src/app
RUN groupadd -r spring && useradd -r -g spring spring
RUN chown -R spring:spring /usr/src/app
USER spring
ADD ./target/*.jar /usr/src/app.jar
EXPOSE 8080
CMD ["java", "-jar" ,"/usr/src/app.jar"]