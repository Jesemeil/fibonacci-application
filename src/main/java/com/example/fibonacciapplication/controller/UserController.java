package com.example.fibonacciapplication.controller;

import com.example.fibonacciapplication.model.User;
import com.example.fibonacciapplication.service.UserService;
import com.example.fibonacciapplication.util.FibonacciUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public User registerUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @GetMapping("/all")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/fibonacci/{n}")
    public long getFibonacci(@PathVariable int n) {
        return FibonacciUtil.fibonacci(n);
    }
}
