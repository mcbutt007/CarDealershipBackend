package qltt.CarDealership.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import qltt.CarDealership.models.ChiTietPhieuNhap;

public interface ChiTietPhieuNhapRepository extends JpaRepository<ChiTietPhieuNhap, String> {
    // You can add custom queries if needed
}

