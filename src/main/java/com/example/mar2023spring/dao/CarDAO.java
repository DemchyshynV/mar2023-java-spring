package com.example.mar2023spring.dao;

import com.example.mar2023spring.models.Car;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CarDAO extends MongoRepository<Car, String> {
}
