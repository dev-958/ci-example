FROM openjdk:11
VOLUME /tmp

ARG JAR_FILE

ADD $JAR_FILE /usr/share/sub-module1/sub-module1.jar

ENTRYPOINT ["java", "-jar", "/usr/share/sub-module1/sub-module1.jar"]