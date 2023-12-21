package qltt.CarDealership.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import qltt.CarDealership.models.ChiTietPhieuBaoGia;
import qltt.CarDealership.repositories.ChiTietPhieuBaoGiaRepository;

import java.util.List;

@RestController
@RequestMapping("/api/ctphieubaogia")
public class ChiTietPhieuBaoGiaController {

    @Autowired
    private ChiTietPhieuBaoGiaRepository chiTietPhieuBaoGiaRepository;

    @GetMapping
    public List<ChiTietPhieuBaoGia> getAllChiTietPhieuBaoGia() {
        return chiTietPhieuBaoGiaRepository.findAll();
    }

    @GetMapping("/{maCTPBG}")
    public ChiTietPhieuBaoGia getChiTietPhieuBaoGiaById(@PathVariable String maCTPBG) {
        return chiTietPhieuBaoGiaRepository.findById(maCTPBG).orElse(null);
    }

    @PostMapping
    public ChiTietPhieuBaoGia createChiTietPhieuBaoGia(@RequestBody ChiTietPhieuBaoGia chiTietPhieuBaoGia) {
        return chiTietPhieuBaoGiaRepository.save(chiTietPhieuBaoGia);
    }

    @PutMapping("/{maCTPBG}")
    public ChiTietPhieuBaoGia updateChiTietPhieuBaoGia(@PathVariable String maCTPBG, @RequestBody ChiTietPhieuBaoGia updatedChiTietPhieuBaoGia) {
        if (chiTietPhieuBaoGiaRepository.existsById(maCTPBG)) {
            updatedChiTietPhieuBaoGia.setMaCTPBG(maCTPBG);
            return chiTietPhieuBaoGiaRepository.save(updatedChiTietPhieuBaoGia);
        } else {
            return null; // Handle not found scenario
        }
    }

    @DeleteMapping("/{maCTPBG}")
    public void deleteChiTietPhieuBaoGia(@PathVariable String maCTPBG) {
        chiTietPhieuBaoGiaRepository.deleteById(maCTPBG);
    }
}
