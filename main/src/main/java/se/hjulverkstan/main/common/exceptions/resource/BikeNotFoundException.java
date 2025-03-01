package se.hjulverkstan.main.common.exceptions.resource;

import org.springframework.http.HttpStatus;
import se.hjulverkstan.main.common.exceptions.ApiException;

public class BikeNotFoundException extends ApiException {
    public BikeNotFoundException(String message) {
        super(HttpStatus.NOT_FOUND.name(),message, HttpStatus.NOT_FOUND.value());
    }
}
