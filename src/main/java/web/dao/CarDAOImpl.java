package web.dao;

import web.dao.CarDAO;
import web.model.Car;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class CarDAOImpl implements CarDAO {
    private final List<Car> cars = Arrays.asList(
            new Car("Toyota", "Blue", 2000),
            new Car("BMW", "Yellow", 3500),
            new Car("Mercedes", "Red", 4000),
            new Car("Porche", "Black", 3000),
            new Car("Ford", "White", 3000)
    );

    @Override
    public List<Car> getCars(int count) {
        if (count >= cars.size()) {
            return cars;
        }
        return cars.subList(0, count);
    }
}
