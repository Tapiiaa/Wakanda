package com.example.wakanda.services.traffic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.wakanda.services.traffic.model.TrafficSensorData;

public interface TrafficSensorDataRepository extends JpaRepository<TrafficSensorData, Long> {}
