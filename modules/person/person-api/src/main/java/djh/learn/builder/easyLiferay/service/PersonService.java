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
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.jsonwebservice.JSONWebService;
import com.liferay.portal.kernel.security.access.control.AccessControlled;
import com.liferay.portal.kernel.service.BaseService;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;

import djh.learn.builder.easyLiferay.exception.NoSuchPersonException;
import djh.learn.builder.easyLiferay.model.Person;

import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the remote service interface for Person. Methods of this
 * service are expected to have security checks based on the propagated JAAS
 * credentials because this service can be accessed remotely.
 *
 * @author deepak.singh.jangra
 * @see PersonServiceUtil
 * @generated
 */
@AccessControlled
@JSONWebService
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface PersonService extends BaseService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add custom service methods to <code>djh.learn.builder.easyLiferay.service.impl.PersonServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface. Consume the person remote service via injection or a <code>org.osgi.util.tracker.ServiceTracker</code>. Use {@link PersonServiceUtil} if injection and service tracking are not available.
	 */
	public Person createPerson(
			ServiceContext serviceContext, String name, int age,
			boolean married)
		throws PortalException;

	public String delete(long personId) throws NoSuchPersonException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Person> getAllPersons() throws PortalException;

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public String getOSGiServiceIdentifier();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Person getPersonById(long personId) throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Person> getPersonsByMarried(boolean married)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Person> getPersonsByName(String name) throws PortalException;

	public Person updatePerson(
			long personId, String name, int age, boolean married)
		throws PortalException;

}