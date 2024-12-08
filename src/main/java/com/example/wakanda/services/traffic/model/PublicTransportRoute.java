package com.example.wakanda.services.traffic.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
public class PublicTransportRoute {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombreRuta;
    private String estadoActual;
    private String tiempoLlegada;
    private String desviosActivos;
    private String ultimaActualizacion;
    private String siguienteParada;
    
    public PublicTransportRoute() {}
    
	public PublicTransportRoute(Long id, String nombreRuta, String estadoActual, String tiempoLlegada,
    		int desviosActivos, String ultimaActualizacion, String siguienteParada) {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombreRuta() {
		return nombreRuta;
	}

	public void setNombreRuta(String nombreRuta) {
		this.nombreRuta = nombreRuta;
	}

	public String getEstadoActual() {
		return estadoActual;
	}

	public void setEstadoActual(String estadoActual) {
		this.estadoActual = estadoActual;
	}

	public String getTiempoLlegada() {
		return tiempoLlegada;
	}

	public void setTiempoLlegada(String tiempoLlegada) {
		this.tiempoLlegada = tiempoLlegada;
	}

	public String getDesviosActivos() {
		return desviosActivos;
	}

	public void setDesviosActivos(String desviosActivos) {
		this.desviosActivos = desviosActivos;
	}

	public String getUltimaActualizacion() {
		return ultimaActualizacion;
	}

	public void setUltimaActualizacion(String ultimaActualizacion) {
		this.ultimaActualizacion = ultimaActualizacion;
	}

	public String getSiguienteParada() {
		return siguienteParada;
	}

	public void setSiguienteParada(String siguienteParada) {
		this.siguienteParada = siguienteParada;
	}
	
	
}

