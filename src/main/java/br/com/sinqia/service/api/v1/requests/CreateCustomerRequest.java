package br.com.sinqia.service.api.v1.requests;

import br.com.sinqia.service.db.input.CreateCustomerDbInput;
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

    public CreateCustomerDbInput toInput() {
        CreateCustomerDbInput input = new CreateCustomerDbInput();
        input.setName(name);
        input.setLastName(lastName);
        input.setDocument(document);
        return input;
    }
}
