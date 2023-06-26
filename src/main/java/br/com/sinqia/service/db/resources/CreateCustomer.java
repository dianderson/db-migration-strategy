package br.com.sinqia.service.db.resources;

import br.com.sinqia.service.db.input.CreateCustomerDbInput;
import br.com.sinqia.service.db.models.CustomerDbModel;

public interface CreateCustomer {
    CustomerDbModel execute(CreateCustomerDbInput input);
}
