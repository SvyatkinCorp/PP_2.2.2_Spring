package web.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDao;

@Controller
public class CarController {
    @Autowired
    private CarDao carDao;

    @GetMapping("/cars")
    public String getAllCars(@RequestParam(value = "count", defaultValue = "0") int count,
                             Model model) {
        if (count == 0 || count>5){
       model.addAttribute("AllCars", carDao.getCarList());
        }else {
        model.addAttribute("AllCars",carDao.getListOfCars(count));}
        return "car/cars";
    }

}

