package qltt.CarDealership.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import qltt.CarDealership.models.PhieuBaoHanh;
import qltt.CarDealership.repositories.PhieuBaoHanhRepository;

import java.util.List;

@RestController
@RequestMapping("/api/phieubaohanh")
public class PhieuBaoHanhController {

    @Autowired
    private PhieuBaoHanhRepository phieuBaoHanhRepository;

    @GetMapping
    public List<PhieuBaoHanh> getAllPhieuBaoHanh() {
        return phieuBaoHanhRepository.findAll();
    }

    @GetMapping("/{maPBH}")
    public PhieuBaoHanh getPhieuBaoHanhById(@PathVariable String maPBH) {
        return phieuBaoHanhRepository.findById(maPBH).orElse(null);
    }

    @PostMapping
    public PhieuBaoHanh createPhieuBaoHanh(@RequestBody PhieuBaoHanh phieuBaoHanh) {
        return phieuBaoHanhRepository.save(phieuBaoHanh);
    }

    @PutMapping("/{maPBH}")
    public PhieuBaoHanh updatePhieuBaoHanh(@PathVariable String maPBH, @RequestBody PhieuBaoHanh updatedPhieuBaoHanh) {
        if (phieuBaoHanhRepository.existsById(maPBH)) {
            updatedPhieuBaoHanh.setMaPBH(maPBH);
            return phieuBaoHanhRepository.save(updatedPhieuBaoHanh);
        } else {
            return null; // Handle not found scenario
        }
    }

    @DeleteMapping("/{maPBH}")
    public void deletePhieuBaoHanh(@PathVariable String maPBH) {
        phieuBaoHanhRepository.deleteById(maPBH);
    }
}

