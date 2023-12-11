#build the aplication (erro com as portas, conflito com aplication.properties)
FROM eclipse-temurin:17-jdk-jammy
LABEL authors="PEDRO"
EXPOSE 8080
WORKDIR /DnD
COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN ./mvnw dependency:resolve
COPY src ./src
CMD ["./mvnw","spring-boot:run"]




