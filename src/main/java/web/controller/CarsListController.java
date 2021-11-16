package web.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.config.AppConfig;
import web.config.AppInit;
import web.config.WebConfig;
import web.model.Car;
import web.service.CarService;
import web.service.CarServicelmp;

import java.util.List;
import java.util.Optional;

@Controller
public class CarsListController {

    @GetMapping(value = "/cars")
    public String printCarsList(@RequestParam(name = "count", required = false) Optional<Integer> count, ModelMap model) {

        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        CarService carService =
                applicationContext.getBean("CarServicelmpBean", CarService.class);

        //CarService carService = new CarServicelmp();
        List<Car> messages = carService.getCarsList(count);

        model.addAttribute("messages", messages);
        return "CarsList";
    }
}
