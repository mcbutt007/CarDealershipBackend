package qltt.CarDealership.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import qltt.CarDealership.models.PhieuNhap;
import qltt.CarDealership.repositories.PhieuNhapRepository;

import java.util.List;

@RestController
@RequestMapping("/api/phieunhap")
public class PhieuNhapController {

    @Autowired
    private PhieuNhapRepository phieuNhapRepository;

    @GetMapping
    public List<PhieuNhap> getAllPhieuNhap() {
        return phieuNhapRepository.findAll();
    }

    @GetMapping("/{maPN}")
    public PhieuNhap getPhieuNhapById(@PathVariable String maPN) {
        return phieuNhapRepository.findById(maPN).orElse(null);
    }

    @PostMapping
    public PhieuNhap createPhieuNhap(@RequestBody PhieuNhap phieuNhap) {
        return phieuNhapRepository.save(phieuNhap);
    }

    @PutMapping("/{maPN}")
    public PhieuNhap updatePhieuNhap(@PathVariable String maPN, @RequestBody PhieuNhap updatedPhieuNhap) {
        if (phieuNhapRepository.existsById(maPN)) {
            updatedPhieuNhap.setMaPN(maPN);
            return phieuNhapRepository.save(updatedPhieuNhap);
        } else {
            return null; // Handle not found scenario
        }
    }

    @DeleteMapping("/{maPN}")
    public void deletePhieuNhap(@PathVariable String maPN) {
        phieuNhapRepository.deleteById(maPN);
    }
}