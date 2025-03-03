package se.hjulverkstan.main.common.exceptions.business;

import org.springframework.http.HttpStatus;
import se.hjulverkstan.main.common.exceptions.ApiException;

public class DataViolationException extends ApiException {
    public DataViolationException(String reason) {
        super(HttpStatus.BAD_REQUEST.name(), "Request violates data integrity: " + reason, HttpStatus.BAD_REQUEST.value());
    }
}
