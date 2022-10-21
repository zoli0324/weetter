package com.codecool.weetter.controller;

import com.codecool.weetter.modell.User;
import com.codecool.weetter.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(consumes = MediaType.APPLICATION_JSON_VALUE,
                produces = MediaType.APPLICATION_JSON_VALUE)
    public String user(@RequestBody User user) {
        System.out.println(user.toString());
        return user.toString();
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public void addUser(@RequestBody User user) {
        System.out.println(user.toString());
        userService.addUser(user);
    }


}
