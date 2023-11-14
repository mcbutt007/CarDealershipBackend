package qltt.CarDealership.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import qltt.CarDealership.models.Xe;
import qltt.CarDealership.repositories.XeRepository;

import java.util.List;

@RestController
@RequestMapping("/api/xe")
public class XeController {

    @Autowired
    private XeRepository xeRepository;

    @GetMapping
    public List<Xe> getAllXe() {
        return xeRepository.findAll();
    }

    @GetMapping("/{maXe}")
    public Xe getXeById(@PathVariable String maXe) {
        return xeRepository.findById(maXe).orElse(null);
    }

    @PostMapping
    public Xe createXe(@RequestBody Xe xe) {
        return xeRepository.save(xe);
    }

    @PutMapping("/{maXe}")
    public Xe updateXe(@PathVariable String maXe, @RequestBody Xe xe) {
        xe.setMaXe(maXe);
        return xeRepository.save(xe);
    }

    @DeleteMapping("/{maXe}")
    public void deleteXe(@PathVariable String maXe) {
        xeRepository.deleteById(maXe);
    }
}
