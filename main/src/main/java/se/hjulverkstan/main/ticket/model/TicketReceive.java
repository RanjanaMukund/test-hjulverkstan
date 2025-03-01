package se.hjulverkstan.main.ticket.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@DiscriminatorValue("RECEIVE")
@Getter
@Setter
@ToString
@EqualsAndHashCode(callSuper = true)
public class TicketReceive extends Ticket {

    @Override
    public boolean isValidTicketStatusTransition(TicketStatus newStatus) {
        return newStatus == null;
    }

}
