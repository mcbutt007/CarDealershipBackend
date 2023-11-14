package qltt.CarDealership.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import qltt.CarDealership.models.NhaCungCap;

public interface NhaCungCapRepository extends JpaRepository<NhaCungCap, String> {
    // You can add custom queries if needed
}
