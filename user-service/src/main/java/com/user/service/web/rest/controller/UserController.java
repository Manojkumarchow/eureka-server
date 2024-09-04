package com.user.service.web.rest.controller;

import com.user.service.kafka.Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class UserController {

    @Autowired
    private Sender sender;

    @Autowired
    private UserService userService;

    @GetMapping("/client")
    public String check() {
        return "Welcome to client";
    }

    @PostMapping("/createUser")
    public String sendMessage(@RequestBody Map<String, Object> metaData) {
        User user = userService.createUser(metaData);
        metaData.put("user", user);
        return sender.sendMessage(metaData);
    }
}

