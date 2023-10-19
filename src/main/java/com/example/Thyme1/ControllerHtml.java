package com.example.Thyme1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerHtml {
    @GetMapping("/addPractical")
    public String add(Model model){
        Car car = new Car(1,"jaguar","blue");
        model.addAttribute("car",car);
        return "Practical";
    }
}
