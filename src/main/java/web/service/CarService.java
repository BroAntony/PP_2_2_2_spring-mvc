package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;
import web.model.Color;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class CarService implements ICarService {

    List<Car> cars;
    @PostConstruct
    public void init() {
        Car car1 = new Car("ГАЗ Волга", "3101", Color.BLACK);
        Car car2 = new Car("ГАЗ Волга", "3110", Color.WHITE);
        Car car3 = new Car("ВАЗ Лада", "2106", Color.DARK);
        Car car4 = new Car("ВАЗ Лада", "2110", Color.GREEN);
        Car car5 = new Car("Ferrari", "F8", Color.RED);
        cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
    }
    public List<Car> getListCar (int count) {
        if (count >= 5) {
            return cars;
        } else {
            return cars.subList(0, count);
        }
    }
}
