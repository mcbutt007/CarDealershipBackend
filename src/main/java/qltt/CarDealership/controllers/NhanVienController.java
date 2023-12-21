package qltt.CarDealership.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import qltt.CarDealership.models.NhanVien;
import qltt.CarDealership.repositories.NhanVienRepository;

import java.util.List;

@RestController
@RequestMapping("/api/nhanvien")
public class NhanVienController {

    @Autowired
    private NhanVienRepository nhanVienRepository;

    @GetMapping
    public List<NhanVien> getAllNhanVien() {
        return nhanVienRepository.findAll();
    }

    @GetMapping("/{maNV}")
    public NhanVien getNhanVienById(@PathVariable String maNV) {
        return nhanVienRepository.findById(maNV).orElse(null);
    }

    @PostMapping
    public NhanVien createNhanVien(@RequestBody NhanVien nhanVien) {
        return nhanVienRepository.save(nhanVien);
    }

    @PutMapping("/{maNV}")
    public NhanVien updateNhanVien(@PathVariable String maNV, @RequestBody NhanVien updatedNhanVien) {
        if (nhanVienRepository.existsById(maNV)) {
            updatedNhanVien.setMaNV(maNV);
            return nhanVienRepository.save(updatedNhanVien);
        } else {
            return null; // Handle not found scenario
        }
    }

    @DeleteMapping("/{maNV}")
    public void deleteNhanVien(@PathVariable String maNV) {
        nhanVienRepository.deleteById(maNV);
    }
}

