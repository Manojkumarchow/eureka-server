package com.user.service.web.rest.service.impl;

import com.user.service.web.rest.controller.User;
import com.user.service.web.rest.controller.UserService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public User createUser(Map<String, Object> metaData) {
        return User.builder()
                .firstName((String) metaData.get("firstName"))
                .lastName((String) metaData.get("lastName"))
                .email((String) metaData.get("email"))
                .build();
    }
}
