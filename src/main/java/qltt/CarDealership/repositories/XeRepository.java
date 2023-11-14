package qltt.CarDealership.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import qltt.CarDealership.models.Xe;

public interface XeRepository extends JpaRepository<Xe, String> {
    // You can add custom queries if needed
}
