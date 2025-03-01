package se.hjulverkstan.main.vehicle.dto.request;

import lombok.*;
import se.hjulverkstan.main.vehicle.model.VehicleGeneric;

@ToString
@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
@NoArgsConstructor
public class VehicleGenericDto extends VehicleDto {
    public VehicleGenericDto(VehicleGeneric vehicleGeneric){
        super(vehicleGeneric);
    }
}
