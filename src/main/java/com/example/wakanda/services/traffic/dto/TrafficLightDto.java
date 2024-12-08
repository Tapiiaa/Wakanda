package com.example.wakanda.services.traffic.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TrafficLightDto {
    private Long id;
    private String interseccion;
    private String estado;
    private int duracionEstadoSegundos;
    private int flujoVehicular;
    private int nivelCongestion;
}
