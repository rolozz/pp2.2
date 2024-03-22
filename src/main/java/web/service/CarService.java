package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("bmw", "v1", 2010));
        cars.add(new Car("lada", "V2", 2011));
        cars.add(new Car("niwa", "v3", 2012));
        cars.add(new Car("kia", "V1", 2013));
        cars.add(new Car("tesla", "v2", 2014));
    }

    public List<Car> getCars(int count) {
        if (count >= 5) {
            return cars;
        }
        return cars.stream().limit(count).toList();
    }
}