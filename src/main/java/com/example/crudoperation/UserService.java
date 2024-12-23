package com.example.crudoperation;

import com.example.crudoperation.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class UserService {
    @Autowired
    private UserRepository userRepository;
    public  String addNewUser ( String name,  String email) {


        User n = new User();
        n.setName(name);
        n.setEmail(email);
        userRepository.save(n);
        return "Saved";
    }

    public Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }
}
