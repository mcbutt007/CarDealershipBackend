package qltt.CarDealership.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import qltt.CarDealership.models.NhaCungCap;
import qltt.CarDealership.repositories.NhaCungCapRepository;

import java.util.List;

@RestController
@RequestMapping("/api/nhacungcap")
public class NhaCungCapController {

    @Autowired
    private NhaCungCapRepository nhacungcapRepository;

    @GetMapping
    public List<NhaCungCap> getAllNHACUNGCAP() {
        return nhacungcapRepository.findAll();
    }

    @GetMapping("/{maNCC}")
    public NhaCungCap getNHACUNGCAPById(@PathVariable String maNCC) {
        return nhacungcapRepository.findById(maNCC).orElse(null);
    }

    @PostMapping
    public NhaCungCap createNHACUNGCAP(@RequestBody NhaCungCap nhacungcap) {
        return nhacungcapRepository.save(nhacungcap);
    }

    @PutMapping("/{maNCC}")
    public NhaCungCap updateNHACUNGCAP(@PathVariable String maNCC, @RequestBody NhaCungCap nhacungcap) {
        nhacungcap.setMaNCC(maNCC);
        return nhacungcapRepository.save(nhacungcap);
    }

    @DeleteMapping("/{maNCC}")
    public void deleteNHACUNGCAP(@PathVariable String maNCC) {
        nhacungcapRepository.deleteById(maNCC);
    }
}
