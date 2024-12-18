package com.example.wakanda.services.traffic.service;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQService {

    @Value("${traffic.queue.name}")
    private String trafficQueue;

    @Autowired
    private RabbitTemplate rabbitTemplate;

    // Publica actualizaciones en RabbitMQ
    public void publishSemaphoreUpdate(String intersection, int greenLightTime) {
        String message = String.format("Intersection: %s, GreenLightTime: %d seconds", intersection, greenLightTime);
        rabbitTemplate.convertAndSend(trafficQueue, message);
    }
}