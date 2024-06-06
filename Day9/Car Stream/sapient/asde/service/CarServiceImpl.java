package com.sapient.asde.service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.Comparator;

import com.sapient.asde.model.Car;

public class CarServiceImpl implements CarService {

    @Override
    public double sumOfPrices(List<Car> carList) {
        return carList.stream()
                .mapToDouble(Car::getPrice)
                .sum();
    }

    @Override
    public List<String> getCarNames(List<Car> carList) {
        return carList.stream()
                .map(Car::getCarName)
                .collect(Collectors.toList());
    }

    @Override
    public Set<String> getCarMakers(List<Car> carList) {
        return carList.stream()
                .map(Car::getCareMake)
                .collect(Collectors.toSet());
    }

    @Override
    public double getHighPricedCar(List<Car> carList) {
        return carList.stream()
                .mapToDouble(Car::getPrice)
                .max()
                .orElse(0);
    }

    @Override
    public Car getCarWithLowPricedCar(List<Car> carList) {
        return carList.stream()
                .min(Comparator.comparingDouble(Car::getPrice))
                .orElse(null);
    }
}
