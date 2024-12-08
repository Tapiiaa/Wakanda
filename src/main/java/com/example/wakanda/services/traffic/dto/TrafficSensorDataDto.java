package com.example.wakanda.services.traffic.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TrafficSensorDataDto {
    private Long id;
    private String ubicacion;
    private int vehiculosHora;
    private double velocidadPromedio;
    private int accidentesReportados;
    private int nivelCongestion;
}