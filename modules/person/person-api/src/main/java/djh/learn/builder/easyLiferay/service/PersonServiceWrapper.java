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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PersonService}.
 *
 * @author deepak.singh.jangra
 * @see PersonService
 * @generated
 */
public class PersonServiceWrapper
	implements PersonService, ServiceWrapper<PersonService> {

	public PersonServiceWrapper() {
		this(null);
	}

	public PersonServiceWrapper(PersonService personService) {
		_personService = personService;
	}

	@Override
	public djh.learn.builder.easyLiferay.model.Person createPerson(
			com.liferay.portal.kernel.service.ServiceContext serviceContext,
			String name, int age, boolean married)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _personService.createPerson(serviceContext, name, age, married);
	}

	@Override
	public String delete(long personId)
		throws djh.learn.builder.easyLiferay.exception.NoSuchPersonException {

		return _personService.delete(personId);
	}

	@Override
	public java.util.List<djh.learn.builder.easyLiferay.model.Person>
			getAllPersons()
		throws com.liferay.portal.kernel.exception.PortalException {

		return _personService.getAllPersons();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _personService.getOSGiServiceIdentifier();
	}

	@Override
	public djh.learn.builder.easyLiferay.model.Person getPersonById(
			long personId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _personService.getPersonById(personId);
	}

	@Override
	public java.util.List<djh.learn.builder.easyLiferay.model.Person>
			getPersonsByMarried(boolean married)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _personService.getPersonsByMarried(married);
	}

	@Override
	public java.util.List<djh.learn.builder.easyLiferay.model.Person>
			getPersonsByName(String name)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _personService.getPersonsByName(name);
	}

	@Override
	public djh.learn.builder.easyLiferay.model.Person updatePerson(
			long personId, String name, int age, boolean married)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _personService.updatePerson(personId, name, age, married);
	}

	@Override
	public PersonService getWrappedService() {
		return _personService;
	}

	@Override
	public void setWrappedService(PersonService personService) {
		_personService = personService;
	}

	private PersonService _personService;

}