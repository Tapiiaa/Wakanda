package com.example.wakanda.services.health.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class HealthMonitor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String numeroSerie;
    private String estado;

    public HealthMonitor(String numeroSerie, String estado) {
        this.numeroSerie = numeroSerie;
        this.estado = estado;
    }

    public void comprobarNumeroSerie(String numeroSerie){
        if(numeroSerie == null || numeroSerie.isEmpty()){
            throw new IllegalArgumentException("El numero de serie no puede ser nulo o vacio");
        }
        if(numeroSerie.length() != 17){
            throw new IllegalArgumentException("El numero de serie debe tener 17 caracteres");
        }
        if(!numeroSerie.matches("\\d+")){
            throw new IllegalArgumentException("El numero de serie debe contener solo numeros");
        }
    }

    public void comprobarEstado(String estado){
        if(estado == null || estado.isEmpty()){
            throw new IllegalArgumentException("El estado no puede ser nulo o vacio");
        }
        if(!estado.equals("activo") && !estado.equals("inactivo")){
            throw new IllegalArgumentException("El estado debe ser activo o inactivo");
        }
    }

    public boolean isActivo(){
        return estado.equals("activo");
    }
}

