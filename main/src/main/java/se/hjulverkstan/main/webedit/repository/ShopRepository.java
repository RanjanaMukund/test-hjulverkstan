package se.hjulverkstan.main.webedit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se.hjulverkstan.main.model.webedit.Shop;

public interface ShopRepository extends JpaRepository<Shop, Long> {
}