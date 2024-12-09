package com.example.wakanda.services.health.config;

import org.springframework.context.annotation.Configuration;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Configuration
public class HealthConfig {

    private static final int THREAD_POOL_SIZE = 5;

    public ExecutorService taskExecutor() {
        return Executors.newFixedThreadPool(THREAD_POOL_SIZE);
    }
}
