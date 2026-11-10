FROM eclipse-temurin:21-jdk-jammy AS builder
WORKDIR /build
COPY . .
RUN ./gradlew bootJar --no-daemon -q

FROM eclipse-temurin:21-jre-jammy
RUN useradd -m -u 1000 appuser
WORKDIR /app
COPY --from=builder /build/build/libs/*.jar app.jar
USER appuser
EXPOSE 8109
ENTRYPOINT ["sh", "-c", "exec java ${JAVA_OPTS:-} -jar app.jar"]
