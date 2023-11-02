package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private static final List<Car> car = new ArrayList<>();

    static {
        car.add(new Car(959595, "Kia", "Rio"));
        car.add(new Car(888888, "Ford", "Focus"));
        car.add(new Car(33333, "Lada", "2107"));
        car.add(new Car(494949, "Audi", "A6"));
        car.add(new Car(9999999, "BMW", "X7"));
    }

    @Override
    public List<Car> getCarList(int count) {
        if (count > 4) {
            return car;
        }
        return car.subList(0, count);
    }

}

