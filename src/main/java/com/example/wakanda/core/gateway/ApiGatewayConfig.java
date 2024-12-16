package com.example.wakanda.core.gateway;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiGatewayConfig {

    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
            // Rutas para los microservicios
            .route("traffic-service", r -> r.path("/traffic/**")
                .uri("lb://TRAFFIC-SERVICE"))
            .route("health-service", r -> r.path("/health/**")
                .uri("lb://HEALTH-SERVICE"))
            .route("education-service", r -> r.path("/education/**")
                .uri("lb://EDUCATION-SERVICE"))
            // Ruta por defecto o fallback (opcional)
            .route("default-route", r -> r.path("/default/**")
                .uri("http://localhost:8080"))
            .build();
    }
}
