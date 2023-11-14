package qltt.CarDealership.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import qltt.CarDealership.models.KhachHang;

public interface KhachHangRepository extends JpaRepository<KhachHang, String> {
    // You can add custom queries if needed
}
