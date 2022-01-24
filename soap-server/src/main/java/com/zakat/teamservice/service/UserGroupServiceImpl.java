package com.zakat.teamservice.service;

import com.zakat.teamservice.DAO.UserDAO;
import com.zakat.teamservice.DAO.UserDAOImpl;
import com.zakat.teamservice.DAO.UserGroupDAO;
import com.zakat.teamservice.DAO.UserGroupDAOImpl;
import com.zakat.teamservice.model.UserGroup;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

/**
 * {@link UserGroupService} implementation.
 */

@WebService(endpointInterface = "com.zakat.teamservice.service.UserGroupService")
public class UserGroupServiceImpl implements UserGroupService {

    UserGroupDAO userGroupDAO = new UserGroupDAOImpl();
    UserDAO userDAO = new UserDAOImpl();

    @Override
    @WebMethod
    public List<UserGroup> findAllUserGroup() {
        return userGroupDAO.findAllUserGroup();
    }

    @Override
    @WebMethod
    public void addUserGroup(UserGroup userGroup) {
        userGroupDAO.addUserGroup(userGroup);
    }

    @Override
    @WebMethod
    public boolean deleteUserGroup(int userGroup_id) {
        UserGroup userGroup = userGroupDAO.getUserGroupById(userGroup_id);
        if (userGroup == null)
            return false;
        return userGroupDAO.deleteUserGroup(userGroup_id);

    }

    @Override
    @WebMethod
    public UserGroup getUserGroupById(int userGroup_id) {
        return userGroupDAO.getUserGroupById(userGroup_id);

    }

    @Override
    @WebMethod
    public void updateUserGroup(UserGroup userGroup) {
        userGroupDAO.updateUserGroup(userGroup);
    }

    @WebMethod
    @Override
    public UserGroup getUserGroupByName(String groupName) {
        return userGroupDAO.getUserGroupByName(groupName);
    }

    @WebMethod
    @Override
    public boolean deleteUserGroupByName(String groupName) {
        return userGroupDAO.deleteUserGroupByName(groupName);
    }


}
