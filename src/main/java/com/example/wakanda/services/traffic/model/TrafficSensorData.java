package com.example.wakanda.services.traffic.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class TrafficSensorData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ubicacion;
    private int vehiculosHora;
    private double velocidadPromedio;
    private int accidentesReportados;
    private int nivelCongestion;
    
	public TrafficSensorData() {}
	
	public TrafficSensorData(Long id, String ubicacion, int vehiculosHora, double velocidadPromedio,
			int accidentesReportados, int nivelCongestion) {
		super();
		this.id = id;
		this.ubicacion = ubicacion;
		this.vehiculosHora = vehiculosHora;
		this.velocidadPromedio = velocidadPromedio;
		this.accidentesReportados = accidentesReportados;
		this.nivelCongestion = nivelCongestion;
	}
}
