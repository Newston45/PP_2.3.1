package web.dao;

import org.springframework.stereotype.Repository;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional
    public void save(User user) {
        if (user.getId() != null) {
            em.merge(user);
        } else {
            em.persist(user);
        }
    }

    @Override
    @Transactional
    public void delete(User user) {
        em.remove(user);
    }

    @Override
    @Transactional
    public User findById(Long id) {
        return em.find(User.class, id);
    }

    @Override
    @Transactional
    public List<User> findAll() {
        return em.createQuery("select u from User u", User.class).getResultList();
    }
}
