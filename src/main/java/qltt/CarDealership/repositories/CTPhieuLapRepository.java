package qltt.CarDealership.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import qltt.CarDealership.models.CTPhieuLap;

public interface CTPhieuLapRepository extends JpaRepository<CTPhieuLap, String> {
    // You can add custom queries if needed
}

