package com.zakat.teamservice;

import com.zakat.teamservice.model.User;
import com.zakat.teamservice.model.UserGroup;
import com.zakat.teamservice.service.UserGroupService;
import com.zakat.teamservice.service.UserGroupServiceImpl;
import com.zakat.teamservice.service.UserService;
import com.zakat.teamservice.service.UserServiceImpl;

import java.util.logging.Logger;
import javax.xml.ws.Endpoint;

/**
 * SoapTeamService.
 *
 *
 */
public class SoapTeamServiceServer {

    private static final Logger LOGGER = Logger.getGlobal();

    public static void main(String[] args) {
        UserGroupService userGroupService = new UserGroupServiceImpl();

        UserService userService = new UserServiceImpl();


        User user = new User("DD", "AA", "3424");
        User user1 = new User("EE", "TT", "3004");
        UserGroup userGroup = new UserGroup("RED", "RED");
//        userService.addUser(user);
//        userService.addUser(user1);
//        userGroupService.addUserGroup(userGroup);
//        System.out.println(userService.getUserById(1));
//        System.out.println(userService.getUserById(2));
//        System.out.println(userGroupService.getUserGroupById(1));
       // System.out.println(userGroupService.addUserToGroup(user, "RED"));.
        User us = userService.getUserById(1);
        System.out.println(us.getUserGroup());
//        System.out.println(userGroupService.addUserToGroup(user, "IT"));



        LOGGER.info("Creating WEB server and publishing SOAP endpoint");
        Endpoint.publish("http://localhost:8090/teamservice/user/",
                new UserServiceImpl());

        Endpoint.publish("http://localhost:8090/teamservice/usergroup/",
                new UserGroupServiceImpl());
    }
}