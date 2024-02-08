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

package djh.learn.builder.easyLiferay.service;

import com.liferay.portal.kernel.exception.PortalException;

import djh.learn.builder.easyLiferay.model.Person;

import java.util.List;

/**
 * Provides the remote service utility for Person. This utility wraps
 * <code>djh.learn.builder.easyLiferay.service.impl.PersonServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author deepak.singh.jangra
 * @see PersonService
 * @generated
 */
public class PersonServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>djh.learn.builder.easyLiferay.service.impl.PersonServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static Person createPerson(
			com.liferay.portal.kernel.service.ServiceContext serviceContext,
			String name, int age, boolean married)
		throws PortalException {

		return getService().createPerson(serviceContext, name, age, married);
	}

	public static String delete(long personId)
		throws djh.learn.builder.easyLiferay.exception.NoSuchPersonException {

		return getService().delete(personId);
	}

	public static List<Person> getAllPersons() throws PortalException {
		return getService().getAllPersons();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static Person getPersonById(long personId) throws PortalException {
		return getService().getPersonById(personId);
	}

	public static List<Person> getPersonsByMarried(boolean married)
		throws PortalException {

		return getService().getPersonsByMarried(married);
	}

	public static List<Person> getPersonsByName(String name)
		throws PortalException {

		return getService().getPersonsByName(name);
	}

	public static Person updatePerson(
			long personId, String name, int age, boolean married)
		throws PortalException {

		return getService().updatePerson(personId, name, age, married);
	}

	public static PersonService getService() {
		return _service;
	}

	private static volatile PersonService _service;

}