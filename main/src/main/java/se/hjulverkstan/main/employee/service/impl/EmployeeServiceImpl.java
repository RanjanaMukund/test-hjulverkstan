package se.hjulverkstan.main.employee.service.impl;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import se.hjulverkstan.Exceptions.ElementNotFoundException;
import se.hjulverkstan.main.dto.NewEmployeeDto;
import se.hjulverkstan.main.employee.dto.request.EmployeeDto;
import se.hjulverkstan.main.employee.dto.response.GetAllEmployeeDto;
import se.hjulverkstan.main.employee.model.Employee;
import se.hjulverkstan.main.employee.repository.EmployeeRepository;
import se.hjulverkstan.main.employee.service.EmployeeService;
import se.hjulverkstan.main.ticket.model.Ticket;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;
    public static final String ELEMENT_NAME = "Employee";

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public GetAllEmployeeDto getAllEmployee() {
        List<Employee> employees = employeeRepository.findAll(Sort.by(Sort.Direction.DESC, "createdAt"));
        List<EmployeeDto> responseList = new ArrayList<>();

        for (Employee employee : employees) {
            responseList.add(new EmployeeDto(employee));
        }

        return new GetAllEmployeeDto(responseList);
    }

    @Override
    public EmployeeDto getEmployeeById(Long id) {
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() -> new ElementNotFoundException(ELEMENT_NAME));

        return new EmployeeDto(employee);
    }

    @Override
    public EmployeeDto deleteEmployee(Long id) {
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() -> new ElementNotFoundException(ELEMENT_NAME));


        if (employee.getTickets() != null) {
            List<Ticket> tickets = employee.getTickets();
            //TODO: how to handle removing employee here?
            tickets.forEach(ticket -> ticket.setEmployee(null));
        }

        employeeRepository.delete(employee);
        return new EmployeeDto(employee);
    }

    @Override
    public EmployeeDto editEmployee(Long id, EmployeeDto employee) {
        Employee selectedEmployee = employeeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException(ELEMENT_NAME));

        selectedEmployee.setEmployeeNumber(employee.getEmployeeNumber());
        selectedEmployee.setFirstName(employee.getFirstName());
        selectedEmployee.setLastName(employee.getLastName());
        selectedEmployee.setPhoneNumber(employee.getPhoneNumber());
        selectedEmployee.setEmail(employee.getEmail());
        selectedEmployee.setPersonalIdentityNumber(employee.getPersonalIdentityNumber());
        selectedEmployee.setComment(employee.getComment());

        employeeRepository.save(selectedEmployee);
        return new EmployeeDto(selectedEmployee);
    }

    @Override
    public EmployeeDto createEmployee(NewEmployeeDto newEmployee) {
        Employee employee = new Employee();
        employee.setEmployeeNumber(newEmployee.getEmployeeNumber());
        employee.setFirstName(newEmployee.getFirstName());
        employee.setLastName(newEmployee.getLastName());
        employee.setPhoneNumber(newEmployee.getPhoneNumber());
        employee.setEmail(newEmployee.getEmail());
        employee.setPersonalIdentityNumber(newEmployee.getPersonalIdentityNumber());
        employee.setComment(newEmployee.getComment());
        employee.setTickets(new ArrayList<>());

        employeeRepository.save(employee);
        return new EmployeeDto(employee);
    }
}