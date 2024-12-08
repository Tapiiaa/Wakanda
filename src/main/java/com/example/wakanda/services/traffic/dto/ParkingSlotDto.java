package com.example.wakanda.services.traffic.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ParkingSlotDto {
    private Long id;
    private String ubicacionPlaza;
    private String estado;
}
