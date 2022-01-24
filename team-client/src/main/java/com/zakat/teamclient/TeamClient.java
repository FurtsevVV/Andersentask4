package com.zakat.teamclient;

import com.zakat.teamclient.generated.UserGroupService;
import com.zakat.teamclient.generated.UserGroupServiceImplService;
import com.zakat.teamclient.generated.UserService;
import com.zakat.teamclient.generated.UserServiceImplService;

public class TeamClient {

    public static void main(String[] args) {
        UserServiceImplService userService = new UserServiceImplService();
        UserService usServ = userService.getUserServiceImplPort();

        UserGroupServiceImplService ugService = new UserGroupServiceImplService();
        UserGroupService ugServ = ugService.getUserGroupServiceImplPort();


    }
}
