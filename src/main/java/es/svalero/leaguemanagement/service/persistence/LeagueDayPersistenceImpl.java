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

import es.svalero.leaguemanagement.NoSuchLeagueDayException;
import es.svalero.leaguemanagement.model.LeagueDay;
import es.svalero.leaguemanagement.model.impl.LeagueDayImpl;
import es.svalero.leaguemanagement.model.impl.LeagueDayModelImpl;
import es.svalero.leaguemanagement.service.persistence.LeagueDayPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the league day service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LeagueDayPersistence
 * @see LeagueDayUtil
 * @generated
 */
public class LeagueDayPersistenceImpl extends BasePersistenceImpl<LeagueDay>
    implements LeagueDayPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link LeagueDayUtil} to access the league day persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = LeagueDayImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(LeagueDayModelImpl.ENTITY_CACHE_ENABLED,
            LeagueDayModelImpl.FINDER_CACHE_ENABLED, LeagueDayImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(LeagueDayModelImpl.ENTITY_CACHE_ENABLED,
            LeagueDayModelImpl.FINDER_CACHE_ENABLED, LeagueDayImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(LeagueDayModelImpl.ENTITY_CACHE_ENABLED,
            LeagueDayModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(LeagueDayModelImpl.ENTITY_CACHE_ENABLED,
            LeagueDayModelImpl.FINDER_CACHE_ENABLED, LeagueDayImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
            new String[] {
                String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(LeagueDayModelImpl.ENTITY_CACHE_ENABLED,
            LeagueDayModelImpl.FINDER_CACHE_ENABLED, LeagueDayImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
            new String[] { String.class.getName() },
            LeagueDayModelImpl.UUID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(LeagueDayModelImpl.ENTITY_CACHE_ENABLED,
            LeagueDayModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
            new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_UUID_UUID_1 = "leagueDay.uuid IS NULL";
    private static final String _FINDER_COLUMN_UUID_UUID_2 = "leagueDay.uuid = ?";
    private static final String _FINDER_COLUMN_UUID_UUID_3 = "(leagueDay.uuid IS NULL OR leagueDay.uuid = '')";
    public static final FinderPath FINDER_PATH_FETCH_BY_UUID_G = new FinderPath(LeagueDayModelImpl.ENTITY_CACHE_ENABLED,
            LeagueDayModelImpl.FINDER_CACHE_ENABLED, LeagueDayImpl.class,
            FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
            new String[] { String.class.getName(), Long.class.getName() },
            LeagueDayModelImpl.UUID_COLUMN_BITMASK |
            LeagueDayModelImpl.GROUPID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_UUID_G = new FinderPath(LeagueDayModelImpl.ENTITY_CACHE_ENABLED,
            LeagueDayModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
            new String[] { String.class.getName(), Long.class.getName() });
    private static final String _FINDER_COLUMN_UUID_G_UUID_1 = "leagueDay.uuid IS NULL AND ";
    private static final String _FINDER_COLUMN_UUID_G_UUID_2 = "leagueDay.uuid = ? AND ";
    private static final String _FINDER_COLUMN_UUID_G_UUID_3 = "(leagueDay.uuid IS NULL OR leagueDay.uuid = '') AND ";
    private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 = "leagueDay.groupId = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C = new FinderPath(LeagueDayModelImpl.ENTITY_CACHE_ENABLED,
            LeagueDayModelImpl.FINDER_CACHE_ENABLED, LeagueDayImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
            new String[] {
                String.class.getName(), Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C =
        new FinderPath(LeagueDayModelImpl.ENTITY_CACHE_ENABLED,
            LeagueDayModelImpl.FINDER_CACHE_ENABLED, LeagueDayImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
            new String[] { String.class.getName(), Long.class.getName() },
            LeagueDayModelImpl.UUID_COLUMN_BITMASK |
            LeagueDayModelImpl.COMPANYID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_UUID_C = new FinderPath(LeagueDayModelImpl.ENTITY_CACHE_ENABLED,
            LeagueDayModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
            new String[] { String.class.getName(), Long.class.getName() });
    private static final String _FINDER_COLUMN_UUID_C_UUID_1 = "leagueDay.uuid IS NULL AND ";
    private static final String _FINDER_COLUMN_UUID_C_UUID_2 = "leagueDay.uuid = ? AND ";
    private static final String _FINDER_COLUMN_UUID_C_UUID_3 = "(leagueDay.uuid IS NULL OR leagueDay.uuid = '') AND ";
    private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 = "leagueDay.companyId = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPIDANDLEAGUEID =
        new FinderPath(LeagueDayModelImpl.ENTITY_CACHE_ENABLED,
            LeagueDayModelImpl.FINDER_CACHE_ENABLED, LeagueDayImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByGroupIdAndLeagueId",
            new String[] {
                Long.class.getName(), Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPIDANDLEAGUEID =
        new FinderPath(LeagueDayModelImpl.ENTITY_CACHE_ENABLED,
            LeagueDayModelImpl.FINDER_CACHE_ENABLED, LeagueDayImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "findByGroupIdAndLeagueId",
            new String[] { Long.class.getName(), Long.class.getName() },
            LeagueDayModelImpl.GROUPID_COLUMN_BITMASK |
            LeagueDayModelImpl.LEAGUEID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_GROUPIDANDLEAGUEID = new FinderPath(LeagueDayModelImpl.ENTITY_CACHE_ENABLED,
            LeagueDayModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "countByGroupIdAndLeagueId",
            new String[] { Long.class.getName(), Long.class.getName() });
    private static final String _FINDER_COLUMN_GROUPIDANDLEAGUEID_GROUPID_2 = "leagueDay.groupId = ? AND ";
    private static final String _FINDER_COLUMN_GROUPIDANDLEAGUEID_LEAGUEID_2 = "leagueDay.leagueId = ?";
    private static final String _SQL_SELECT_LEAGUEDAY = "SELECT leagueDay FROM LeagueDay leagueDay";
    private static final String _SQL_SELECT_LEAGUEDAY_WHERE = "SELECT leagueDay FROM LeagueDay leagueDay WHERE ";
    private static final String _SQL_COUNT_LEAGUEDAY = "SELECT COUNT(leagueDay) FROM LeagueDay leagueDay";
    private static final String _SQL_COUNT_LEAGUEDAY_WHERE = "SELECT COUNT(leagueDay) FROM LeagueDay leagueDay WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "leagueDay.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No LeagueDay exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No LeagueDay exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(LeagueDayPersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "uuid", "number"
            });
    private static LeagueDay _nullLeagueDay = new LeagueDayImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<LeagueDay> toCacheModel() {
                return _nullLeagueDayCacheModel;
            }
        };

    private static CacheModel<LeagueDay> _nullLeagueDayCacheModel = new CacheModel<LeagueDay>() {
            @Override
            public LeagueDay toEntityModel() {
                return _nullLeagueDay;
            }
        };

    public LeagueDayPersistenceImpl() {
        setModelClass(LeagueDay.class);
    }

    /**
     * Returns all the league daies where uuid = &#63;.
     *
     * @param uuid the uuid
     * @return the matching league daies
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<LeagueDay> findByUuid(String uuid) throws SystemException {
        return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

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
    @Override
    public List<LeagueDay> findByUuid(String uuid, int start, int end)
        throws SystemException {
        return findByUuid(uuid, start, end, null);
    }

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
    @Override
    public List<LeagueDay> findByUuid(String uuid, int start, int end,
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

        List<LeagueDay> list = (List<LeagueDay>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (LeagueDay leagueDay : list) {
                if (!Validator.equals(uuid, leagueDay.getUuid())) {
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

            query.append(_SQL_SELECT_LEAGUEDAY_WHERE);

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
                query.append(LeagueDayModelImpl.ORDER_BY_JPQL);
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
                    list = (List<LeagueDay>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<LeagueDay>(list);
                } else {
                    list = (List<LeagueDay>) QueryUtil.list(q, getDialect(),
                            start, end);
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
     * Returns the first league day in the ordered set where uuid = &#63;.
     *
     * @param uuid the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching league day
     * @throws es.svalero.leaguemanagement.NoSuchLeagueDayException if a matching league day could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public LeagueDay findByUuid_First(String uuid,
        OrderByComparator orderByComparator)
        throws NoSuchLeagueDayException, SystemException {
        LeagueDay leagueDay = fetchByUuid_First(uuid, orderByComparator);

        if (leagueDay != null) {
            return leagueDay;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("uuid=");
        msg.append(uuid);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchLeagueDayException(msg.toString());
    }

    /**
     * Returns the first league day in the ordered set where uuid = &#63;.
     *
     * @param uuid the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching league day, or <code>null</code> if a matching league day could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public LeagueDay fetchByUuid_First(String uuid,
        OrderByComparator orderByComparator) throws SystemException {
        List<LeagueDay> list = findByUuid(uuid, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last league day in the ordered set where uuid = &#63;.
     *
     * @param uuid the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching league day
     * @throws es.svalero.leaguemanagement.NoSuchLeagueDayException if a matching league day could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public LeagueDay findByUuid_Last(String uuid,
        OrderByComparator orderByComparator)
        throws NoSuchLeagueDayException, SystemException {
        LeagueDay leagueDay = fetchByUuid_Last(uuid, orderByComparator);

        if (leagueDay != null) {
            return leagueDay;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("uuid=");
        msg.append(uuid);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchLeagueDayException(msg.toString());
    }

    /**
     * Returns the last league day in the ordered set where uuid = &#63;.
     *
     * @param uuid the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching league day, or <code>null</code> if a matching league day could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public LeagueDay fetchByUuid_Last(String uuid,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByUuid(uuid);

        if (count == 0) {
            return null;
        }

        List<LeagueDay> list = findByUuid(uuid, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

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
    @Override
    public LeagueDay[] findByUuid_PrevAndNext(long leagueDayId, String uuid,
        OrderByComparator orderByComparator)
        throws NoSuchLeagueDayException, SystemException {
        LeagueDay leagueDay = findByPrimaryKey(leagueDayId);

        Session session = null;

        try {
            session = openSession();

            LeagueDay[] array = new LeagueDayImpl[3];

            array[0] = getByUuid_PrevAndNext(session, leagueDay, uuid,
                    orderByComparator, true);

            array[1] = leagueDay;

            array[2] = getByUuid_PrevAndNext(session, leagueDay, uuid,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected LeagueDay getByUuid_PrevAndNext(Session session,
        LeagueDay leagueDay, String uuid, OrderByComparator orderByComparator,
        boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_LEAGUEDAY_WHERE);

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
            query.append(LeagueDayModelImpl.ORDER_BY_JPQL);
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
            Object[] values = orderByComparator.getOrderByConditionValues(leagueDay);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<LeagueDay> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the league daies where uuid = &#63; from the database.
     *
     * @param uuid the uuid
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByUuid(String uuid) throws SystemException {
        for (LeagueDay leagueDay : findByUuid(uuid, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(leagueDay);
        }
    }

    /**
     * Returns the number of league daies where uuid = &#63;.
     *
     * @param uuid the uuid
     * @return the number of matching league daies
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

            query.append(_SQL_COUNT_LEAGUEDAY_WHERE);

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
     * Returns the league day where uuid = &#63; and groupId = &#63; or throws a {@link es.svalero.leaguemanagement.NoSuchLeagueDayException} if it could not be found.
     *
     * @param uuid the uuid
     * @param groupId the group ID
     * @return the matching league day
     * @throws es.svalero.leaguemanagement.NoSuchLeagueDayException if a matching league day could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public LeagueDay findByUUID_G(String uuid, long groupId)
        throws NoSuchLeagueDayException, SystemException {
        LeagueDay leagueDay = fetchByUUID_G(uuid, groupId);

        if (leagueDay == null) {
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

            throw new NoSuchLeagueDayException(msg.toString());
        }

        return leagueDay;
    }

    /**
     * Returns the league day where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
     *
     * @param uuid the uuid
     * @param groupId the group ID
     * @return the matching league day, or <code>null</code> if a matching league day could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public LeagueDay fetchByUUID_G(String uuid, long groupId)
        throws SystemException {
        return fetchByUUID_G(uuid, groupId, true);
    }

    /**
     * Returns the league day where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
     *
     * @param uuid the uuid
     * @param groupId the group ID
     * @param retrieveFromCache whether to use the finder cache
     * @return the matching league day, or <code>null</code> if a matching league day could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public LeagueDay fetchByUUID_G(String uuid, long groupId,
        boolean retrieveFromCache) throws SystemException {
        Object[] finderArgs = new Object[] { uuid, groupId };

        Object result = null;

        if (retrieveFromCache) {
            result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_UUID_G,
                    finderArgs, this);
        }

        if (result instanceof LeagueDay) {
            LeagueDay leagueDay = (LeagueDay) result;

            if (!Validator.equals(uuid, leagueDay.getUuid()) ||
                    (groupId != leagueDay.getGroupId())) {
                result = null;
            }
        }

        if (result == null) {
            StringBundler query = new StringBundler(4);

            query.append(_SQL_SELECT_LEAGUEDAY_WHERE);

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

                List<LeagueDay> list = q.list();

                if (list.isEmpty()) {
                    FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
                        finderArgs, list);
                } else {
                    LeagueDay leagueDay = list.get(0);

                    result = leagueDay;

                    cacheResult(leagueDay);

                    if ((leagueDay.getUuid() == null) ||
                            !leagueDay.getUuid().equals(uuid) ||
                            (leagueDay.getGroupId() != groupId)) {
                        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
                            finderArgs, leagueDay);
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
            return (LeagueDay) result;
        }
    }

    /**
     * Removes the league day where uuid = &#63; and groupId = &#63; from the database.
     *
     * @param uuid the uuid
     * @param groupId the group ID
     * @return the league day that was removed
     * @throws SystemException if a system exception occurred
     */
    @Override
    public LeagueDay removeByUUID_G(String uuid, long groupId)
        throws NoSuchLeagueDayException, SystemException {
        LeagueDay leagueDay = findByUUID_G(uuid, groupId);

        return remove(leagueDay);
    }

    /**
     * Returns the number of league daies where uuid = &#63; and groupId = &#63;.
     *
     * @param uuid the uuid
     * @param groupId the group ID
     * @return the number of matching league daies
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

            query.append(_SQL_COUNT_LEAGUEDAY_WHERE);

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
     * Returns all the league daies where uuid = &#63; and companyId = &#63;.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @return the matching league daies
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<LeagueDay> findByUuid_C(String uuid, long companyId)
        throws SystemException {
        return findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

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
    @Override
    public List<LeagueDay> findByUuid_C(String uuid, long companyId, int start,
        int end) throws SystemException {
        return findByUuid_C(uuid, companyId, start, end, null);
    }

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
    @Override
    public List<LeagueDay> findByUuid_C(String uuid, long companyId, int start,
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

        List<LeagueDay> list = (List<LeagueDay>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (LeagueDay leagueDay : list) {
                if (!Validator.equals(uuid, leagueDay.getUuid()) ||
                        (companyId != leagueDay.getCompanyId())) {
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

            query.append(_SQL_SELECT_LEAGUEDAY_WHERE);

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
                query.append(LeagueDayModelImpl.ORDER_BY_JPQL);
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
                    list = (List<LeagueDay>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<LeagueDay>(list);
                } else {
                    list = (List<LeagueDay>) QueryUtil.list(q, getDialect(),
                            start, end);
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
     * Returns the first league day in the ordered set where uuid = &#63; and companyId = &#63;.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching league day
     * @throws es.svalero.leaguemanagement.NoSuchLeagueDayException if a matching league day could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public LeagueDay findByUuid_C_First(String uuid, long companyId,
        OrderByComparator orderByComparator)
        throws NoSuchLeagueDayException, SystemException {
        LeagueDay leagueDay = fetchByUuid_C_First(uuid, companyId,
                orderByComparator);

        if (leagueDay != null) {
            return leagueDay;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("uuid=");
        msg.append(uuid);

        msg.append(", companyId=");
        msg.append(companyId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchLeagueDayException(msg.toString());
    }

    /**
     * Returns the first league day in the ordered set where uuid = &#63; and companyId = &#63;.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching league day, or <code>null</code> if a matching league day could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public LeagueDay fetchByUuid_C_First(String uuid, long companyId,
        OrderByComparator orderByComparator) throws SystemException {
        List<LeagueDay> list = findByUuid_C(uuid, companyId, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

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
    @Override
    public LeagueDay findByUuid_C_Last(String uuid, long companyId,
        OrderByComparator orderByComparator)
        throws NoSuchLeagueDayException, SystemException {
        LeagueDay leagueDay = fetchByUuid_C_Last(uuid, companyId,
                orderByComparator);

        if (leagueDay != null) {
            return leagueDay;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("uuid=");
        msg.append(uuid);

        msg.append(", companyId=");
        msg.append(companyId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchLeagueDayException(msg.toString());
    }

    /**
     * Returns the last league day in the ordered set where uuid = &#63; and companyId = &#63;.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching league day, or <code>null</code> if a matching league day could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public LeagueDay fetchByUuid_C_Last(String uuid, long companyId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByUuid_C(uuid, companyId);

        if (count == 0) {
            return null;
        }

        List<LeagueDay> list = findByUuid_C(uuid, companyId, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

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
    @Override
    public LeagueDay[] findByUuid_C_PrevAndNext(long leagueDayId, String uuid,
        long companyId, OrderByComparator orderByComparator)
        throws NoSuchLeagueDayException, SystemException {
        LeagueDay leagueDay = findByPrimaryKey(leagueDayId);

        Session session = null;

        try {
            session = openSession();

            LeagueDay[] array = new LeagueDayImpl[3];

            array[0] = getByUuid_C_PrevAndNext(session, leagueDay, uuid,
                    companyId, orderByComparator, true);

            array[1] = leagueDay;

            array[2] = getByUuid_C_PrevAndNext(session, leagueDay, uuid,
                    companyId, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected LeagueDay getByUuid_C_PrevAndNext(Session session,
        LeagueDay leagueDay, String uuid, long companyId,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_LEAGUEDAY_WHERE);

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
            query.append(LeagueDayModelImpl.ORDER_BY_JPQL);
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
            Object[] values = orderByComparator.getOrderByConditionValues(leagueDay);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<LeagueDay> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the league daies where uuid = &#63; and companyId = &#63; from the database.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByUuid_C(String uuid, long companyId)
        throws SystemException {
        for (LeagueDay leagueDay : findByUuid_C(uuid, companyId,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(leagueDay);
        }
    }

    /**
     * Returns the number of league daies where uuid = &#63; and companyId = &#63;.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @return the number of matching league daies
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

            query.append(_SQL_COUNT_LEAGUEDAY_WHERE);

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
     * Returns all the league daies where groupId = &#63; and leagueId = &#63;.
     *
     * @param groupId the group ID
     * @param leagueId the league ID
     * @return the matching league daies
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<LeagueDay> findByGroupIdAndLeagueId(long groupId, long leagueId)
        throws SystemException {
        return findByGroupIdAndLeagueId(groupId, leagueId, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

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
    @Override
    public List<LeagueDay> findByGroupIdAndLeagueId(long groupId,
        long leagueId, int start, int end) throws SystemException {
        return findByGroupIdAndLeagueId(groupId, leagueId, start, end, null);
    }

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
    @Override
    public List<LeagueDay> findByGroupIdAndLeagueId(long groupId,
        long leagueId, int start, int end, OrderByComparator orderByComparator)
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

        List<LeagueDay> list = (List<LeagueDay>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (LeagueDay leagueDay : list) {
                if ((groupId != leagueDay.getGroupId()) ||
                        (leagueId != leagueDay.getLeagueId())) {
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

            query.append(_SQL_SELECT_LEAGUEDAY_WHERE);

            query.append(_FINDER_COLUMN_GROUPIDANDLEAGUEID_GROUPID_2);

            query.append(_FINDER_COLUMN_GROUPIDANDLEAGUEID_LEAGUEID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(LeagueDayModelImpl.ORDER_BY_JPQL);
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
                    list = (List<LeagueDay>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<LeagueDay>(list);
                } else {
                    list = (List<LeagueDay>) QueryUtil.list(q, getDialect(),
                            start, end);
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
     * Returns the first league day in the ordered set where groupId = &#63; and leagueId = &#63;.
     *
     * @param groupId the group ID
     * @param leagueId the league ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching league day
     * @throws es.svalero.leaguemanagement.NoSuchLeagueDayException if a matching league day could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public LeagueDay findByGroupIdAndLeagueId_First(long groupId,
        long leagueId, OrderByComparator orderByComparator)
        throws NoSuchLeagueDayException, SystemException {
        LeagueDay leagueDay = fetchByGroupIdAndLeagueId_First(groupId,
                leagueId, orderByComparator);

        if (leagueDay != null) {
            return leagueDay;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(", leagueId=");
        msg.append(leagueId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchLeagueDayException(msg.toString());
    }

    /**
     * Returns the first league day in the ordered set where groupId = &#63; and leagueId = &#63;.
     *
     * @param groupId the group ID
     * @param leagueId the league ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching league day, or <code>null</code> if a matching league day could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public LeagueDay fetchByGroupIdAndLeagueId_First(long groupId,
        long leagueId, OrderByComparator orderByComparator)
        throws SystemException {
        List<LeagueDay> list = findByGroupIdAndLeagueId(groupId, leagueId, 0,
                1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

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
    @Override
    public LeagueDay findByGroupIdAndLeagueId_Last(long groupId, long leagueId,
        OrderByComparator orderByComparator)
        throws NoSuchLeagueDayException, SystemException {
        LeagueDay leagueDay = fetchByGroupIdAndLeagueId_Last(groupId, leagueId,
                orderByComparator);

        if (leagueDay != null) {
            return leagueDay;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(", leagueId=");
        msg.append(leagueId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchLeagueDayException(msg.toString());
    }

    /**
     * Returns the last league day in the ordered set where groupId = &#63; and leagueId = &#63;.
     *
     * @param groupId the group ID
     * @param leagueId the league ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching league day, or <code>null</code> if a matching league day could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public LeagueDay fetchByGroupIdAndLeagueId_Last(long groupId,
        long leagueId, OrderByComparator orderByComparator)
        throws SystemException {
        int count = countByGroupIdAndLeagueId(groupId, leagueId);

        if (count == 0) {
            return null;
        }

        List<LeagueDay> list = findByGroupIdAndLeagueId(groupId, leagueId,
                count - 1, count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

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
    @Override
    public LeagueDay[] findByGroupIdAndLeagueId_PrevAndNext(long leagueDayId,
        long groupId, long leagueId, OrderByComparator orderByComparator)
        throws NoSuchLeagueDayException, SystemException {
        LeagueDay leagueDay = findByPrimaryKey(leagueDayId);

        Session session = null;

        try {
            session = openSession();

            LeagueDay[] array = new LeagueDayImpl[3];

            array[0] = getByGroupIdAndLeagueId_PrevAndNext(session, leagueDay,
                    groupId, leagueId, orderByComparator, true);

            array[1] = leagueDay;

            array[2] = getByGroupIdAndLeagueId_PrevAndNext(session, leagueDay,
                    groupId, leagueId, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected LeagueDay getByGroupIdAndLeagueId_PrevAndNext(Session session,
        LeagueDay leagueDay, long groupId, long leagueId,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_LEAGUEDAY_WHERE);

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
            query.append(LeagueDayModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(groupId);

        qPos.add(leagueId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(leagueDay);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<LeagueDay> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the league daies where groupId = &#63; and leagueId = &#63; from the database.
     *
     * @param groupId the group ID
     * @param leagueId the league ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByGroupIdAndLeagueId(long groupId, long leagueId)
        throws SystemException {
        for (LeagueDay leagueDay : findByGroupIdAndLeagueId(groupId, leagueId,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(leagueDay);
        }
    }

    /**
     * Returns the number of league daies where groupId = &#63; and leagueId = &#63;.
     *
     * @param groupId the group ID
     * @param leagueId the league ID
     * @return the number of matching league daies
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

            query.append(_SQL_COUNT_LEAGUEDAY_WHERE);

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
     * Caches the league day in the entity cache if it is enabled.
     *
     * @param leagueDay the league day
     */
    @Override
    public void cacheResult(LeagueDay leagueDay) {
        EntityCacheUtil.putResult(LeagueDayModelImpl.ENTITY_CACHE_ENABLED,
            LeagueDayImpl.class, leagueDay.getPrimaryKey(), leagueDay);

        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
            new Object[] { leagueDay.getUuid(), leagueDay.getGroupId() },
            leagueDay);

        leagueDay.resetOriginalValues();
    }

    /**
     * Caches the league daies in the entity cache if it is enabled.
     *
     * @param leagueDaies the league daies
     */
    @Override
    public void cacheResult(List<LeagueDay> leagueDaies) {
        for (LeagueDay leagueDay : leagueDaies) {
            if (EntityCacheUtil.getResult(
                        LeagueDayModelImpl.ENTITY_CACHE_ENABLED,
                        LeagueDayImpl.class, leagueDay.getPrimaryKey()) == null) {
                cacheResult(leagueDay);
            } else {
                leagueDay.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all league daies.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(LeagueDayImpl.class.getName());
        }

        EntityCacheUtil.clearCache(LeagueDayImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the league day.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(LeagueDay leagueDay) {
        EntityCacheUtil.removeResult(LeagueDayModelImpl.ENTITY_CACHE_ENABLED,
            LeagueDayImpl.class, leagueDay.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        clearUniqueFindersCache(leagueDay);
    }

    @Override
    public void clearCache(List<LeagueDay> leagueDaies) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (LeagueDay leagueDay : leagueDaies) {
            EntityCacheUtil.removeResult(LeagueDayModelImpl.ENTITY_CACHE_ENABLED,
                LeagueDayImpl.class, leagueDay.getPrimaryKey());

            clearUniqueFindersCache(leagueDay);
        }
    }

    protected void cacheUniqueFindersCache(LeagueDay leagueDay) {
        if (leagueDay.isNew()) {
            Object[] args = new Object[] {
                    leagueDay.getUuid(), leagueDay.getGroupId()
                };

            FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
                Long.valueOf(1));
            FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
                leagueDay);
        } else {
            LeagueDayModelImpl leagueDayModelImpl = (LeagueDayModelImpl) leagueDay;

            if ((leagueDayModelImpl.getColumnBitmask() &
                    FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        leagueDay.getUuid(), leagueDay.getGroupId()
                    };

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
                    Long.valueOf(1));
                FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
                    leagueDay);
            }
        }
    }

    protected void clearUniqueFindersCache(LeagueDay leagueDay) {
        LeagueDayModelImpl leagueDayModelImpl = (LeagueDayModelImpl) leagueDay;

        Object[] args = new Object[] { leagueDay.getUuid(), leagueDay.getGroupId() };

        FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
        FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);

        if ((leagueDayModelImpl.getColumnBitmask() &
                FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
            args = new Object[] {
                    leagueDayModelImpl.getOriginalUuid(),
                    leagueDayModelImpl.getOriginalGroupId()
                };

            FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
            FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
        }
    }

    /**
     * Creates a new league day with the primary key. Does not add the league day to the database.
     *
     * @param leagueDayId the primary key for the new league day
     * @return the new league day
     */
    @Override
    public LeagueDay create(long leagueDayId) {
        LeagueDay leagueDay = new LeagueDayImpl();

        leagueDay.setNew(true);
        leagueDay.setPrimaryKey(leagueDayId);

        String uuid = PortalUUIDUtil.generate();

        leagueDay.setUuid(uuid);

        return leagueDay;
    }

    /**
     * Removes the league day with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param leagueDayId the primary key of the league day
     * @return the league day that was removed
     * @throws es.svalero.leaguemanagement.NoSuchLeagueDayException if a league day with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public LeagueDay remove(long leagueDayId)
        throws NoSuchLeagueDayException, SystemException {
        return remove((Serializable) leagueDayId);
    }

    /**
     * Removes the league day with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the league day
     * @return the league day that was removed
     * @throws es.svalero.leaguemanagement.NoSuchLeagueDayException if a league day with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public LeagueDay remove(Serializable primaryKey)
        throws NoSuchLeagueDayException, SystemException {
        Session session = null;

        try {
            session = openSession();

            LeagueDay leagueDay = (LeagueDay) session.get(LeagueDayImpl.class,
                    primaryKey);

            if (leagueDay == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchLeagueDayException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(leagueDay);
        } catch (NoSuchLeagueDayException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected LeagueDay removeImpl(LeagueDay leagueDay)
        throws SystemException {
        leagueDay = toUnwrappedModel(leagueDay);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(leagueDay)) {
                leagueDay = (LeagueDay) session.get(LeagueDayImpl.class,
                        leagueDay.getPrimaryKeyObj());
            }

            if (leagueDay != null) {
                session.delete(leagueDay);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (leagueDay != null) {
            clearCache(leagueDay);
        }

        return leagueDay;
    }

    @Override
    public LeagueDay updateImpl(
        es.svalero.leaguemanagement.model.LeagueDay leagueDay)
        throws SystemException {
        leagueDay = toUnwrappedModel(leagueDay);

        boolean isNew = leagueDay.isNew();

        LeagueDayModelImpl leagueDayModelImpl = (LeagueDayModelImpl) leagueDay;

        if (Validator.isNull(leagueDay.getUuid())) {
            String uuid = PortalUUIDUtil.generate();

            leagueDay.setUuid(uuid);
        }

        Session session = null;

        try {
            session = openSession();

            if (leagueDay.isNew()) {
                session.save(leagueDay);

                leagueDay.setNew(false);
            } else {
                session.merge(leagueDay);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !LeagueDayModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((leagueDayModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        leagueDayModelImpl.getOriginalUuid()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
                    args);

                args = new Object[] { leagueDayModelImpl.getUuid() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
                    args);
            }

            if ((leagueDayModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        leagueDayModelImpl.getOriginalUuid(),
                        leagueDayModelImpl.getOriginalCompanyId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
                    args);

                args = new Object[] {
                        leagueDayModelImpl.getUuid(),
                        leagueDayModelImpl.getCompanyId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
                    args);
            }

            if ((leagueDayModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPIDANDLEAGUEID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        leagueDayModelImpl.getOriginalGroupId(),
                        leagueDayModelImpl.getOriginalLeagueId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPIDANDLEAGUEID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPIDANDLEAGUEID,
                    args);

                args = new Object[] {
                        leagueDayModelImpl.getGroupId(),
                        leagueDayModelImpl.getLeagueId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPIDANDLEAGUEID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPIDANDLEAGUEID,
                    args);
            }
        }

        EntityCacheUtil.putResult(LeagueDayModelImpl.ENTITY_CACHE_ENABLED,
            LeagueDayImpl.class, leagueDay.getPrimaryKey(), leagueDay);

        clearUniqueFindersCache(leagueDay);
        cacheUniqueFindersCache(leagueDay);

        return leagueDay;
    }

    protected LeagueDay toUnwrappedModel(LeagueDay leagueDay) {
        if (leagueDay instanceof LeagueDayImpl) {
            return leagueDay;
        }

        LeagueDayImpl leagueDayImpl = new LeagueDayImpl();

        leagueDayImpl.setNew(leagueDay.isNew());
        leagueDayImpl.setPrimaryKey(leagueDay.getPrimaryKey());

        leagueDayImpl.setUuid(leagueDay.getUuid());
        leagueDayImpl.setLeagueDayId(leagueDay.getLeagueDayId());
        leagueDayImpl.setGroupId(leagueDay.getGroupId());
        leagueDayImpl.setCompanyId(leagueDay.getCompanyId());
        leagueDayImpl.setUserId(leagueDay.getUserId());
        leagueDayImpl.setUserName(leagueDay.getUserName());
        leagueDayImpl.setCreateDate(leagueDay.getCreateDate());
        leagueDayImpl.setModifiedDate(leagueDay.getModifiedDate());
        leagueDayImpl.setLeagueId(leagueDay.getLeagueId());
        leagueDayImpl.setNumber(leagueDay.getNumber());

        return leagueDayImpl;
    }

    /**
     * Returns the league day with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the league day
     * @return the league day
     * @throws es.svalero.leaguemanagement.NoSuchLeagueDayException if a league day with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public LeagueDay findByPrimaryKey(Serializable primaryKey)
        throws NoSuchLeagueDayException, SystemException {
        LeagueDay leagueDay = fetchByPrimaryKey(primaryKey);

        if (leagueDay == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchLeagueDayException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return leagueDay;
    }

    /**
     * Returns the league day with the primary key or throws a {@link es.svalero.leaguemanagement.NoSuchLeagueDayException} if it could not be found.
     *
     * @param leagueDayId the primary key of the league day
     * @return the league day
     * @throws es.svalero.leaguemanagement.NoSuchLeagueDayException if a league day with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public LeagueDay findByPrimaryKey(long leagueDayId)
        throws NoSuchLeagueDayException, SystemException {
        return findByPrimaryKey((Serializable) leagueDayId);
    }

    /**
     * Returns the league day with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the league day
     * @return the league day, or <code>null</code> if a league day with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public LeagueDay fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        LeagueDay leagueDay = (LeagueDay) EntityCacheUtil.getResult(LeagueDayModelImpl.ENTITY_CACHE_ENABLED,
                LeagueDayImpl.class, primaryKey);

        if (leagueDay == _nullLeagueDay) {
            return null;
        }

        if (leagueDay == null) {
            Session session = null;

            try {
                session = openSession();

                leagueDay = (LeagueDay) session.get(LeagueDayImpl.class,
                        primaryKey);

                if (leagueDay != null) {
                    cacheResult(leagueDay);
                } else {
                    EntityCacheUtil.putResult(LeagueDayModelImpl.ENTITY_CACHE_ENABLED,
                        LeagueDayImpl.class, primaryKey, _nullLeagueDay);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(LeagueDayModelImpl.ENTITY_CACHE_ENABLED,
                    LeagueDayImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return leagueDay;
    }

    /**
     * Returns the league day with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param leagueDayId the primary key of the league day
     * @return the league day, or <code>null</code> if a league day with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public LeagueDay fetchByPrimaryKey(long leagueDayId)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) leagueDayId);
    }

    /**
     * Returns all the league daies.
     *
     * @return the league daies
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<LeagueDay> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    public List<LeagueDay> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

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
    @Override
    public List<LeagueDay> findAll(int start, int end,
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

        List<LeagueDay> list = (List<LeagueDay>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_LEAGUEDAY);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_LEAGUEDAY;

                if (pagination) {
                    sql = sql.concat(LeagueDayModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<LeagueDay>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<LeagueDay>(list);
                } else {
                    list = (List<LeagueDay>) QueryUtil.list(q, getDialect(),
                            start, end);
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
     * Removes all the league daies from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (LeagueDay leagueDay : findAll()) {
            remove(leagueDay);
        }
    }

    /**
     * Returns the number of league daies.
     *
     * @return the number of league daies
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

                Query q = session.createQuery(_SQL_COUNT_LEAGUEDAY);

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
     * Initializes the league day persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.es.svalero.leaguemanagement.model.LeagueDay")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<LeagueDay>> listenersList = new ArrayList<ModelListener<LeagueDay>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<LeagueDay>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(LeagueDayImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
