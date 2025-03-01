package se.hjulverkstan.main.common.exceptions.business;

import org.springframework.http.HttpStatus;
import se.hjulverkstan.main.common.exceptions.ApiException;

public class AlreadyUsedException extends ApiException {

    public AlreadyUsedException(String message) {
        super(HttpStatus.IM_USED.name(),message, HttpStatus.IM_USED.value());
    }
}
