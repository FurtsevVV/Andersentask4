package com.zakat.teamservice.DAO;

import com.zakat.teamservice.model.User;

import java.util.List;

public interface UserDAO {
     User getUserById(int user_id);
     List<User> findAllUsers();
     boolean deleteUserById(int user_id);
     void updateUser(User user);
    void addUser(User user);
    boolean addUserToGroup(User user, int groupId);


    User getUserByUserTelegramId(String userTelegramId);

    boolean deleteUserByTelegramId(String userTelegramId);
}
