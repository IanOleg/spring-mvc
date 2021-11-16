package web.DAO;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class CarDAOlmp implements CarDAO{

    private List<Car> carsList;

    {
        this.carsList = new ArrayList<Car>();
        this.carsList.add(new Car("1425","Nissan","gray"));
        this.carsList.add(new Car("2344","TOYOTA","red"));
        this.carsList.add(new Car("4566","BMW","black"));
        this.carsList.add(new Car("0089","AUDI","black"));
        this.carsList.add(new Car("9121","Subaru","white"));
    }

    public List<Car> getCarsList(Optional<Integer> count){
        if (count.isPresent() && count.get() < 5){
            return carsList.stream().limit(count.get()).collect(Collectors.toList());
        } else {
            return carsList;
        }
    }
}
