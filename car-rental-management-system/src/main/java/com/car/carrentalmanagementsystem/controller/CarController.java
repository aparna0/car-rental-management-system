package com.car.carrentalmanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.car.carrentalmanagementsystem.model.Car;
import com.car.carrentalmanagementsystem.services.CarServiceImpl;

@RestController
public class CarController {
    
    @Autowired
    CarServiceImpl service;

    @PostMapping("/saveCar")
    public Car saveCar(@RequestBody Car car){
        System.out.println(car);
        return service.addCar(car);
    }

    @PostMapping("/editCar")
    public void editCar(@RequestParam("carId") int id, @RequestBody Car car){
        car.setCarId(id);
        service.editCar(car);
    }

    @GetMapping("/deleteCar")
    public void deleteCar(@RequestParam("carId") int id){
        service.deleteCar(id);
    }

    @GetMapping("/getCars")
    public List<Car> getCars(){
        return service.getAllCars();
    }
   
    @GetMapping("/getCar")
    public Car getCar(@RequestParam("carId") int id){
        return service.getCarById(id);
    }
}