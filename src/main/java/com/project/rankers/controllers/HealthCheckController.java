package com.project.rankers.controllers;

import com.project.rankers.entities.User;
import com.project.rankers.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class HealthCheckController {

    @Autowired
    private UserService userService;

    @GetMapping("/health")
    public String health() {
        return "OK";
    }
}
