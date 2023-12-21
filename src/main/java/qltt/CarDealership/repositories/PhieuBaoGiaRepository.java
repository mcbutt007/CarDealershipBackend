package qltt.CarDealership.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import qltt.CarDealership.models.PhieuBaoGia;

@Repository
public interface PhieuBaoGiaRepository extends JpaRepository<PhieuBaoGia, String> {
    // You can define custom queries or methods here if needed
}
