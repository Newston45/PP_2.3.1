package com.example.usermanager.usermanager.dao;

import com.example.usermanager.usermanager.model.User;

import java.util.List;

public interface UserDao {
    void save(User user);
    void delete(User user);
    User findById(Long id);
    List<User> findAll();
}
