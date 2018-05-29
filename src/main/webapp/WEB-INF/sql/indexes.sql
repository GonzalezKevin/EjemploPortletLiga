create index IX_EA664EB7 on LM_League (groupId);
create index IX_C15E2301 on LM_League (uuid_);
create index IX_86A9A687 on LM_League (uuid_, companyId);
create unique index IX_89A822C9 on LM_League (uuid_, groupId);

create index IX_76670893 on LM_LeagueDay (groupId, leagueId);
create index IX_88617E7F on LM_LeagueDay (uuid_);
create index IX_3EFED049 on LM_LeagueDay (uuid_, companyId);
create unique index IX_4D60D50B on LM_LeagueDay (uuid_, groupId);

create index IX_806EADA7 on LM_Match (uuid_);
create index IX_7DF01821 on LM_Match (uuid_, companyId);
create unique index IX_BB3232E3 on LM_Match (uuid_, groupId);

create index IX_8C58B327 on LM_Team (groupId, leagueId);
create index IX_482F6713 on LM_Team (uuid_);
create index IX_FDA38335 on LM_Team (uuid_, companyId);
create unique index IX_CD2D52F7 on LM_Team (uuid_, groupId);