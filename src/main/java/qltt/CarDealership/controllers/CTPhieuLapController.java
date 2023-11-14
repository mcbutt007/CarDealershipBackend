package qltt.CarDealership.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import qltt.CarDealership.models.CTPhieuLap;
import qltt.CarDealership.repositories.CTPhieuLapRepository;

import java.util.List;

@RestController
@RequestMapping("/api/ctphieulap")
public class CTPhieuLapController {

    @Autowired
    private CTPhieuLapRepository ctPhieuLapRepository;

    @GetMapping
    public List<CTPhieuLap> getAllCTPhieuLap() {
        return ctPhieuLapRepository.findAll();
    }

    @GetMapping("/{maCTPN}")
    public CTPhieuLap getCTPhieuLapById(@PathVariable String maCTPN) {
        return ctPhieuLapRepository.findById(maCTPN).orElse(null);
    }

    @PostMapping
    public CTPhieuLap createCTPhieuLap(@RequestBody CTPhieuLap ctPhieuLap) {
        return ctPhieuLapRepository.save(ctPhieuLap);
    }

    @PutMapping("/{maCTPN}")
    public CTPhieuLap updateCTPhieuLap(@PathVariable String maCTPN, @RequestBody CTPhieuLap ctPhieuLap) {
        ctPhieuLap.setMaCTPN(maCTPN);
        return ctPhieuLapRepository.save(ctPhieuLap);
    }

    @DeleteMapping("/{maCTPN}")
    public void deleteCTPhieuLap(@PathVariable String maCTPN) {
        ctPhieuLapRepository.deleteById(maCTPN);
    }
}
