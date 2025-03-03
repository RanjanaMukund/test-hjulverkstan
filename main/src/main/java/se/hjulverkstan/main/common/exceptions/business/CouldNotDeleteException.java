package se.hjulverkstan.main.common.exceptions.business;

import org.springframework.http.HttpStatus;
import se.hjulverkstan.main.common.exceptions.ApiException;

public class CouldNotDeleteException extends ApiException {
    public CouldNotDeleteException(String message) {
        super("could_not_delete", message, HttpStatus.BAD_REQUEST.value());
    }
}
