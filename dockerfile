FROM maven:3.8.4-openjdk-17-slim AS builder

WORKDIR /app

COPY pom.xml .
RUN mvn -B dependency:resolve dependency:resolve-plugins

COPY . .
RUN mvn -B clean package -DskipTests

FROM openjdk:17-alpine as runtime

VOLUME /tmp
COPY --from=builder /app/target/azchip.fretes-0.1.jar azchip.fretes-0.1.jar
ENTRYPOINT ["java","-jar","azchip.fretes-0.1.jar"]
