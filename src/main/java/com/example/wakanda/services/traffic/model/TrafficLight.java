package com.example.wakanda.services.traffic.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class TrafficLight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String interseccion;
    private String estado;
    private int duracionEstadoSegundos;
    private int flujoVehicular;
    private int nivelCongestion;

    // Constructor vacío (necesario para JPA)
    public TrafficLight() {}

 
    public TrafficLight(String interseccion, String estado, int duracionEstadoSegundos,
                        int flujoVehicular, int nivelCongestion) {
        this.interseccion = interseccion;
        this.estado = estado;
        this.duracionEstadoSegundos = duracionEstadoSegundos;
        this.flujoVehicular = flujoVehicular;
        this.nivelCongestion = nivelCongestion;
    }
}
