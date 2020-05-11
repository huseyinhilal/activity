package com.activity.activity.controller;

import com.activity.activity.model.Users;
import com.activity.activity.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="/rest/user")
public class UserController {

    @Autowired
    UserRepository userRepository;
    @GetMapping(value="/all")
    public List<Users> getAll(){
        return userRepository.findAll();
    }

    @PostMapping(value="/load")
    public List<Users> persist(@RequestBody final Users users){
        userRepository.save(users);
        return userRepository.findAll();
    }




    //id'ye göre kullanıcı çekmek
    @PostMapping(value="/loadby")
    public Optional<Users> getUserById(@RequestBody Integer userId){
        return userRepository.findById(userId);
    }
}
