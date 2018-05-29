package es.svalero.leaguemanagement.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TeamLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see TeamLocalService
 * @generated
 */
public class TeamLocalServiceWrapper implements TeamLocalService,
    ServiceWrapper<TeamLocalService> {
    private TeamLocalService _teamLocalService;

    public TeamLocalServiceWrapper(TeamLocalService teamLocalService) {
        _teamLocalService = teamLocalService;
    }

    /**
    * Adds the team to the database. Also notifies the appropriate model listeners.
    *
    * @param team the team
    * @return the team that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public es.svalero.leaguemanagement.model.Team addTeam(
        es.svalero.leaguemanagement.model.Team team)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _teamLocalService.addTeam(team);
    }

    /**
    * Creates a new team with the primary key. Does not add the team to the database.
    *
    * @param teamId the primary key for the new team
    * @return the new team
    */
    @Override
    public es.svalero.leaguemanagement.model.Team createTeam(long teamId) {
        return _teamLocalService.createTeam(teamId);
    }

    /**
    * Deletes the team with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param teamId the primary key of the team
    * @return the team that was removed
    * @throws PortalException if a team with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public es.svalero.leaguemanagement.model.Team deleteTeam(long teamId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _teamLocalService.deleteTeam(teamId);
    }

    /**
    * Deletes the team from the database. Also notifies the appropriate model listeners.
    *
    * @param team the team
    * @return the team that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public es.svalero.leaguemanagement.model.Team deleteTeam(
        es.svalero.leaguemanagement.model.Team team)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _teamLocalService.deleteTeam(team);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _teamLocalService.dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _teamLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.svalero.leaguemanagement.model.impl.TeamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _teamLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.svalero.leaguemanagement.model.impl.TeamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _teamLocalService.dynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _teamLocalService.dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _teamLocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public es.svalero.leaguemanagement.model.Team fetchTeam(long teamId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _teamLocalService.fetchTeam(teamId);
    }

    /**
    * Returns the team with the matching UUID and company.
    *
    * @param uuid the team's UUID
    * @param companyId the primary key of the company
    * @return the matching team, or <code>null</code> if a matching team could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public es.svalero.leaguemanagement.model.Team fetchTeamByUuidAndCompanyId(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _teamLocalService.fetchTeamByUuidAndCompanyId(uuid, companyId);
    }

    /**
    * Returns the team matching the UUID and group.
    *
    * @param uuid the team's UUID
    * @param groupId the primary key of the group
    * @return the matching team, or <code>null</code> if a matching team could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public es.svalero.leaguemanagement.model.Team fetchTeamByUuidAndGroupId(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _teamLocalService.fetchTeamByUuidAndGroupId(uuid, groupId);
    }

    /**
    * Returns the team with the primary key.
    *
    * @param teamId the primary key of the team
    * @return the team
    * @throws PortalException if a team with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public es.svalero.leaguemanagement.model.Team getTeam(long teamId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _teamLocalService.getTeam(teamId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _teamLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns the team with the matching UUID and company.
    *
    * @param uuid the team's UUID
    * @param companyId the primary key of the company
    * @return the matching team
    * @throws PortalException if a matching team could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public es.svalero.leaguemanagement.model.Team getTeamByUuidAndCompanyId(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _teamLocalService.getTeamByUuidAndCompanyId(uuid, companyId);
    }

    /**
    * Returns the team matching the UUID and group.
    *
    * @param uuid the team's UUID
    * @param groupId the primary key of the group
    * @return the matching team
    * @throws PortalException if a matching team could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public es.svalero.leaguemanagement.model.Team getTeamByUuidAndGroupId(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _teamLocalService.getTeamByUuidAndGroupId(uuid, groupId);
    }

    /**
    * Returns a range of all the teams.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.svalero.leaguemanagement.model.impl.TeamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of teams
    * @param end the upper bound of the range of teams (not inclusive)
    * @return the range of teams
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<es.svalero.leaguemanagement.model.Team> getTeams(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _teamLocalService.getTeams(start, end);
    }

    /**
    * Returns the number of teams.
    *
    * @return the number of teams
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getTeamsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _teamLocalService.getTeamsCount();
    }

    /**
    * Updates the team in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param team the team
    * @return the team that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public es.svalero.leaguemanagement.model.Team updateTeam(
        es.svalero.leaguemanagement.model.Team team)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _teamLocalService.updateTeam(team);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _teamLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _teamLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _teamLocalService.invokeMethod(name, parameterTypes, arguments);
    }

    @Override
    public es.svalero.leaguemanagement.model.Team addTeam(long userId,
        long leagueId, java.lang.String name,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _teamLocalService.addTeam(userId, leagueId, name, serviceContext);
    }

    @Override
    public java.util.List<es.svalero.leaguemanagement.model.Team> getTeams(
        long groupId, long leagueId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _teamLocalService.getTeams(groupId, leagueId);
    }

    @Override
    public int countByGroupIdAndLeagueId(long groupId, long leagueId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _teamLocalService.countByGroupIdAndLeagueId(groupId, leagueId);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public TeamLocalService getWrappedTeamLocalService() {
        return _teamLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedTeamLocalService(TeamLocalService teamLocalService) {
        _teamLocalService = teamLocalService;
    }

    @Override
    public TeamLocalService getWrappedService() {
        return _teamLocalService;
    }

    @Override
    public void setWrappedService(TeamLocalService teamLocalService) {
        _teamLocalService = teamLocalService;
    }
}
