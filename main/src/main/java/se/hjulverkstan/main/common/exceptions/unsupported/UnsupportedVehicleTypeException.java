package se.hjulverkstan.main.common.exceptions.unsupported;

import org.springframework.http.HttpStatus;
import se.hjulverkstan.main.common.exceptions.ApiException;

public class UnsupportedVehicleTypeException extends ApiException {
    public UnsupportedVehicleTypeException(String message) {
        super("unsupported_vehicle_type", message, HttpStatus.BAD_REQUEST.value());
    }
}
