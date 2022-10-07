package com.fareye.training.controller;

import com.fareye.training.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
    List<User> users = new ArrayList<>();
    @GetMapping("/hello")
    public String hello(@RequestParam String name){
        return "hello i am "+name;
    }

    @PostMapping("/add")
    public List<User> add(@RequestBody User name){
        users.add(name);
        System.out.println(users);
        return users;
    }

}
