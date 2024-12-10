package com.example.wakanda.services.health.util;

import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import com.example.wakanda.services.health.model.HealthMonitor;
@Component
public class HealthCsvReader {

    public List<HealthMonitor> readHealthMonitorCsv(MultipartFile file) throws Exception {
        List<HealthMonitor> healthMonitors = new ArrayList<>();

        try (Reader reader = new InputStreamReader(file.getInputStream())) {
            CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT
                .withHeader("ID", "NumeroSerie", "Estado")
                .withIgnoreHeaderCase().withTrim());

            for (CSVRecord csvRecord : csvParser) {
                HealthMonitor healthMonitor = new HealthMonitor();

                healthMonitor.setId(Long.parseLong(csvRecord.get("ID")));
                healthMonitor.setNumeroSerie(csvRecord.get("NumeroSerie"));
                healthMonitor.setEstado(csvRecord.get("Estado"));

                healthMonitors.add(healthMonitor);
            }
        }
        return healthMonitors;
    }
}
