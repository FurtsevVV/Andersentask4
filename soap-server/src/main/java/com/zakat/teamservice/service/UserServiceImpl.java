package com.zakat.teamservice.service;

import com.zakat.teamservice.DAO.UserDAO;
import com.zakat.teamservice.DAO.UserDAOImpl;
import com.zakat.teamservice.DAO.UserGroupDAO;
import com.zakat.teamservice.DAO.UserGroupDAOImpl;
import com.zakat.teamservice.model.User;
import com.zakat.teamservice.model.UserGroup;

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
UserGroupDAO userGroupDAO = new UserGroupDAOImpl();

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

    @Override
    public User getUserByUserTelegramId(String userTelegramId) {
      return   userDAO.getUserByUserTelegramId(userTelegramId);
    }

    @Override
    public boolean deleteUserByTelegramId(String userTelegramId) {
        return userDAO.deleteUserByTelegramId(userTelegramId);
    }

    @Override
    public boolean addUserToUserGroup(String telegramUserId, String groupName) {
        User user = userDAO.getUserByUserTelegramId(telegramUserId);
        if(user==null)
            return false;
        UserGroup userGroup = userGroupDAO.getUserGroupByName(groupName);
        if(userGroupDAO==null)
            return false;
        user.setUserGroup(userGroup);
        userDAO.updateUser(user);
        return true;
            }
}
