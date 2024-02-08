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

package djh.learn.builder.easyLiferay.service.impl;

import com.liferay.portal.aop.AopService;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import djh.learn.builder.easyLiferay.exception.NoSuchPersonException;
import djh.learn.builder.easyLiferay.model.Person;
import djh.learn.builder.easyLiferay.service.base.PersonServiceBaseImpl;

import org.osgi.service.component.annotations.Component;

import java.util.Date;
import java.util.List;

/**
 * @author deepak.singh.jangra
 */
@Component(
	property = {
		"json.web.service.context.name=easy_liferay",
		"json.web.service.context.path=Person"
	},
	service = AopService.class
)
public class PersonServiceImpl extends PersonServiceBaseImpl {
	public Person createPerson(ServiceContext serviceContext, String name, int age, boolean married) throws PortalException {
		return personLocalService.createPerson(serviceContext,name,age,married);
	}

	public Person updatePerson(long personId,String name, int age, boolean married) throws PortalException {

		return personLocalService.updatePerson(personId,name,age,married);

	}

	public List<Person> getAllPersons() throws PortalException {

		return personLocalService.getAllPersons();
	}

	public List<Person> getPersonsByMarried(boolean married) throws PortalException {

		return personLocalService.getPersonsByMarried(married);
	}

	public String delete(long personId) throws NoSuchPersonException {

		return personLocalService.delete(personId);
	}

	public Person getPersonById(long personId) throws PortalException {

		return personLocalService.getPerson(personId);
	}

	public List<Person> getPersonsByName(String name) throws PortalException {

		// Update assigment. This doesn't yet persist the entity.
		List<Person> persons = personLocalService.getPersonsByName(name);
		return persons;
	}
}