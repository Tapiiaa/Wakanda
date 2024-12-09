package com.example.wakanda.services.traffic.repository;

import com.example.wakanda.services.traffic.model.TrafficLight;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface TrafficLightRepository extends JpaRepository<TrafficLight, Long> {
    // Método para obtener todos los datos de semáforos
    List<TrafficLight> findAll();

    // Método para guardar los datos de semáforos
    void saveAll(List<TrafficLight> trafficLights);

    // Método para obtener un solo dato de semáforos
    Optional<TrafficLight> findById(Long id);

    // Método para actualizar un solo dato de semáforos
    void update(TrafficLight trafficLight);
}
