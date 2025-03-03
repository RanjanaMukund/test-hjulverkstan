package se.hjulverkstan.main.location.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se.hjulverkstan.main.location.model.Location;

public interface LocationRepository extends JpaRepository<Location, Long> {
}