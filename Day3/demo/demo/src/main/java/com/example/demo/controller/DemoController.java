package com.example.demo.controller;
import com.example.demo.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class DemoController {
    @RequestMapping("/")
    public String getMessage(){
        return "Hey!Good going";
    }
    @RequestMapping("/")
    public Employee getEmployee(){
        return new Employee("Muskan");

    }
}
