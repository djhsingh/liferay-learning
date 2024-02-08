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
import djh.learn.easyLiferay.externalDB.service.base.EmployeeLocalServiceBaseImpl;

import java.util.Date;
import java.util.List;

/**
 * @author Brian Wing Shun Chan
 */
public class EmployeeLocalServiceImpl extends EmployeeLocalServiceBaseImpl {
    public Employee createEmployee(ServiceContext serviceContext, String name, double salary, Date dob) throws PortalException {
        Group group = serviceContext.getScopeGroup();
        User user = userLocalService.getUser(serviceContext.getUserId());

        long employeeId = counterLocalService.increment(Employee.class.getName());

        // Create assigment. This doesn't yet persist the entity.
        Employee employee = createEmployee(employeeId);

        // Populate fields.
        employee.setCompanyId(group.getCompanyId());
        employee.setCreateDate(serviceContext.getCreateDate(new Date()));
        employee.setGroupId(group.getGroupId());
        employee.setModifiedDate(serviceContext.getModifiedDate(new Date()));
        employee.setUserName(user.getScreenName());
        employee.setName(name);
        employee.setDob(dob);
        employee.setSalary(salary);
        // Persist employee to external database.
        employee =  super.addEmployee(employee);
        return employee;
    }

    public Employee updateEmployee(long employeeId,String name, Date dob, double salary) throws PortalException {

        Employee employee = getEmployee(employeeId);

        // Populate fields.
        employee.setModifiedDate(new Date());
        employee.setName(name);
        employee.setSalary(salary);
        employee.setDob(dob);
        // Persist person to database.
        employee =super.updateEmployee(employee);
        return employee;

    }

    public List<Employee> getAllEmployees() throws PortalException {

        // Update assigment. This doesn't yet persist the entity.
        List<Employee> employees = employeePersistence.findAll();
        return employees;
    }

    public List<Employee> getEmployeeBySalary(double salary) throws PortalException {

        // Update assigment. This doesn't yet persist the entity.
        List<Employee> employees =employeePersistence.findByBySalary(salary);
        return employees;
    }

    public String delete(long employeeId) throws NoSuchEmployeeException {

        employeePersistence.remove(employeeId);
        return "Employee Deleted Successfully!";
    }

    public Employee getEmployeeById(long employeeId) throws PortalException {

        return getEmployee(employeeId);
    }
}