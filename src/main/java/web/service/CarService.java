package web.service;

import web.model.Car;

import java.util.List;
import java.util.Optional;

public interface CarService {
    public List<Car> getCarsList(Optional<Integer> count);
}
