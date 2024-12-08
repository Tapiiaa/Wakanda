package com.example.wakanda.services.traffic.model;

import jakarta.persistence.*;
import lombok.Data;


public class TrafficSensorData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ubicacion;
    private int vehiculosHora;
    private double velocidadPromedio;
    private int accidentesReportados;
    private String nivelCongestion;
    
	public TrafficSensorData() {}
	
	public TrafficSensorData(Long id, String ubicacion, int vehiculosHora, double velocidadPromedio,
			int accidentesReportados, String nivelCongestion) {
		super();
		this.id = id;
		this.ubicacion = ubicacion;
		this.vehiculosHora = vehiculosHora;
		this.velocidadPromedio = velocidadPromedio;
		this.accidentesReportados = accidentesReportados;
		this.nivelCongestion = nivelCongestion;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getUbicacion() {
		return ubicacion;
	}
	
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	
	public int getVehiculosHora() {
		return vehiculosHora;
	}
	
	public void setVehiculosHora(int vehiculosHora) {
		this.vehiculosHora = vehiculosHora;
	}
	
	public double getVelocidadPromedio() {
		return velocidadPromedio;
	}
	
	public void setVelocidadPromedio(double velocidadPromedio) {
		this.velocidadPromedio = velocidadPromedio;
    }
	
	public int getAccidentesReportados() {
		return accidentesReportados;
	}
	
	public void setAccidentesReportados(int accidentesReportados) {
		this.accidentesReportados = accidentesReportados;
	}
	
	public String getNivelCongestion() {
		return nivelCongestion;
	}
	
	public void setNivelCongestion(String nivelCongestion) {
		this.nivelCongestion = nivelCongestion;
	}

}
