package com.car.carrentalmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.car.carrentalmanagementsystem.model.Car;

@Component
@Repository
public interface CarRepository extends JpaRepository<Car,Integer>{
}
