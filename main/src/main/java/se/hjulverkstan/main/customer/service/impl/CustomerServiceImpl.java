package se.hjulverkstan.main.customer.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import se.hjulverkstan.Exceptions.ElementNotFoundException;
import se.hjulverkstan.Exceptions.MissingArgumentException;
import se.hjulverkstan.main.customer.dto.request.CustomerDto;
import se.hjulverkstan.main.customer.dto.respose.GetAllCustomerDto;
import se.hjulverkstan.main.customer.model.Customer;
import se.hjulverkstan.main.customer.model.CustomerType;
import se.hjulverkstan.main.customer.repository.CustomerRepository;
import se.hjulverkstan.main.customer.service.CustomerService;
import se.hjulverkstan.main.customer.dto.request.NewCustomerDto;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
@Slf4j
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;
    public static String ELEMENT_NAME = "Customer";

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public GetAllCustomerDto getAllCustomer() {
        log.info("Fetching all customers");
        List<Customer> customers = customerRepository.findAll(Sort.by(Sort.Direction.DESC, "createdAt"));
        List<CustomerDto> responseList = new ArrayList<>();

        for (Customer customer : customers) {
            responseList.add(new CustomerDto(customer));
        }

        log.debug("Retrieved {} customers", responseList.size());
        return new GetAllCustomerDto(responseList);
    }

    @Override
    public CustomerDto getCustomerById(Long id) {
        log.info("Fetching customer with ID: {}", id);
        Customer customer = customerRepository.findById(id)
                .orElseThrow(() -> {
                    log.error("Customer with ID {} not found", id);
                    return new ElementNotFoundException(ELEMENT_NAME);
                });

        log.debug("Retrieved customer: {}", customer);
        return new CustomerDto(customer);
    }

    @Override
    public CustomerDto deleteCustomer(Long id) {
        log.info("Deleting customer with ID: {}", id);
        Customer customer = customerRepository.findById(id)
                .orElseThrow(() -> {
                    log.error("Customer with ID {} not found", id);
                    return new ElementNotFoundException(ELEMENT_NAME);
                });

        customerRepository.delete(customer);
        log.debug("Deleted customer: {}", customer);
        return new CustomerDto(customer);
    }

    @Override
    public CustomerDto editCustomer(Long id, CustomerDto customer) {
        log.info("Updating customer with ID: {}", id);
        Customer selectedCustomer = customerRepository.findById(id)
                .orElseThrow(() -> {
                    log.error("Customer with ID {} not found", id);
                    return new ElementNotFoundException(ELEMENT_NAME);
                });

        selectedCustomer.setCustomerType(customer.getCustomerType());
        selectedCustomer.setFirstName(customer.getFirstName());
        selectedCustomer.setLastName(customer.getLastName());
        selectedCustomer.setPersonalIdentityNumber(customer.getPersonalIdentityNumber());

        // Requires orgName if customer is an organization
        if (selectedCustomer.getCustomerType().equals(CustomerType.ORGANIZATION) && customer.getOrganizationName() == null) {
            log.error("Organization name is missing for customer with ID: {}", id);
            throw new MissingArgumentException("Organization name");
        }

        selectedCustomer.setOrganizationName(customer.getOrganizationName());
        selectedCustomer.setPhoneNumber(customer.getPhoneNumber());
        selectedCustomer.setEmail(customer.getEmail());
        selectedCustomer.setComment(customer.getComment());

        customerRepository.save(selectedCustomer);
        log.debug("Updated customer: {}", selectedCustomer);
        return new CustomerDto(selectedCustomer);
    }

    @Override
    public CustomerDto createCustomer(NewCustomerDto newCustomer) {
        log.info("Creating a new customer: {}", newCustomer);
        Customer customer = new Customer();
        customer.setCustomerType(newCustomer.getCustomerType());
        customer.setFirstName(newCustomer.getFirstName());
        customer.setLastName(newCustomer.getLastName());
        customer.setPersonalIdentityNumber(newCustomer.getPersonalIdentityNumber());

        // Requires orgName if customer is an organization
        if (customer.getCustomerType().equals(CustomerType.ORGANIZATION) && newCustomer.getOrganizationName() == null) {
            log.error("Organization name is missing for new customer");
            throw new MissingArgumentException("Organization name");
        }

        customer.setOrganizationName(newCustomer.getOrganizationName());
        customer.setPhoneNumber(newCustomer.getPhoneNumber());
        customer.setEmail(newCustomer.getEmail());
        customer.setTickets(new ArrayList<>());
        customer.setComment(newCustomer.getComment());

        customerRepository.save(customer);
        log.debug("Created customer: {}", customer);
        return new CustomerDto(customer);
    }
}