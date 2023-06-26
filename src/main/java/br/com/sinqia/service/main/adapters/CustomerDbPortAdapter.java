package br.com.sinqia.service.main.adapters;

import br.com.sinqia.service.db.input.CreateCustomerDbInput;
import br.com.sinqia.service.db.input.UpdateCustomerDbInput;
import br.com.sinqia.service.db.models.CustomerDbModel;
import br.com.sinqia.service.db.resources.CreateCustomer;
import br.com.sinqia.service.db.resources.UpdateCustomer;
import br.com.sinqia.service.domains.customers.inputs.CreateCustomerInput;
import br.com.sinqia.service.domains.customers.inputs.UpdateCustomerInput;
import br.com.sinqia.service.domains.customers.models.CustomerModel;
import br.com.sinqia.service.domains.customers.ports.CustomerDbPort;
import br.com.sinqia.service.main.converters.CustomerDbConverter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CustomerDbPortAdapter implements CustomerDbPort {
    private final CreateCustomer createCustomer;
    private final UpdateCustomer updateCustomer;

    @Override
    public CustomerModel create(CreateCustomerInput input) {
        CreateCustomerDbInput dbInput = CustomerDbConverter.toDbInput(input);
        CustomerDbModel dbModel = createCustomer.execute(dbInput);
        return CustomerDbConverter.toModel(dbModel);
    }

    @Override
    public CustomerModel update(UpdateCustomerInput input) {
        UpdateCustomerDbInput dbInput = CustomerDbConverter.toDbInput(input);
        CustomerDbModel dbModel = updateCustomer.execute(dbInput);
        return CustomerDbConverter.toModel(dbModel);
    }
}
