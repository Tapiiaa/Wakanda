# Usa una imagen de Java
FROM openjdk:17-jdk-slim

# Establece el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copia tu archivo JAR al contenedor
COPY target/Wakanda-0.0.1-SNAPSHOT.jar app.jar

# Expone el puerto 8761 para Eureka Server
EXPOSE 8761
EXPOSE 8082

# Argumento para seleccionar el perfil (servidor o cliente)
ENV SPRING_PROFILES_ACTIVE=default

# Comando para ejecutar el JAR con el perfil especificado
ENTRYPOINT ["sh", "-c", "java -jar app.jar --spring.profiles.active=${SPRING_PROFILES_ACTIVE}"]

# Añadir Healthcheck en Dockerfile
HEALTHCHECK --interval=30s --timeout=3s --start-period=10s --retries=3 \
  CMD curl --fail http://localhost:8761/actuator/health || exit 1
