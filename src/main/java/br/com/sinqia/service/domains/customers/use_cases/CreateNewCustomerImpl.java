package br.com.sinqia.service.domains.customers.use_cases;

import br.com.sinqia.service.domains.customers.inputs.CreateCustomerInput;
import br.com.sinqia.service.domains.customers.models.CustomerModel;
import br.com.sinqia.service.domains.customers.ports.CustomerDbPort;
import br.com.sinqia.service.domains.customers.resources.CreateNewCustomer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateNewCustomerImpl implements CreateNewCustomer {
    private final CustomerDbPort port;

    @Override
    public CustomerModel execute(CreateCustomerInput input) {

        return port.create(input);
    }
}
