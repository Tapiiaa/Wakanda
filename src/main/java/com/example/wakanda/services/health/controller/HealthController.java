package com.example.wakanda.services.health.controller;

import com.example.wakanda.services.health.service.HealthService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class HealthController {

    private final HealthService healthService;

    public HealthController(HealthService healthService) {
        this.healthService = healthService;
    }

    // Endpoint para obtener todos los datos de salud
    @RequestMapping("/all")
    public String getAllHealthMonitors() {
        // Falta crear el resto de codigo para implementar la logica.
        return "";
    }
}
