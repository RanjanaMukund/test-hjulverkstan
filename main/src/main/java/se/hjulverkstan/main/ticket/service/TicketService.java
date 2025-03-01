package se.hjulverkstan.main.ticket.service;

import se.hjulverkstan.main.ticket.dto.request.EditTicketDto;
import se.hjulverkstan.main.ticket.dto.request.NewTicketDto;
import se.hjulverkstan.main.ticket.dto.request.TicketDto;
import se.hjulverkstan.main.ticket.dto.request.TicketStatusDto;

public interface TicketService {
    GetAllTicketDto getAllTicket();

    TicketDto getTicketById(Long id);

    TicketDto deleteTicket(Long id);

    TicketDto editTicket(Long id, EditTicketDto ticket);

    TicketDto createTicket(NewTicketDto newTicket);

    TicketDto updateTicketStatus(Long id, TicketStatusDto ticketStatusDto);
}
