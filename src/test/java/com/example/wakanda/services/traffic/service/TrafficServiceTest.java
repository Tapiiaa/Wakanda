package com.example.wakanda.services.traffic.service;

import com.example.wakanda.services.traffic.model.TrafficLight;
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

}