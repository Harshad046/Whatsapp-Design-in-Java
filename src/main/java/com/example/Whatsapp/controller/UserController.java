package com.example.Whatsapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.Whatsapp.service.UserService;
import com.example.Whatsapp.model.User;
import com.example.Whatsapp.model.UserDTO;

import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {
    
    @Autowired
    private UserService userService;

    @PostMapping
    public User registerUser(@RequestBody @Validated UserDTO userDTO) {
        System.err.println("User registered Successfully: " + userDTO.getName() + ", " + userDTO.getPhone());
        return userService.registerUser(userDTO.getName(), userDTO.getPhone());
    } 

    @GetMapping("/{userId}")
    public Optional<User> getUser(@PathVariable Long userId) {
        return Optional.ofNullable(userService.getUser(userId));  
    } 

    @PutMapping("/login")
    public void loginUser(@RequestParam Long userId) {
        userService.login(userId);
    }

    @PutMapping("/logout")
    public void logoutUser(@RequestParam Long userId) {
        userService.logout(userId);
    }

}
