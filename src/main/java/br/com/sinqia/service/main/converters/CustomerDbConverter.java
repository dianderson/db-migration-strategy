package br.com.sinqia.service.main.converters;

import br.com.sinqia.service.db.input.CreateCustomerDbInput;
import br.com.sinqia.service.db.input.UpdateCustomerDbInput;
import br.com.sinqia.service.db.models.CustomerDbModel;
import br.com.sinqia.service.domains.customers.inputs.CreateCustomerInput;
import br.com.sinqia.service.domains.customers.inputs.UpdateCustomerInput;
import br.com.sinqia.service.domains.customers.models.CustomerModel;

public class CustomerDbConverter {
    public static CustomerModel toModel(CustomerDbModel dbModel) {
        CustomerModel model = new CustomerModel();
        model.setCode(dbModel.getCode());
        model.setName(dbModel.getName());
        model.setLastName(dbModel.getLastName());
        model.setDocument(dbModel.getDocument());
        model.setCreatedAt(dbModel.getCreatedAt());
        model.setCreatedBy(dbModel.getCreatedBy());
        model.setUpdatedAt(dbModel.getUpdatedAt());
        model.setUpdatedBy(dbModel.getUpdatedBy());
        return model;
    }

    public static CreateCustomerDbInput toDbInput(CreateCustomerInput inputDomain) {
        CreateCustomerDbInput dbInput = new CreateCustomerDbInput();
        dbInput.setName(inputDomain.getName());
        dbInput.setLastName(inputDomain.getLastName());
        dbInput.setDocument(inputDomain.getDocument());
        return dbInput;
    }

    public static UpdateCustomerDbInput toDbInput(UpdateCustomerInput inputDomain) {
        UpdateCustomerDbInput dbInput = new UpdateCustomerDbInput();
        dbInput.setCode(inputDomain.getCode());
        dbInput.setName(inputDomain.getName());
        dbInput.setLastName(inputDomain.getLastName());
        dbInput.setDocument(inputDomain.getDocument());
        return dbInput;
    }
}
