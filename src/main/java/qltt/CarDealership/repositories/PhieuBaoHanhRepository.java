package qltt.CarDealership.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import qltt.CarDealership.models.PhieuBaoHanh;

@Repository
public interface PhieuBaoHanhRepository extends JpaRepository<PhieuBaoHanh, String> {
    // You can define custom queries or methods here if needed
}
