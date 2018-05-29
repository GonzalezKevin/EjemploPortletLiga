package es.svalero.leaguemanagement.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link LeagueLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see LeagueLocalService
 * @generated
 */
public class LeagueLocalServiceWrapper implements LeagueLocalService,
    ServiceWrapper<LeagueLocalService> {
    private LeagueLocalService _leagueLocalService;

    public LeagueLocalServiceWrapper(LeagueLocalService leagueLocalService) {
        _leagueLocalService = leagueLocalService;
    }

    /**
    * Adds the league to the database. Also notifies the appropriate model listeners.
    *
    * @param league the league
    * @return the league that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public es.svalero.leaguemanagement.model.League addLeague(
        es.svalero.leaguemanagement.model.League league)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _leagueLocalService.addLeague(league);
    }

    /**
    * Creates a new league with the primary key. Does not add the league to the database.
    *
    * @param leagueId the primary key for the new league
    * @return the new league
    */
    @Override
    public es.svalero.leaguemanagement.model.League createLeague(long leagueId) {
        return _leagueLocalService.createLeague(leagueId);
    }

    /**
    * Deletes the league with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param leagueId the primary key of the league
    * @return the league that was removed
    * @throws PortalException if a league with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public es.svalero.leaguemanagement.model.League deleteLeague(long leagueId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _leagueLocalService.deleteLeague(leagueId);
    }

    /**
    * Deletes the league from the database. Also notifies the appropriate model listeners.
    *
    * @param league the league
    * @return the league that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public es.svalero.leaguemanagement.model.League deleteLeague(
        es.svalero.leaguemanagement.model.League league)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _leagueLocalService.deleteLeague(league);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _leagueLocalService.dynamicQuery();
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
        return _leagueLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.svalero.leaguemanagement.model.impl.LeagueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _leagueLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.svalero.leaguemanagement.model.impl.LeagueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _leagueLocalService.dynamicQuery(dynamicQuery, start, end,
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
        return _leagueLocalService.dynamicQueryCount(dynamicQuery);
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
        return _leagueLocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public es.svalero.leaguemanagement.model.League fetchLeague(long leagueId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _leagueLocalService.fetchLeague(leagueId);
    }

    /**
    * Returns the league with the matching UUID and company.
    *
    * @param uuid the league's UUID
    * @param companyId the primary key of the company
    * @return the matching league, or <code>null</code> if a matching league could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public es.svalero.leaguemanagement.model.League fetchLeagueByUuidAndCompanyId(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _leagueLocalService.fetchLeagueByUuidAndCompanyId(uuid, companyId);
    }

    /**
    * Returns the league matching the UUID and group.
    *
    * @param uuid the league's UUID
    * @param groupId the primary key of the group
    * @return the matching league, or <code>null</code> if a matching league could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public es.svalero.leaguemanagement.model.League fetchLeagueByUuidAndGroupId(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _leagueLocalService.fetchLeagueByUuidAndGroupId(uuid, groupId);
    }

    /**
    * Returns the league with the primary key.
    *
    * @param leagueId the primary key of the league
    * @return the league
    * @throws PortalException if a league with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public es.svalero.leaguemanagement.model.League getLeague(long leagueId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _leagueLocalService.getLeague(leagueId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _leagueLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns the league with the matching UUID and company.
    *
    * @param uuid the league's UUID
    * @param companyId the primary key of the company
    * @return the matching league
    * @throws PortalException if a matching league could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public es.svalero.leaguemanagement.model.League getLeagueByUuidAndCompanyId(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _leagueLocalService.getLeagueByUuidAndCompanyId(uuid, companyId);
    }

    /**
    * Returns the league matching the UUID and group.
    *
    * @param uuid the league's UUID
    * @param groupId the primary key of the group
    * @return the matching league
    * @throws PortalException if a matching league could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public es.svalero.leaguemanagement.model.League getLeagueByUuidAndGroupId(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _leagueLocalService.getLeagueByUuidAndGroupId(uuid, groupId);
    }

    /**
    * Returns a range of all the leagues.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.svalero.leaguemanagement.model.impl.LeagueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of leagues
    * @param end the upper bound of the range of leagues (not inclusive)
    * @return the range of leagues
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<es.svalero.leaguemanagement.model.League> getLeagues(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _leagueLocalService.getLeagues(start, end);
    }

    /**
    * Returns the number of leagues.
    *
    * @return the number of leagues
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getLeaguesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _leagueLocalService.getLeaguesCount();
    }

    /**
    * Updates the league in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param league the league
    * @return the league that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public es.svalero.leaguemanagement.model.League updateLeague(
        es.svalero.leaguemanagement.model.League league)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _leagueLocalService.updateLeague(league);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _leagueLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _leagueLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _leagueLocalService.invokeMethod(name, parameterTypes, arguments);
    }

    @Override
    public java.util.List<es.svalero.leaguemanagement.model.League> getLeagues(
        long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _leagueLocalService.getLeagues(groupId);
    }

    @Override
    public int countByGroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _leagueLocalService.countByGroupId(groupId);
    }

    @Override
    public es.svalero.leaguemanagement.model.League addLeague(long userId,
        java.lang.String name,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _leagueLocalService.addLeague(userId, name, serviceContext);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public LeagueLocalService getWrappedLeagueLocalService() {
        return _leagueLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedLeagueLocalService(
        LeagueLocalService leagueLocalService) {
        _leagueLocalService = leagueLocalService;
    }

    @Override
    public LeagueLocalService getWrappedService() {
        return _leagueLocalService;
    }

    @Override
    public void setWrappedService(LeagueLocalService leagueLocalService) {
        _leagueLocalService = leagueLocalService;
    }
}
