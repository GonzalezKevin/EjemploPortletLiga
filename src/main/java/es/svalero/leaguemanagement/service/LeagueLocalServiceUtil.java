package es.svalero.leaguemanagement.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for League. This utility wraps
 * {@link es.svalero.leaguemanagement.service.impl.LeagueLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see LeagueLocalService
 * @see es.svalero.leaguemanagement.service.base.LeagueLocalServiceBaseImpl
 * @see es.svalero.leaguemanagement.service.impl.LeagueLocalServiceImpl
 * @generated
 */
public class LeagueLocalServiceUtil {
    private static LeagueLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link es.svalero.leaguemanagement.service.impl.LeagueLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the league to the database. Also notifies the appropriate model listeners.
    *
    * @param league the league
    * @return the league that was added
    * @throws SystemException if a system exception occurred
    */
    public static es.svalero.leaguemanagement.model.League addLeague(
        es.svalero.leaguemanagement.model.League league)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addLeague(league);
    }

    /**
    * Creates a new league with the primary key. Does not add the league to the database.
    *
    * @param leagueId the primary key for the new league
    * @return the new league
    */
    public static es.svalero.leaguemanagement.model.League createLeague(
        long leagueId) {
        return getService().createLeague(leagueId);
    }

    /**
    * Deletes the league with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param leagueId the primary key of the league
    * @return the league that was removed
    * @throws PortalException if a league with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.svalero.leaguemanagement.model.League deleteLeague(
        long leagueId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteLeague(leagueId);
    }

    /**
    * Deletes the league from the database. Also notifies the appropriate model listeners.
    *
    * @param league the league
    * @return the league that was removed
    * @throws SystemException if a system exception occurred
    */
    public static es.svalero.leaguemanagement.model.League deleteLeague(
        es.svalero.leaguemanagement.model.League league)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteLeague(league);
    }

    public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return getService().dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery);
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
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery, start, end);
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
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery, projection);
    }

    public static es.svalero.leaguemanagement.model.League fetchLeague(
        long leagueId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchLeague(leagueId);
    }

    /**
    * Returns the league with the matching UUID and company.
    *
    * @param uuid the league's UUID
    * @param companyId the primary key of the company
    * @return the matching league, or <code>null</code> if a matching league could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.svalero.leaguemanagement.model.League fetchLeagueByUuidAndCompanyId(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchLeagueByUuidAndCompanyId(uuid, companyId);
    }

    /**
    * Returns the league matching the UUID and group.
    *
    * @param uuid the league's UUID
    * @param groupId the primary key of the group
    * @return the matching league, or <code>null</code> if a matching league could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.svalero.leaguemanagement.model.League fetchLeagueByUuidAndGroupId(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchLeagueByUuidAndGroupId(uuid, groupId);
    }

    /**
    * Returns the league with the primary key.
    *
    * @param leagueId the primary key of the league
    * @return the league
    * @throws PortalException if a league with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.svalero.leaguemanagement.model.League getLeague(
        long leagueId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getLeague(leagueId);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
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
    public static es.svalero.leaguemanagement.model.League getLeagueByUuidAndCompanyId(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getLeagueByUuidAndCompanyId(uuid, companyId);
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
    public static es.svalero.leaguemanagement.model.League getLeagueByUuidAndGroupId(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getLeagueByUuidAndGroupId(uuid, groupId);
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
    public static java.util.List<es.svalero.leaguemanagement.model.League> getLeagues(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getLeagues(start, end);
    }

    /**
    * Returns the number of leagues.
    *
    * @return the number of leagues
    * @throws SystemException if a system exception occurred
    */
    public static int getLeaguesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getLeaguesCount();
    }

    /**
    * Updates the league in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param league the league
    * @return the league that was updated
    * @throws SystemException if a system exception occurred
    */
    public static es.svalero.leaguemanagement.model.League updateLeague(
        es.svalero.leaguemanagement.model.League league)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateLeague(league);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public static java.lang.String getBeanIdentifier() {
        return getService().getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public static void setBeanIdentifier(java.lang.String beanIdentifier) {
        getService().setBeanIdentifier(beanIdentifier);
    }

    public static java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return getService().invokeMethod(name, parameterTypes, arguments);
    }

    public static java.util.List<es.svalero.leaguemanagement.model.League> getLeagues(
        long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getLeagues(groupId);
    }

    public static int countByGroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().countByGroupId(groupId);
    }

    public static es.svalero.leaguemanagement.model.League addLeague(
        long userId, java.lang.String name,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().addLeague(userId, name, serviceContext);
    }

    public static void clearService() {
        _service = null;
    }

    public static LeagueLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    LeagueLocalService.class.getName());

            if (invokableLocalService instanceof LeagueLocalService) {
                _service = (LeagueLocalService) invokableLocalService;
            } else {
                _service = new LeagueLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(LeagueLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(LeagueLocalService service) {
    }
}
