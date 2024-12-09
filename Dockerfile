FROM ubuntu:latest
LABEL authors="patri"

ENTRYPOINT ["top", "-b"]

# Usa una imagen base de Java
FROM openjdk:17-jdk-slim

# Establece el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copia el archivo JAR generado al contenedor
COPY target/Wakanda-0.0.1-SNAPSHOT.jar eureka-server.jar

# Expone el puerto que usa Eureka Server (8761 por defecto)
EXPOSE 8761

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "eureka-server.jar"]
