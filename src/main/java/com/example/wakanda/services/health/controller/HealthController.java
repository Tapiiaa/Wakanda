package com.example.wakanda.services.health.controller;

import com.example.wakanda.services.health.model.HealthMonitor;
import com.example.wakanda.services.health.service.HealthService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/health")
public class HealthController {

    private final HealthService healthService;

    public HealthController(HealthService healthService) {
        this.healthService = healthService;
    }

    // Endpoint para obtener todos los datos de salud
    @RequestMapping("/all")
    public ResponseEntity<List<HealthMonitor>> getAllHealthMonitors() {
        return ResponseEntity.ok(healthService.getAllHealthMonitors());
    }
}


