package se.hjulverkstan.main.common.exceptions.unsupported;

import org.springframework.http.HttpStatus;
import se.hjulverkstan.main.common.exceptions.ApiException;

public class UnsupportedBikeTypeException extends ApiException {
    public UnsupportedBikeTypeException(String message) {
        super("unsupported_bike_type", message, HttpStatus.BAD_REQUEST.value());
    }
}
