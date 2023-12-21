package qltt.CarDealership.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import qltt.CarDealership.models.HopDongDatCoc;

@Repository
public interface HopDongDatCocRepository extends JpaRepository<HopDongDatCoc, String> {
    // You can define custom queries or methods here if needed
}

