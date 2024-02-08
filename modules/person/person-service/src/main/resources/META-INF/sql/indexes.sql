create index IX_2F8FA9BB on easy_liferay_Person (married);
create index IX_2B7153BD on easy_liferay_Person (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_3FC5A57F on easy_liferay_Person (uuid_[$COLUMN_LENGTH:75$], groupId);