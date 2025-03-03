package se.hjulverkstan.main.common.exceptions.unsupported;

import org.springframework.http.HttpStatus;
import se.hjulverkstan.main.common.exceptions.ApiException;

public class UnsupportedTicketStatusException extends ApiException {
  public UnsupportedTicketStatusException(String message) {
    super("unsupported_ticket_status", message, HttpStatus.BAD_REQUEST.value());
  }
}
