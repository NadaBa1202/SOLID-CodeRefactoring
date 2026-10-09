package com.directi.training.srp.exercise_refactoring;

public class CarManager {

    private final ICarRepository _repository;
    private final CarFormatter _formatter;

    public CarManager(
            ICarRepository repository,
            CarFormatter formatter) {
        _repository = repository;
        _formatter = formatter;
    }

    public Car getFromDb(String carId) {
        return _repository.findById(carId);
    }

    public String getCarsNames() {
        return _formatter.getCarsNames(_repository.findAll());
    }

    public Car getBestCar() {
        Car bestCar = null;

        for (Car car : _repository.findAll()) {
            if (bestCar == null ||
                car.getModel().compareTo(bestCar.getModel()) > 0) {
                bestCar = car;
            }
        }

        return bestCar;
    }
}