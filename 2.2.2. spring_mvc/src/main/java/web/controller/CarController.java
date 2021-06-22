package web.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller


public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping("/cars")
    public String listCars(@RequestParam(value = "count", required = false, defaultValue = "5") int count,
                           Model model) {
        if (count >= 5) {
            model.addAttribute("cars", carService.getAllCars());
        }
        model.addAttribute("cars", carService.getCars(count));
        return "cars";
    }
}



