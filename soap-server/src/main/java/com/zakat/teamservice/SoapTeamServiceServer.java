package com.zakat.teamservice;

import com.zakat.teamservice.model.RoleEnum;
import com.zakat.teamservice.model.User;
import com.zakat.teamservice.model.UserGroup;
import com.zakat.teamservice.service.UserGroupService;
import com.zakat.teamservice.service.UserGroupServiceImpl;
import com.zakat.teamservice.service.UserService;
import com.zakat.teamservice.service.UserServiceImpl;

import java.util.List;
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

UserService userService = new UserServiceImpl();
UserGroupService ugService = new UserGroupServiceImpl();

userService.addUserToUserGroup("@yser4", "Frends");

//        System.out.println(user);
//user.setUsername("Kot Kit");
//user.setUserRole(RoleEnum.USER);
//user.setTelegramUserId("@yser4");
//user.setTelegramChatId("@chat1");
//userService.addUser(user);

//   List<User> userList= userService.findAllUsers();
//        System.out.println(userList);
//        System.out.println(userService.findAllUsers());
//User user = userService.getUserByUserTelegramId("@yser4");
//UserGroup userGroup = ugService.getUserGroupById(4);
//user.setUserGroup(userGroup);
//userService.updateUser(user);
//        System.out.println(userService.findAllUsers());

//        System.out.println(ugService.findAllUserGroup());
////UserGroup userGroup = new UserGroup("Group1", "YELLOW");
//        System.out.println(ugService.deleteUserGroup(4));
//        System.out.println(ugService.findAllUserGroup());



        LOGGER.info("Creating WEB server and publishing SOAP endpoint");
        Endpoint.publish("http://localhost:8090/teamservice/user/",
                new UserServiceImpl());

        Endpoint.publish("http://localhost:8090/teamservice/usergroup/",
                new UserGroupServiceImpl());
    }
}