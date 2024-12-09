package com.example.wakanda.services.traffic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.wakanda.services.traffic.model.TrafficSensorData;

import java.util.List;
import java.util.Optional;

public interface TrafficSensorDataRepository extends JpaRepository<TrafficSensorData, Long> {
    // Método para obtener todos los datos de sensores de tráfico
    List<TrafficSensorData> findAll();

    // Método para guardar los datos de sensores de tráfico
    void saveAll(List<TrafficSensorData> sensorData);

    // Método para obtener un solo dato de sensores de tráfico
    Optional<TrafficSensorData> findById(Long id);

    // Método para actualizar un solo dato de sensores de tráfico
    void update(TrafficSensorData sensorData);
}
