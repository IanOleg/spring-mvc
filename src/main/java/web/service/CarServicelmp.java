package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.DAO.CarDAO;
import web.DAO.CarDAOlmp;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CarServicelmp implements CarService {

    CarDAO carDAO;

    {
        carDAO = new CarDAOlmp();
    }

    public List<Car> getCarsList(Optional<Integer> count){
        return carDAO.getCarsList(count);
    }
}
