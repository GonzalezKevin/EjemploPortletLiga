package es.svalero.leaguemanagement.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import es.svalero.leaguemanagement.model.Match;

/**
 * The persistence interface for the match service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MatchPersistenceImpl
 * @see MatchUtil
 * @generated
 */
public interface MatchPersistence extends BasePersistence<Match> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link MatchUtil} to access the match persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the matchs where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the matching matchs
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<es.svalero.leaguemanagement.model.Match> findByUuid(
        java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the matchs where uuid = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.svalero.leaguemanagement.model.impl.MatchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param start the lower bound of the range of matchs
    * @param end the upper bound of the range of matchs (not inclusive)
    * @return the range of matching matchs
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<es.svalero.leaguemanagement.model.Match> findByUuid(
        java.lang.String uuid, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the matchs where uuid = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.svalero.leaguemanagement.model.impl.MatchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param start the lower bound of the range of matchs
    * @param end the upper bound of the range of matchs (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching matchs
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<es.svalero.leaguemanagement.model.Match> findByUuid(
        java.lang.String uuid, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first match in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching match
    * @throws es.svalero.leaguemanagement.NoSuchMatchException if a matching match could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.svalero.leaguemanagement.model.Match findByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.svalero.leaguemanagement.NoSuchMatchException;

    /**
    * Returns the first match in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching match, or <code>null</code> if a matching match could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.svalero.leaguemanagement.model.Match fetchByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last match in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching match
    * @throws es.svalero.leaguemanagement.NoSuchMatchException if a matching match could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.svalero.leaguemanagement.model.Match findByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.svalero.leaguemanagement.NoSuchMatchException;

    /**
    * Returns the last match in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching match, or <code>null</code> if a matching match could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.svalero.leaguemanagement.model.Match fetchByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the matchs before and after the current match in the ordered set where uuid = &#63;.
    *
    * @param matchId the primary key of the current match
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next match
    * @throws es.svalero.leaguemanagement.NoSuchMatchException if a match with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.svalero.leaguemanagement.model.Match[] findByUuid_PrevAndNext(
        long matchId, java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.svalero.leaguemanagement.NoSuchMatchException;

    /**
    * Removes all the matchs where uuid = &#63; from the database.
    *
    * @param uuid the uuid
    * @throws SystemException if a system exception occurred
    */
    public void removeByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of matchs where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the number of matching matchs
    * @throws SystemException if a system exception occurred
    */
    public int countByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the match where uuid = &#63; and groupId = &#63; or throws a {@link es.svalero.leaguemanagement.NoSuchMatchException} if it could not be found.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the matching match
    * @throws es.svalero.leaguemanagement.NoSuchMatchException if a matching match could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.svalero.leaguemanagement.model.Match findByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.svalero.leaguemanagement.NoSuchMatchException;

    /**
    * Returns the match where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the matching match, or <code>null</code> if a matching match could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.svalero.leaguemanagement.model.Match fetchByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the match where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching match, or <code>null</code> if a matching match could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.svalero.leaguemanagement.model.Match fetchByUUID_G(
        java.lang.String uuid, long groupId, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the match where uuid = &#63; and groupId = &#63; from the database.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the match that was removed
    * @throws SystemException if a system exception occurred
    */
    public es.svalero.leaguemanagement.model.Match removeByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.svalero.leaguemanagement.NoSuchMatchException;

    /**
    * Returns the number of matchs where uuid = &#63; and groupId = &#63;.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the number of matching matchs
    * @throws SystemException if a system exception occurred
    */
    public int countByUUID_G(java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the matchs where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @return the matching matchs
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<es.svalero.leaguemanagement.model.Match> findByUuid_C(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the matchs where uuid = &#63; and companyId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.svalero.leaguemanagement.model.impl.MatchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param start the lower bound of the range of matchs
    * @param end the upper bound of the range of matchs (not inclusive)
    * @return the range of matching matchs
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<es.svalero.leaguemanagement.model.Match> findByUuid_C(
        java.lang.String uuid, long companyId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the matchs where uuid = &#63; and companyId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.svalero.leaguemanagement.model.impl.MatchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param start the lower bound of the range of matchs
    * @param end the upper bound of the range of matchs (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching matchs
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<es.svalero.leaguemanagement.model.Match> findByUuid_C(
        java.lang.String uuid, long companyId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first match in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching match
    * @throws es.svalero.leaguemanagement.NoSuchMatchException if a matching match could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.svalero.leaguemanagement.model.Match findByUuid_C_First(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.svalero.leaguemanagement.NoSuchMatchException;

    /**
    * Returns the first match in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching match, or <code>null</code> if a matching match could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.svalero.leaguemanagement.model.Match fetchByUuid_C_First(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last match in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching match
    * @throws es.svalero.leaguemanagement.NoSuchMatchException if a matching match could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.svalero.leaguemanagement.model.Match findByUuid_C_Last(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.svalero.leaguemanagement.NoSuchMatchException;

    /**
    * Returns the last match in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching match, or <code>null</code> if a matching match could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.svalero.leaguemanagement.model.Match fetchByUuid_C_Last(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the matchs before and after the current match in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param matchId the primary key of the current match
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next match
    * @throws es.svalero.leaguemanagement.NoSuchMatchException if a match with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.svalero.leaguemanagement.model.Match[] findByUuid_C_PrevAndNext(
        long matchId, java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.svalero.leaguemanagement.NoSuchMatchException;

    /**
    * Removes all the matchs where uuid = &#63; and companyId = &#63; from the database.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByUuid_C(java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of matchs where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @return the number of matching matchs
    * @throws SystemException if a system exception occurred
    */
    public int countByUuid_C(java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the match in the entity cache if it is enabled.
    *
    * @param match the match
    */
    public void cacheResult(es.svalero.leaguemanagement.model.Match match);

    /**
    * Caches the matchs in the entity cache if it is enabled.
    *
    * @param matchs the matchs
    */
    public void cacheResult(
        java.util.List<es.svalero.leaguemanagement.model.Match> matchs);

    /**
    * Creates a new match with the primary key. Does not add the match to the database.
    *
    * @param matchId the primary key for the new match
    * @return the new match
    */
    public es.svalero.leaguemanagement.model.Match create(long matchId);

    /**
    * Removes the match with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param matchId the primary key of the match
    * @return the match that was removed
    * @throws es.svalero.leaguemanagement.NoSuchMatchException if a match with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.svalero.leaguemanagement.model.Match remove(long matchId)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.svalero.leaguemanagement.NoSuchMatchException;

    public es.svalero.leaguemanagement.model.Match updateImpl(
        es.svalero.leaguemanagement.model.Match match)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the match with the primary key or throws a {@link es.svalero.leaguemanagement.NoSuchMatchException} if it could not be found.
    *
    * @param matchId the primary key of the match
    * @return the match
    * @throws es.svalero.leaguemanagement.NoSuchMatchException if a match with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.svalero.leaguemanagement.model.Match findByPrimaryKey(
        long matchId)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.svalero.leaguemanagement.NoSuchMatchException;

    /**
    * Returns the match with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param matchId the primary key of the match
    * @return the match, or <code>null</code> if a match with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.svalero.leaguemanagement.model.Match fetchByPrimaryKey(
        long matchId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the matchs.
    *
    * @return the matchs
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<es.svalero.leaguemanagement.model.Match> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<es.svalero.leaguemanagement.model.Match> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the matchs.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.svalero.leaguemanagement.model.impl.MatchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of matchs
    * @param end the upper bound of the range of matchs (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matchs
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<es.svalero.leaguemanagement.model.Match> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the matchs from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of matchs.
    *
    * @return the number of matchs
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
