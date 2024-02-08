create table easy_liferay_Person (
	uuid_ VARCHAR(75) null,
	personId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(75) null,
	married BOOLEAN,
	age INTEGER
);