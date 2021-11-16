package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.DAO.CarDAO;
import web.model.Car;
import java.util.List;
import java.util.Optional;

@Service
public class CarServicelmp implements CarService {

    @Autowired
    private CarDAO carDAO;

    public List<Car> getCarsList(Optional<Integer> count){
        return carDAO.getCarsList(count);
    }
}
