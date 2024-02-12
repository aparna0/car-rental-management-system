package com.car.carrentalmanagementsystem.services;

import java.util.List;

import org.springframework.stereotype.Component;

import com.car.carrentalmanagementsystem.model.Car;

@Component
public interface CarServiceInterface {

    public Car addCar(Car car);
    public List<Car> getAllCars();
    public Car getCarById(int id);
    public void deleteCar(int id);
    public void editCar(Car car);
}