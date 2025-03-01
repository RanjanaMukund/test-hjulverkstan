package se.hjulverkstan.main.ticket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se.hjulverkstan.main.ticket.model.Ticket;
@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {
}
