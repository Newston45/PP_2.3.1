package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    void save(User user);
    void delete(User user);
    User findById(Long id);
    List<User> findAll();
}
