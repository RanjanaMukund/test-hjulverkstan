package se.hjulverkstan.main.ticket.dto.request;

import lombok.*;
import se.hjulverkstan.main.ticket.model.TicketDonate;

@Getter
@Setter
@ToString
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
public class NewTicketDonateDto extends NewTicketDto {
    public NewTicketDonateDto(TicketDonate ticket) {
        super(ticket);
    }
}
