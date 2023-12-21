package qltt.CarDealership.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import qltt.CarDealership.models.HopDongMuaXe;
import qltt.CarDealership.repositories.HopDongMuaXeRepository;

import java.util.List;

@RestController
@RequestMapping("/api/hopdongmuaxe")
public class HopDongMuaXeController {

    @Autowired
    private HopDongMuaXeRepository hopDongMuaXeRepository;

    @GetMapping
    public List<HopDongMuaXe> getAllHopDongMuaXe() {
        return hopDongMuaXeRepository.findAll();
    }

    @GetMapping("/{maHDMX}")
    public HopDongMuaXe getHopDongMuaXeById(@PathVariable String maHDMX) {
        return hopDongMuaXeRepository.findById(maHDMX).orElse(null);
    }

    @PostMapping
    public HopDongMuaXe createHopDongMuaXe(@RequestBody HopDongMuaXe hopDongMuaXe) {
        return hopDongMuaXeRepository.save(hopDongMuaXe);
    }

    @PutMapping("/{maHDMX}")
    public HopDongMuaXe updateHopDongMuaXe(@PathVariable String maHDMX, @RequestBody HopDongMuaXe updatedHopDongMuaXe) {
        if (hopDongMuaXeRepository.existsById(maHDMX)) {
            updatedHopDongMuaXe.setMaHDMX(maHDMX);
            return hopDongMuaXeRepository.save(updatedHopDongMuaXe);
        } else {
            return null; // Handle not found scenario
        }
    }

    @DeleteMapping("/{maHDMX}")
    public void deleteHopDongMuaXe(@PathVariable String maHDMX) {
        hopDongMuaXeRepository.deleteById(maHDMX);
    }
}
