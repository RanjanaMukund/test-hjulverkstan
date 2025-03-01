package se.hjulverkstan.main.employee.service;

import se.hjulverkstan.main.dto.NewEmployeeDto;
import se.hjulverkstan.main.employee.dto.request.EmployeeDto;
import se.hjulverkstan.main.employee.dto.response.GetAllEmployeeDto;

public interface EmployeeService {
    public GetAllEmployeeDto getAllEmployee();

    public EmployeeDto getEmployeeById(Long id);

    public EmployeeDto deleteEmployee(Long id);

    public EmployeeDto editEmployee(Long id, EmployeeDto employee);

    public EmployeeDto createEmployee(NewEmployeeDto newEmployee);
}
