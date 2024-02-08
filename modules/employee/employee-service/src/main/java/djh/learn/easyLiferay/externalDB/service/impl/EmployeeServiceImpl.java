/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package djh.learn.easyLiferay.externalDB.service.impl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import djh.learn.easyLiferay.externalDB.exception.NoSuchEmployeeException;
import djh.learn.easyLiferay.externalDB.model.Employee;
import djh.learn.easyLiferay.externalDB.service.base.EmployeeServiceBaseImpl;

import java.util.Date;
import java.util.List;

/**
 * @author Brian Wing Shun Chan
 */
public class EmployeeServiceImpl extends EmployeeServiceBaseImpl {
    public Employee createEmployee(ServiceContext serviceContext, String name, double salary, Date dob) throws PortalException {
        return employeeLocalService.createEmployee(serviceContext,name,salary,dob);
    }

    public Employee updateEmployee(long employeeId,String name, Date dob, double salary) throws PortalException {

        return employeeLocalService.updateEmployee(employeeId,name,dob,salary);

    }

    public List<Employee> getAllEmployees() throws PortalException {

        // Update assigment. This doesn't yet persist the entity.
        return employeeLocalService.getAllEmployees();
    }

    public List<Employee> getEmployeeBySalary(double salary) throws PortalException {

        // Update assigment. This doesn't yet persist the entity.
        return employeeLocalService.getEmployeeBySalary(salary);
    }

    public String delete(long employeeId) throws NoSuchEmployeeException {

       return employeeLocalService.delete(employeeId);
    }

    public Employee getEmployeeById(long employeeId) throws PortalException {

        return employeeLocalService.getEmployee(employeeId);
    }
}