package com.example.wakanda.services.traffic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.wakanda.services.traffic.model.ParkingSlot;

public interface ParkingSlotRepository extends JpaRepository<ParkingSlot, Long> {}
