package miu.ea.springeamonolith.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello, this is a beautiful day!";
    }
}
