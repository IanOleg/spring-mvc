package web.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class CarDAOlmp implements CarDAO{

    private List<Car> carsList;

    {
        this.carsList = new ArrayList<Car>();
        this.carsList.add(new Car("125","Nissan","gray"));
        this.carsList.add(new Car("234","TOYOTA","red"));
        this.carsList.add(new Car("456","BMW","black"));
        this.carsList.add(new Car("009","AUDI","black"));
        this.carsList.add(new Car("911","Subaru","white"));
    }

    public List<Car> getCarsList(Optional<Integer> count){
        if (count.isPresent() && count.get() < 5){
            return carsList.stream().limit(count.get()).collect(Collectors.toList());
        } else {
            return carsList;
        }
    }
}
