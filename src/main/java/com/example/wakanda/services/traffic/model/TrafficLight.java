package com.example.wakanda.services.traffic.model;

import jakarta.persistence.*;

@Entity
public class TrafficLight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String interseccion;
    private String estado;
    private int duracionEstadoSegundos;
    private int flujoVehicular;
    private String nivelCongestion;

    // Constructor vacío (necesario para JPA)
    public TrafficLight() {}

 
    public TrafficLight(String interseccion, String estado, int duracionEstadoSegundos,
                        int flujoVehicular, String nivelCongestion) {
        this.interseccion = interseccion;
        this.estado = estado;
        this.duracionEstadoSegundos = duracionEstadoSegundos;
        this.flujoVehicular = flujoVehicular;
        this.nivelCongestion = nivelCongestion;
    }

    // Getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInterseccion() {
        return interseccion;
    }

    public void setInterseccion(String interseccion) {
        this.interseccion = interseccion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getDuracionEstadoSegundos() {
        return duracionEstadoSegundos;
    }

    public void setDuracionEstadoSegundos(int duracionEstadoSegundos) {
        this.duracionEstadoSegundos = duracionEstadoSegundos;
    }

    public int getFlujoVehicular() {
        return flujoVehicular;
    }

    public void setFlujoVehicular(int flujoVehicular) {
        this.flujoVehicular = flujoVehicular;
    }

    public String getNivelCongestion() {
        return nivelCongestion;
    }

    public void setNivelCongestion(String nivelCongestion) {
        this.nivelCongestion = nivelCongestion;
    }
}
