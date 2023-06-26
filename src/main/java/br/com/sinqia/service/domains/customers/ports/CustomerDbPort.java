package br.com.sinqia.service.domains.customers.ports;

import br.com.sinqia.service.domains.customers.inputs.CreateCustomerInput;
import br.com.sinqia.service.domains.customers.inputs.UpdateCustomerInput;
import br.com.sinqia.service.domains.customers.models.CustomerModel;

public interface CustomerDbPort {
    CustomerModel create(CreateCustomerInput input);

    CustomerModel update(UpdateCustomerInput input);
}
