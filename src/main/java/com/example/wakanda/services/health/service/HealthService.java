package com.example.wakanda.services.health.service;

import com.example.wakanda.services.health.model.HealthMonitor;

import java.util.List;

public interface HealthService {
    List<HealthMonitor> getAllHealthMonitors();
    HealthMonitor getHealthMonitorById(Long id);
    void updateHealthMonitorStatus(Long id, String status);
}
