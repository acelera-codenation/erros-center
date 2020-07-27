package br.com.central.errors.events.entity.dto;

import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@ApiModel(value = "EventResponse")
public class EventResponse {
    private Long id;
    private Integer level;
    private String description;
    private String origin;
    private LocalDateTime date;
    private Integer quantity;
}