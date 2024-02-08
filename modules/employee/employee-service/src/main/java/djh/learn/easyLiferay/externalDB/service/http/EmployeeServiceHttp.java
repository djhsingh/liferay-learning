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

package djh.learn.easyLiferay.externalDB.service.http;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.HttpPrincipal;
import com.liferay.portal.kernel.service.http.TunnelUtil;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;

import djh.learn.easyLiferay.externalDB.service.EmployeeServiceUtil;

/**
 * Provides the HTTP utility for the
 * <code>EmployeeServiceUtil</code> service
 * utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it requires an additional
 * <code>HttpPrincipal</code> parameter.
 *
 * <p>
 * The benefits of using the HTTP utility is that it is fast and allows for
 * tunneling without the cost of serializing to text. The drawback is that it
 * only works with Java.
 * </p>
 *
 * <p>
 * Set the property <b>tunnel.servlet.hosts.allowed</b> in portal.properties to
 * configure security.
 * </p>
 *
 * <p>
 * The HTTP utility is only generated for remote services.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class EmployeeServiceHttp {

	public static djh.learn.easyLiferay.externalDB.model.Employee
			createEmployee(
				HttpPrincipal httpPrincipal,
				com.liferay.portal.kernel.service.ServiceContext serviceContext,
				String name, double salary, java.util.Date dob)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				EmployeeServiceUtil.class, "createEmployee",
				_createEmployeeParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, serviceContext, name, salary, dob);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (djh.learn.easyLiferay.externalDB.model.Employee)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static djh.learn.easyLiferay.externalDB.model.Employee
			updateEmployee(
				HttpPrincipal httpPrincipal, long employeeId, String name,
				java.util.Date dob, double salary)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				EmployeeServiceUtil.class, "updateEmployee",
				_updateEmployeeParameterTypes1);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, employeeId, name, dob, salary);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (djh.learn.easyLiferay.externalDB.model.Employee)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List
		<djh.learn.easyLiferay.externalDB.model.Employee> getAllEmployees(
				HttpPrincipal httpPrincipal)
			throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				EmployeeServiceUtil.class, "getAllEmployees",
				_getAllEmployeesParameterTypes2);

			MethodHandler methodHandler = new MethodHandler(methodKey);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List
				<djh.learn.easyLiferay.externalDB.model.Employee>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List
		<djh.learn.easyLiferay.externalDB.model.Employee> getEmployeeBySalary(
				HttpPrincipal httpPrincipal, double salary)
			throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				EmployeeServiceUtil.class, "getEmployeeBySalary",
				_getEmployeeBySalaryParameterTypes3);

			MethodHandler methodHandler = new MethodHandler(methodKey, salary);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List
				<djh.learn.easyLiferay.externalDB.model.Employee>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static String delete(HttpPrincipal httpPrincipal, long employeeId)
		throws djh.learn.easyLiferay.externalDB.exception.
			NoSuchEmployeeException {

		try {
			MethodKey methodKey = new MethodKey(
				EmployeeServiceUtil.class, "delete", _deleteParameterTypes4);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, employeeId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						djh.learn.easyLiferay.externalDB.exception.
							NoSuchEmployeeException) {

					throw (djh.learn.easyLiferay.externalDB.exception.
						NoSuchEmployeeException)exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (String)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static djh.learn.easyLiferay.externalDB.model.Employee
			getEmployeeById(HttpPrincipal httpPrincipal, long employeeId)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				EmployeeServiceUtil.class, "getEmployeeById",
				_getEmployeeByIdParameterTypes5);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, employeeId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (djh.learn.easyLiferay.externalDB.model.Employee)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(EmployeeServiceHttp.class);

	private static final Class<?>[] _createEmployeeParameterTypes0 =
		new Class[] {
			com.liferay.portal.kernel.service.ServiceContext.class,
			String.class, double.class, java.util.Date.class
		};
	private static final Class<?>[] _updateEmployeeParameterTypes1 =
		new Class[] {
			long.class, String.class, java.util.Date.class, double.class
		};
	private static final Class<?>[] _getAllEmployeesParameterTypes2 =
		new Class[] {};
	private static final Class<?>[] _getEmployeeBySalaryParameterTypes3 =
		new Class[] {double.class};
	private static final Class<?>[] _deleteParameterTypes4 = new Class[] {
		long.class
	};
	private static final Class<?>[] _getEmployeeByIdParameterTypes5 =
		new Class[] {long.class};

}