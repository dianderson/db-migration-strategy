package br.com.sinqia.service.db.input;

import br.com.sinqia.service.db.postgres.entities.CustomerEntity;
import lombok.Data;

import java.util.UUID;

@Data
public class CreateCustomerDbInput {
    private String name;
    private String lastName;
    private String document;

    public CustomerEntity toPostgresEntity() {
        CustomerEntity entity = new CustomerEntity();
        entity.setCode(UUID.randomUUID().toString());
        entity.setName(name);
        entity.setLastName(lastName);
        entity.setDocument(document);
        return entity;
    }
}
