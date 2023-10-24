package com.example.mar2023spring.service;

import com.example.mar2023spring.models.Car;

import java.util.List;

public interface CarService {
    List<Car> getCars();

    Car getCar(String id);

    void saveCar(Car car);

    void deleteCar(String id);

}