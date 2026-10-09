package com.directi.training.srp.exercise_refactoring;

import java.util.List;

public interface ICarRepository {
    Car findById(String carId);
    List<Car> findAll();
}