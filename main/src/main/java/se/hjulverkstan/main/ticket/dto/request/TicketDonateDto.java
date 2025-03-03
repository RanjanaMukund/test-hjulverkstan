package se.hjulverkstan.main.ticket.dto.request;

import jakarta.validation.constraints.Null;
import lombok.*;
import se.hjulverkstan.main.ticket.model.TicketDonate;
import se.hjulverkstan.main.ticket.model.TicketStatus;

@Getter
@Setter
@ToString
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
public class TicketDonateDto extends TicketDto {

    @Null(message = "Status must be null for donate tickets")
    private TicketStatus ticketStatus;

    public TicketDonateDto(TicketDonate ticket) {
        super(ticket);
    }
}
