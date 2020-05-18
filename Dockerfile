FROM openjdk:12
COPY build/libs/jaction.jar jaction.jar
EXPOSE 8080
ENTRYPOINT [ "java", "-jar", "jaction.jar" ]