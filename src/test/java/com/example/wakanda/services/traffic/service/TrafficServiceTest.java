package com.example.wakanda.services.traffic.service;

import com.example.wakanda.services.traffic.model.ParkingSlot;
import com.example.wakanda.services.traffic.model.TrafficLight;
import com.example.wakanda.services.traffic.repository.ParkingSlotRepository;
import com.example.wakanda.services.traffic.repository.TrafficLightRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class TrafficServiceTest {

    @Mock
    private TrafficLightRepository trafficLightRepository;
    @Mock
    private ParkingSlotRepository parkingSlotRepository;

    @InjectMocks
    private TrafficService trafficService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetAllTrafficLights() {
        TrafficLight light1 = new TrafficLight("Calle 1", "Verde", 30, 100, "Bajo");
        TrafficLight light2 = new TrafficLight("Calle 2", "Amarillo", 20, 100, "Medio");
        TrafficLight light3 = new TrafficLight("Calle 3", "Rojo", 10, 100, "Alto");

        when(trafficLightRepository.findAll()).thenReturn(List.of(light1, light2, light3));

        List<TrafficLight> lights = trafficService.getAllTrafficLights();

        assertEquals(3, lights.size());
        assertEquals(light1, lights.get(0));
        assertEquals(light2, lights.get(1));
        assertEquals(light3, lights.get(2));
    }

    @Test
    void testGetAllParkingSlots() {
        ParkingSlot slot1 = new ParkingSlot("Calle 1", "Ocupado");
        ParkingSlot slot2 = new ParkingSlot("Calle 2", "Libre");
        ParkingSlot slot3 = new ParkingSlot("Calle 3", "Ocupado");

        when(parkingSlotRepository.findAll()).thenReturn(List.of(slot1, slot2, slot3));

        List<ParkingSlot> slots = trafficService.getAllParkingSlots();

        assertEquals(3, slots.size());
        assertEquals(slot1, slots.get(0));
        assertEquals(slot2, slots.get(1));
        assertEquals(slot3, slots.get(2));
    }

    @Test
    void testSaveTrafficLights() {
        TrafficLight light1 = new TrafficLight("Calle 1", "Verde", 30, 100, "Bajo");
        TrafficLight light2 = new TrafficLight("Calle 2", "Amarillo", 20, 100, "Medio");
        TrafficLight light3 = new TrafficLight("Calle 3", "Rojo", 10, 100, "Alto");

        when(trafficLightRepository.saveAll(List.of(light1, light2, light3))).thenReturn(List.of(light1, light2, light3));

        List<TrafficLight> lights = trafficService.saveTrafficLights(List.of(light1, light2, light3));

        assertEquals(3, lights.size());
        assertEquals(light1, lights.get(0));
    }

    @Test
    void testProcessCsv() {
        String csv = "ID,Interseccion,Estado,DuracionEstadoSegundos,FlujoVehicular,NivelCongestion\n" +
                "1,Interseccion 1,Estado 1,10,100,Nivel 1\n" +
                "2,Interseccion 2,Estado 2,20,200,Nivel 2\n" +
                "3,Interseccion 3,Estado 3,30,300,Nivel 3";

        trafficService.processCsv(csv, "trafficLights");

        assertEquals(3, trafficService.getAllTrafficLights().size());
    }
}