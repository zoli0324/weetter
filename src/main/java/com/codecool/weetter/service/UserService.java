package com.codecool.weetter.service;

import com.codecool.weetter.modell.User;
import com.codecool.weetter.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public String index() {
        return "hello";
    }

    public void addUser(User user) {
        System.out.println(user.toString());
        userRepository.save(user);
    }
}
