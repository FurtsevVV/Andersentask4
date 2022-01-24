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

    @WebMethod
    User getUserById(int user_id);

    @WebMethod
    List<User> findAllUsers();

    @WebMethod
    boolean deleteUserById(int user_id);

    @WebMethod
    void updateUser(User user);

    @WebMethod
    void addUser(User user);

    @WebMethod
    User getUserByUserTelegramId(String userTelegramId);

    @WebMethod
    boolean deleteUserByTelegramId(String userTelegramId);

    @WebMethod
    boolean addUserToUserGroup(String telegramUserId, String groupName);

    @WebMethod
    boolean deleteUserFromUserGroup(String telegramUserId, String groupName);

    @WebMethod
    List<User> findAllUsersFromGroup(String groupName);
}
