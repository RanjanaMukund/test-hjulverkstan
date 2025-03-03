package se.hjulverkstan.main.vehicle.dto.request;

import jakarta.validation.constraints.NotNull;
import lombok.*;
import se.hjulverkstan.main.vehicle.model.VehicleBatch;

@Setter
@Getter
@ToString
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class NewVehiclebatchDto extends NewVehicleDto {
    @NotNull(message = "Number of vehicles in batch is required")
    private Integer batchCount;

    public NewVehiclebatchDto(VehicleBatch vehicleBatch) {
        super(vehicleBatch);
        this.batchCount = vehicleBatch.getBatchCount();
    }
}