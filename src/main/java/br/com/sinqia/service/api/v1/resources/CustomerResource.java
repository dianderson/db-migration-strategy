package br.com.sinqia.service.api.v1.resources;

import br.com.sinqia.service.api.v1.requests.CreateCustomerRequest;
import br.com.sinqia.service.api.v1.requests.UpdateCustomerRequest;
import br.com.sinqia.service.api.v1.responses.CustomerResponse;
import br.com.sinqia.service.domains.customers.resources.CreateNewCustomer;
import br.com.sinqia.service.domains.customers.resources.AlterCustomer;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/customers")
public class CustomerResource {
    private final CreateNewCustomer createCustomer;
    private final AlterCustomer updateCustomer;

    @PostMapping
    CustomerResponse create(@Valid @RequestBody CreateCustomerRequest request) {
        return new CustomerResponse(
                createCustomer.execute(request.toInput())
        );
    }

    @PutMapping("/{customer-code}")
    CustomerResponse update(
            @PathVariable("customer-code") String customerCode,
            @Valid @RequestBody UpdateCustomerRequest request) {
        return new CustomerResponse(
                updateCustomer.execute(request.toInput(customerCode))
        );
    }
}
