package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.DAO.CarDAO;
import web.DAO.CarDAOlmp;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class CarServicelmp implements CarService {

    @Autowired
    CarDAO carDAO;

   // {
        //carDAO = new CarDAOlmp();
   // }

    public List<Car> getCarsList(Optional<Integer> count){
        return carDAO.getCarsList(count);
    }
}
