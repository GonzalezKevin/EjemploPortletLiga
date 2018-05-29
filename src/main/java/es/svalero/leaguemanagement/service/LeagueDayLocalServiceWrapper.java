package es.svalero.leaguemanagement.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link LeagueDayLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see LeagueDayLocalService
 * @generated
 */
public class LeagueDayLocalServiceWrapper implements LeagueDayLocalService,
    ServiceWrapper<LeagueDayLocalService> {
    private LeagueDayLocalService _leagueDayLocalService;

    public LeagueDayLocalServiceWrapper(
        LeagueDayLocalService leagueDayLocalService) {
        _leagueDayLocalService = leagueDayLocalService;
    }

    /**
    * Adds the league day to the database. Also notifies the appropriate model listeners.
    *
    * @param leagueDay the league day
    * @return the league day that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public es.svalero.leaguemanagement.model.LeagueDay addLeagueDay(
        es.svalero.leaguemanagement.model.LeagueDay leagueDay)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _leagueDayLocalService.addLeagueDay(leagueDay);
    }

    /**
    * Creates a new league day with the primary key. Does not add the league day to the database.
    *
    * @param leagueDayId the primary key for the new league day
    * @return the new league day
    */
    @Override
    public es.svalero.leaguemanagement.model.LeagueDay createLeagueDay(
        long leagueDayId) {
        return _leagueDayLocalService.createLeagueDay(leagueDayId);
    }

    /**
    * Deletes the league day with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param leagueDayId the primary key of the league day
    * @return the league day that was removed
    * @throws PortalException if a league day with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public es.svalero.leaguemanagement.model.LeagueDay deleteLeagueDay(
        long leagueDayId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _leagueDayLocalService.deleteLeagueDay(leagueDayId);
    }

    /**
    * Deletes the league day from the database. Also notifies the appropriate model listeners.
    *
    * @param leagueDay the league day
    * @return the league day that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public es.svalero.leaguemanagement.model.LeagueDay deleteLeagueDay(
        es.svalero.leaguemanagement.model.LeagueDay leagueDay)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _leagueDayLocalService.deleteLeagueDay(leagueDay);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _leagueDayLocalService.dynamicQuery();
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
        return _leagueDayLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.svalero.leaguemanagement.model.impl.LeagueDayModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _leagueDayLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.svalero.leaguemanagement.model.impl.LeagueDayModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _leagueDayLocalService.dynamicQuery(dynamicQuery, start, end,
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
        return _leagueDayLocalService.dynamicQueryCount(dynamicQuery);
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
        return _leagueDayLocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public es.svalero.leaguemanagement.model.LeagueDay fetchLeagueDay(
        long leagueDayId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _leagueDayLocalService.fetchLeagueDay(leagueDayId);
    }

    /**
    * Returns the league day with the matching UUID and company.
    *
    * @param uuid the league day's UUID
    * @param companyId the primary key of the company
    * @return the matching league day, or <code>null</code> if a matching league day could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public es.svalero.leaguemanagement.model.LeagueDay fetchLeagueDayByUuidAndCompanyId(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _leagueDayLocalService.fetchLeagueDayByUuidAndCompanyId(uuid,
            companyId);
    }

    /**
    * Returns the league day matching the UUID and group.
    *
    * @param uuid the league day's UUID
    * @param groupId the primary key of the group
    * @return the matching league day, or <code>null</code> if a matching league day could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public es.svalero.leaguemanagement.model.LeagueDay fetchLeagueDayByUuidAndGroupId(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _leagueDayLocalService.fetchLeagueDayByUuidAndGroupId(uuid,
            groupId);
    }

    /**
    * Returns the league day with the primary key.
    *
    * @param leagueDayId the primary key of the league day
    * @return the league day
    * @throws PortalException if a league day with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public es.svalero.leaguemanagement.model.LeagueDay getLeagueDay(
        long leagueDayId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _leagueDayLocalService.getLeagueDay(leagueDayId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _leagueDayLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns the league day with the matching UUID and company.
    *
    * @param uuid the league day's UUID
    * @param companyId the primary key of the company
    * @return the matching league day
    * @throws PortalException if a matching league day could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public es.svalero.leaguemanagement.model.LeagueDay getLeagueDayByUuidAndCompanyId(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _leagueDayLocalService.getLeagueDayByUuidAndCompanyId(uuid,
            companyId);
    }

    /**
    * Returns the league day matching the UUID and group.
    *
    * @param uuid the league day's UUID
    * @param groupId the primary key of the group
    * @return the matching league day
    * @throws PortalException if a matching league day could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public es.svalero.leaguemanagement.model.LeagueDay getLeagueDayByUuidAndGroupId(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _leagueDayLocalService.getLeagueDayByUuidAndGroupId(uuid, groupId);
    }

    /**
    * Returns a range of all the league daies.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.svalero.leaguemanagement.model.impl.LeagueDayModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of league daies
    * @param end the upper bound of the range of league daies (not inclusive)
    * @return the range of league daies
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<es.svalero.leaguemanagement.model.LeagueDay> getLeagueDaies(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _leagueDayLocalService.getLeagueDaies(start, end);
    }

    /**
    * Returns the number of league daies.
    *
    * @return the number of league daies
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getLeagueDaiesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _leagueDayLocalService.getLeagueDaiesCount();
    }

    /**
    * Updates the league day in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param leagueDay the league day
    * @return the league day that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public es.svalero.leaguemanagement.model.LeagueDay updateLeagueDay(
        es.svalero.leaguemanagement.model.LeagueDay leagueDay)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _leagueDayLocalService.updateLeagueDay(leagueDay);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _leagueDayLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _leagueDayLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _leagueDayLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    @Override
    public es.svalero.leaguemanagement.model.LeagueDay addLeagueDay(
        long userId, long leagueId, java.lang.String number,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _leagueDayLocalService.addLeagueDay(userId, leagueId, number,
            serviceContext);
    }

    @Override
    public java.util.List<es.svalero.leaguemanagement.model.LeagueDay> getLeagueDays(
        long groupId, long leagueId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _leagueDayLocalService.getLeagueDays(groupId, leagueId);
    }

    @Override
    public int countByGroupIdAndLeagueId(long groupId, long leagueId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _leagueDayLocalService.countByGroupIdAndLeagueId(groupId,
            leagueId);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public LeagueDayLocalService getWrappedLeagueDayLocalService() {
        return _leagueDayLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedLeagueDayLocalService(
        LeagueDayLocalService leagueDayLocalService) {
        _leagueDayLocalService = leagueDayLocalService;
    }

    @Override
    public LeagueDayLocalService getWrappedService() {
        return _leagueDayLocalService;
    }

    @Override
    public void setWrappedService(LeagueDayLocalService leagueDayLocalService) {
        _leagueDayLocalService = leagueDayLocalService;
    }
}
