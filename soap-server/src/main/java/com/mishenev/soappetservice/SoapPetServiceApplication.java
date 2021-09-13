package com.mishenev.soappetservice;

import com.mishenev.soappetservice.service.EmployeeServiceImpl;
import javax.xml.ws.Endpoint;

/**
 * SoapPetServiceApplication.
 *
 * @author Dmitrii_Mishenev
 */
public class SoapPetServiceApplication {

    public static void main(String[] args) {

        Endpoint.publish("http://localhost:8080/employeeservice",
                new EmployeeServiceImpl());
    }
}