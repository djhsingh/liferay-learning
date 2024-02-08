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

package djh.learn.builder.easyLiferay.service.http;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.HttpPrincipal;
import com.liferay.portal.kernel.service.http.TunnelUtil;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;

import djh.learn.builder.easyLiferay.service.PersonServiceUtil;

/**
 * Provides the HTTP utility for the
 * <code>PersonServiceUtil</code> service
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
 * @author deepak.singh.jangra
 * @generated
 */
public class PersonServiceHttp {

	public static djh.learn.builder.easyLiferay.model.Person createPerson(
			HttpPrincipal httpPrincipal,
			com.liferay.portal.kernel.service.ServiceContext serviceContext,
			String name, int age, boolean married)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				PersonServiceUtil.class, "createPerson",
				_createPersonParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, serviceContext, name, age, married);

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

			return (djh.learn.builder.easyLiferay.model.Person)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static djh.learn.builder.easyLiferay.model.Person updatePerson(
			HttpPrincipal httpPrincipal, long personId, String name, int age,
			boolean married)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				PersonServiceUtil.class, "updatePerson",
				_updatePersonParameterTypes1);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, personId, name, age, married);

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

			return (djh.learn.builder.easyLiferay.model.Person)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<djh.learn.builder.easyLiferay.model.Person>
			getAllPersons(HttpPrincipal httpPrincipal)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				PersonServiceUtil.class, "getAllPersons",
				_getAllPersonsParameterTypes2);

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

			return (java.util.List<djh.learn.builder.easyLiferay.model.Person>)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<djh.learn.builder.easyLiferay.model.Person>
			getPersonsByMarried(HttpPrincipal httpPrincipal, boolean married)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				PersonServiceUtil.class, "getPersonsByMarried",
				_getPersonsByMarriedParameterTypes3);

			MethodHandler methodHandler = new MethodHandler(methodKey, married);

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

			return (java.util.List<djh.learn.builder.easyLiferay.model.Person>)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static String delete(HttpPrincipal httpPrincipal, long personId)
		throws djh.learn.builder.easyLiferay.exception.NoSuchPersonException {

		try {
			MethodKey methodKey = new MethodKey(
				PersonServiceUtil.class, "delete", _deleteParameterTypes4);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, personId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						djh.learn.builder.easyLiferay.exception.
							NoSuchPersonException) {

					throw (djh.learn.builder.easyLiferay.exception.
						NoSuchPersonException)exception;
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

	public static djh.learn.builder.easyLiferay.model.Person getPersonById(
			HttpPrincipal httpPrincipal, long personId)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				PersonServiceUtil.class, "getPersonById",
				_getPersonByIdParameterTypes5);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, personId);

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

			return (djh.learn.builder.easyLiferay.model.Person)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<djh.learn.builder.easyLiferay.model.Person>
			getPersonsByName(HttpPrincipal httpPrincipal, String name)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				PersonServiceUtil.class, "getPersonsByName",
				_getPersonsByNameParameterTypes6);

			MethodHandler methodHandler = new MethodHandler(methodKey, name);

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

			return (java.util.List<djh.learn.builder.easyLiferay.model.Person>)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(PersonServiceHttp.class);

	private static final Class<?>[] _createPersonParameterTypes0 = new Class[] {
		com.liferay.portal.kernel.service.ServiceContext.class, String.class,
		int.class, boolean.class
	};
	private static final Class<?>[] _updatePersonParameterTypes1 = new Class[] {
		long.class, String.class, int.class, boolean.class
	};
	private static final Class<?>[] _getAllPersonsParameterTypes2 =
		new Class[] {};
	private static final Class<?>[] _getPersonsByMarriedParameterTypes3 =
		new Class[] {boolean.class};
	private static final Class<?>[] _deleteParameterTypes4 = new Class[] {
		long.class
	};
	private static final Class<?>[] _getPersonByIdParameterTypes5 =
		new Class[] {long.class};
	private static final Class<?>[] _getPersonsByNameParameterTypes6 =
		new Class[] {String.class};

}