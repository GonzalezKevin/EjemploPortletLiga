package es.svalero.leaguemanagement.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import es.svalero.leaguemanagement.model.LeagueDay;

/**
 * The persistence interface for the league day service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LeagueDayPersistenceImpl
 * @see LeagueDayUtil
 * @generated
 */
public interface LeagueDayPersistence extends BasePersistence<LeagueDay> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link LeagueDayUtil} to access the league day persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the league daies where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the matching league daies
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<es.svalero.leaguemanagement.model.LeagueDay> findByUuid(
        java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the league daies where uuid = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.svalero.leaguemanagement.model.impl.LeagueDayModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param start the lower bound of the range of league daies
    * @param end the upper bound of the range of league daies (not inclusive)
    * @return the range of matching league daies
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<es.svalero.leaguemanagement.model.LeagueDay> findByUuid(
        java.lang.String uuid, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the league daies where uuid = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.svalero.leaguemanagement.model.impl.LeagueDayModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param start the lower bound of the range of league daies
    * @param end the upper bound of the range of league daies (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching league daies
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<es.svalero.leaguemanagement.model.LeagueDay> findByUuid(
        java.lang.String uuid, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first league day in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching league day
    * @throws es.svalero.leaguemanagement.NoSuchLeagueDayException if a matching league day could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.svalero.leaguemanagement.model.LeagueDay findByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.svalero.leaguemanagement.NoSuchLeagueDayException;

    /**
    * Returns the first league day in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching league day, or <code>null</code> if a matching league day could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.svalero.leaguemanagement.model.LeagueDay fetchByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last league day in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching league day
    * @throws es.svalero.leaguemanagement.NoSuchLeagueDayException if a matching league day could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.svalero.leaguemanagement.model.LeagueDay findByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.svalero.leaguemanagement.NoSuchLeagueDayException;

    /**
    * Returns the last league day in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching league day, or <code>null</code> if a matching league day could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.svalero.leaguemanagement.model.LeagueDay fetchByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the league daies before and after the current league day in the ordered set where uuid = &#63;.
    *
    * @param leagueDayId the primary key of the current league day
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next league day
    * @throws es.svalero.leaguemanagement.NoSuchLeagueDayException if a league day with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.svalero.leaguemanagement.model.LeagueDay[] findByUuid_PrevAndNext(
        long leagueDayId, java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.svalero.leaguemanagement.NoSuchLeagueDayException;

    /**
    * Removes all the league daies where uuid = &#63; from the database.
    *
    * @param uuid the uuid
    * @throws SystemException if a system exception occurred
    */
    public void removeByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of league daies where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the number of matching league daies
    * @throws SystemException if a system exception occurred
    */
    public int countByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the league day where uuid = &#63; and groupId = &#63; or throws a {@link es.svalero.leaguemanagement.NoSuchLeagueDayException} if it could not be found.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the matching league day
    * @throws es.svalero.leaguemanagement.NoSuchLeagueDayException if a matching league day could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.svalero.leaguemanagement.model.LeagueDay findByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.svalero.leaguemanagement.NoSuchLeagueDayException;

    /**
    * Returns the league day where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the matching league day, or <code>null</code> if a matching league day could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.svalero.leaguemanagement.model.LeagueDay fetchByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the league day where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching league day, or <code>null</code> if a matching league day could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.svalero.leaguemanagement.model.LeagueDay fetchByUUID_G(
        java.lang.String uuid, long groupId, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the league day where uuid = &#63; and groupId = &#63; from the database.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the league day that was removed
    * @throws SystemException if a system exception occurred
    */
    public es.svalero.leaguemanagement.model.LeagueDay removeByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.svalero.leaguemanagement.NoSuchLeagueDayException;

    /**
    * Returns the number of league daies where uuid = &#63; and groupId = &#63;.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the number of matching league daies
    * @throws SystemException if a system exception occurred
    */
    public int countByUUID_G(java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the league daies where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @return the matching league daies
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<es.svalero.leaguemanagement.model.LeagueDay> findByUuid_C(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the league daies where uuid = &#63; and companyId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.svalero.leaguemanagement.model.impl.LeagueDayModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param start the lower bound of the range of league daies
    * @param end the upper bound of the range of league daies (not inclusive)
    * @return the range of matching league daies
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<es.svalero.leaguemanagement.model.LeagueDay> findByUuid_C(
        java.lang.String uuid, long companyId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the league daies where uuid = &#63; and companyId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.svalero.leaguemanagement.model.impl.LeagueDayModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param start the lower bound of the range of league daies
    * @param end the upper bound of the range of league daies (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching league daies
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<es.svalero.leaguemanagement.model.LeagueDay> findByUuid_C(
        java.lang.String uuid, long companyId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first league day in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching league day
    * @throws es.svalero.leaguemanagement.NoSuchLeagueDayException if a matching league day could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.svalero.leaguemanagement.model.LeagueDay findByUuid_C_First(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.svalero.leaguemanagement.NoSuchLeagueDayException;

    /**
    * Returns the first league day in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching league day, or <code>null</code> if a matching league day could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.svalero.leaguemanagement.model.LeagueDay fetchByUuid_C_First(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last league day in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching league day
    * @throws es.svalero.leaguemanagement.NoSuchLeagueDayException if a matching league day could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.svalero.leaguemanagement.model.LeagueDay findByUuid_C_Last(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.svalero.leaguemanagement.NoSuchLeagueDayException;

    /**
    * Returns the last league day in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching league day, or <code>null</code> if a matching league day could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.svalero.leaguemanagement.model.LeagueDay fetchByUuid_C_Last(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the league daies before and after the current league day in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param leagueDayId the primary key of the current league day
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next league day
    * @throws es.svalero.leaguemanagement.NoSuchLeagueDayException if a league day with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.svalero.leaguemanagement.model.LeagueDay[] findByUuid_C_PrevAndNext(
        long leagueDayId, java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.svalero.leaguemanagement.NoSuchLeagueDayException;

    /**
    * Removes all the league daies where uuid = &#63; and companyId = &#63; from the database.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByUuid_C(java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of league daies where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @return the number of matching league daies
    * @throws SystemException if a system exception occurred
    */
    public int countByUuid_C(java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the league daies where groupId = &#63; and leagueId = &#63;.
    *
    * @param groupId the group ID
    * @param leagueId the league ID
    * @return the matching league daies
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<es.svalero.leaguemanagement.model.LeagueDay> findByGroupIdAndLeagueId(
        long groupId, long leagueId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the league daies where groupId = &#63; and leagueId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.svalero.leaguemanagement.model.impl.LeagueDayModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param leagueId the league ID
    * @param start the lower bound of the range of league daies
    * @param end the upper bound of the range of league daies (not inclusive)
    * @return the range of matching league daies
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<es.svalero.leaguemanagement.model.LeagueDay> findByGroupIdAndLeagueId(
        long groupId, long leagueId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the league daies where groupId = &#63; and leagueId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.svalero.leaguemanagement.model.impl.LeagueDayModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param leagueId the league ID
    * @param start the lower bound of the range of league daies
    * @param end the upper bound of the range of league daies (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching league daies
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<es.svalero.leaguemanagement.model.LeagueDay> findByGroupIdAndLeagueId(
        long groupId, long leagueId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first league day in the ordered set where groupId = &#63; and leagueId = &#63;.
    *
    * @param groupId the group ID
    * @param leagueId the league ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching league day
    * @throws es.svalero.leaguemanagement.NoSuchLeagueDayException if a matching league day could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.svalero.leaguemanagement.model.LeagueDay findByGroupIdAndLeagueId_First(
        long groupId, long leagueId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.svalero.leaguemanagement.NoSuchLeagueDayException;

    /**
    * Returns the first league day in the ordered set where groupId = &#63; and leagueId = &#63;.
    *
    * @param groupId the group ID
    * @param leagueId the league ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching league day, or <code>null</code> if a matching league day could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.svalero.leaguemanagement.model.LeagueDay fetchByGroupIdAndLeagueId_First(
        long groupId, long leagueId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last league day in the ordered set where groupId = &#63; and leagueId = &#63;.
    *
    * @param groupId the group ID
    * @param leagueId the league ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching league day
    * @throws es.svalero.leaguemanagement.NoSuchLeagueDayException if a matching league day could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.svalero.leaguemanagement.model.LeagueDay findByGroupIdAndLeagueId_Last(
        long groupId, long leagueId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.svalero.leaguemanagement.NoSuchLeagueDayException;

    /**
    * Returns the last league day in the ordered set where groupId = &#63; and leagueId = &#63;.
    *
    * @param groupId the group ID
    * @param leagueId the league ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching league day, or <code>null</code> if a matching league day could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.svalero.leaguemanagement.model.LeagueDay fetchByGroupIdAndLeagueId_Last(
        long groupId, long leagueId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the league daies before and after the current league day in the ordered set where groupId = &#63; and leagueId = &#63;.
    *
    * @param leagueDayId the primary key of the current league day
    * @param groupId the group ID
    * @param leagueId the league ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next league day
    * @throws es.svalero.leaguemanagement.NoSuchLeagueDayException if a league day with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.svalero.leaguemanagement.model.LeagueDay[] findByGroupIdAndLeagueId_PrevAndNext(
        long leagueDayId, long groupId, long leagueId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.svalero.leaguemanagement.NoSuchLeagueDayException;

    /**
    * Removes all the league daies where groupId = &#63; and leagueId = &#63; from the database.
    *
    * @param groupId the group ID
    * @param leagueId the league ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByGroupIdAndLeagueId(long groupId, long leagueId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of league daies where groupId = &#63; and leagueId = &#63;.
    *
    * @param groupId the group ID
    * @param leagueId the league ID
    * @return the number of matching league daies
    * @throws SystemException if a system exception occurred
    */
    public int countByGroupIdAndLeagueId(long groupId, long leagueId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the league day in the entity cache if it is enabled.
    *
    * @param leagueDay the league day
    */
    public void cacheResult(
        es.svalero.leaguemanagement.model.LeagueDay leagueDay);

    /**
    * Caches the league daies in the entity cache if it is enabled.
    *
    * @param leagueDaies the league daies
    */
    public void cacheResult(
        java.util.List<es.svalero.leaguemanagement.model.LeagueDay> leagueDaies);

    /**
    * Creates a new league day with the primary key. Does not add the league day to the database.
    *
    * @param leagueDayId the primary key for the new league day
    * @return the new league day
    */
    public es.svalero.leaguemanagement.model.LeagueDay create(long leagueDayId);

    /**
    * Removes the league day with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param leagueDayId the primary key of the league day
    * @return the league day that was removed
    * @throws es.svalero.leaguemanagement.NoSuchLeagueDayException if a league day with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.svalero.leaguemanagement.model.LeagueDay remove(long leagueDayId)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.svalero.leaguemanagement.NoSuchLeagueDayException;

    public es.svalero.leaguemanagement.model.LeagueDay updateImpl(
        es.svalero.leaguemanagement.model.LeagueDay leagueDay)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the league day with the primary key or throws a {@link es.svalero.leaguemanagement.NoSuchLeagueDayException} if it could not be found.
    *
    * @param leagueDayId the primary key of the league day
    * @return the league day
    * @throws es.svalero.leaguemanagement.NoSuchLeagueDayException if a league day with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.svalero.leaguemanagement.model.LeagueDay findByPrimaryKey(
        long leagueDayId)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.svalero.leaguemanagement.NoSuchLeagueDayException;

    /**
    * Returns the league day with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param leagueDayId the primary key of the league day
    * @return the league day, or <code>null</code> if a league day with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.svalero.leaguemanagement.model.LeagueDay fetchByPrimaryKey(
        long leagueDayId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the league daies.
    *
    * @return the league daies
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<es.svalero.leaguemanagement.model.LeagueDay> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<es.svalero.leaguemanagement.model.LeagueDay> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the league daies.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.svalero.leaguemanagement.model.impl.LeagueDayModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of league daies
    * @param end the upper bound of the range of league daies (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of league daies
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<es.svalero.leaguemanagement.model.LeagueDay> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the league daies from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of league daies.
    *
    * @return the number of league daies
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
