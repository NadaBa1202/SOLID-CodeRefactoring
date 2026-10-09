package com.directi.training.srp.exercise_refactoring;

import java.util.List;
import java.util.stream.Collectors;

public class CarFormatter {

    public String getCarsNames(List<Car> cars) {
        return cars.stream()
            .map(car -> car.getBrand() + " " + car.getModel())
            .collect(Collectors.joining(", "));
    }
}
