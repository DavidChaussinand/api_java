package com.api_spring.demo.controller;

import com.api_spring.demo.model.CarModel;
import com.api_spring.demo.repository.CarRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/modeles")
public class CarController {

    @Autowired
    private CarRepository carRepository;

    @GetMapping
    public List<CarModel> fillCars() {
        return carRepository.findAll();
    }

    @GetMapping("/{id}")
    public CarModel fillById(@PathVariable("id") int id) {
        return carRepository.findById(id);

    }
    @PutMapping("/{id}")
    public CarModel updateCar(@PathVariable("id") int id, @RequestBody CarModel updatedCar) {
        return carRepository.updateById(id, updatedCar);
    }

    @PostMapping
    public CarModel addModel(@RequestBody CarModel modele) {
        return carRepository.save(modele);
    }
    @DeleteMapping("/{id}")
    public CarModel deleteCar(@PathVariable("id") int id) {
        return carRepository.deleteById(id);

    }


}