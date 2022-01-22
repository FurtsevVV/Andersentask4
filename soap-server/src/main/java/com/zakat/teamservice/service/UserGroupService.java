package com.zakat.teamservice.service;

import com.zakat.teamservice.model.User;
import com.zakat.teamservice.model.UserGroup;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

/**
 * UserGroupService Interface
 */
@WebService
public interface UserGroupService {
    @WebMethod
    List<UserGroup> findAllUserGroup();
    @WebMethod
    void addUserGroup(UserGroup userGroup);
    @WebMethod
    boolean deleteUserGroup(int userGroup_id);
    @WebMethod
    UserGroup getUserGroupById(int userGroup_id);
    @WebMethod
    void updateUserGroup(UserGroup userGroup);


}
