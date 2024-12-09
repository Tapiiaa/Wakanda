package com.example.wakanda.services.traffic.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class TrafficLight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String interseccion;
    private String estado;
    private int duracionEstadoSegundos;
    private int flujoVehicular;
    private String nivelCongestion;

    public TrafficLight(String interseccion, String estado, int duracionEstadoSegundos,
                        int flujoVehicular, String nivelCongestion) {
        this.interseccion = interseccion;
        this.estado = estado;
        this.duracionEstadoSegundos = duracionEstadoSegundos;
        this.flujoVehicular = flujoVehicular;
        this.nivelCongestion = nivelCongestion;
    }
}
