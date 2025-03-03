package se.hjulverkstan.main.ticket.dto.request;

import jakarta.validation.constraints.Null;
import lombok.*;
import se.hjulverkstan.main.ticket.model.TicketReceive;
import se.hjulverkstan.main.ticket.model.TicketStatus;

@Getter
@Setter
@ToString
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
public class TicketReceiveDto extends TicketDto {

    @Null(message = "Status must be null for receive tickets")
    private TicketStatus ticketStatus;

    public TicketReceiveDto(TicketReceive ticket) {
        super(ticket);
    }
}
