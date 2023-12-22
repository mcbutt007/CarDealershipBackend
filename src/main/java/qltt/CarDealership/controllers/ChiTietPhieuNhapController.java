package qltt.CarDealership.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import qltt.CarDealership.models.ChiTietPhieuNhap;
import qltt.CarDealership.repositories.ChiTietPhieuNhapRepository;

import java.util.List;

@RestController
@RequestMapping("/api/chitietphieunhap")
public class ChiTietPhieuNhapController {

    @Autowired
    private ChiTietPhieuNhapRepository chiTietPhieuNhapRepository;

    @GetMapping
    public List<ChiTietPhieuNhap> getAllChiTietPhieuNhap() {
        return chiTietPhieuNhapRepository.findAll();
    }

    @GetMapping("/{maCTPN}")
    public ChiTietPhieuNhap getChiTietPhieuNhapById(@PathVariable String maCTPN) {
        return chiTietPhieuNhapRepository.findById(maCTPN).orElse(null);
    }

    @PostMapping
    public ChiTietPhieuNhap createChiTietPhieuNhap(@RequestBody ChiTietPhieuNhap chiTietPhieuNhap) {
        return chiTietPhieuNhapRepository.save(chiTietPhieuNhap);
    }

    @PutMapping("/{maCTPN}")
    public ChiTietPhieuNhap updateChiTietPhieuNhap(@PathVariable String maCTPN, @RequestBody ChiTietPhieuNhap updatedChiTietPhieuNhap) {
        if (chiTietPhieuNhapRepository.existsById(maCTPN)) {
            updatedChiTietPhieuNhap.setMaCTPN(maCTPN);
            return chiTietPhieuNhapRepository.save(updatedChiTietPhieuNhap);
        } else {
            return null; // Handle not found scenario
        }
    }

    @DeleteMapping("/{maCTPN}")
    public void deleteChiTietPhieuNhap(@PathVariable String maCTPN) {
        chiTietPhieuNhapRepository.deleteById(maCTPN);
    }
}
