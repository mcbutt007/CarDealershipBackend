package qltt.CarDealership.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import qltt.CarDealership.models.ChiTietPhieuBaoHanh;

@Repository
public interface ChiTietPhieuBaoHanhRepository extends JpaRepository<ChiTietPhieuBaoHanh, String> {
    // You can define custom queries or methods here if needed
}
