package fr.polytech.CovidAlert.controllers;

import fr.polytech.CovidAlert.models.User;
import fr.polytech.CovidAlert.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Scanner;

@RestController
@RequestMapping("/api/v1/users")
public class UsersController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<User> list() {
        return userRepository.findAll();
    }
    @GetMapping
    @RequestMapping("{id}")
    public User get(@PathVariable Long id) {
        User user = userRepository.getById(id);
        System.out.println(user);
        return userRepository.getById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public User create(@RequestBody final User user) {
        return  userRepository.saveAndFlush(user);
    }
}
