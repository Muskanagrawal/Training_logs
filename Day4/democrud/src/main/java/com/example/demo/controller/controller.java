package com.example.demo.controller;

import com.example.demo.CrudApplication;
import com.example.demo.model.crudStudent;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
class Controller{

    @RequestMapping(value = "/hello")
    public String sayHello() {
        return "Hello World Developer!!!";
    }


    @Autowired
    private StudentService studentService;


    @PostMapping("/users")
    public crudStudent saveUser(@RequestBody crudStudent student){

        return studentService.userSave(student);
    }

    @GetMapping("/users")
    public List<crudStudent> allUsers() {

        return studentService.findAll();
    }

    @GetMapping("/users/count")
    public Long count() {

        return studentService.count();
    }

    @DeleteMapping("/users/{id}")
    public void delete(@PathVariable String id) {

        Long userId = Long.parseLong(id);
        studentService.deleteById(userId);
    }
}
