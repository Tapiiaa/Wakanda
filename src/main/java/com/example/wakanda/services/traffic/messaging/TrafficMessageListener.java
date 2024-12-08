package com.example.wakanda.services.traffic.messaging;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class TrafficMessageListener {

    @RabbitListener(queues = "${traffic.queue.name}")
    public void receiveMessage(String message) {
        System.out.println("Received message from trafficQueue: " + message);
        // Puedes procesar el mensaje recibido aquí.
    }
}
