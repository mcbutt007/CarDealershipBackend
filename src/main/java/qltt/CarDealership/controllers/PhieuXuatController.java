package qltt.CarDealership.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import qltt.CarDealership.models.PhieuXuat;
import qltt.CarDealership.repositories.PhieuXuatRepository;

import java.util.List;

@RestController
@RequestMapping("/api/phieuxuat")
public class PhieuXuatController {

    @Autowired
    private PhieuXuatRepository phieuXuatRepository;

    @GetMapping
    public List<PhieuXuat> getAllPhieuXuat() {
        return phieuXuatRepository.findAll();
    }

    @GetMapping("/{maPX}")
    public PhieuXuat getPhieuXuatById(@PathVariable String maPX) {
        return phieuXuatRepository.findById(maPX).orElse(null);
    }

    @PostMapping
    public PhieuXuat createPhieuXuat(@RequestBody PhieuXuat phieuXuat) {
        return phieuXuatRepository.save(phieuXuat);
    }

    @PutMapping("/{maPX}")
    public PhieuXuat updatePhieuXuat(@PathVariable String maPX, @RequestBody PhieuXuat updatedPhieuXuat) {
        if (phieuXuatRepository.existsById(maPX)) {
            updatedPhieuXuat.setMaPX(maPX);
            return phieuXuatRepository.save(updatedPhieuXuat);
        } else {
            return null; // Handle not found scenario
        }
    }

    @DeleteMapping("/{maPX}")
    public void deletePhieuXuat(@PathVariable String maPX) {
        phieuXuatRepository.deleteById(maPX);
    }
}
