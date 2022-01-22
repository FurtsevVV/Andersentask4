package com.zakat.teamservice.service;

import com.zakat.teamservice.model.User;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

/**
 * UserService Interface
 */
@WebService
public interface UserService {

    /**
     * Return User by Id
     * @param user_id
     * @return User Object
     */
    @WebMethod
     User getUserById(int user_id);

    /**
     * Return all users from current course
     * @return List Users
     */
    @WebMethod
     List<User> findAllUsers();

    /**
     * Delete User
     * @param user_id
     * @return true if user has been removed
     */
    @WebMethod
     boolean deleteUserById(int user_id);

    /**
     * Update given user
     *
     * @param user
     */
    @WebMethod
     void updateUser(User user);

    /**
     * Add new user
     *
     * @param user
     */
    @WebMethod
    void addUser(User user);

    /**
     * Get User by user telegram id
     * @param userTelegramId
     * @return
     */
    @WebMethod
    User getUserByUserTelegramId(String userTelegramId);

    /**
     * Delete user by telegram id
     * @param userTelegramId
     * @return
     */
    @WebMethod
    boolean deleteUserByTelegramId(String userTelegramId);

    /**
     * Add user to UserGroup
     * @param telegramUserId
     * @param groupName
     * @return
     */
    @WebMethod
    boolean addUserToUserGroup(String telegramUserId, String groupName);
}