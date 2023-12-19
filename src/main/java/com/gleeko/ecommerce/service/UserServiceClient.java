package com.gleeko.ecommerce.service;

import com.gleeko.userservice.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserServiceClient {

    private final RestTemplate restTemplate;
    private final String userServiceUrl = "http://localhost:8080/users"; // The URL where UserService is hosted

    @Autowired
    public UserServiceClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    // Method to call UserService and get a user by ID
    public User getUserById(Long id) {
        return restTemplate.getForObject(userServiceUrl + "/" + id, User.class);
    }
}
