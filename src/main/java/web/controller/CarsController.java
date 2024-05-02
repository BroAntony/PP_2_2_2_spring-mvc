package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.service.CarService;


import javax.servlet.http.HttpServletRequest;


@Controller
public class CarsController {
    @GetMapping(value = "/cars")
    public String carsPage(HttpServletRequest request, ModelMap model) {
        int count;
        if (request.getParameter("count") != null){
            count = Integer.parseInt(request.getParameter("count"));
        } else {
            count = 5;
        };
        model.addAttribute("cars", CarService.getListCar(count));
        return "cars";
    }
}
