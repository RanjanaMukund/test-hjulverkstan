package se.hjulverkstan.main.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se.hjulverkstan.main.customer.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository <Customer, Long> {
}
