FROM maven:latest
LABEL authors="jaahas"

WORKDIR /app
COPY pom.xml /app
COPY . /app
RUN mvn package
CMD ["java", "-jar", "target/tempConverter.jar"]
