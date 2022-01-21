package com.zakat.teamservice.service;

import com.zakat.teamservice.DAO.UserDAO;
import com.zakat.teamservice.DAO.UserDAOImpl;
import com.zakat.teamservice.model.User;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

/**
 * {@link UserService} implementation.
 *
 */

@WebService(endpointInterface = "com.zakat.teamservice.service.UserService")
public class UserServiceImpl implements UserService{

UserDAO userDAO = new UserDAOImpl();

    @Override
    @WebMethod
    public User getUserById(int user_id) {
        return userDAO.getUserById(user_id) ;
    }

    @Override
    @WebMethod
    public List<User> findAllUsers() {
        return userDAO.findAllUsers();
    }

    @Override
    @WebMethod
        public boolean deleteUserById(int user_id) {
        User user = null;
        user = userDAO.getUserById(user_id);
        if(user==null)
       return false;
                      else
        return userDAO.deleteUserById(user_id);
    }

    @Override
    @WebMethod
    public void updateUser(User user) {
    userDAO.updateUser(user);
    }

    @Override
    @WebMethod
    public void addUser(User user) {
userDAO.addUser(user);
    }
}
