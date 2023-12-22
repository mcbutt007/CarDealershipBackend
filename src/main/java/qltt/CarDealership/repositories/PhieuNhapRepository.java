package qltt.CarDealership.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import qltt.CarDealership.models.PhieuNhap;
import org.springframework.stereotype.Repository;

@Repository
public interface PhieuNhapRepository extends JpaRepository<PhieuNhap, String> {
    // You can define custom queries or methods here if needed
}