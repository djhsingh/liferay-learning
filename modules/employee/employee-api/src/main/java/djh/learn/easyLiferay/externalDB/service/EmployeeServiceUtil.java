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

package djh.learn.easyLiferay.externalDB.service;

import com.liferay.portal.kernel.exception.PortalException;

import djh.learn.easyLiferay.externalDB.model.Employee;

import java.util.List;

/**
 * Provides the remote service utility for Employee. This utility wraps
 * <code>djh.learn.easyLiferay.externalDB.service.impl.EmployeeServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see EmployeeService
 * @generated
 */
public class EmployeeServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>djh.learn.easyLiferay.externalDB.service.impl.EmployeeServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static Employee createEmployee(
			com.liferay.portal.kernel.service.ServiceContext serviceContext,
			String name, double salary, java.util.Date dob)
		throws PortalException {

		return getService().createEmployee(serviceContext, name, salary, dob);
	}

	public static String delete(long employeeId)
		throws djh.learn.easyLiferay.externalDB.exception.
			NoSuchEmployeeException {

		return getService().delete(employeeId);
	}

	public static List<Employee> getAllEmployees() throws PortalException {
		return getService().getAllEmployees();
	}

	public static Employee getEmployeeById(long employeeId)
		throws PortalException {

		return getService().getEmployeeById(employeeId);
	}

	public static List<Employee> getEmployeeBySalary(double salary)
		throws PortalException {

		return getService().getEmployeeBySalary(salary);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static Employee updateEmployee(
			long employeeId, String name, java.util.Date dob, double salary)
		throws PortalException {

		return getService().updateEmployee(employeeId, name, dob, salary);
	}

	public static EmployeeService getService() {
		return _service;
	}

	private static volatile EmployeeService _service;

}