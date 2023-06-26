package br.com.sinqia.service.domains.customers.resources;

import br.com.sinqia.service.domains.customers.inputs.UpdateCustomerInput;
import br.com.sinqia.service.domains.customers.models.CustomerModel;

public interface AlterCustomer {
    CustomerModel execute(UpdateCustomerInput input);
}
