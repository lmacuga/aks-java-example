FROM azul/zulu-openjdk-alpine:11
ARG JAR_FILE
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-Xmx300m","-jar","/app.jar"]