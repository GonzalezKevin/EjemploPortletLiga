package es.svalero.leaguemanagement.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import es.svalero.leaguemanagement.model.Team;

/**
 * The persistence interface for the team service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TeamPersistenceImpl
 * @see TeamUtil
 * @generated
 */
public interface TeamPersistence extends BasePersistence<Team> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link TeamUtil} to access the team persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the teams where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the matching teams
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<es.svalero.leaguemanagement.model.Team> findByUuid(
        java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the teams where uuid = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.svalero.leaguemanagement.model.impl.TeamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param start the lower bound of the range of teams
    * @param end the upper bound of the range of teams (not inclusive)
    * @return the range of matching teams
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<es.svalero.leaguemanagement.model.Team> findByUuid(
        java.lang.String uuid, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the teams where uuid = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.svalero.leaguemanagement.model.impl.TeamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param start the lower bound of the range of teams
    * @param end the upper bound of the range of teams (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching teams
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<es.svalero.leaguemanagement.model.Team> findByUuid(
        java.lang.String uuid, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first team in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching team
    * @throws es.svalero.leaguemanagement.NoSuchTeamException if a matching team could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.svalero.leaguemanagement.model.Team findByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.svalero.leaguemanagement.NoSuchTeamException;

    /**
    * Returns the first team in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching team, or <code>null</code> if a matching team could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.svalero.leaguemanagement.model.Team fetchByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last team in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching team
    * @throws es.svalero.leaguemanagement.NoSuchTeamException if a matching team could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.svalero.leaguemanagement.model.Team findByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.svalero.leaguemanagement.NoSuchTeamException;

    /**
    * Returns the last team in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching team, or <code>null</code> if a matching team could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.svalero.leaguemanagement.model.Team fetchByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the teams before and after the current team in the ordered set where uuid = &#63;.
    *
    * @param teamId the primary key of the current team
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next team
    * @throws es.svalero.leaguemanagement.NoSuchTeamException if a team with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.svalero.leaguemanagement.model.Team[] findByUuid_PrevAndNext(
        long teamId, java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.svalero.leaguemanagement.NoSuchTeamException;

    /**
    * Removes all the teams where uuid = &#63; from the database.
    *
    * @param uuid the uuid
    * @throws SystemException if a system exception occurred
    */
    public void removeByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of teams where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the number of matching teams
    * @throws SystemException if a system exception occurred
    */
    public int countByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the team where uuid = &#63; and groupId = &#63; or throws a {@link es.svalero.leaguemanagement.NoSuchTeamException} if it could not be found.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the matching team
    * @throws es.svalero.leaguemanagement.NoSuchTeamException if a matching team could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.svalero.leaguemanagement.model.Team findByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.svalero.leaguemanagement.NoSuchTeamException;

    /**
    * Returns the team where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the matching team, or <code>null</code> if a matching team could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.svalero.leaguemanagement.model.Team fetchByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the team where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching team, or <code>null</code> if a matching team could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.svalero.leaguemanagement.model.Team fetchByUUID_G(
        java.lang.String uuid, long groupId, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the team where uuid = &#63; and groupId = &#63; from the database.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the team that was removed
    * @throws SystemException if a system exception occurred
    */
    public es.svalero.leaguemanagement.model.Team removeByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.svalero.leaguemanagement.NoSuchTeamException;

    /**
    * Returns the number of teams where uuid = &#63; and groupId = &#63;.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the number of matching teams
    * @throws SystemException if a system exception occurred
    */
    public int countByUUID_G(java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the teams where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @return the matching teams
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<es.svalero.leaguemanagement.model.Team> findByUuid_C(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the teams where uuid = &#63; and companyId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.svalero.leaguemanagement.model.impl.TeamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param start the lower bound of the range of teams
    * @param end the upper bound of the range of teams (not inclusive)
    * @return the range of matching teams
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<es.svalero.leaguemanagement.model.Team> findByUuid_C(
        java.lang.String uuid, long companyId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the teams where uuid = &#63; and companyId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.svalero.leaguemanagement.model.impl.TeamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param start the lower bound of the range of teams
    * @param end the upper bound of the range of teams (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching teams
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<es.svalero.leaguemanagement.model.Team> findByUuid_C(
        java.lang.String uuid, long companyId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first team in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching team
    * @throws es.svalero.leaguemanagement.NoSuchTeamException if a matching team could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.svalero.leaguemanagement.model.Team findByUuid_C_First(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.svalero.leaguemanagement.NoSuchTeamException;

    /**
    * Returns the first team in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching team, or <code>null</code> if a matching team could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.svalero.leaguemanagement.model.Team fetchByUuid_C_First(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last team in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching team
    * @throws es.svalero.leaguemanagement.NoSuchTeamException if a matching team could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.svalero.leaguemanagement.model.Team findByUuid_C_Last(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.svalero.leaguemanagement.NoSuchTeamException;

    /**
    * Returns the last team in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching team, or <code>null</code> if a matching team could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.svalero.leaguemanagement.model.Team fetchByUuid_C_Last(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the teams before and after the current team in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param teamId the primary key of the current team
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next team
    * @throws es.svalero.leaguemanagement.NoSuchTeamException if a team with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.svalero.leaguemanagement.model.Team[] findByUuid_C_PrevAndNext(
        long teamId, java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.svalero.leaguemanagement.NoSuchTeamException;

    /**
    * Removes all the teams where uuid = &#63; and companyId = &#63; from the database.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByUuid_C(java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of teams where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @return the number of matching teams
    * @throws SystemException if a system exception occurred
    */
    public int countByUuid_C(java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the teams where groupId = &#63; and leagueId = &#63;.
    *
    * @param groupId the group ID
    * @param leagueId the league ID
    * @return the matching teams
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<es.svalero.leaguemanagement.model.Team> findByGroupIdAndLeagueId(
        long groupId, long leagueId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the teams where groupId = &#63; and leagueId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.svalero.leaguemanagement.model.impl.TeamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param leagueId the league ID
    * @param start the lower bound of the range of teams
    * @param end the upper bound of the range of teams (not inclusive)
    * @return the range of matching teams
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<es.svalero.leaguemanagement.model.Team> findByGroupIdAndLeagueId(
        long groupId, long leagueId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the teams where groupId = &#63; and leagueId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.svalero.leaguemanagement.model.impl.TeamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param leagueId the league ID
    * @param start the lower bound of the range of teams
    * @param end the upper bound of the range of teams (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching teams
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<es.svalero.leaguemanagement.model.Team> findByGroupIdAndLeagueId(
        long groupId, long leagueId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first team in the ordered set where groupId = &#63; and leagueId = &#63;.
    *
    * @param groupId the group ID
    * @param leagueId the league ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching team
    * @throws es.svalero.leaguemanagement.NoSuchTeamException if a matching team could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.svalero.leaguemanagement.model.Team findByGroupIdAndLeagueId_First(
        long groupId, long leagueId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.svalero.leaguemanagement.NoSuchTeamException;

    /**
    * Returns the first team in the ordered set where groupId = &#63; and leagueId = &#63;.
    *
    * @param groupId the group ID
    * @param leagueId the league ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching team, or <code>null</code> if a matching team could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.svalero.leaguemanagement.model.Team fetchByGroupIdAndLeagueId_First(
        long groupId, long leagueId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last team in the ordered set where groupId = &#63; and leagueId = &#63;.
    *
    * @param groupId the group ID
    * @param leagueId the league ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching team
    * @throws es.svalero.leaguemanagement.NoSuchTeamException if a matching team could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.svalero.leaguemanagement.model.Team findByGroupIdAndLeagueId_Last(
        long groupId, long leagueId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.svalero.leaguemanagement.NoSuchTeamException;

    /**
    * Returns the last team in the ordered set where groupId = &#63; and leagueId = &#63;.
    *
    * @param groupId the group ID
    * @param leagueId the league ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching team, or <code>null</code> if a matching team could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.svalero.leaguemanagement.model.Team fetchByGroupIdAndLeagueId_Last(
        long groupId, long leagueId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the teams before and after the current team in the ordered set where groupId = &#63; and leagueId = &#63;.
    *
    * @param teamId the primary key of the current team
    * @param groupId the group ID
    * @param leagueId the league ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next team
    * @throws es.svalero.leaguemanagement.NoSuchTeamException if a team with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.svalero.leaguemanagement.model.Team[] findByGroupIdAndLeagueId_PrevAndNext(
        long teamId, long groupId, long leagueId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.svalero.leaguemanagement.NoSuchTeamException;

    /**
    * Removes all the teams where groupId = &#63; and leagueId = &#63; from the database.
    *
    * @param groupId the group ID
    * @param leagueId the league ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByGroupIdAndLeagueId(long groupId, long leagueId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of teams where groupId = &#63; and leagueId = &#63;.
    *
    * @param groupId the group ID
    * @param leagueId the league ID
    * @return the number of matching teams
    * @throws SystemException if a system exception occurred
    */
    public int countByGroupIdAndLeagueId(long groupId, long leagueId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the team in the entity cache if it is enabled.
    *
    * @param team the team
    */
    public void cacheResult(es.svalero.leaguemanagement.model.Team team);

    /**
    * Caches the teams in the entity cache if it is enabled.
    *
    * @param teams the teams
    */
    public void cacheResult(
        java.util.List<es.svalero.leaguemanagement.model.Team> teams);

    /**
    * Creates a new team with the primary key. Does not add the team to the database.
    *
    * @param teamId the primary key for the new team
    * @return the new team
    */
    public es.svalero.leaguemanagement.model.Team create(long teamId);

    /**
    * Removes the team with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param teamId the primary key of the team
    * @return the team that was removed
    * @throws es.svalero.leaguemanagement.NoSuchTeamException if a team with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.svalero.leaguemanagement.model.Team remove(long teamId)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.svalero.leaguemanagement.NoSuchTeamException;

    public es.svalero.leaguemanagement.model.Team updateImpl(
        es.svalero.leaguemanagement.model.Team team)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the team with the primary key or throws a {@link es.svalero.leaguemanagement.NoSuchTeamException} if it could not be found.
    *
    * @param teamId the primary key of the team
    * @return the team
    * @throws es.svalero.leaguemanagement.NoSuchTeamException if a team with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.svalero.leaguemanagement.model.Team findByPrimaryKey(long teamId)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.svalero.leaguemanagement.NoSuchTeamException;

    /**
    * Returns the team with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param teamId the primary key of the team
    * @return the team, or <code>null</code> if a team with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.svalero.leaguemanagement.model.Team fetchByPrimaryKey(long teamId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the teams.
    *
    * @return the teams
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<es.svalero.leaguemanagement.model.Team> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<es.svalero.leaguemanagement.model.Team> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the teams.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.svalero.leaguemanagement.model.impl.TeamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of teams
    * @param end the upper bound of the range of teams (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of teams
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<es.svalero.leaguemanagement.model.Team> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the teams from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of teams.
    *
    * @return the number of teams
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
