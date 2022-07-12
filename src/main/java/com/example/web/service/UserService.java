package com.example.web.service;

import com.example.web.model.User;

import java.util.List;

public interface UserService {
    List<User> allUsers();

    void saveUser(User user);

    User getUserById(long id);

    void updateUser(long id,User updatedUser);

    void deleteUser(long id);

}
