package qltt.CarDealership.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import qltt.CarDealership.models.PhieuLap;
import qltt.CarDealership.repositories.PhieuLapRepository;

import java.util.List;

@RestController
@RequestMapping("/api/phieulap")
public class PhieuLapController {

    @Autowired
    private PhieuLapRepository phieuLapRepository;

    @GetMapping
    public List<PhieuLap> getAllPhieuLap() {
        return phieuLapRepository.findAll();
    }

    @GetMapping("/{maPhieuNhap}")
    public PhieuLap getPhieuLapById(@PathVariable String maPhieuNhap) {
        return phieuLapRepository.findById(maPhieuNhap).orElse(null);
    }

    @PostMapping
    public PhieuLap createPhieuLap(@RequestBody PhieuLap phieuLap) {
        return phieuLapRepository.save(phieuLap);
    }

    @PutMapping("/{maPhieuNhap}")
    public PhieuLap updatePhieuLap(@PathVariable String maPhieuNhap, @RequestBody PhieuLap phieuLap) {
        phieuLap.setMaPhieuNhap(maPhieuNhap);
        return phieuLapRepository.save(phieuLap);
    }

    @DeleteMapping("/{maPhieuNhap}")
    public void deletePhieuLap(@PathVariable String maPhieuNhap) {
        phieuLapRepository.deleteById(maPhieuNhap);
    }
}
