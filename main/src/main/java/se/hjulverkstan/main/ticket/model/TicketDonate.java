package se.hjulverkstan.main.ticket.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@DiscriminatorValue("DONATE")
@Getter
@Setter
@ToString
@EqualsAndHashCode(callSuper = true)
public class TicketDonate extends Ticket {

    @Override
    public boolean isValidTicketStatusTransition(TicketStatus newStatus) {
        return newStatus == null;
    }

}
