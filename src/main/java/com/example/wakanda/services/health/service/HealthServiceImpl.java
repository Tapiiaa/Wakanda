package com.example.wakanda.services.health.service;

import com.example.wakanda.services.health.exception.HealthMonitorNotFoundException;
import com.example.wakanda.services.health.model.HealthMonitor;
import com.example.wakanda.services.health.repository.HealthMonitorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.ExecutorService;

@Service
public class HealthServiceImpl implements HealthService {

    private final HealthMonitorRepository healthMonitorRepository;
    private final ExecutorService executorService;

    public HealthServiceImpl(HealthMonitorRepository healthMonitorRepository, ExecutorService executorService) {
        this.healthMonitorRepository = healthMonitorRepository;
        this.executorService = executorService;
    }

    @Override
    public List<HealthMonitor> getAllHealthMonitors() {
        return healthMonitorRepository.findAll();
    }

    @Override
    public HealthMonitor getHealthMonitorById(Long id) {
        return healthMonitorRepository.findById(id)
                .orElseThrow(() -> new HealthMonitorNotFoundException("No se ha encontrado el monitor de salud con el id: " + id));
    }

    @Override
    public void updateHealthMonitorStatus(Long id, String status) {
        executorService.submit(() -> {
            HealthMonitor monitor = getHealthMonitorById(id);
            monitor.setEstado(status);
            healthMonitorRepository.save(monitor);
        });
    }
}
