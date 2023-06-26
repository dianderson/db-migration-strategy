package br.com.sinqia.service.domains.customers.inputs;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CreateCustomerInput {
    private String name;
    private String lastName;
    private String document;
}
