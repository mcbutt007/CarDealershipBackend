package qltt.CarDealership.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import qltt.CarDealership.models.KhachHang;
import qltt.CarDealership.repositories.KhachHangRepository;

import java.util.List;

@RestController
@RequestMapping("/api/khachhang")
public class KhachHangController {

    @Autowired
    private KhachHangRepository khachhangRepository;

    @GetMapping
    public List<KhachHang> getAllKHACHHANG() {
        return khachhangRepository.findAll();
    }

    @GetMapping("/{maKH}")
    public KhachHang getKHACHHANGById(@PathVariable String maKH) {
        return khachhangRepository.findById(maKH).orElse(null);
    }

    @PostMapping
    public KhachHang createKHACHHANG(@RequestBody KhachHang khachhang) {
        return khachhangRepository.save(khachhang);
    }

    @PutMapping("/{maKH}")
    public KhachHang updateKHACHHANG(@PathVariable String maKH, @RequestBody KhachHang khachhang) {
        khachhang.setMaKH(maKH);
        return khachhangRepository.save(khachhang);
    }

    @DeleteMapping("/{maKH}")
    public void deleteKHACHHANG(@PathVariable String maKH) {
        khachhangRepository.deleteById(maKH);
    }
}