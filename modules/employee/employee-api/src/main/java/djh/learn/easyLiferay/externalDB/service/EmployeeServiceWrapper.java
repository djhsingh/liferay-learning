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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EmployeeService}.
 *
 * @author Brian Wing Shun Chan
 * @see EmployeeService
 * @generated
 */
public class EmployeeServiceWrapper
	implements EmployeeService, ServiceWrapper<EmployeeService> {

	public EmployeeServiceWrapper() {
		this(null);
	}

	public EmployeeServiceWrapper(EmployeeService employeeService) {
		_employeeService = employeeService;
	}

	@Override
	public djh.learn.easyLiferay.externalDB.model.Employee createEmployee(
			com.liferay.portal.kernel.service.ServiceContext serviceContext,
			String name, double salary, java.util.Date dob)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _employeeService.createEmployee(
			serviceContext, name, salary, dob);
	}

	@Override
	public String delete(long employeeId)
		throws djh.learn.easyLiferay.externalDB.exception.
			NoSuchEmployeeException {

		return _employeeService.delete(employeeId);
	}

	@Override
	public java.util.List<djh.learn.easyLiferay.externalDB.model.Employee>
			getAllEmployees()
		throws com.liferay.portal.kernel.exception.PortalException {

		return _employeeService.getAllEmployees();
	}

	@Override
	public djh.learn.easyLiferay.externalDB.model.Employee getEmployeeById(
			long employeeId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _employeeService.getEmployeeById(employeeId);
	}

	@Override
	public java.util.List<djh.learn.easyLiferay.externalDB.model.Employee>
			getEmployeeBySalary(double salary)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _employeeService.getEmployeeBySalary(salary);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _employeeService.getOSGiServiceIdentifier();
	}

	@Override
	public djh.learn.easyLiferay.externalDB.model.Employee updateEmployee(
			long employeeId, String name, java.util.Date dob, double salary)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _employeeService.updateEmployee(employeeId, name, dob, salary);
	}

	@Override
	public EmployeeService getWrappedService() {
		return _employeeService;
	}

	@Override
	public void setWrappedService(EmployeeService employeeService) {
		_employeeService = employeeService;
	}

	private EmployeeService _employeeService;

}