package br.com.sinqia.service.db.input;

import lombok.Data;

@Data
public class UpdateCustomerDbInput {
    private String code;
    private String name;
    private String lastName;
    private String document;
}