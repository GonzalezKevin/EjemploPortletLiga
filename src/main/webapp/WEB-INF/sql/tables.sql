create table LM_League (
	uuid_ VARCHAR(75) null,
	leagueId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(75) null
);

create table LM_LeagueDay (
	uuid_ VARCHAR(75) null,
	leagueDayId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	leagueId LONG,
	number_ VARCHAR(75) null
);

create table LM_Match (
	uuid_ VARCHAR(75) null,
	matchId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	localTeamId LONG,
	visitingTeamId LONG,
	localScore INTEGER,
	visitingScore INTEGER
);

create table LM_Team (
	uuid_ VARCHAR(75) null,
	teamId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	leagueId LONG,
	name VARCHAR(75) null
);