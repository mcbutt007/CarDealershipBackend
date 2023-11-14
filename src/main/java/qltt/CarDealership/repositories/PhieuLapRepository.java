package qltt.CarDealership.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import qltt.CarDealership.models.PhieuLap;

public interface PhieuLapRepository extends JpaRepository<PhieuLap, String> {
    // You can add custom queries if needed
}
