package es.svalero.leaguemanagement.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import es.svalero.leaguemanagement.model.League;

/**
 * The persistence interface for the league service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LeaguePersistenceImpl
 * @see LeagueUtil
 * @generated
 */
public interface LeaguePersistence extends BasePersistence<League> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link LeagueUtil} to access the league persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the leagues where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the matching leagues
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<es.svalero.leaguemanagement.model.League> findByUuid(
        java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the leagues where uuid = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.svalero.leaguemanagement.model.impl.LeagueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param start the lower bound of the range of leagues
    * @param end the upper bound of the range of leagues (not inclusive)
    * @return the range of matching leagues
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<es.svalero.leaguemanagement.model.League> findByUuid(
        java.lang.String uuid, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the leagues where uuid = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.svalero.leaguemanagement.model.impl.LeagueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param start the lower bound of the range of leagues
    * @param end the upper bound of the range of leagues (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching leagues
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<es.svalero.leaguemanagement.model.League> findByUuid(
        java.lang.String uuid, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first league in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching league
    * @throws es.svalero.leaguemanagement.NoSuchLeagueException if a matching league could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.svalero.leaguemanagement.model.League findByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.svalero.leaguemanagement.NoSuchLeagueException;

    /**
    * Returns the first league in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching league, or <code>null</code> if a matching league could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.svalero.leaguemanagement.model.League fetchByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last league in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching league
    * @throws es.svalero.leaguemanagement.NoSuchLeagueException if a matching league could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.svalero.leaguemanagement.model.League findByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.svalero.leaguemanagement.NoSuchLeagueException;

    /**
    * Returns the last league in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching league, or <code>null</code> if a matching league could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.svalero.leaguemanagement.model.League fetchByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the leagues before and after the current league in the ordered set where uuid = &#63;.
    *
    * @param leagueId the primary key of the current league
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next league
    * @throws es.svalero.leaguemanagement.NoSuchLeagueException if a league with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.svalero.leaguemanagement.model.League[] findByUuid_PrevAndNext(
        long leagueId, java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.svalero.leaguemanagement.NoSuchLeagueException;

    /**
    * Removes all the leagues where uuid = &#63; from the database.
    *
    * @param uuid the uuid
    * @throws SystemException if a system exception occurred
    */
    public void removeByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of leagues where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the number of matching leagues
    * @throws SystemException if a system exception occurred
    */
    public int countByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the league where uuid = &#63; and groupId = &#63; or throws a {@link es.svalero.leaguemanagement.NoSuchLeagueException} if it could not be found.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the matching league
    * @throws es.svalero.leaguemanagement.NoSuchLeagueException if a matching league could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.svalero.leaguemanagement.model.League findByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.svalero.leaguemanagement.NoSuchLeagueException;

    /**
    * Returns the league where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the matching league, or <code>null</code> if a matching league could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.svalero.leaguemanagement.model.League fetchByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the league where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching league, or <code>null</code> if a matching league could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.svalero.leaguemanagement.model.League fetchByUUID_G(
        java.lang.String uuid, long groupId, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the league where uuid = &#63; and groupId = &#63; from the database.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the league that was removed
    * @throws SystemException if a system exception occurred
    */
    public es.svalero.leaguemanagement.model.League removeByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.svalero.leaguemanagement.NoSuchLeagueException;

    /**
    * Returns the number of leagues where uuid = &#63; and groupId = &#63;.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the number of matching leagues
    * @throws SystemException if a system exception occurred
    */
    public int countByUUID_G(java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the leagues where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @return the matching leagues
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<es.svalero.leaguemanagement.model.League> findByUuid_C(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the leagues where uuid = &#63; and companyId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.svalero.leaguemanagement.model.impl.LeagueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param start the lower bound of the range of leagues
    * @param end the upper bound of the range of leagues (not inclusive)
    * @return the range of matching leagues
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<es.svalero.leaguemanagement.model.League> findByUuid_C(
        java.lang.String uuid, long companyId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the leagues where uuid = &#63; and companyId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.svalero.leaguemanagement.model.impl.LeagueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param start the lower bound of the range of leagues
    * @param end the upper bound of the range of leagues (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching leagues
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<es.svalero.leaguemanagement.model.League> findByUuid_C(
        java.lang.String uuid, long companyId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first league in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching league
    * @throws es.svalero.leaguemanagement.NoSuchLeagueException if a matching league could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.svalero.leaguemanagement.model.League findByUuid_C_First(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.svalero.leaguemanagement.NoSuchLeagueException;

    /**
    * Returns the first league in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching league, or <code>null</code> if a matching league could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.svalero.leaguemanagement.model.League fetchByUuid_C_First(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last league in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching league
    * @throws es.svalero.leaguemanagement.NoSuchLeagueException if a matching league could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.svalero.leaguemanagement.model.League findByUuid_C_Last(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.svalero.leaguemanagement.NoSuchLeagueException;

    /**
    * Returns the last league in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching league, or <code>null</code> if a matching league could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.svalero.leaguemanagement.model.League fetchByUuid_C_Last(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the leagues before and after the current league in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param leagueId the primary key of the current league
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next league
    * @throws es.svalero.leaguemanagement.NoSuchLeagueException if a league with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.svalero.leaguemanagement.model.League[] findByUuid_C_PrevAndNext(
        long leagueId, java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.svalero.leaguemanagement.NoSuchLeagueException;

    /**
    * Removes all the leagues where uuid = &#63; and companyId = &#63; from the database.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByUuid_C(java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of leagues where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @return the number of matching leagues
    * @throws SystemException if a system exception occurred
    */
    public int countByUuid_C(java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the leagues where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the matching leagues
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<es.svalero.leaguemanagement.model.League> findByGroupId(
        long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the leagues where groupId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.svalero.leaguemanagement.model.impl.LeagueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param start the lower bound of the range of leagues
    * @param end the upper bound of the range of leagues (not inclusive)
    * @return the range of matching leagues
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<es.svalero.leaguemanagement.model.League> findByGroupId(
        long groupId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the leagues where groupId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.svalero.leaguemanagement.model.impl.LeagueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param start the lower bound of the range of leagues
    * @param end the upper bound of the range of leagues (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching leagues
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<es.svalero.leaguemanagement.model.League> findByGroupId(
        long groupId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first league in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching league
    * @throws es.svalero.leaguemanagement.NoSuchLeagueException if a matching league could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.svalero.leaguemanagement.model.League findByGroupId_First(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.svalero.leaguemanagement.NoSuchLeagueException;

    /**
    * Returns the first league in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching league, or <code>null</code> if a matching league could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.svalero.leaguemanagement.model.League fetchByGroupId_First(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last league in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching league
    * @throws es.svalero.leaguemanagement.NoSuchLeagueException if a matching league could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.svalero.leaguemanagement.model.League findByGroupId_Last(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.svalero.leaguemanagement.NoSuchLeagueException;

    /**
    * Returns the last league in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching league, or <code>null</code> if a matching league could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.svalero.leaguemanagement.model.League fetchByGroupId_Last(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the leagues before and after the current league in the ordered set where groupId = &#63;.
    *
    * @param leagueId the primary key of the current league
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next league
    * @throws es.svalero.leaguemanagement.NoSuchLeagueException if a league with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.svalero.leaguemanagement.model.League[] findByGroupId_PrevAndNext(
        long leagueId, long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.svalero.leaguemanagement.NoSuchLeagueException;

    /**
    * Removes all the leagues where groupId = &#63; from the database.
    *
    * @param groupId the group ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByGroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of leagues where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the number of matching leagues
    * @throws SystemException if a system exception occurred
    */
    public int countByGroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the league in the entity cache if it is enabled.
    *
    * @param league the league
    */
    public void cacheResult(es.svalero.leaguemanagement.model.League league);

    /**
    * Caches the leagues in the entity cache if it is enabled.
    *
    * @param leagues the leagues
    */
    public void cacheResult(
        java.util.List<es.svalero.leaguemanagement.model.League> leagues);

    /**
    * Creates a new league with the primary key. Does not add the league to the database.
    *
    * @param leagueId the primary key for the new league
    * @return the new league
    */
    public es.svalero.leaguemanagement.model.League create(long leagueId);

    /**
    * Removes the league with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param leagueId the primary key of the league
    * @return the league that was removed
    * @throws es.svalero.leaguemanagement.NoSuchLeagueException if a league with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.svalero.leaguemanagement.model.League remove(long leagueId)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.svalero.leaguemanagement.NoSuchLeagueException;

    public es.svalero.leaguemanagement.model.League updateImpl(
        es.svalero.leaguemanagement.model.League league)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the league with the primary key or throws a {@link es.svalero.leaguemanagement.NoSuchLeagueException} if it could not be found.
    *
    * @param leagueId the primary key of the league
    * @return the league
    * @throws es.svalero.leaguemanagement.NoSuchLeagueException if a league with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.svalero.leaguemanagement.model.League findByPrimaryKey(
        long leagueId)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.svalero.leaguemanagement.NoSuchLeagueException;

    /**
    * Returns the league with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param leagueId the primary key of the league
    * @return the league, or <code>null</code> if a league with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.svalero.leaguemanagement.model.League fetchByPrimaryKey(
        long leagueId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the leagues.
    *
    * @return the leagues
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<es.svalero.leaguemanagement.model.League> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<es.svalero.leaguemanagement.model.League> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the leagues.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.svalero.leaguemanagement.model.impl.LeagueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of leagues
    * @param end the upper bound of the range of leagues (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of leagues
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<es.svalero.leaguemanagement.model.League> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the leagues from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of leagues.
    *
    * @return the number of leagues
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
