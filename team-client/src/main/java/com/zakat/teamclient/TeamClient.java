package com.zakat.teamclient;






import com.zakat.teamclient.generated.*;

import java.util.List;

public class TeamClient {

    public static void main(String[] args) {
UserServiceImplService userService = new UserServiceImplService();
  UserService usServ = userService.getUserServiceImplPort();
//
        UserGroupServiceImplService ugService = new UserGroupServiceImplService();
        UserGroupService ugServ = ugService.getUserGroupServiceImplPort();

//        UserGroup userGroup = new UserGroup();
//        userGroup.setGroupName("Posony");
//        userGroup.setColorMark("PURPLE");
//        ugServ.addUserGroup(userGroup);
//        User user = new User();
//        user.setTelegramUserId("@user5");
//        user.setUserRole(RoleEnum.USER);
//        user.setUsername("Ivan Suhoi");
//        user.setTelegramChatId("@chat1");
//usServ.addUser(user);

//        System.out.println(usServ.findAllUsers());

        User user = usServ.getUserByUserTelegramId("@user1");
        System.out.println(user.getUsername());
//        List<User> userList = usServ.findAllUsers();
//        System.out.println(userList);

  UserGroup userGroup = ugServ.getUserGroupByName("Frends");
        System.out.println(userGroup);

    }
}
