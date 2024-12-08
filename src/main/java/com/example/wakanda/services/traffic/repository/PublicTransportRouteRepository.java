package com.example.wakanda.services.traffic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.wakanda.services.traffic.model.PublicTransportRoute;

public interface PublicTransportRouteRepository extends JpaRepository<PublicTransportRoute, Long> {}
