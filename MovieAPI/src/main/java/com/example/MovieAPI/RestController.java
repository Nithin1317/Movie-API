package com.example.MovieAPI;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RestController {
    @GetMapping("/")
    public String landingPage(){
        return "landingPage";
    }
}
