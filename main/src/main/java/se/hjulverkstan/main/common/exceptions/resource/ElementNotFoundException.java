package se.hjulverkstan.main.common.exceptions.resource;

import org.springframework.http.HttpStatus;
import se.hjulverkstan.main.common.exceptions.ApiException;

public class ElementNotFoundException extends ApiException {
    public ElementNotFoundException(String element) {
        super(HttpStatus.NOT_FOUND.name(),  element + " Not Found", HttpStatus.NOT_FOUND.value());
    }
}
