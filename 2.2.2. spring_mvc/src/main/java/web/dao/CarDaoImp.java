package web.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Repository
public class CarDaoImp implements CarDao {


    @Autowired
    private Car car;

    @Override
    public List<Car> getAllCars() {
        return car.getAllCars();
    }


    @Override
    public List<Car> getCars(int count) {
        List<Car> listCar = car.getAllCars();
        return listCar.stream().limit(count).collect(Collectors.toList());
    }
}


