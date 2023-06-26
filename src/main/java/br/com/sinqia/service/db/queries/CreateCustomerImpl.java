package br.com.sinqia.service.db.queries;

import br.com.sinqia.service.db.input.CreateCustomerDbInput;
import br.com.sinqia.service.db.models.CustomerDbModel;
import br.com.sinqia.service.db.postgres.repositories.CustomerRepository;
import br.com.sinqia.service.db.resources.CreateCustomer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CreateCustomerImpl implements CreateCustomer {
    private final CustomerRepository customerRepository;

    @Override
    public CustomerDbModel execute(CreateCustomerDbInput input) {
        return customerRepository.save(input.toPostgresEntity()).toModel();
    }
}
