FROM openjdk:11
VOLUME /tmp

ARG JAR_FILE

ADD $JAR_FILE /usr/share/sub-module2/sub-module2.jar

LABEL service="sub-module2", project="ci-example"

ENTRYPOINT ["java", "-jar", "/usr/share/sub-module2/sub-module2.jar"]