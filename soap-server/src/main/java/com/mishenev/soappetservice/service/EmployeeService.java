package com.mishenev.soappetservice.service;

import com.mishenev.soappetservice.model.Employee;
import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * EmployeeService.
 *
 * @author Dmitrii_Mishenev
 */
@WebService
public interface EmployeeService {

    /**
     * Jax-ws WebMethod for retrieving employee's details.
     * @param name Employee's name.
     * @return employee's details.
     */
    @WebMethod
    Employee getEmployee(String name);
}