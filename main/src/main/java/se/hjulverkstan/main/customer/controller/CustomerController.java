package se.hjulverkstan.main.customer.controller;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import se.hjulverkstan.main.customer.service.CustomerService;
import se.hjulverkstan.main.dto.NewCustomerDto;

@RestController
@RequestMapping("v1/customer")
public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService){
        this.customerService = customerService;
    }

    @GetMapping()
    public ResponseEntity<GetAllCustomerDto> getAllCustomers(){
        return new ResponseEntity<>(customerService.getAllCustomer(), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<CustomerDto> getCustomerById(@PathVariable Long id){
        return new ResponseEntity<>(customerService.getCustomerById(id), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<CustomerDto> createCustomer(@Valid @RequestBody NewCustomerDto newCustomer){
        return new ResponseEntity<>(customerService.createCustomer(newCustomer), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CustomerDto> editCustomer(@PathVariable Long id, @Valid @RequestBody CustomerDto customer){
        return new ResponseEntity<>(customerService.editCustomer(id, customer), HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<CustomerDto> deleteCustomer(@PathVariable Long id){
        return new ResponseEntity<>(customerService.deleteCustomer(id), HttpStatus.OK);
    }
}
