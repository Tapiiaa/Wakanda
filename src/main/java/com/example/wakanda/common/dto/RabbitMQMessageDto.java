package com.example.wakanda.common.dto;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RabbitMQMessageDto {
    private String id;
    private String payload;
    private Date timestamp;
}
