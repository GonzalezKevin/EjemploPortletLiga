package es.svalero.leaguemanagement.service.persistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import es.svalero.leaguemanagement.NoSuchTeamException;
import es.svalero.leaguemanagement.model.Team;
import es.svalero.leaguemanagement.model.impl.TeamImpl;
import es.svalero.leaguemanagement.model.impl.TeamModelImpl;
import es.svalero.leaguemanagement.service.persistence.TeamPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the team service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TeamPersistence
 * @see TeamUtil
 * @generated
 */
public class TeamPersistenceImpl extends BasePersistenceImpl<Team>
    implements TeamPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link TeamUtil} to access the team persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = TeamImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TeamModelImpl.ENTITY_CACHE_ENABLED,
            TeamModelImpl.FINDER_CACHE_ENABLED, TeamImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TeamModelImpl.ENTITY_CACHE_ENABLED,
            TeamModelImpl.FINDER_CACHE_ENABLED, TeamImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TeamModelImpl.ENTITY_CACHE_ENABLED,
            TeamModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(TeamModelImpl.ENTITY_CACHE_ENABLED,
            TeamModelImpl.FINDER_CACHE_ENABLED, TeamImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
            new String[] {
                String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(TeamModelImpl.ENTITY_CACHE_ENABLED,
            TeamModelImpl.FINDER_CACHE_ENABLED, TeamImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
            new String[] { String.class.getName() },
            TeamModelImpl.UUID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(TeamModelImpl.ENTITY_CACHE_ENABLED,
            TeamModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
            new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_UUID_UUID_1 = "team.uuid IS NULL";
    private static final String _FINDER_COLUMN_UUID_UUID_2 = "team.uuid = ?";
    private static final String _FINDER_COLUMN_UUID_UUID_3 = "(team.uuid IS NULL OR team.uuid = '')";
    public static final FinderPath FINDER_PATH_FETCH_BY_UUID_G = new FinderPath(TeamModelImpl.ENTITY_CACHE_ENABLED,
            TeamModelImpl.FINDER_CACHE_ENABLED, TeamImpl.class,
            FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
            new String[] { String.class.getName(), Long.class.getName() },
            TeamModelImpl.UUID_COLUMN_BITMASK |
            TeamModelImpl.GROUPID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_UUID_G = new FinderPath(TeamModelImpl.ENTITY_CACHE_ENABLED,
            TeamModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
            new String[] { String.class.getName(), Long.class.getName() });
    private static final String _FINDER_COLUMN_UUID_G_UUID_1 = "team.uuid IS NULL AND ";
    private static final String _FINDER_COLUMN_UUID_G_UUID_2 = "team.uuid = ? AND ";
    private static final String _FINDER_COLUMN_UUID_G_UUID_3 = "(team.uuid IS NULL OR team.uuid = '') AND ";
    private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 = "team.groupId = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C = new FinderPath(TeamModelImpl.ENTITY_CACHE_ENABLED,
            TeamModelImpl.FINDER_CACHE_ENABLED, TeamImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
            new String[] {
                String.class.getName(), Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C =
        new FinderPath(TeamModelImpl.ENTITY_CACHE_ENABLED,
            TeamModelImpl.FINDER_CACHE_ENABLED, TeamImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
            new String[] { String.class.getName(), Long.class.getName() },
            TeamModelImpl.UUID_COLUMN_BITMASK |
            TeamModelImpl.COMPANYID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_UUID_C = new FinderPath(TeamModelImpl.ENTITY_CACHE_ENABLED,
            TeamModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
            new String[] { String.class.getName(), Long.class.getName() });
    private static final String _FINDER_COLUMN_UUID_C_UUID_1 = "team.uuid IS NULL AND ";
    private static final String _FINDER_COLUMN_UUID_C_UUID_2 = "team.uuid = ? AND ";
    private static final String _FINDER_COLUMN_UUID_C_UUID_3 = "(team.uuid IS NULL OR team.uuid = '') AND ";
    private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 = "team.companyId = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPIDANDLEAGUEID =
        new FinderPath(TeamModelImpl.ENTITY_CACHE_ENABLED,
            TeamModelImpl.FINDER_CACHE_ENABLED, TeamImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByGroupIdAndLeagueId",
            new String[] {
                Long.class.getName(), Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPIDANDLEAGUEID =
        new FinderPath(TeamModelImpl.ENTITY_CACHE_ENABLED,
            TeamModelImpl.FINDER_CACHE_ENABLED, TeamImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "findByGroupIdAndLeagueId",
            new String[] { Long.class.getName(), Long.class.getName() },
            TeamModelImpl.GROUPID_COLUMN_BITMASK |
            TeamModelImpl.LEAGUEID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_GROUPIDANDLEAGUEID = new FinderPath(TeamModelImpl.ENTITY_CACHE_ENABLED,
            TeamModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "countByGroupIdAndLeagueId",
            new String[] { Long.class.getName(), Long.class.getName() });
    private static final String _FINDER_COLUMN_GROUPIDANDLEAGUEID_GROUPID_2 = "team.groupId = ? AND ";
    private static final String _FINDER_COLUMN_GROUPIDANDLEAGUEID_LEAGUEID_2 = "team.leagueId = ?";
    private static final String _SQL_SELECT_TEAM = "SELECT team FROM Team team";
    private static final String _SQL_SELECT_TEAM_WHERE = "SELECT team FROM Team team WHERE ";
    private static final String _SQL_COUNT_TEAM = "SELECT COUNT(team) FROM Team team";
    private static final String _SQL_COUNT_TEAM_WHERE = "SELECT COUNT(team) FROM Team team WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "team.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Team exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Team exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(TeamPersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "uuid"
            });
    private static Team _nullTeam = new TeamImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Team> toCacheModel() {
                return _nullTeamCacheModel;
            }
        };

    private static CacheModel<Team> _nullTeamCacheModel = new CacheModel<Team>() {
            @Override
            public Team toEntityModel() {
                return _nullTeam;
            }
        };

    public TeamPersistenceImpl() {
        setModelClass(Team.class);
    }

    /**
     * Returns all the teams where uuid = &#63;.
     *
     * @param uuid the uuid
     * @return the matching teams
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Team> findByUuid(String uuid) throws SystemException {
        return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

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
    @Override
    public List<Team> findByUuid(String uuid, int start, int end)
        throws SystemException {
        return findByUuid(uuid, start, end, null);
    }

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
    @Override
    public List<Team> findByUuid(String uuid, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID;
            finderArgs = new Object[] { uuid };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID;
            finderArgs = new Object[] { uuid, start, end, orderByComparator };
        }

        List<Team> list = (List<Team>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Team team : list) {
                if (!Validator.equals(uuid, team.getUuid())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_TEAM_WHERE);

            boolean bindUuid = false;

            if (uuid == null) {
                query.append(_FINDER_COLUMN_UUID_UUID_1);
            } else if (uuid.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_UUID_UUID_3);
            } else {
                bindUuid = true;

                query.append(_FINDER_COLUMN_UUID_UUID_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(TeamModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindUuid) {
                    qPos.add(uuid);
                }

                if (!pagination) {
                    list = (List<Team>) QueryUtil.list(q, getDialect(), start,
                            end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Team>(list);
                } else {
                    list = (List<Team>) QueryUtil.list(q, getDialect(), start,
                            end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Returns the first team in the ordered set where uuid = &#63;.
     *
     * @param uuid the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching team
     * @throws es.svalero.leaguemanagement.NoSuchTeamException if a matching team could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Team findByUuid_First(String uuid,
        OrderByComparator orderByComparator)
        throws NoSuchTeamException, SystemException {
        Team team = fetchByUuid_First(uuid, orderByComparator);

        if (team != null) {
            return team;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("uuid=");
        msg.append(uuid);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchTeamException(msg.toString());
    }

    /**
     * Returns the first team in the ordered set where uuid = &#63;.
     *
     * @param uuid the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching team, or <code>null</code> if a matching team could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Team fetchByUuid_First(String uuid,
        OrderByComparator orderByComparator) throws SystemException {
        List<Team> list = findByUuid(uuid, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last team in the ordered set where uuid = &#63;.
     *
     * @param uuid the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching team
     * @throws es.svalero.leaguemanagement.NoSuchTeamException if a matching team could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Team findByUuid_Last(String uuid, OrderByComparator orderByComparator)
        throws NoSuchTeamException, SystemException {
        Team team = fetchByUuid_Last(uuid, orderByComparator);

        if (team != null) {
            return team;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("uuid=");
        msg.append(uuid);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchTeamException(msg.toString());
    }

    /**
     * Returns the last team in the ordered set where uuid = &#63;.
     *
     * @param uuid the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching team, or <code>null</code> if a matching team could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Team fetchByUuid_Last(String uuid,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByUuid(uuid);

        if (count == 0) {
            return null;
        }

        List<Team> list = findByUuid(uuid, count - 1, count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

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
    @Override
    public Team[] findByUuid_PrevAndNext(long teamId, String uuid,
        OrderByComparator orderByComparator)
        throws NoSuchTeamException, SystemException {
        Team team = findByPrimaryKey(teamId);

        Session session = null;

        try {
            session = openSession();

            Team[] array = new TeamImpl[3];

            array[0] = getByUuid_PrevAndNext(session, team, uuid,
                    orderByComparator, true);

            array[1] = team;

            array[2] = getByUuid_PrevAndNext(session, team, uuid,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Team getByUuid_PrevAndNext(Session session, Team team,
        String uuid, OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_TEAM_WHERE);

        boolean bindUuid = false;

        if (uuid == null) {
            query.append(_FINDER_COLUMN_UUID_UUID_1);
        } else if (uuid.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_UUID_UUID_3);
        } else {
            bindUuid = true;

            query.append(_FINDER_COLUMN_UUID_UUID_2);
        }

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(TeamModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindUuid) {
            qPos.add(uuid);
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(team);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Team> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the teams where uuid = &#63; from the database.
     *
     * @param uuid the uuid
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByUuid(String uuid) throws SystemException {
        for (Team team : findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
                null)) {
            remove(team);
        }
    }

    /**
     * Returns the number of teams where uuid = &#63;.
     *
     * @param uuid the uuid
     * @return the number of matching teams
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByUuid(String uuid) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID;

        Object[] finderArgs = new Object[] { uuid };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_TEAM_WHERE);

            boolean bindUuid = false;

            if (uuid == null) {
                query.append(_FINDER_COLUMN_UUID_UUID_1);
            } else if (uuid.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_UUID_UUID_3);
            } else {
                bindUuid = true;

                query.append(_FINDER_COLUMN_UUID_UUID_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindUuid) {
                    qPos.add(uuid);
                }

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns the team where uuid = &#63; and groupId = &#63; or throws a {@link es.svalero.leaguemanagement.NoSuchTeamException} if it could not be found.
     *
     * @param uuid the uuid
     * @param groupId the group ID
     * @return the matching team
     * @throws es.svalero.leaguemanagement.NoSuchTeamException if a matching team could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Team findByUUID_G(String uuid, long groupId)
        throws NoSuchTeamException, SystemException {
        Team team = fetchByUUID_G(uuid, groupId);

        if (team == null) {
            StringBundler msg = new StringBundler(6);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("uuid=");
            msg.append(uuid);

            msg.append(", groupId=");
            msg.append(groupId);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            if (_log.isWarnEnabled()) {
                _log.warn(msg.toString());
            }

            throw new NoSuchTeamException(msg.toString());
        }

        return team;
    }

    /**
     * Returns the team where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
     *
     * @param uuid the uuid
     * @param groupId the group ID
     * @return the matching team, or <code>null</code> if a matching team could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Team fetchByUUID_G(String uuid, long groupId)
        throws SystemException {
        return fetchByUUID_G(uuid, groupId, true);
    }

    /**
     * Returns the team where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
     *
     * @param uuid the uuid
     * @param groupId the group ID
     * @param retrieveFromCache whether to use the finder cache
     * @return the matching team, or <code>null</code> if a matching team could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Team fetchByUUID_G(String uuid, long groupId,
        boolean retrieveFromCache) throws SystemException {
        Object[] finderArgs = new Object[] { uuid, groupId };

        Object result = null;

        if (retrieveFromCache) {
            result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_UUID_G,
                    finderArgs, this);
        }

        if (result instanceof Team) {
            Team team = (Team) result;

            if (!Validator.equals(uuid, team.getUuid()) ||
                    (groupId != team.getGroupId())) {
                result = null;
            }
        }

        if (result == null) {
            StringBundler query = new StringBundler(4);

            query.append(_SQL_SELECT_TEAM_WHERE);

            boolean bindUuid = false;

            if (uuid == null) {
                query.append(_FINDER_COLUMN_UUID_G_UUID_1);
            } else if (uuid.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_UUID_G_UUID_3);
            } else {
                bindUuid = true;

                query.append(_FINDER_COLUMN_UUID_G_UUID_2);
            }

            query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindUuid) {
                    qPos.add(uuid);
                }

                qPos.add(groupId);

                List<Team> list = q.list();

                if (list.isEmpty()) {
                    FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
                        finderArgs, list);
                } else {
                    Team team = list.get(0);

                    result = team;

                    cacheResult(team);

                    if ((team.getUuid() == null) ||
                            !team.getUuid().equals(uuid) ||
                            (team.getGroupId() != groupId)) {
                        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
                            finderArgs, team);
                    }
                }
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G,
                    finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        if (result instanceof List<?>) {
            return null;
        } else {
            return (Team) result;
        }
    }

    /**
     * Removes the team where uuid = &#63; and groupId = &#63; from the database.
     *
     * @param uuid the uuid
     * @param groupId the group ID
     * @return the team that was removed
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Team removeByUUID_G(String uuid, long groupId)
        throws NoSuchTeamException, SystemException {
        Team team = findByUUID_G(uuid, groupId);

        return remove(team);
    }

    /**
     * Returns the number of teams where uuid = &#63; and groupId = &#63;.
     *
     * @param uuid the uuid
     * @param groupId the group ID
     * @return the number of matching teams
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByUUID_G(String uuid, long groupId)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_G;

        Object[] finderArgs = new Object[] { uuid, groupId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_TEAM_WHERE);

            boolean bindUuid = false;

            if (uuid == null) {
                query.append(_FINDER_COLUMN_UUID_G_UUID_1);
            } else if (uuid.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_UUID_G_UUID_3);
            } else {
                bindUuid = true;

                query.append(_FINDER_COLUMN_UUID_G_UUID_2);
            }

            query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindUuid) {
                    qPos.add(uuid);
                }

                qPos.add(groupId);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns all the teams where uuid = &#63; and companyId = &#63;.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @return the matching teams
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Team> findByUuid_C(String uuid, long companyId)
        throws SystemException {
        return findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

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
    @Override
    public List<Team> findByUuid_C(String uuid, long companyId, int start,
        int end) throws SystemException {
        return findByUuid_C(uuid, companyId, start, end, null);
    }

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
    @Override
    public List<Team> findByUuid_C(String uuid, long companyId, int start,
        int end, OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C;
            finderArgs = new Object[] { uuid, companyId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C;
            finderArgs = new Object[] {
                    uuid, companyId,
                    
                    start, end, orderByComparator
                };
        }

        List<Team> list = (List<Team>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Team team : list) {
                if (!Validator.equals(uuid, team.getUuid()) ||
                        (companyId != team.getCompanyId())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(4 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(4);
            }

            query.append(_SQL_SELECT_TEAM_WHERE);

            boolean bindUuid = false;

            if (uuid == null) {
                query.append(_FINDER_COLUMN_UUID_C_UUID_1);
            } else if (uuid.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_UUID_C_UUID_3);
            } else {
                bindUuid = true;

                query.append(_FINDER_COLUMN_UUID_C_UUID_2);
            }

            query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(TeamModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindUuid) {
                    qPos.add(uuid);
                }

                qPos.add(companyId);

                if (!pagination) {
                    list = (List<Team>) QueryUtil.list(q, getDialect(), start,
                            end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Team>(list);
                } else {
                    list = (List<Team>) QueryUtil.list(q, getDialect(), start,
                            end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

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
    @Override
    public Team findByUuid_C_First(String uuid, long companyId,
        OrderByComparator orderByComparator)
        throws NoSuchTeamException, SystemException {
        Team team = fetchByUuid_C_First(uuid, companyId, orderByComparator);

        if (team != null) {
            return team;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("uuid=");
        msg.append(uuid);

        msg.append(", companyId=");
        msg.append(companyId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchTeamException(msg.toString());
    }

    /**
     * Returns the first team in the ordered set where uuid = &#63; and companyId = &#63;.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching team, or <code>null</code> if a matching team could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Team fetchByUuid_C_First(String uuid, long companyId,
        OrderByComparator orderByComparator) throws SystemException {
        List<Team> list = findByUuid_C(uuid, companyId, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

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
    @Override
    public Team findByUuid_C_Last(String uuid, long companyId,
        OrderByComparator orderByComparator)
        throws NoSuchTeamException, SystemException {
        Team team = fetchByUuid_C_Last(uuid, companyId, orderByComparator);

        if (team != null) {
            return team;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("uuid=");
        msg.append(uuid);

        msg.append(", companyId=");
        msg.append(companyId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchTeamException(msg.toString());
    }

    /**
     * Returns the last team in the ordered set where uuid = &#63; and companyId = &#63;.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching team, or <code>null</code> if a matching team could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Team fetchByUuid_C_Last(String uuid, long companyId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByUuid_C(uuid, companyId);

        if (count == 0) {
            return null;
        }

        List<Team> list = findByUuid_C(uuid, companyId, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

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
    @Override
    public Team[] findByUuid_C_PrevAndNext(long teamId, String uuid,
        long companyId, OrderByComparator orderByComparator)
        throws NoSuchTeamException, SystemException {
        Team team = findByPrimaryKey(teamId);

        Session session = null;

        try {
            session = openSession();

            Team[] array = new TeamImpl[3];

            array[0] = getByUuid_C_PrevAndNext(session, team, uuid, companyId,
                    orderByComparator, true);

            array[1] = team;

            array[2] = getByUuid_C_PrevAndNext(session, team, uuid, companyId,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Team getByUuid_C_PrevAndNext(Session session, Team team,
        String uuid, long companyId, OrderByComparator orderByComparator,
        boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_TEAM_WHERE);

        boolean bindUuid = false;

        if (uuid == null) {
            query.append(_FINDER_COLUMN_UUID_C_UUID_1);
        } else if (uuid.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_UUID_C_UUID_3);
        } else {
            bindUuid = true;

            query.append(_FINDER_COLUMN_UUID_C_UUID_2);
        }

        query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(TeamModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindUuid) {
            qPos.add(uuid);
        }

        qPos.add(companyId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(team);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Team> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the teams where uuid = &#63; and companyId = &#63; from the database.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByUuid_C(String uuid, long companyId)
        throws SystemException {
        for (Team team : findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(team);
        }
    }

    /**
     * Returns the number of teams where uuid = &#63; and companyId = &#63;.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @return the number of matching teams
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByUuid_C(String uuid, long companyId)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_C;

        Object[] finderArgs = new Object[] { uuid, companyId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_TEAM_WHERE);

            boolean bindUuid = false;

            if (uuid == null) {
                query.append(_FINDER_COLUMN_UUID_C_UUID_1);
            } else if (uuid.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_UUID_C_UUID_3);
            } else {
                bindUuid = true;

                query.append(_FINDER_COLUMN_UUID_C_UUID_2);
            }

            query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindUuid) {
                    qPos.add(uuid);
                }

                qPos.add(companyId);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns all the teams where groupId = &#63; and leagueId = &#63;.
     *
     * @param groupId the group ID
     * @param leagueId the league ID
     * @return the matching teams
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Team> findByGroupIdAndLeagueId(long groupId, long leagueId)
        throws SystemException {
        return findByGroupIdAndLeagueId(groupId, leagueId, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

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
    @Override
    public List<Team> findByGroupIdAndLeagueId(long groupId, long leagueId,
        int start, int end) throws SystemException {
        return findByGroupIdAndLeagueId(groupId, leagueId, start, end, null);
    }

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
    @Override
    public List<Team> findByGroupIdAndLeagueId(long groupId, long leagueId,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPIDANDLEAGUEID;
            finderArgs = new Object[] { groupId, leagueId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPIDANDLEAGUEID;
            finderArgs = new Object[] {
                    groupId, leagueId,
                    
                    start, end, orderByComparator
                };
        }

        List<Team> list = (List<Team>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Team team : list) {
                if ((groupId != team.getGroupId()) ||
                        (leagueId != team.getLeagueId())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(4 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(4);
            }

            query.append(_SQL_SELECT_TEAM_WHERE);

            query.append(_FINDER_COLUMN_GROUPIDANDLEAGUEID_GROUPID_2);

            query.append(_FINDER_COLUMN_GROUPIDANDLEAGUEID_LEAGUEID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(TeamModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(groupId);

                qPos.add(leagueId);

                if (!pagination) {
                    list = (List<Team>) QueryUtil.list(q, getDialect(), start,
                            end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Team>(list);
                } else {
                    list = (List<Team>) QueryUtil.list(q, getDialect(), start,
                            end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

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
    @Override
    public Team findByGroupIdAndLeagueId_First(long groupId, long leagueId,
        OrderByComparator orderByComparator)
        throws NoSuchTeamException, SystemException {
        Team team = fetchByGroupIdAndLeagueId_First(groupId, leagueId,
                orderByComparator);

        if (team != null) {
            return team;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(", leagueId=");
        msg.append(leagueId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchTeamException(msg.toString());
    }

    /**
     * Returns the first team in the ordered set where groupId = &#63; and leagueId = &#63;.
     *
     * @param groupId the group ID
     * @param leagueId the league ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching team, or <code>null</code> if a matching team could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Team fetchByGroupIdAndLeagueId_First(long groupId, long leagueId,
        OrderByComparator orderByComparator) throws SystemException {
        List<Team> list = findByGroupIdAndLeagueId(groupId, leagueId, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

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
    @Override
    public Team findByGroupIdAndLeagueId_Last(long groupId, long leagueId,
        OrderByComparator orderByComparator)
        throws NoSuchTeamException, SystemException {
        Team team = fetchByGroupIdAndLeagueId_Last(groupId, leagueId,
                orderByComparator);

        if (team != null) {
            return team;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(", leagueId=");
        msg.append(leagueId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchTeamException(msg.toString());
    }

    /**
     * Returns the last team in the ordered set where groupId = &#63; and leagueId = &#63;.
     *
     * @param groupId the group ID
     * @param leagueId the league ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching team, or <code>null</code> if a matching team could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Team fetchByGroupIdAndLeagueId_Last(long groupId, long leagueId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByGroupIdAndLeagueId(groupId, leagueId);

        if (count == 0) {
            return null;
        }

        List<Team> list = findByGroupIdAndLeagueId(groupId, leagueId,
                count - 1, count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

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
    @Override
    public Team[] findByGroupIdAndLeagueId_PrevAndNext(long teamId,
        long groupId, long leagueId, OrderByComparator orderByComparator)
        throws NoSuchTeamException, SystemException {
        Team team = findByPrimaryKey(teamId);

        Session session = null;

        try {
            session = openSession();

            Team[] array = new TeamImpl[3];

            array[0] = getByGroupIdAndLeagueId_PrevAndNext(session, team,
                    groupId, leagueId, orderByComparator, true);

            array[1] = team;

            array[2] = getByGroupIdAndLeagueId_PrevAndNext(session, team,
                    groupId, leagueId, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Team getByGroupIdAndLeagueId_PrevAndNext(Session session,
        Team team, long groupId, long leagueId,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_TEAM_WHERE);

        query.append(_FINDER_COLUMN_GROUPIDANDLEAGUEID_GROUPID_2);

        query.append(_FINDER_COLUMN_GROUPIDANDLEAGUEID_LEAGUEID_2);

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(TeamModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(groupId);

        qPos.add(leagueId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(team);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Team> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the teams where groupId = &#63; and leagueId = &#63; from the database.
     *
     * @param groupId the group ID
     * @param leagueId the league ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByGroupIdAndLeagueId(long groupId, long leagueId)
        throws SystemException {
        for (Team team : findByGroupIdAndLeagueId(groupId, leagueId,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(team);
        }
    }

    /**
     * Returns the number of teams where groupId = &#63; and leagueId = &#63;.
     *
     * @param groupId the group ID
     * @param leagueId the league ID
     * @return the number of matching teams
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByGroupIdAndLeagueId(long groupId, long leagueId)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_GROUPIDANDLEAGUEID;

        Object[] finderArgs = new Object[] { groupId, leagueId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_TEAM_WHERE);

            query.append(_FINDER_COLUMN_GROUPIDANDLEAGUEID_GROUPID_2);

            query.append(_FINDER_COLUMN_GROUPIDANDLEAGUEID_LEAGUEID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(groupId);

                qPos.add(leagueId);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Caches the team in the entity cache if it is enabled.
     *
     * @param team the team
     */
    @Override
    public void cacheResult(Team team) {
        EntityCacheUtil.putResult(TeamModelImpl.ENTITY_CACHE_ENABLED,
            TeamImpl.class, team.getPrimaryKey(), team);

        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
            new Object[] { team.getUuid(), team.getGroupId() }, team);

        team.resetOriginalValues();
    }

    /**
     * Caches the teams in the entity cache if it is enabled.
     *
     * @param teams the teams
     */
    @Override
    public void cacheResult(List<Team> teams) {
        for (Team team : teams) {
            if (EntityCacheUtil.getResult(TeamModelImpl.ENTITY_CACHE_ENABLED,
                        TeamImpl.class, team.getPrimaryKey()) == null) {
                cacheResult(team);
            } else {
                team.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all teams.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(TeamImpl.class.getName());
        }

        EntityCacheUtil.clearCache(TeamImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the team.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Team team) {
        EntityCacheUtil.removeResult(TeamModelImpl.ENTITY_CACHE_ENABLED,
            TeamImpl.class, team.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        clearUniqueFindersCache(team);
    }

    @Override
    public void clearCache(List<Team> teams) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Team team : teams) {
            EntityCacheUtil.removeResult(TeamModelImpl.ENTITY_CACHE_ENABLED,
                TeamImpl.class, team.getPrimaryKey());

            clearUniqueFindersCache(team);
        }
    }

    protected void cacheUniqueFindersCache(Team team) {
        if (team.isNew()) {
            Object[] args = new Object[] { team.getUuid(), team.getGroupId() };

            FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
                Long.valueOf(1));
            FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G, args, team);
        } else {
            TeamModelImpl teamModelImpl = (TeamModelImpl) team;

            if ((teamModelImpl.getColumnBitmask() &
                    FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
                Object[] args = new Object[] { team.getUuid(), team.getGroupId() };

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
                    Long.valueOf(1));
                FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
                    team);
            }
        }
    }

    protected void clearUniqueFindersCache(Team team) {
        TeamModelImpl teamModelImpl = (TeamModelImpl) team;

        Object[] args = new Object[] { team.getUuid(), team.getGroupId() };

        FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
        FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);

        if ((teamModelImpl.getColumnBitmask() &
                FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
            args = new Object[] {
                    teamModelImpl.getOriginalUuid(),
                    teamModelImpl.getOriginalGroupId()
                };

            FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
            FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
        }
    }

    /**
     * Creates a new team with the primary key. Does not add the team to the database.
     *
     * @param teamId the primary key for the new team
     * @return the new team
     */
    @Override
    public Team create(long teamId) {
        Team team = new TeamImpl();

        team.setNew(true);
        team.setPrimaryKey(teamId);

        String uuid = PortalUUIDUtil.generate();

        team.setUuid(uuid);

        return team;
    }

    /**
     * Removes the team with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param teamId the primary key of the team
     * @return the team that was removed
     * @throws es.svalero.leaguemanagement.NoSuchTeamException if a team with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Team remove(long teamId) throws NoSuchTeamException, SystemException {
        return remove((Serializable) teamId);
    }

    /**
     * Removes the team with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the team
     * @return the team that was removed
     * @throws es.svalero.leaguemanagement.NoSuchTeamException if a team with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Team remove(Serializable primaryKey)
        throws NoSuchTeamException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Team team = (Team) session.get(TeamImpl.class, primaryKey);

            if (team == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchTeamException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(team);
        } catch (NoSuchTeamException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Team removeImpl(Team team) throws SystemException {
        team = toUnwrappedModel(team);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(team)) {
                team = (Team) session.get(TeamImpl.class,
                        team.getPrimaryKeyObj());
            }

            if (team != null) {
                session.delete(team);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (team != null) {
            clearCache(team);
        }

        return team;
    }

    @Override
    public Team updateImpl(es.svalero.leaguemanagement.model.Team team)
        throws SystemException {
        team = toUnwrappedModel(team);

        boolean isNew = team.isNew();

        TeamModelImpl teamModelImpl = (TeamModelImpl) team;

        if (Validator.isNull(team.getUuid())) {
            String uuid = PortalUUIDUtil.generate();

            team.setUuid(uuid);
        }

        Session session = null;

        try {
            session = openSession();

            if (team.isNew()) {
                session.save(team);

                team.setNew(false);
            } else {
                session.merge(team);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !TeamModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((teamModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] { teamModelImpl.getOriginalUuid() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
                    args);

                args = new Object[] { teamModelImpl.getUuid() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
                    args);
            }

            if ((teamModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        teamModelImpl.getOriginalUuid(),
                        teamModelImpl.getOriginalCompanyId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
                    args);

                args = new Object[] {
                        teamModelImpl.getUuid(), teamModelImpl.getCompanyId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
                    args);
            }

            if ((teamModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPIDANDLEAGUEID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        teamModelImpl.getOriginalGroupId(),
                        teamModelImpl.getOriginalLeagueId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPIDANDLEAGUEID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPIDANDLEAGUEID,
                    args);

                args = new Object[] {
                        teamModelImpl.getGroupId(), teamModelImpl.getLeagueId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPIDANDLEAGUEID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPIDANDLEAGUEID,
                    args);
            }
        }

        EntityCacheUtil.putResult(TeamModelImpl.ENTITY_CACHE_ENABLED,
            TeamImpl.class, team.getPrimaryKey(), team);

        clearUniqueFindersCache(team);
        cacheUniqueFindersCache(team);

        return team;
    }

    protected Team toUnwrappedModel(Team team) {
        if (team instanceof TeamImpl) {
            return team;
        }

        TeamImpl teamImpl = new TeamImpl();

        teamImpl.setNew(team.isNew());
        teamImpl.setPrimaryKey(team.getPrimaryKey());

        teamImpl.setUuid(team.getUuid());
        teamImpl.setTeamId(team.getTeamId());
        teamImpl.setGroupId(team.getGroupId());
        teamImpl.setCompanyId(team.getCompanyId());
        teamImpl.setUserId(team.getUserId());
        teamImpl.setUserName(team.getUserName());
        teamImpl.setCreateDate(team.getCreateDate());
        teamImpl.setModifiedDate(team.getModifiedDate());
        teamImpl.setLeagueId(team.getLeagueId());
        teamImpl.setName(team.getName());

        return teamImpl;
    }

    /**
     * Returns the team with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the team
     * @return the team
     * @throws es.svalero.leaguemanagement.NoSuchTeamException if a team with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Team findByPrimaryKey(Serializable primaryKey)
        throws NoSuchTeamException, SystemException {
        Team team = fetchByPrimaryKey(primaryKey);

        if (team == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchTeamException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return team;
    }

    /**
     * Returns the team with the primary key or throws a {@link es.svalero.leaguemanagement.NoSuchTeamException} if it could not be found.
     *
     * @param teamId the primary key of the team
     * @return the team
     * @throws es.svalero.leaguemanagement.NoSuchTeamException if a team with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Team findByPrimaryKey(long teamId)
        throws NoSuchTeamException, SystemException {
        return findByPrimaryKey((Serializable) teamId);
    }

    /**
     * Returns the team with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the team
     * @return the team, or <code>null</code> if a team with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Team fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Team team = (Team) EntityCacheUtil.getResult(TeamModelImpl.ENTITY_CACHE_ENABLED,
                TeamImpl.class, primaryKey);

        if (team == _nullTeam) {
            return null;
        }

        if (team == null) {
            Session session = null;

            try {
                session = openSession();

                team = (Team) session.get(TeamImpl.class, primaryKey);

                if (team != null) {
                    cacheResult(team);
                } else {
                    EntityCacheUtil.putResult(TeamModelImpl.ENTITY_CACHE_ENABLED,
                        TeamImpl.class, primaryKey, _nullTeam);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(TeamModelImpl.ENTITY_CACHE_ENABLED,
                    TeamImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return team;
    }

    /**
     * Returns the team with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param teamId the primary key of the team
     * @return the team, or <code>null</code> if a team with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Team fetchByPrimaryKey(long teamId) throws SystemException {
        return fetchByPrimaryKey((Serializable) teamId);
    }

    /**
     * Returns all the teams.
     *
     * @return the teams
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Team> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    public List<Team> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
    }

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
    @Override
    public List<Team> findAll(int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
            finderArgs = FINDER_ARGS_EMPTY;
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
            finderArgs = new Object[] { start, end, orderByComparator };
        }

        List<Team> list = (List<Team>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_TEAM);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_TEAM;

                if (pagination) {
                    sql = sql.concat(TeamModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Team>) QueryUtil.list(q, getDialect(), start,
                            end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Team>(list);
                } else {
                    list = (List<Team>) QueryUtil.list(q, getDialect(), start,
                            end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Removes all the teams from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Team team : findAll()) {
            remove(team);
        }
    }

    /**
     * Returns the number of teams.
     *
     * @return the number of teams
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countAll() throws SystemException {
        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
                FINDER_ARGS_EMPTY, this);

        if (count == null) {
            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(_SQL_COUNT_TEAM);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    @Override
    protected Set<String> getBadColumnNames() {
        return _badColumnNames;
    }

    /**
     * Initializes the team persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.es.svalero.leaguemanagement.model.Team")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Team>> listenersList = new ArrayList<ModelListener<Team>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Team>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(TeamImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
