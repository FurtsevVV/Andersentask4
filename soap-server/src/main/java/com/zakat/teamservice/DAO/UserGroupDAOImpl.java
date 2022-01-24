package com.zakat.teamservice.DAO;

import com.zakat.teamservice.model.UserGroup;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

/**
 * {@link UserGroupDAO} implementation.
 * Connect to database
 */
public class UserGroupDAOImpl implements UserGroupDAO {

    SessionFactory factory = new Configuration()
            .configure("hibernate.cfg.xml")
            .addAnnotatedClass(UserGroup.class)
            .buildSessionFactory();


    @Override
    public List<UserGroup> findAllUserGroup() {
        List<UserGroup> userGroupsList;

        Session session = factory.getCurrentSession();
        session.beginTransaction();
        userGroupsList = session.createQuery("from UserGroup", UserGroup.class).list();
        session.getTransaction().commit();
        session.close();
        return userGroupsList;
    }

    @Override
    public void addUserGroup(UserGroup userGroup) {
        Session session = factory.openSession();
        session.beginTransaction();
        session.save(userGroup);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public boolean deleteUserGroup(int userGroup_id) {
        Session session = factory.openSession();
        session.beginTransaction();
        UserGroup userGroup = session.load(UserGroup.class, userGroup_id);
        session.delete(userGroup);
        session.getTransaction().commit();
        session.close();
        return true;
    }

    @Override
    public UserGroup getUserGroupById(int userGroup_id) {
        Session session = factory.openSession();
        session.beginTransaction();
        UserGroup userGroup = session.get(UserGroup.class, userGroup_id);
        session.getTransaction().commit();
        session.close();

        return userGroup;
    }

    @Override
    public void updateUserGroup(UserGroup userGroup) {
        Session session = factory.openSession();
        session.beginTransaction();
        session.update(userGroup);
        session.getTransaction().commit();
        session.close();
    }


    @Override
    public UserGroup getUserGroupByName(String groupName) {
        UserGroup userGroup = null;
        Session session = factory.openSession();
        session.beginTransaction();
        Query query = session.createQuery("FROM UserGroup ug where ug.groupName = :name");
        query.setParameter("name", groupName);
        List<UserGroup> result = query.getResultList();
        if(result.size()==0){
        session.getTransaction().commit();
        session.close();
            return null;

        } else {
         userGroup = result.get(0);
        session.getTransaction().commit();
        session.close();}
        return userGroup;
    }

    @Override
    public boolean deleteUserGroupByName(String groupName) {
        Session session = factory.openSession();
        session.beginTransaction();
        Query query = session.createQuery("FROM UserGroup ug where ug.groupName = :name");
        query.setParameter("name", groupName);
        List<UserGroup> result = query.getResultList();
        if (result.size() == 0) {
            session.getTransaction().commit();
            session.close();
            return false;
        }
        UserGroup userGroup = result.get(0);
        session.delete(userGroup);
        session.getTransaction().commit();
        session.close();
        return true;
    }
}
