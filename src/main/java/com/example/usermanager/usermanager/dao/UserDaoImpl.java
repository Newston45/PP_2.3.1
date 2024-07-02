package com.example.usermanager.usermanager.dao;

import com.example.usermanager.usermanager.model.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void save(User user) {
        if (user.getId() != null) {
            em.merge(user);
        } else {
            em.persist(user);
        }
    }

    @Override
    public void delete(User user) {
        em.remove(user);
    }

    @Override
    public User findById(Long id) {
        return em.find(User.class, id);
    }

    @Override
    public List<User> findAll() {
        return em.createQuery("select u from User u", User.class).getResultList();
    }
}
