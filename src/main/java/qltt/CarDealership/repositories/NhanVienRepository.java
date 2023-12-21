package qltt.CarDealership.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import qltt.CarDealership.models.NhanVien;

@Repository
public interface NhanVienRepository extends JpaRepository<NhanVien, String> {
    // You can define custom queries or methods here if needed
}
