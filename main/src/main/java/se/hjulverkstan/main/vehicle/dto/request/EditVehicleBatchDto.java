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
public class EditVehicleBatchDto extends EditVehicleDto {
    @NotNull(message = "Number of vehicles in batch is required")
    private Integer batchCount;

    public EditVehicleBatchDto(VehicleBatch vehicleBatch) {
        super(vehicleBatch);
        this.batchCount = vehicleBatch.getBatchCount();
    }
}