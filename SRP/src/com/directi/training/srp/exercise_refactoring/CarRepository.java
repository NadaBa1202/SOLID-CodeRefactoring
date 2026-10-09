package com.directi.training.srp.exercise_refactoring;

import java.util.Arrays;
import java.util.List;

public class CarRepository implements ICarRepository {

    private final List<Car> _carsDb = Arrays.asList(
        new Car("1", "Golf III", "Volkswagen"),
        new Car("2", "Multipla", "Fiat"),
        new Car("3", "Megane", "Renault")
    );

    @Override
    public Car findById(String carId) {
        for (Car car : _carsDb) {
            if (car.getId().equals(carId)) {
                return car;
            }
        }
        return null;
    }

    @Override
    public List<Car> findAll() {
        return _carsDb;
    }
}