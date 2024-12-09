package com.example.wakanda.services.traffic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.wakanda.services.traffic.model.PublicTransportRoute;

import java.util.List;
import java.util.Optional;

public interface PublicTransportRouteRepository extends JpaRepository<PublicTransportRoute, Long> {

    // Método para obtener todos los datos de rutas de transporte público
    List<PublicTransportRoute> findAll();

    // Método para guardar los datos de rutas de transporte público
    void saveAll(List<PublicTransportRoute> routes);

    // Método para obtener un solo dato de rutas de transporte público
    Optional<PublicTransportRoute> findById(Long id);

    // Método para actualizar un solo dato de rutas de transporte público
    void update(PublicTransportRoute route);
}
