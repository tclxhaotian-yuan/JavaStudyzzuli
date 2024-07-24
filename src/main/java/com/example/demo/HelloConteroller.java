package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloConteroller {
    @GetMapping
    public String hello() {
        return "Hello 同程旅行！";
    }
}