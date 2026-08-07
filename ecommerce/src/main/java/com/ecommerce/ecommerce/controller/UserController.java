package com.ecommerce.ecommerce.controller;

import com.ecommerce.ecommerce.model.User;
import com.ecommerce.ecommerce.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users/{id}")
    public User getUserById (@PathVariable Long id) {
        return userService.findbyId(id);
    }

    @GetMapping("/users/{name}")
    public User getUserByName (@PathVariable String name) {
        return userService.findbyName(name);
    }

    @PostMapping("/users")
    public User createUser (@RequestBody User user){
        return userService.saveUser(user);
    }


}
