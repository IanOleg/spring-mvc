package web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import web.DAO.CarDAO;
import web.DAO.CarDAOlmp;
import web.service.CarService;
import web.service.CarServicelmp;

@Configuration()
public class AppConfig {

    @Bean()
    @Scope("prototype")
    public CarService CarServicelmpBean() {
        return new CarServicelmp();
    }

    @Bean()
    @Scope("prototype")
    public CarDAO CarDAOlmpBean() {
        return new CarDAOlmp();
    }
}