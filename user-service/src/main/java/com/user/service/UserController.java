package com.user.service;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @GetMapping("/client")
        public String check() {
        return "Welcome to client";
        }
}
