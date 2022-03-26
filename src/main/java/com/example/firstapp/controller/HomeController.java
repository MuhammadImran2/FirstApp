package com.example.firstapp.controller;


import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {

   /* @RequestMapping("/")
    public String sayHelloGet() {
        return "Hello World from Get";
    }*/

    @GetMapping("/")
    public String sayHelloGet() {
        return "Hello World from Get";
    }

    @PostMapping("/")
    public String sayHelloPost() {
        return "Hello World from Post";
    }

    @PutMapping("/")
    public String sayHelloPut() {
        return "Hello World from Put";
    }

    @DeleteMapping("/")
    public String sayHelloDelete() {
        return "Hello World from Delete ";
    }
    //http://localhost:8080/
}
