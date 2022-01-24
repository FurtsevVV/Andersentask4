package com.zakat.teamservice;

import com.zakat.teamservice.service.UserGroupService;
import com.zakat.teamservice.service.UserGroupServiceImpl;
import com.zakat.teamservice.service.UserService;
import com.zakat.teamservice.service.UserServiceImpl;

import javax.xml.ws.Endpoint;
import java.util.logging.Logger;

/**
 * SoapTeamService.
 */
public class SoapTeamServiceServer {

    private static final Logger LOGGER = Logger.getGlobal();

    public static void main(String[] args) {

        UserService userService = new UserServiceImpl();
        UserGroupService ugService = new UserGroupServiceImpl();

        System.out.println(userService.findAllUsers());

        LOGGER.info("Creating WEB server and publishing SOAP endpoint");
        Endpoint.publish("http://localhost:8090/teamservice/user/",
                new UserServiceImpl());

        Endpoint.publish("http://localhost:8090/teamservice/usergroup/",
                new UserGroupServiceImpl());
    }
}