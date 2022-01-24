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
 */

@WebService(endpointInterface = "com.zakat.teamservice.service.UserService")
public class UserServiceImpl implements UserService {

    UserDAO userDAO = new UserDAOImpl();
    UserGroupDAO userGroupDAO = new UserGroupDAOImpl();


    /**
     * Return User by Id
     *
     * @param user_id
     * @return User Object
     */
    @Override
    @WebMethod
    public User getUserById(int user_id) {
        return userDAO.getUserById(user_id);
    }


    /**
     * Return all users from current course
     *
     * @return List Users
     */
    @Override
    @WebMethod
    public List<User> findAllUsers() {
        return userDAO.findAllUsers();
    }

    /**
     * Delete User
     *
     * @param user_id
     * @return true if user has been removed
     */
    @Override
    @WebMethod
    public boolean deleteUserById(int user_id) {
        User user = null;
        user = userDAO.getUserById(user_id);
        if (user == null)
            return false;
        else
            return userDAO.deleteUserById(user_id);
    }

    /**
     * Update given user
     *
     * @param user
     */
    @Override
    @WebMethod
    public void updateUser(User user) {
        userDAO.updateUser(user);
    }

    /**
     * Add new user
     *
     * @param user
     */
    @Override
    @WebMethod
    public void addUser(User user) {
        userDAO.addUser(user);
    }

    /**
     * Get User by user telegram id
     *
     * @param userTelegramId
     * @return
     */
    @WebMethod
    @Override
    public User getUserByUserTelegramId(String userTelegramId) {
        return userDAO.getUserByUserTelegramId(userTelegramId);
    }

    /**
     * Delete user by telegram id
     *
     * @param userTelegramId
     * @return
     */
    @WebMethod
    @Override
    public boolean deleteUserByTelegramId(String userTelegramId) {
        return userDAO.deleteUserByTelegramId(userTelegramId);
    }

    /**
     * Add user to UserGroup
     *
     * @param telegramUserId
     * @param groupName
     * @return
     */
    @WebMethod
    @Override
    public boolean addUserToUserGroup(String telegramUserId, String groupName) {
        User user = userDAO.getUserByUserTelegramId(telegramUserId);
        if (user == null)
            return false;
        UserGroup userGroup = userGroupDAO.getUserGroupByName(groupName);
        if (userGroupDAO == null)
            return false;
        user.setUserGroup(userGroup);
        userDAO.updateUser(user);
        return true;
    }

    /**
     * Delete User from User Group
     *
     * @param telegramUserId
     * @param groupName
     * @return
     */
    @WebMethod
    @Override
    public boolean deleteUserFromUserGroup(String telegramUserId, String groupName) {
        User user = userDAO.getUserByUserTelegramId(telegramUserId);
        if (user == null)
            return false;
        UserGroup userGroup = userGroupDAO.getUserGroupByName(groupName);
        if (userGroupDAO == null)
            return false;
        return userDAO.deleteUserFromUserGroup(user, userGroup);
    }

    /**
     * Return all users from group with specified name
     *
     * @param groupName
     * @return List Users
     */
    @WebMethod
    @Override
    public List<User> findAllUsersFromGroup(String groupName) {
        return userDAO.findAllUsersFromGroup(groupName);
    }
}
