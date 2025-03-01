package se.hjulverkstan.main.common.custom_annotations;

import se.hjulverkstan.main.model.VehicleStatus;

public interface FullVehicleFieldValidation extends BaseVehicleFieldValidation {
    Boolean getIsCustomerOwned();

    VehicleStatus getVehicleStatus();
}
