package qltt.CarDealership.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import qltt.CarDealership.models.PhieuXuat;

@Repository
public interface PhieuXuatRepository extends JpaRepository<PhieuXuat, String> {
    // You can define custom queries or methods here if needed
}
