package io.codelex.datasaver.repositories;

import io.codelex.datasaver.models.ApartmentPrices;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataRepository extends JpaRepository<ApartmentPrices, Long> {
}
