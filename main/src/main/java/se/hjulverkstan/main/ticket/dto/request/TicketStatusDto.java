package se.hjulverkstan.main.ticket.dto.request;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import se.hjulverkstan.main.ticket.model.TicketStatus;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TicketStatusDto {

    @NotNull(message = "Status is required")
    private TicketStatus ticketStatus;
}
