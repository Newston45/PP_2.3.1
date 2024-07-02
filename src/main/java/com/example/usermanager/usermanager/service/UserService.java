package com.example.usermanager.usermanager.service;

import com.example.usermanager.usermanager.model.User;

import java.util.List;

public interface UserService {
    void save(User user);
    void delete(User user);
    User findById(Long id);
    List<User> findAll();
}
