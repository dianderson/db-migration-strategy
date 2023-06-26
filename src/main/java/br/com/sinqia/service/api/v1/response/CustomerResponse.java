package br.com.sinqia.service.api.v1.response;

import br.com.sinqia.service.db.models.CustomerDbModel;
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

    public CustomerResponse(CustomerDbModel dbModel) {
        code = dbModel.getCode();
        name = dbModel.getName();
        lastName = dbModel.getLastName();
        document = dbModel.getDocument();
        createdAt = dbModel.getCreatedAt();
        createdBy = dbModel.getCreatedBy();
        updatedAt = dbModel.getUpdatedAt();
        updatedBy = dbModel.getUpdatedBy();
    }
}
