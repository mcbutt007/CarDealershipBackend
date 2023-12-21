package qltt.CarDealership.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import qltt.CarDealership.models.ChiTietPhieuBaoGia;

@Repository
public interface ChiTietPhieuBaoGiaRepository extends JpaRepository<ChiTietPhieuBaoGia, String> {
    // You can define custom queries or methods here if needed
}