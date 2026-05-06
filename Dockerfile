FROM eclipse-temurin:17-jdk

WORKDIR /app

COPY pom.xml .

RUN apt-get update && apt-get install -y maven

COPY src ./src

RUN mvn clean package || true

RUN useradd -m appuser

USER appuser

EXPOSE 8080

CMD ["java", "-version"]
