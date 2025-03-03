package se.hjulverkstan.main.vehicle.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import se.hjulverkstan.main.vehicle.dto.request.VehicleDto;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllVehicleDto {

    private List<VehicleDto> vehicles;
}