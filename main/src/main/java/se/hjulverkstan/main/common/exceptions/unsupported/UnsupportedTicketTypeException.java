package se.hjulverkstan.main.common.exceptions.unsupported;

import org.springframework.http.HttpStatus;
import se.hjulverkstan.main.common.exceptions.ApiException;

public class UnsupportedTicketTypeException extends ApiException {
    public UnsupportedTicketTypeException(String message) {
        super("unsupported_ticket_type", message, HttpStatus.BAD_REQUEST.value());
    }
}
