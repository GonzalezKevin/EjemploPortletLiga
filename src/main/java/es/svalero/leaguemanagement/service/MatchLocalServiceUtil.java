package es.svalero.leaguemanagement.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Match. This utility wraps
 * {@link es.svalero.leaguemanagement.service.impl.MatchLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see MatchLocalService
 * @see es.svalero.leaguemanagement.service.base.MatchLocalServiceBaseImpl
 * @see es.svalero.leaguemanagement.service.impl.MatchLocalServiceImpl
 * @generated
 */
public class MatchLocalServiceUtil {
    private static MatchLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link es.svalero.leaguemanagement.service.impl.MatchLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the match to the database. Also notifies the appropriate model listeners.
    *
    * @param match the match
    * @return the match that was added
    * @throws SystemException if a system exception occurred
    */
    public static es.svalero.leaguemanagement.model.Match addMatch(
        es.svalero.leaguemanagement.model.Match match)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addMatch(match);
    }

    /**
    * Creates a new match with the primary key. Does not add the match to the database.
    *
    * @param matchId the primary key for the new match
    * @return the new match
    */
    public static es.svalero.leaguemanagement.model.Match createMatch(
        long matchId) {
        return getService().createMatch(matchId);
    }

    /**
    * Deletes the match with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param matchId the primary key of the match
    * @return the match that was removed
    * @throws PortalException if a match with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.svalero.leaguemanagement.model.Match deleteMatch(
        long matchId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteMatch(matchId);
    }

    /**
    * Deletes the match from the database. Also notifies the appropriate model listeners.
    *
    * @param match the match
    * @return the match that was removed
    * @throws SystemException if a system exception occurred
    */
    public static es.svalero.leaguemanagement.model.Match deleteMatch(
        es.svalero.leaguemanagement.model.Match match)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteMatch(match);
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.svalero.leaguemanagement.model.impl.MatchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.svalero.leaguemanagement.model.impl.MatchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

    public static es.svalero.leaguemanagement.model.Match fetchMatch(
        long matchId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchMatch(matchId);
    }

    /**
    * Returns the match with the matching UUID and company.
    *
    * @param uuid the match's UUID
    * @param companyId the primary key of the company
    * @return the matching match, or <code>null</code> if a matching match could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.svalero.leaguemanagement.model.Match fetchMatchByUuidAndCompanyId(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchMatchByUuidAndCompanyId(uuid, companyId);
    }

    /**
    * Returns the match matching the UUID and group.
    *
    * @param uuid the match's UUID
    * @param groupId the primary key of the group
    * @return the matching match, or <code>null</code> if a matching match could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.svalero.leaguemanagement.model.Match fetchMatchByUuidAndGroupId(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchMatchByUuidAndGroupId(uuid, groupId);
    }

    /**
    * Returns the match with the primary key.
    *
    * @param matchId the primary key of the match
    * @return the match
    * @throws PortalException if a match with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.svalero.leaguemanagement.model.Match getMatch(long matchId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getMatch(matchId);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns the match with the matching UUID and company.
    *
    * @param uuid the match's UUID
    * @param companyId the primary key of the company
    * @return the matching match
    * @throws PortalException if a matching match could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.svalero.leaguemanagement.model.Match getMatchByUuidAndCompanyId(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getMatchByUuidAndCompanyId(uuid, companyId);
    }

    /**
    * Returns the match matching the UUID and group.
    *
    * @param uuid the match's UUID
    * @param groupId the primary key of the group
    * @return the matching match
    * @throws PortalException if a matching match could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.svalero.leaguemanagement.model.Match getMatchByUuidAndGroupId(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getMatchByUuidAndGroupId(uuid, groupId);
    }

    /**
    * Returns a range of all the matchs.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.svalero.leaguemanagement.model.impl.MatchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of matchs
    * @param end the upper bound of the range of matchs (not inclusive)
    * @return the range of matchs
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<es.svalero.leaguemanagement.model.Match> getMatchs(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getMatchs(start, end);
    }

    /**
    * Returns the number of matchs.
    *
    * @return the number of matchs
    * @throws SystemException if a system exception occurred
    */
    public static int getMatchsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getMatchsCount();
    }

    /**
    * Updates the match in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param match the match
    * @return the match that was updated
    * @throws SystemException if a system exception occurred
    */
    public static es.svalero.leaguemanagement.model.Match updateMatch(
        es.svalero.leaguemanagement.model.Match match)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateMatch(match);
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

    public static void clearService() {
        _service = null;
    }

    public static MatchLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    MatchLocalService.class.getName());

            if (invokableLocalService instanceof MatchLocalService) {
                _service = (MatchLocalService) invokableLocalService;
            } else {
                _service = new MatchLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(MatchLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(MatchLocalService service) {
    }
}
