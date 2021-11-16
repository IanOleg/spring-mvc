package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.DAO.CarDAO;
import web.model.Car;
import web.service.CarService;

import java.util.List;
import java.util.Optional;

@Controller
public class CarsListController {

    @Autowired
    private CarService carService;

    @GetMapping(value = "/cars")
    public String printCarsList(@RequestParam(name = "count", required = false) Optional<Integer> count, ModelMap model) {

        List<Car> messages = carService.getCarsList(count);
        model.addAttribute("messages", messages);
        return "CarsList";
    }
}
