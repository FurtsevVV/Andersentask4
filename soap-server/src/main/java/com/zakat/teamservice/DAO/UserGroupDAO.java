package com.zakat.teamservice.DAO;

import com.zakat.teamservice.model.UserGroup;

import java.util.List;

public interface UserGroupDAO {

    List<UserGroup> findAllUserGroup();

    void addUserGroup(UserGroup userGroup);

    boolean deleteUserGroup(int userGroup_id);

    UserGroup getUserGroupById(int userGroup_id);

    void updateUserGroup(UserGroup userGroup);

    UserGroup getUserGroupByName(String groupName);

    boolean deleteUserGroupByName(String groupName);
}
