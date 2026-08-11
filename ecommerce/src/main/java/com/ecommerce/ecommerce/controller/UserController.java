package com.ecommerce.ecommerce.controller;

import com.ecommerce.ecommerce.model.User;
import com.ecommerce.ecommerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private final UserService userService;

    public UserController (UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public User getUserById (@PathVariable Long id) {
        return userService.findbyId(id);
    }

    @GetMapping("/name/{name}")
    public User getUserByName (@PathVariable String name) {
        return userService.findByName(name);
    }

    @PostMapping
    public User createUser (@RequestBody User user){
        return userService.saveUser(user);
    }


}
