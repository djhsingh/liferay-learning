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
import djh.learn.builder.easyLiferay.service.base.PersonLocalServiceBaseImpl;

import org.osgi.service.component.annotations.Component;

import java.util.Date;
import java.util.List;

/**
 * @author deepak.singh.jangra
 */
@Component(
	property = "model.class.name=djh.learn.builder.easyLiferay.model.Person",
	service = AopService.class
)
public class PersonLocalServiceImpl extends PersonLocalServiceBaseImpl {

	public Person createPerson(ServiceContext serviceContext, String name, int age, boolean married) throws PortalException {
		Group group = serviceContext.getScopeGroup();
		User user = userLocalService.getUser(serviceContext.getUserId());

		long personId = counterLocalService.increment(Person.class.getName());

		// Create assigment. This doesn't yet persist the entity.
		Person person = createPerson(personId);

		// Populate fields.
		person.setCompanyId(group.getCompanyId());
		person.setCreateDate(serviceContext.getCreateDate(new Date()));
		person.setGroupId(group.getGroupId());
		person.setModifiedDate(serviceContext.getModifiedDate(new Date()));
		person.setUserName(user.getScreenName());
		person.setName(name);
		person.setAge(age);
		person.setMarried(married);
		// Persist person to database.
		person =  super.addPerson(person);
		return person;
	}

	public Person updatePerson(long personId,String name, int age, boolean married) throws PortalException {

		// Update assigment. This doesn't yet persist the entity.
		Person person = getPerson(personId);

		// Populate fields.
		person.setModifiedDate(new Date());
		person.setName(name);
		person.setAge(age);
		person.setMarried(married);
		// Persist person to database.
		person =super.updatePerson(person);
		return person;

	}

	public List<Person> getAllPersons() throws PortalException {

		// Update assigment. This doesn't yet persist the entity.
		List<Person> persons = personPersistence.findAll();
		return persons;
	}

	public List<Person> getPersonsByMarried(boolean married) throws PortalException {

		// Update assigment. This doesn't yet persist the entity.
		List<Person> persons = personPersistence.findByMarried(married);
		return persons;
	}

	public String delete(long personId) throws NoSuchPersonException {

		personPersistence.remove(personId);
		return "Person Deleted Successfully!";
	}

	public Person getPersonById(long personId) throws PortalException {

		return getPerson(personId);
	}


	public List<Person> getPersonsByName(String name) throws PortalException {

		// Update assigment. This doesn't yet persist the entity.
		List<Person> persons = personFinder.getPersonsByName(name);
		return persons;
	}
}