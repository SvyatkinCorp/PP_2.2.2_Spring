package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarDao {

    private List<Car> carList;

    {
        carList = new ArrayList<>();
        carList.add(new Car("Kia", "Rio", "Green"));
        carList.add(new Car("Opel", "Astra", "Yellow"));
        carList.add(new Car("Ford", "Focus 2", "Orange"));
        carList.add(new Car("Audi", "Q3", "Grey"));
        carList.add(new Car("Kia", "Ceed", "Green"));
    }

    public List<Car> getCarList() {
        return carList;
    }

    public List<Car> getListOfCars(int count) {

        return carList.stream().limit(count).toList();

    }
}

