package com.example.wakanda.services.traffic.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PublicTransportRouteDto {
    private Long id;
    private String nombreRuta;
    private String estadoActual;
    private String tiempoLlegada;
    private String desviosActivos;
    private String ultimaActualizacion;
    private String siguienteParada;
}
