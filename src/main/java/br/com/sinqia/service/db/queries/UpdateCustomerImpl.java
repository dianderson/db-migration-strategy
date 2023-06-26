package br.com.sinqia.service.db.queries;

import br.com.sinqia.service.db.input.UpdateCustomerDbInput;
import br.com.sinqia.service.db.models.CustomerDbModel;
import br.com.sinqia.service.db.postgres.entities.CustomerEntity;
import br.com.sinqia.service.db.postgres.repositories.CustomerRepository;
import br.com.sinqia.service.db.resources.UpdateCustomer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UpdateCustomerImpl implements UpdateCustomer {
    private final CustomerRepository customerRepository;

    @Override
    public CustomerDbModel execute(UpdateCustomerDbInput input) {
        CustomerEntity entity = customerRepository.findByCode(input.getCode());
        entity.setName(input.getName());
        entity.setLastName(input.getLastName());
        entity.setDocument(input.getDocument());
        return customerRepository.save(entity).toModel();
    }
}
