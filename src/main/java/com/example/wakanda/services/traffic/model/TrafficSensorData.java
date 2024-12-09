package com.example.wakanda.services.traffic.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@Entity
@NoArgsConstructor
public class TrafficSensorData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ubicacion;
    private int vehiculosHora;
    private double velocidadPromedio;
    private int accidentesReportados;
    private String nivelCongestion;
    

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
}
