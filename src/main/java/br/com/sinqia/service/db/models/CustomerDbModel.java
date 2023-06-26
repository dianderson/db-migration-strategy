package br.com.sinqia.service.db.models;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CustomerDbModel {
    private String code;
    private String name;
    private String lastName;
    private String document;
    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime updatedAt;
    private String updatedBy;
}
