package com.example.wakanda.services.traffic.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.wakanda.services.traffic.service.TrafficService;
import com.example.wakanda.services.traffic.dto.ParkingSlotDto;
import com.example.wakanda.services.traffic.dto.PublicTransportRouteDto;
import com.example.wakanda.services.traffic.dto.TrafficDataManagerDto;
import com.example.wakanda.services.traffic.dto.TrafficLightDto;
import com.example.wakanda.services.traffic.dto.TrafficSensorDataDto;

import java.util.List;

@RestController
@RequestMapping("/traffic")
public class TrafficController {

    private final TrafficService trafficService;

    public TrafficController(TrafficService trafficService) {
        this.trafficService = trafficService;
    }

    // Endpoint para obtener todos los datos de tráfico
    @GetMapping("/all")
    public ResponseEntity<TrafficDataManagerDto> getAllTrafficData() {
        // Se obtienen los datos de los diferentes tipos a través del servicio unificado
        List<ParkingSlotDto> parkingSlots = trafficService.getAllParkingSlots();
        List<PublicTransportRouteDto> publicTransportRoutes = trafficService.getAllPublicTransportRoutes();
        List<TrafficLightDto> trafficLights = trafficService.getAllTrafficLights();
        List<TrafficSensorDataDto> trafficSensorData = trafficService.getAllSensorData();

        // Envolvemos los datos en un DTO genérico para la respuesta
        TrafficDataManagerDto response = new TrafficDataManagerDto();
        response.setParkingSlots(parkingSlots);
        response.setPublicTransportRoutes(publicTransportRoutes);
        response.setTrafficLights(trafficLights);
        response.setTrafficSensorData(trafficSensorData);

        return ResponseEntity.ok(response);
    }

    // Endpoint para procesar los archivos CSV
    @PostMapping("/process-csv")
    public ResponseEntity<String> processCsvData(@RequestParam("file") MultipartFile file) {
        trafficService.processCsv(file, "trafficLights");
        return ResponseEntity.ok("CSV data processed successfully!");
    }
}
