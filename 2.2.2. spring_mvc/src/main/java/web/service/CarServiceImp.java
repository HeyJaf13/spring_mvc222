package web.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.dao.CarDaoImp;
import web.model.Car;

import java.util.List;
@Service
@AllArgsConstructor
public class CarServiceImp implements CarService{

    @Autowired
    private CarDao carDao;



    @Override
    public List<Car> getCars(int count) {


        return carDao.getCars(count);
    }

    @Override
    public List<Car> getAllCars() {
        return carDao.getAllCars();
    }
}
