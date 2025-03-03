package se.hjulverkstan.main.common.exceptions.unsupported;

import org.springframework.http.HttpStatus;
import se.hjulverkstan.main.common.exceptions.ApiException;

public class UnsupportedTicketVehiclesException extends ApiException {
    public UnsupportedTicketVehiclesException(String message) {
        super("unsupported_ticket_vehicles", message, HttpStatus.BAD_REQUEST.value());
    }
}
