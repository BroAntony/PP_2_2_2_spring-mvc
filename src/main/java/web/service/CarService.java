package web.service;

import web.model.Car;
import web.model.Color;

import java.util.ArrayList;
import java.util.List;

public class CarService {
    public static List<Car> getListCar (int count){
        Car car1 = new Car("ГАЗ Волга", "3101", Color.BLACK);
        Car car2 = new Car("ГАЗ Волга", "3110", Color.WHITE);
        Car car3 = new Car("ВАЗ Лада", "2106", Color.DARK);
        Car car4 = new Car("ВАЗ Лада", "2110", Color.GREEN);
        Car car5 = new Car("Ferrari", "F8", Color.RED);
        List<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        if (count >= 5) {
            return cars;
        } else {
            return switch (count) {
                case 1 -> cars.subList(0, 1);
                case 2 -> cars.subList(0, 2);
                case 3 -> cars.subList(0, 3);
                case 4 -> cars.subList(0, 4);
                default -> cars.subList(0, 0);
            };
        }
    }
}
