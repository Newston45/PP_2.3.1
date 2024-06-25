package service;

import model.User;

import java.util.List;

public interface UserService {
    public void addUser(User user);
    public void updateUser(User user);
    public void deleteUserById(int id);
    public User findUser(int id);
    public List<User> findAllUsers();
}
