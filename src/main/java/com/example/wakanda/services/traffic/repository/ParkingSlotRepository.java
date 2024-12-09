package com.example.wakanda.services.traffic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.wakanda.services.traffic.model.ParkingSlot;

import java.util.List;
import java.util.Optional;

public interface ParkingSlotRepository extends JpaRepository<ParkingSlot, Long> {
    // Método para obtener todos los datos de plazas de aparcamiento
    List<ParkingSlot> findAll();

    // Método para guardar los datos de plazas de aparcamiento
    void saveAll(List<ParkingSlot> parkingSlots);

    // Método para obtener un solo dato de plazas de aparcamiento
    Optional<ParkingSlot> findById(Long id);

    // Método para actualizar un solo dato de plazas de aparcamiento
    void update(ParkingSlot parkingSlot);

    // Método para eliminar un solo dato de plazas de aparcamiento
    void delete(ParkingSlot parkingSlot);
}
