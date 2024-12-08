package com.example.wakanda.services.traffic.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
public class ParkingSlot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ubicacionPlaza;
    private String estado; 
    
	public ParkingSlot() {}
	
	public ParkingSlot(String ubicacionPlaza, String estado) {
		this.ubicacionPlaza = ubicacionPlaza;
		this.estado = estado;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUbicacionPlaza() {
		return ubicacionPlaza;
	}

	public void setUbicacionPlaza(String ubicacionPlaza) {
		this.ubicacionPlaza = ubicacionPlaza;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
}
