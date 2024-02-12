package com.car.carrentalmanagementsystem.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.car.carrentalmanagementsystem.model.Car;
import com.car.carrentalmanagementsystem.repository.CarRepository;

@Component
public class CarServiceImpl implements CarServiceInterface{
    
    @Autowired
    CarRepository carRepo;
    public Car addCar(Car car){
        return (carRepo.save(car));
    }
    public List<Car> getAllCars(){
        List<Car> car = carRepo.findAll(); 
        return (car);
    }
    public Car getCarById(int id){
        Optional<Car> opt = carRepo.findById(id);
        return opt.get();
    }
    public void deleteCar(int id){
        Optional<Car> opt = carRepo.findById(id);
        carRepo.delete(opt.get());
    }
    public void editCar(Car car){
        carRepo.save(car);
    }
}

