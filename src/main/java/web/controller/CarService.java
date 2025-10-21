package web.controller;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class CarService {
    private List<Car> cars = Arrays.asList(
            new Car("Toyota", "Blue", 2000),
            new Car("BMW", "Yellow", 3500),
            new Car("Mercedes", "Red", 4000),
            new Car("Porche", "Black", 3000),
            new Car("Ford", "White", 3000)
    );

    public List<Car> getCars(int count) {
        if (count >= cars.size()) {
            return cars;
        }
        return cars.subList(0, count);
    }
}
