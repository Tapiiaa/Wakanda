# Sistema de Gestión de Servicios en Wakanda
Realizado por: Pablo Edu García, Patrik Paul Sirbu, Pedro Alonso Tapia Lobo.
#### Enlace al repositorio: https://github.com/Tapiiaa/Wakanda

## Descripción
Sistema modular para la gestión eficiente de servicios tecnológicos en la ciudad inteligente de Wakanda, basado en microservicios con Spring Boot y Spring Cloud.

## Características principales
- **Gestiónn Inteligente del Tráfico:** Semáforos y sensores optimizan el flujo vehicular.
- **Salud y bienestar** Obtención de datos de pacientes y de circulación de servicios sanitarios
- **Monitoreo:** Prometheus y Grafana para supervisión de servicios.

## Configuración rápida
1. Crear un proyecto Spring Boot con:
   - Spring Cloud.
   - Eureka (descubrimiento de servicios).
   - Ribbon (balanceo de carga).

2. Implementar patrones:
   - **Resiliencia:** Circuit Breaker con Hystrix.
   - **Trazabilidad:** Sleuth y Zipkin.

3. Centralizar configuraciones con Spring Cloud Config.

4. Monitorear con Prometheus y Grafana.

## Uso
1. Configura y ejecuta Eureka Server.
2. Despliega cada microservicio.
3. Usa Prometheus y Grafana para monitoreo.
4. Verifica la trazabilidad en Zipkin.

## Tecnologías utilizadas
- Spring Boot y Spring Cloud.
- Hystrix, Ribbon, Eureka.
- Prometheus, Grafana, Zipkin.
