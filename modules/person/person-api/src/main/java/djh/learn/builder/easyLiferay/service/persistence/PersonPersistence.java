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

package djh.learn.builder.easyLiferay.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import djh.learn.builder.easyLiferay.exception.NoSuchPersonException;
import djh.learn.builder.easyLiferay.model.Person;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the person service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author deepak.singh.jangra
 * @see PersonUtil
 * @generated
 */
@ProviderType
public interface PersonPersistence extends BasePersistence<Person> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PersonUtil} to access the person persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the persons where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching persons
	 */
	public java.util.List<Person> findByUuid(String uuid);

	/**
	 * Returns a range of all the persons where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PersonModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of persons
	 * @param end the upper bound of the range of persons (not inclusive)
	 * @return the range of matching persons
	 */
	public java.util.List<Person> findByUuid(String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the persons where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PersonModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of persons
	 * @param end the upper bound of the range of persons (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching persons
	 */
	public java.util.List<Person> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Person>
			orderByComparator);

	/**
	 * Returns an ordered range of all the persons where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PersonModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of persons
	 * @param end the upper bound of the range of persons (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching persons
	 */
	public java.util.List<Person> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Person>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first person in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching person
	 * @throws NoSuchPersonException if a matching person could not be found
	 */
	public Person findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Person>
				orderByComparator)
		throws NoSuchPersonException;

	/**
	 * Returns the first person in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching person, or <code>null</code> if a matching person could not be found
	 */
	public Person fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Person>
			orderByComparator);

	/**
	 * Returns the last person in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching person
	 * @throws NoSuchPersonException if a matching person could not be found
	 */
	public Person findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Person>
				orderByComparator)
		throws NoSuchPersonException;

	/**
	 * Returns the last person in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching person, or <code>null</code> if a matching person could not be found
	 */
	public Person fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Person>
			orderByComparator);

	/**
	 * Returns the persons before and after the current person in the ordered set where uuid = &#63;.
	 *
	 * @param personId the primary key of the current person
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next person
	 * @throws NoSuchPersonException if a person with the primary key could not be found
	 */
	public Person[] findByUuid_PrevAndNext(
			long personId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Person>
				orderByComparator)
		throws NoSuchPersonException;

	/**
	 * Removes all the persons where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of persons where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching persons
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the person where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchPersonException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching person
	 * @throws NoSuchPersonException if a matching person could not be found
	 */
	public Person findByUUID_G(String uuid, long groupId)
		throws NoSuchPersonException;

	/**
	 * Returns the person where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching person, or <code>null</code> if a matching person could not be found
	 */
	public Person fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the person where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching person, or <code>null</code> if a matching person could not be found
	 */
	public Person fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the person where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the person that was removed
	 */
	public Person removeByUUID_G(String uuid, long groupId)
		throws NoSuchPersonException;

	/**
	 * Returns the number of persons where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching persons
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the persons where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching persons
	 */
	public java.util.List<Person> findByUuid_C(String uuid, long companyId);

	/**
	 * Returns a range of all the persons where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PersonModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of persons
	 * @param end the upper bound of the range of persons (not inclusive)
	 * @return the range of matching persons
	 */
	public java.util.List<Person> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the persons where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PersonModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of persons
	 * @param end the upper bound of the range of persons (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching persons
	 */
	public java.util.List<Person> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Person>
			orderByComparator);

	/**
	 * Returns an ordered range of all the persons where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PersonModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of persons
	 * @param end the upper bound of the range of persons (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching persons
	 */
	public java.util.List<Person> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Person>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first person in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching person
	 * @throws NoSuchPersonException if a matching person could not be found
	 */
	public Person findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Person>
				orderByComparator)
		throws NoSuchPersonException;

	/**
	 * Returns the first person in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching person, or <code>null</code> if a matching person could not be found
	 */
	public Person fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Person>
			orderByComparator);

	/**
	 * Returns the last person in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching person
	 * @throws NoSuchPersonException if a matching person could not be found
	 */
	public Person findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Person>
				orderByComparator)
		throws NoSuchPersonException;

	/**
	 * Returns the last person in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching person, or <code>null</code> if a matching person could not be found
	 */
	public Person fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Person>
			orderByComparator);

	/**
	 * Returns the persons before and after the current person in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param personId the primary key of the current person
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next person
	 * @throws NoSuchPersonException if a person with the primary key could not be found
	 */
	public Person[] findByUuid_C_PrevAndNext(
			long personId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Person>
				orderByComparator)
		throws NoSuchPersonException;

	/**
	 * Removes all the persons where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of persons where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching persons
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the persons where married = &#63;.
	 *
	 * @param married the married
	 * @return the matching persons
	 */
	public java.util.List<Person> findByMarried(boolean married);

	/**
	 * Returns a range of all the persons where married = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PersonModelImpl</code>.
	 * </p>
	 *
	 * @param married the married
	 * @param start the lower bound of the range of persons
	 * @param end the upper bound of the range of persons (not inclusive)
	 * @return the range of matching persons
	 */
	public java.util.List<Person> findByMarried(
		boolean married, int start, int end);

	/**
	 * Returns an ordered range of all the persons where married = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PersonModelImpl</code>.
	 * </p>
	 *
	 * @param married the married
	 * @param start the lower bound of the range of persons
	 * @param end the upper bound of the range of persons (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching persons
	 */
	public java.util.List<Person> findByMarried(
		boolean married, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Person>
			orderByComparator);

	/**
	 * Returns an ordered range of all the persons where married = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PersonModelImpl</code>.
	 * </p>
	 *
	 * @param married the married
	 * @param start the lower bound of the range of persons
	 * @param end the upper bound of the range of persons (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching persons
	 */
	public java.util.List<Person> findByMarried(
		boolean married, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Person>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first person in the ordered set where married = &#63;.
	 *
	 * @param married the married
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching person
	 * @throws NoSuchPersonException if a matching person could not be found
	 */
	public Person findByMarried_First(
			boolean married,
			com.liferay.portal.kernel.util.OrderByComparator<Person>
				orderByComparator)
		throws NoSuchPersonException;

	/**
	 * Returns the first person in the ordered set where married = &#63;.
	 *
	 * @param married the married
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching person, or <code>null</code> if a matching person could not be found
	 */
	public Person fetchByMarried_First(
		boolean married,
		com.liferay.portal.kernel.util.OrderByComparator<Person>
			orderByComparator);

	/**
	 * Returns the last person in the ordered set where married = &#63;.
	 *
	 * @param married the married
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching person
	 * @throws NoSuchPersonException if a matching person could not be found
	 */
	public Person findByMarried_Last(
			boolean married,
			com.liferay.portal.kernel.util.OrderByComparator<Person>
				orderByComparator)
		throws NoSuchPersonException;

	/**
	 * Returns the last person in the ordered set where married = &#63;.
	 *
	 * @param married the married
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching person, or <code>null</code> if a matching person could not be found
	 */
	public Person fetchByMarried_Last(
		boolean married,
		com.liferay.portal.kernel.util.OrderByComparator<Person>
			orderByComparator);

	/**
	 * Returns the persons before and after the current person in the ordered set where married = &#63;.
	 *
	 * @param personId the primary key of the current person
	 * @param married the married
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next person
	 * @throws NoSuchPersonException if a person with the primary key could not be found
	 */
	public Person[] findByMarried_PrevAndNext(
			long personId, boolean married,
			com.liferay.portal.kernel.util.OrderByComparator<Person>
				orderByComparator)
		throws NoSuchPersonException;

	/**
	 * Removes all the persons where married = &#63; from the database.
	 *
	 * @param married the married
	 */
	public void removeByMarried(boolean married);

	/**
	 * Returns the number of persons where married = &#63;.
	 *
	 * @param married the married
	 * @return the number of matching persons
	 */
	public int countByMarried(boolean married);

	/**
	 * Caches the person in the entity cache if it is enabled.
	 *
	 * @param person the person
	 */
	public void cacheResult(Person person);

	/**
	 * Caches the persons in the entity cache if it is enabled.
	 *
	 * @param persons the persons
	 */
	public void cacheResult(java.util.List<Person> persons);

	/**
	 * Creates a new person with the primary key. Does not add the person to the database.
	 *
	 * @param personId the primary key for the new person
	 * @return the new person
	 */
	public Person create(long personId);

	/**
	 * Removes the person with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param personId the primary key of the person
	 * @return the person that was removed
	 * @throws NoSuchPersonException if a person with the primary key could not be found
	 */
	public Person remove(long personId) throws NoSuchPersonException;

	public Person updateImpl(Person person);

	/**
	 * Returns the person with the primary key or throws a <code>NoSuchPersonException</code> if it could not be found.
	 *
	 * @param personId the primary key of the person
	 * @return the person
	 * @throws NoSuchPersonException if a person with the primary key could not be found
	 */
	public Person findByPrimaryKey(long personId) throws NoSuchPersonException;

	/**
	 * Returns the person with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param personId the primary key of the person
	 * @return the person, or <code>null</code> if a person with the primary key could not be found
	 */
	public Person fetchByPrimaryKey(long personId);

	/**
	 * Returns all the persons.
	 *
	 * @return the persons
	 */
	public java.util.List<Person> findAll();

	/**
	 * Returns a range of all the persons.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PersonModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of persons
	 * @param end the upper bound of the range of persons (not inclusive)
	 * @return the range of persons
	 */
	public java.util.List<Person> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the persons.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PersonModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of persons
	 * @param end the upper bound of the range of persons (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of persons
	 */
	public java.util.List<Person> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Person>
			orderByComparator);

	/**
	 * Returns an ordered range of all the persons.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PersonModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of persons
	 * @param end the upper bound of the range of persons (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of persons
	 */
	public java.util.List<Person> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Person>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the persons from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of persons.
	 *
	 * @return the number of persons
	 */
	public int countAll();

}