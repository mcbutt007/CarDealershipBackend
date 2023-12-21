package qltt.CarDealership.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import qltt.CarDealership.models.HopDongMuaXe;

@Repository
public interface HopDongMuaXeRepository extends JpaRepository<HopDongMuaXe, String> {
    // You can define custom queries or methods here if needed
}
