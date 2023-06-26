package br.com.sinqia.service.domains.customers.use_cases;

import br.com.sinqia.service.domains.customers.inputs.UpdateCustomerInput;
import br.com.sinqia.service.domains.customers.models.CustomerModel;
import br.com.sinqia.service.domains.customers.ports.CustomerDbPort;
import br.com.sinqia.service.domains.customers.resources.AlterCustomer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AlterCustomerImpl implements AlterCustomer {
    private final CustomerDbPort port;

    @Override
    public CustomerModel execute(UpdateCustomerInput input) {
        return port.update(input);
    }
}
