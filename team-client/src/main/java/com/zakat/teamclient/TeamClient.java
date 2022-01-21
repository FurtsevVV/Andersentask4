package com.zakat.teamclient;

import com.zakat.teamclient.generated.User;
import com.zakat.teamclient.generated.UserService;
import com.zakat.teamclient.generated.UserServiceImplService;

public class TeamClient {

    public static void main(String[] args) {
UserServiceImplService userService = new UserServiceImplService();
  UserService usServ = userService.getUserServiceImplPort();

        User user = usServ.getUserById(1);
        System.out.println(user);

    }
}
