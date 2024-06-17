package com.user.service;

import com.user.service.kafka.Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private Sender sender;

    @GetMapping("/client")
    public String check() {
        return "Welcome to client";
    }

    @PostMapping("/send/{message}")
    public String sendMessage(@PathVariable String message) {
        return sender.sendMessage(message);
    }
}
