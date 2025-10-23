package web.service;

import web.dao.CarDAO;
import web.dao.CarDAOImpl;
import web.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    private final CarDAOImpl carDAO;

    @Autowired
    public CarService(CarDAOImpl carDAO) {
        this.carDAO = carDAO;
    }

    public List<Car> getCars(int count) {
        return carDAO.getCars(count);
    }
}
