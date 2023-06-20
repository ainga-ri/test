package com.example.democovert;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/example")
@CrossOrigin(origins = "http://localhost:3000")
public class TestController {

    @GetMapping
    public String helloEmilia() {
        return "Hello Emilia";
    }
}
