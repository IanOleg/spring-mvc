package web.DAO;

import web.model.Car;

import java.util.List;
import java.util.Optional;

public interface CarDAO {

    List<Car> getCarsList(Optional<Integer> count);
}
