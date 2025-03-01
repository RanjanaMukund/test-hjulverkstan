package se.hjulverkstan.main.common.exceptions.unsupported;

import org.springframework.http.HttpStatus;
import se.hjulverkstan.main.common.exceptions.ApiException;

public class UnsupportedVehicleStatusException extends ApiException {
    public UnsupportedVehicleStatusException(String message) {
        super("unsupported_vehicle_status", message, HttpStatus.BAD_REQUEST.value());
    }
}
