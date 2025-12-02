# 1단계: Gradle로 빌드
FROM gradle:8.7.0-jdk17 AS builder
WORKDIR /app

# Gradle 캐시를 위해 먼저 의존성만 복사해도 되지만, 단순하게 전체 복사
COPY . .
RUN ./gradlew clean bootJar -x test

# 2단계: 실행용 JDK 이미지
FROM eclipse-temurin:17-jdk
WORKDIR /app

# 빌드된 jar 복사 (build/libs 밑에 있는 jar 하나 가져오기)
COPY --from=builder /app/build/libs/*.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
