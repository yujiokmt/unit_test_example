FROM maven:3.5.4-jdk-8-alpine AS appserver
WORKDIR /usr/src/unit_test_example
COPY pom.xml .
RUN mvn -B -f pom.xml -s /usr/share/maven/ref/settings-docker.xml dependency:resolve
COPY . .
RUN mvn -B -s /usr/share/maven/ref/settings-docker.xml package