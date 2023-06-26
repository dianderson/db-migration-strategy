package br.com.sinqia.service.db.resources;

import br.com.sinqia.service.db.input.UpdateCustomerDbInput;
import br.com.sinqia.service.db.models.CustomerDbModel;

public interface UpdateCustomer {
    CustomerDbModel execute(UpdateCustomerDbInput input);
}
