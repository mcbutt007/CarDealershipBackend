package qltt.CarDealership.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import qltt.CarDealership.models.KhuyenMai;
import qltt.CarDealership.repositories.KhuyenMaiRepository;

import java.util.List;

@RestController
@RequestMapping("/api/khuyenmai")
public class KhuyenMaiController {

    @Autowired
    private KhuyenMaiRepository khuyenMaiRepository;

    @GetMapping
    public List<KhuyenMai> getAllKhuyenMai() {
        return khuyenMaiRepository.findAll();
    }

    @GetMapping("/{maKM}")
    public KhuyenMai getKhuyenMaiById(@PathVariable String maKM) {
        return khuyenMaiRepository.findById(maKM).orElse(null);
    }

    @PostMapping
    public KhuyenMai createKhuyenMai(@RequestBody KhuyenMai khuyenMai) {
        return khuyenMaiRepository.save(khuyenMai);
    }

    @PutMapping("/{maKM}")
    public KhuyenMai updateKhuyenMai(@PathVariable String maKM, @RequestBody KhuyenMai updatedKhuyenMai) {
        if (khuyenMaiRepository.existsById(maKM)) {
            updatedKhuyenMai.setMaKM(maKM);
            return khuyenMaiRepository.save(updatedKhuyenMai);
        } else {
            return null; // Handle not found scenario
        }
    }

    @DeleteMapping("/{maKM}")
    public void deleteKhuyenMai(@PathVariable String maKM) {
        khuyenMaiRepository.deleteById(maKM);
    }
}
