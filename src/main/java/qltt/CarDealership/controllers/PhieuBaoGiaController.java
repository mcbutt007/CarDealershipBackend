package qltt.CarDealership.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import qltt.CarDealership.models.PhieuBaoGia;
import qltt.CarDealership.repositories.PhieuBaoGiaRepository;

import java.util.List;

@RestController
@RequestMapping("/api/phieubaogia")
public class PhieuBaoGiaController {

    @Autowired
    private PhieuBaoGiaRepository phieuBaoGiaRepository;

    @GetMapping
    public List<PhieuBaoGia> getAllPhieuBaoGia() {
        return phieuBaoGiaRepository.findAll();
    }

    @GetMapping("/{maPBG}")
    public PhieuBaoGia getPhieuBaoGiaById(@PathVariable String maPBG) {
        return phieuBaoGiaRepository.findById(maPBG).orElse(null);
    }

    @PostMapping
    public PhieuBaoGia createPhieuBaoGia(@RequestBody PhieuBaoGia phieuBaoGia) {
        return phieuBaoGiaRepository.save(phieuBaoGia);
    }

    @PutMapping("/{maPBG}")
    public PhieuBaoGia updatePhieuBaoGia(@PathVariable String maPBG, @RequestBody PhieuBaoGia updatedPhieuBaoGia) {
        if (phieuBaoGiaRepository.existsById(maPBG)) {
            updatedPhieuBaoGia.setMaPBG(maPBG);
            return phieuBaoGiaRepository.save(updatedPhieuBaoGia);
        } else {
            return null; // Handle not found scenario
        }
    }

    @DeleteMapping("/{maPBG}")
    public void deletePhieuBaoGia(@PathVariable String maPBG) {
        phieuBaoGiaRepository.deleteById(maPBG);
    }
}

