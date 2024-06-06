package com.sapient.asde.service;

import java.util.List;
import java.util.Set;
import com.sapient.asde.model.Car;

public interface CarService {
    double sumOfPrices(List<Car> carList);

    List<String> getCarNames(List<Car> carList);

    Set<String> getCarMakers(List<Car> carList);

    double getHighPricedCar(List<Car> carList);

    Car getCarWithLowPricedCar(List<Car> carList);
}
