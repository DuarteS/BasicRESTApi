package com.fontys.dockerapp.WorkshopDocker.Services;

import com.fontys.dockerapp.WorkshopDocker.Models.User;
import com.fontys.dockerapp.WorkshopDocker.Repositorys.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public User getUserById(String id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("No user by ID: " + id));
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

}
