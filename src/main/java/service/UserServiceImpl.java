package service;

import dao.UserDAO;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Transactional
    @Override
    public void addUser(User user) {
        userDAO.addUser(user);
    }

    @Transactional
    @Override
    public void updateUser(User user) {
        userDAO.updateUser(user);
    }

    @Transactional
    @Override
    public void deleteUserById(int id) {
        userDAO.deleteUser(findUser(id));
    }

    @Transactional
    @Override
    public User findUser(int id) {
        return userDAO.findUser(id);
    }

    @Transactional
    @Override
    public List<User> findAllUsers() {
        return userDAO.findAllUsers();
    }
}
