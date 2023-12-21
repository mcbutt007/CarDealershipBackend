package qltt.CarDealership.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import qltt.CarDealership.models.HopDongDatCoc;
import qltt.CarDealership.repositories.HopDongDatCocRepository;

import java.util.List;

@RestController
@RequestMapping("/api/hopdongdatcoc")
public class HopDongDatCocController {

    @Autowired
    private HopDongDatCocRepository hopDongDatCocRepository;

    @GetMapping
    public List<HopDongDatCoc> getAllHopDongDatCoc() {
        return hopDongDatCocRepository.findAll();
    }

    @GetMapping("/{maHDDC}")
    public HopDongDatCoc getHopDongDatCocById(@PathVariable String maHDDC) {
        return hopDongDatCocRepository.findById(maHDDC).orElse(null);
    }

    @PostMapping
    public HopDongDatCoc createHopDongDatCoc(@RequestBody HopDongDatCoc hopDongDatCoc) {
        return hopDongDatCocRepository.save(hopDongDatCoc);
    }

    @PutMapping("/{maHDDC}")
    public HopDongDatCoc updateHopDongDatCoc(@PathVariable String maHDDC, @RequestBody HopDongDatCoc updatedHopDongDatCoc) {
        if (hopDongDatCocRepository.existsById(maHDDC)) {
            updatedHopDongDatCoc.setMaHDDC(maHDDC);
            return hopDongDatCocRepository.save(updatedHopDongDatCoc);
        } else {
            return null; // Handle not found scenario
        }
    }

    @DeleteMapping("/{maHDDC}")
    public void deleteHopDongDatCoc(@PathVariable String maHDDC) {
        hopDongDatCocRepository.deleteById(maHDDC);
    }
}
