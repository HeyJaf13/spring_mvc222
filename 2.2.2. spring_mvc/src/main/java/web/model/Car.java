package web.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class Car {
    private String name;
    private String model;
    private int series;


    public List<Car> getAllCars() {
        List<Car> listCars = new ArrayList<>();
        listCars.add(new Car("vaz", "2110", 712));
        listCars.add(new Car("vaz", "2114", 933));
        listCars.add(new Car("vaz", "2121", 113));
        listCars.add(new Car("vaz", "2112", 124));
        listCars.add(new Car("vaz", "2106", 448));
        return listCars;
    }
    public Car(String name, String model, int series) {
        this.name = name;
        this.model = model;
        this.series = series;
    }
    public Car(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", series=" + series +
                '}';
    }
}

