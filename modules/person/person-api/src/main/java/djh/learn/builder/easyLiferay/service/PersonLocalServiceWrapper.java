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
 * Provides a wrapper for {@link PersonLocalService}.
 *
 * @author deepak.singh.jangra
 * @see PersonLocalService
 * @generated
 */
public class PersonLocalServiceWrapper
	implements PersonLocalService, ServiceWrapper<PersonLocalService> {

	public PersonLocalServiceWrapper() {
		this(null);
	}

	public PersonLocalServiceWrapper(PersonLocalService personLocalService) {
		_personLocalService = personLocalService;
	}

	/**
	 * Adds the person to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PersonLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param person the person
	 * @return the person that was added
	 */
	@Override
	public djh.learn.builder.easyLiferay.model.Person addPerson(
		djh.learn.builder.easyLiferay.model.Person person) {

		return _personLocalService.addPerson(person);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _personLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new person with the primary key. Does not add the person to the database.
	 *
	 * @param personId the primary key for the new person
	 * @return the new person
	 */
	@Override
	public djh.learn.builder.easyLiferay.model.Person createPerson(
		long personId) {

		return _personLocalService.createPerson(personId);
	}

	@Override
	public djh.learn.builder.easyLiferay.model.Person createPerson(
			com.liferay.portal.kernel.service.ServiceContext serviceContext,
			String name, int age, boolean married)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _personLocalService.createPerson(
			serviceContext, name, age, married);
	}

	@Override
	public String delete(long personId)
		throws djh.learn.builder.easyLiferay.exception.NoSuchPersonException {

		return _personLocalService.delete(personId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _personLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the person with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PersonLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param personId the primary key of the person
	 * @return the person that was removed
	 * @throws PortalException if a person with the primary key could not be found
	 */
	@Override
	public djh.learn.builder.easyLiferay.model.Person deletePerson(
			long personId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _personLocalService.deletePerson(personId);
	}

	/**
	 * Deletes the person from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PersonLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param person the person
	 * @return the person that was removed
	 */
	@Override
	public djh.learn.builder.easyLiferay.model.Person deletePerson(
		djh.learn.builder.easyLiferay.model.Person person) {

		return _personLocalService.deletePerson(person);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _personLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _personLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _personLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _personLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>djh.learn.builder.easyLiferay.model.impl.PersonModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _personLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>djh.learn.builder.easyLiferay.model.impl.PersonModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _personLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _personLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _personLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public djh.learn.builder.easyLiferay.model.Person fetchPerson(
		long personId) {

		return _personLocalService.fetchPerson(personId);
	}

	/**
	 * Returns the person matching the UUID and group.
	 *
	 * @param uuid the person's UUID
	 * @param groupId the primary key of the group
	 * @return the matching person, or <code>null</code> if a matching person could not be found
	 */
	@Override
	public djh.learn.builder.easyLiferay.model.Person
		fetchPersonByUuidAndGroupId(String uuid, long groupId) {

		return _personLocalService.fetchPersonByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _personLocalService.getActionableDynamicQuery();
	}

	@Override
	public java.util.List<djh.learn.builder.easyLiferay.model.Person>
			getAllPersons()
		throws com.liferay.portal.kernel.exception.PortalException {

		return _personLocalService.getAllPersons();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _personLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _personLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _personLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _personLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the person with the primary key.
	 *
	 * @param personId the primary key of the person
	 * @return the person
	 * @throws PortalException if a person with the primary key could not be found
	 */
	@Override
	public djh.learn.builder.easyLiferay.model.Person getPerson(long personId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _personLocalService.getPerson(personId);
	}

	@Override
	public djh.learn.builder.easyLiferay.model.Person getPersonById(
			long personId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _personLocalService.getPersonById(personId);
	}

	/**
	 * Returns the person matching the UUID and group.
	 *
	 * @param uuid the person's UUID
	 * @param groupId the primary key of the group
	 * @return the matching person
	 * @throws PortalException if a matching person could not be found
	 */
	@Override
	public djh.learn.builder.easyLiferay.model.Person getPersonByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _personLocalService.getPersonByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the persons.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>djh.learn.builder.easyLiferay.model.impl.PersonModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of persons
	 * @param end the upper bound of the range of persons (not inclusive)
	 * @return the range of persons
	 */
	@Override
	public java.util.List<djh.learn.builder.easyLiferay.model.Person>
		getPersons(int start, int end) {

		return _personLocalService.getPersons(start, end);
	}

	@Override
	public java.util.List<djh.learn.builder.easyLiferay.model.Person>
			getPersonsByMarried(boolean married)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _personLocalService.getPersonsByMarried(married);
	}

	@Override
	public java.util.List<djh.learn.builder.easyLiferay.model.Person>
			getPersonsByName(String name)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _personLocalService.getPersonsByName(name);
	}

	/**
	 * Returns all the persons matching the UUID and company.
	 *
	 * @param uuid the UUID of the persons
	 * @param companyId the primary key of the company
	 * @return the matching persons, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<djh.learn.builder.easyLiferay.model.Person>
		getPersonsByUuidAndCompanyId(String uuid, long companyId) {

		return _personLocalService.getPersonsByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of persons matching the UUID and company.
	 *
	 * @param uuid the UUID of the persons
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of persons
	 * @param end the upper bound of the range of persons (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching persons, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<djh.learn.builder.easyLiferay.model.Person>
		getPersonsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<djh.learn.builder.easyLiferay.model.Person>
					orderByComparator) {

		return _personLocalService.getPersonsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of persons.
	 *
	 * @return the number of persons
	 */
	@Override
	public int getPersonsCount() {
		return _personLocalService.getPersonsCount();
	}

	@Override
	public djh.learn.builder.easyLiferay.model.Person updatePerson(
			long personId, String name, int age, boolean married)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _personLocalService.updatePerson(personId, name, age, married);
	}

	/**
	 * Updates the person in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PersonLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param person the person
	 * @return the person that was updated
	 */
	@Override
	public djh.learn.builder.easyLiferay.model.Person updatePerson(
		djh.learn.builder.easyLiferay.model.Person person) {

		return _personLocalService.updatePerson(person);
	}

	@Override
	public PersonLocalService getWrappedService() {
		return _personLocalService;
	}

	@Override
	public void setWrappedService(PersonLocalService personLocalService) {
		_personLocalService = personLocalService;
	}

	private PersonLocalService _personLocalService;

}