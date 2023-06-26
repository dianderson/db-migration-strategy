package br.com.sinqia.service.api.v1.resources;

import br.com.sinqia.service.api.v1.requests.CreateCustomerRequest;
import br.com.sinqia.service.api.v1.requests.UpdateCustomerRequest;
import br.com.sinqia.service.api.v1.response.CustomerResponse;
import br.com.sinqia.service.db.resources.CreateCustomer;
import br.com.sinqia.service.db.resources.UpdateCustomer;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/customers")
public class CustomerResource {
    private final CreateCustomer createCustomer;
    private final UpdateCustomer updateCustomer;

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
