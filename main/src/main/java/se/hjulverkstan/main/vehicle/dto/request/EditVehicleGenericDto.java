package se.hjulverkstan.main.vehicle.dto.request;

import lombok.*;
import se.hjulverkstan.main.vehicle.model.VehicleGeneric;

@ToString
@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
@NoArgsConstructor
public class EditVehicleGenericDto extends EditVehicleDto {
    public EditVehicleGenericDto(VehicleGeneric vehicleGeneric){
        super(vehicleGeneric);
    }
}
