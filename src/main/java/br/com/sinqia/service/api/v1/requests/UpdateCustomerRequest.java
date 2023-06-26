package br.com.sinqia.service.api.v1.requests;

import br.com.sinqia.service.db.input.UpdateCustomerDbInput;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UpdateCustomerRequest {
    @NotBlank
    private String name;
    @NotBlank
    private String lastName;
    @NotBlank
    private String document;

    public UpdateCustomerDbInput toInput(String code) {
        UpdateCustomerDbInput input = new UpdateCustomerDbInput();
        input.setCode(code);
        input.setName(name);
        input.setLastName(lastName);
        input.setDocument(document);
        return input;
    }
}
