package br.com.sinqia.service.domains.customers.inputs;

import lombok.Data;

@Data
public class UpdateCustomerInput {
    private String code;
    private String name;
    private String lastName;
    private String document;
}