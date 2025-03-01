package se.hjulverkstan.main.common.exceptions.validation;

import org.springframework.http.HttpStatus;
import se.hjulverkstan.main.common.exceptions.ApiException;

public class InvalidDataException extends ApiException {
    public InvalidDataException(String message) {
        super(HttpStatus.BAD_REQUEST.name(), "Invalid or missing data: " + message, HttpStatus.BAD_REQUEST.value());
    }
}
