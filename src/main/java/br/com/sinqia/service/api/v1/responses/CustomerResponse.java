package br.com.sinqia.service.api.v1.responses;

import br.com.sinqia.service.domains.customers.models.CustomerModel;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CustomerResponse {
    private String code;
    private String name;
    private String lastName;
    private String document;
    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime updatedAt;
    private String updatedBy;

    public CustomerResponse(CustomerModel model) {
        code = model.getCode();
        name = model.getName();
        lastName = model.getLastName();
        document = model.getDocument();
        createdAt = model.getCreatedAt();
        createdBy = model.getCreatedBy();
        updatedAt = model.getUpdatedAt();
        updatedBy = model.getUpdatedBy();
    }
}
