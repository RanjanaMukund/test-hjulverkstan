package se.hjulverkstan.main.ticket.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import se.hjulverkstan.main.ticket.dto.request.TicketDto;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllTicketDto {
    private List<TicketDto> tickets;
}
