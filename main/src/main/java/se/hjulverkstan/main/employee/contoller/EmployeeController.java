package se.hjulverkstan.main.employee.contoller;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import se.hjulverkstan.main.dto.NewEmployeeDto;

@RestController
@RequestMapping("v1/employee")
//@ControllerAdvice
public class EmployeeController {
    private final EmployeeService service;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    @GetMapping()
    public ResponseEntity<GetAllEmployeeDto> getAllEmployees() {
        return new ResponseEntity<>(service.getAllEmployee(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmployeeDto> getEmployeeById(@PathVariable Long id) {
        return new ResponseEntity<>(service.getEmployeeById(id), HttpStatus.OK);

    }

    @PostMapping()
    public ResponseEntity<EmployeeDto> createEmployee(@Valid @RequestBody NewEmployeeDto newEmployee) {
        return new ResponseEntity<>(service.createEmployee(newEmployee), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<EmployeeDto> editEmployee(@PathVariable Long id, @Valid @RequestBody EmployeeDto employee) {
        return new ResponseEntity<>(service.editEmployee(id, employee), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<EmployeeDto> deleteEmployee(@PathVariable Long id) {
        return new ResponseEntity<>(service.deleteEmployee(id), HttpStatus.OK);
    }
}