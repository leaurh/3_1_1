package com.example.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.web.model.User;

import com.example.web.repository.UserRepository;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    public UserServiceImpl() {
    }

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public List<User> allUsers() {
        return userRepository.findAll();
    }

    public void saveUser(User user) {
        userRepository.save(user);

    }


    public User getUserById(long id) {
        return userRepository.findById(id).orElse(null);
    }


    public void updateUser(long id, User updatedUser) {
        updatedUser.setId(id);
        userRepository.save(updatedUser);

    }


    public void deleteUser(long id) {
        userRepository.deleteById(id);

    }
}
