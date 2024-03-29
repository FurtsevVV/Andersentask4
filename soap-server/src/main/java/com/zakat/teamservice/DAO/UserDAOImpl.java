package com.zakat.teamservice.DAO;

import com.zakat.teamservice.model.User;
import com.zakat.teamservice.model.UserGroup;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

/**
 * {@link UserDAO} implementation.
 * Connect to database
 */

public class UserDAOImpl implements UserDAO {
    SessionFactory factory = new Configuration()
            .configure("hibernate.cfg.xml")
            .addAnnotatedClass(User.class)
            .buildSessionFactory();


    /**
     * Return User from database
     *
     * @param user_id
     * @return User to user_id
     */
    @Override
    public User getUserById(int user_id) {
        Session session = factory.openSession();
        session.beginTransaction();
        User user = session.get(User.class, user_id);
        session.getTransaction().commit();
        session.close();

        return user;
    }

    /**
     * Find all users in database
     *
     * @return List of Users
     */
    @Override
    public List<User> findAllUsers() {
        List<User> userList;
        Session session = factory.openSession();
        session.beginTransaction();
        userList = session.createQuery("from User", User.class).list();
        session.getTransaction().commit();
        session.close();
        return userList;

    }

    /**
     * Delete User
     *
     * @param user_id
     * @return true if user has been removed
     */
    @Override
    public boolean deleteUserById(int user_id) {

        Session session = factory.openSession();
        session.beginTransaction();
        User user = session.load(User.class, user_id);
        session.delete(user);
        session.getTransaction().commit();
        session.close();
        return true;
    }

    /**
     * Update given user
     *
     * @param user
     */
    @Override
    public void updateUser(User user) {
        Session session = factory.openSession();
        session.beginTransaction();
        session.update(user);
        session.getTransaction().commit();
        session.close();
    }

    /**
     * Save new user
     *
     * @param user
     */
    @Override
    public void addUser(User user) {
        Session session = factory.openSession();
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
        session.close();
    }


    @Override
    public User getUserByUserTelegramId(String userTelegramId) {
        Session session = factory.openSession();
        session.beginTransaction();
        User user = null;
        Query query = session.createQuery("FROM User u where u.telegramUserId = :name");
        query.setParameter("name", userTelegramId);
        List<User> result = query.getResultList();
        if (result.size() == 0) {
            session.close();
            return null;
        } else {
            user = result.get(0);
            session.getTransaction().commit();
            session.close();
        }
        return user;
    }

    @Override
    public boolean deleteUserByTelegramId(String userTelegramId) {
        Session session = factory.openSession();
        session.beginTransaction();
        Query query = session.createQuery("FROM User u where u.telegramUserId = :name");
        query.setParameter("name", userTelegramId);
        List<User> result = query.getResultList();
        if (result.size() == 0)
            return false;
        User user = result.get(0);
        session.getTransaction().commit();
        session.close();

        Session session1 = factory.openSession();
        session1.beginTransaction();
        session1.delete(user);
        session1.getTransaction().commit();
        session1.close();
        return true;
    }

    @Override
    public boolean deleteUserFromUserGroup(User user, UserGroup userGroup) {
        Session session = factory.openSession();
        session.beginTransaction();
        user.setUserGroup(null);
        session.update(user);
        session.getTransaction().commit();
        session.close();
        return true;
    }

    @Override
    public List<User> findAllUsersFromGroup(String groupName) {
        Session session = factory.openSession();
        session.beginTransaction();

        Query query = session.createQuery("from User u where u.userGroup.groupName = :name");
        query.setParameter("name", groupName);
        List<User> result = query.getResultList();
        session.getTransaction().commit();
        session.close();
        return result;
    }
}
