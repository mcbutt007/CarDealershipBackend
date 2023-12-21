package qltt.CarDealership.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import qltt.CarDealership.models.ChiTietPhieuBaoHanh;
import qltt.CarDealership.repositories.ChiTietPhieuBaoHanhRepository;

import java.util.List;

@RestController
@RequestMapping("/api/chitietphieubaohanh")
public class ChiTietPhieuBaoHanhController {

    @Autowired
    private ChiTietPhieuBaoHanhRepository chiTietPhieuBaoHanhRepository;

    @GetMapping
    public List<ChiTietPhieuBaoHanh> getAllChiTietPhieuBaoHanh() {
        return chiTietPhieuBaoHanhRepository.findAll();
    }

    @GetMapping("/{maCTPBH}")
    public ChiTietPhieuBaoHanh getChiTietPhieuBaoHanhById(@PathVariable String maCTPBH) {
        return chiTietPhieuBaoHanhRepository.findById(maCTPBH).orElse(null);
    }

    @PostMapping
    public ChiTietPhieuBaoHanh createChiTietPhieuBaoHanh(@RequestBody ChiTietPhieuBaoHanh chiTietPhieuBaoHanh) {
        return chiTietPhieuBaoHanhRepository.save(chiTietPhieuBaoHanh);
    }

    @PutMapping("/{maCTPBH}")
    public ChiTietPhieuBaoHanh updateChiTietPhieuBaoHanh(@PathVariable String maCTPBH, @RequestBody ChiTietPhieuBaoHanh updatedChiTietPhieuBaoHanh) {
        if (chiTietPhieuBaoHanhRepository.existsById(maCTPBH)) {
            updatedChiTietPhieuBaoHanh.setMaCTPBH(maCTPBH);
            return chiTietPhieuBaoHanhRepository.save(updatedChiTietPhieuBaoHanh);
        } else {
            return null; // Handle not found scenario
        }
    }

    @DeleteMapping("/{maCTPBH}")
    public void deleteChiTietPhieuBaoHanh(@PathVariable String maCTPBH) {
        chiTietPhieuBaoHanhRepository.deleteById(maCTPBH);
    }
}
