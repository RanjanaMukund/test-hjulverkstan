package se.hjulverkstan.main.webedit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se.hjulverkstan.main.webedit.model.GeneralContent;


@Repository
public interface GeneralContentRepository extends JpaRepository<GeneralContent, Long> {
}
