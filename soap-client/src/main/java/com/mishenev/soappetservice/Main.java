package com.mishenev.soappetservice;

/**
 * Main.
 *
 * @author Dmitrii_Mishenev
 */
public class Main {

    public static void main(String[] args) {

        com.raps.code.generate.ws.EmployeeService employeeService =
                new com.raps.code.generate.ws.EmployeeServiceImplService()
                        .getPort(com.raps.code.generate.ws.EmployeeService.class);

        com.raps.code.generate.ws.Employee employee = employeeService.getEmployee("Ivan");

        System.out.println(employee.getAge());
    }
}