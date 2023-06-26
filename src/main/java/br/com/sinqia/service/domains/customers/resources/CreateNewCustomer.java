package br.com.sinqia.service.domains.customers.resources;

import br.com.sinqia.service.domains.customers.inputs.CreateCustomerInput;
import br.com.sinqia.service.domains.customers.models.CustomerModel;

public interface CreateNewCustomer {
    CustomerModel execute(CreateCustomerInput input);
}
