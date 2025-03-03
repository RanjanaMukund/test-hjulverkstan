package se.hjulverkstan.main.customer.dto.respose;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import se.hjulverkstan.main.customer.dto.request.CustomerDto;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllCustomerDto {
    private List<CustomerDto> customers;
}
