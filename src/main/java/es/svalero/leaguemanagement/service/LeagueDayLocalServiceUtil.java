package es.svalero.leaguemanagement.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for LeagueDay. This utility wraps
 * {@link es.svalero.leaguemanagement.service.impl.LeagueDayLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see LeagueDayLocalService
 * @see es.svalero.leaguemanagement.service.base.LeagueDayLocalServiceBaseImpl
 * @see es.svalero.leaguemanagement.service.impl.LeagueDayLocalServiceImpl
 * @generated
 */
public class LeagueDayLocalServiceUtil {
    private static LeagueDayLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link es.svalero.leaguemanagement.service.impl.LeagueDayLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the league day to the database. Also notifies the appropriate model listeners.
    *
    * @param leagueDay the league day
    * @return the league day that was added
    * @throws SystemException if a system exception occurred
    */
    public static es.svalero.leaguemanagement.model.LeagueDay addLeagueDay(
        es.svalero.leaguemanagement.model.LeagueDay leagueDay)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addLeagueDay(leagueDay);
    }

    /**
    * Creates a new league day with the primary key. Does not add the league day to the database.
    *
    * @param leagueDayId the primary key for the new league day
    * @return the new league day
    */
    public static es.svalero.leaguemanagement.model.LeagueDay createLeagueDay(
        long leagueDayId) {
        return getService().createLeagueDay(leagueDayId);
    }

    /**
    * Deletes the league day with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param leagueDayId the primary key of the league day
    * @return the league day that was removed
    * @throws PortalException if a league day with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.svalero.leaguemanagement.model.LeagueDay deleteLeagueDay(
        long leagueDayId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteLeagueDay(leagueDayId);
    }

    /**
    * Deletes the league day from the database. Also notifies the appropriate model listeners.
    *
    * @param leagueDay the league day
    * @return the league day that was removed
    * @throws SystemException if a system exception occurred
    */
    public static es.svalero.leaguemanagement.model.LeagueDay deleteLeagueDay(
        es.svalero.leaguemanagement.model.LeagueDay leagueDay)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteLeagueDay(leagueDay);
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.svalero.leaguemanagement.model.impl.LeagueDayModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

    public static es.svalero.leaguemanagement.model.LeagueDay fetchLeagueDay(
        long leagueDayId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchLeagueDay(leagueDayId);
    }

    /**
    * Returns the league day with the matching UUID and company.
    *
    * @param uuid the league day's UUID
    * @param companyId the primary key of the company
    * @return the matching league day, or <code>null</code> if a matching league day could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.svalero.leaguemanagement.model.LeagueDay fetchLeagueDayByUuidAndCompanyId(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchLeagueDayByUuidAndCompanyId(uuid, companyId);
    }

    /**
    * Returns the league day matching the UUID and group.
    *
    * @param uuid the league day's UUID
    * @param groupId the primary key of the group
    * @return the matching league day, or <code>null</code> if a matching league day could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.svalero.leaguemanagement.model.LeagueDay fetchLeagueDayByUuidAndGroupId(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchLeagueDayByUuidAndGroupId(uuid, groupId);
    }

    /**
    * Returns the league day with the primary key.
    *
    * @param leagueDayId the primary key of the league day
    * @return the league day
    * @throws PortalException if a league day with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.svalero.leaguemanagement.model.LeagueDay getLeagueDay(
        long leagueDayId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getLeagueDay(leagueDayId);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
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
    public static es.svalero.leaguemanagement.model.LeagueDay getLeagueDayByUuidAndCompanyId(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getLeagueDayByUuidAndCompanyId(uuid, companyId);
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
    public static es.svalero.leaguemanagement.model.LeagueDay getLeagueDayByUuidAndGroupId(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getLeagueDayByUuidAndGroupId(uuid, groupId);
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
    public static java.util.List<es.svalero.leaguemanagement.model.LeagueDay> getLeagueDaies(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getLeagueDaies(start, end);
    }

    /**
    * Returns the number of league daies.
    *
    * @return the number of league daies
    * @throws SystemException if a system exception occurred
    */
    public static int getLeagueDaiesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getLeagueDaiesCount();
    }

    /**
    * Updates the league day in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param leagueDay the league day
    * @return the league day that was updated
    * @throws SystemException if a system exception occurred
    */
    public static es.svalero.leaguemanagement.model.LeagueDay updateLeagueDay(
        es.svalero.leaguemanagement.model.LeagueDay leagueDay)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateLeagueDay(leagueDay);
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

    public static es.svalero.leaguemanagement.model.LeagueDay addLeagueDay(
        long userId, long leagueId, java.lang.String number,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .addLeagueDay(userId, leagueId, number, serviceContext);
    }

    public static java.util.List<es.svalero.leaguemanagement.model.LeagueDay> getLeagueDays(
        long groupId, long leagueId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getLeagueDays(groupId, leagueId);
    }

    public static int countByGroupIdAndLeagueId(long groupId, long leagueId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().countByGroupIdAndLeagueId(groupId, leagueId);
    }

    public static void clearService() {
        _service = null;
    }

    public static LeagueDayLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    LeagueDayLocalService.class.getName());

            if (invokableLocalService instanceof LeagueDayLocalService) {
                _service = (LeagueDayLocalService) invokableLocalService;
            } else {
                _service = new LeagueDayLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(LeagueDayLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(LeagueDayLocalService service) {
    }
}
