package se.hjulverkstan.main.vehicle.dto.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import se.hjulverkstan.main.vehicle.model.Vehicle;
import se.hjulverkstan.main.vehicle.model.VehicleStatus;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NewVehicleStatusDto {
    @NotNull(message = "New status is required")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private VehicleStatus newStatus;

    public NewVehicleStatusDto(Vehicle vehicle) {
        this.newStatus = vehicle.getVehicleStatus();
    }

}
