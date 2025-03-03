package se.hjulverkstan.main.employee.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import se.hjulverkstan.main.employee.dto.request.EmployeeDto;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllEmployeeDto {
    private List<EmployeeDto> employees;
}
