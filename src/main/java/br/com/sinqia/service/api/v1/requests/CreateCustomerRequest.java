package br.com.sinqia.service.api.v1.requests;

import br.com.sinqia.service.domains.customers.inputs.CreateCustomerInput;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CreateCustomerRequest {
    @NotBlank
    private String name;
    @NotBlank
    private String lastName;
    @NotBlank
    private String document;

    public CreateCustomerInput toInput() {
        return new CreateCustomerInput(name, lastName, document);
    }
}
