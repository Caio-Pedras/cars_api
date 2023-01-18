package com.cars_api.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cars_api.api.model.Car;

public interface CarRepository extends JpaRepository<Car, Long> {

}
