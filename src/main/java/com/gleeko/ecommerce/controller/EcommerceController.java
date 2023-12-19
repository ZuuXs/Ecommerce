package com.gleeko.ecommerce.controller;

import com.gleeko.ecommerce.service.UserServiceClient;
import com.gleeko.userservice.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ecommerce")
public class EcommerceController {

    private final UserServiceClient userServiceClient;

    @Autowired
    public EcommerceController(UserServiceClient userServiceClient) {
        this.userServiceClient = userServiceClient;
    }

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable Long id) {
        return userServiceClient.getUserById(id);
    }
}