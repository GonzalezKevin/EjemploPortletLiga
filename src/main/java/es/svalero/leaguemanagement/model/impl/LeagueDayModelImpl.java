package es.svalero.leaguemanagement.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import es.svalero.leaguemanagement.model.LeagueDay;
import es.svalero.leaguemanagement.model.LeagueDayModel;
import es.svalero.leaguemanagement.model.LeagueDaySoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the LeagueDay service. Represents a row in the &quot;LM_LeagueDay&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link es.svalero.leaguemanagement.model.LeagueDayModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link LeagueDayImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LeagueDayImpl
 * @see es.svalero.leaguemanagement.model.LeagueDay
 * @see es.svalero.leaguemanagement.model.LeagueDayModel
 * @generated
 */
@JSON(strict = true)
public class LeagueDayModelImpl extends BaseModelImpl<LeagueDay>
    implements LeagueDayModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a league day model instance should use the {@link es.svalero.leaguemanagement.model.LeagueDay} interface instead.
     */
    public static final String TABLE_NAME = "LM_LeagueDay";
    public static final Object[][] TABLE_COLUMNS = {
            { "uuid_", Types.VARCHAR },
            { "leagueDayId", Types.BIGINT },
            { "groupId", Types.BIGINT },
            { "companyId", Types.BIGINT },
            { "userId", Types.BIGINT },
            { "userName", Types.VARCHAR },
            { "createDate", Types.TIMESTAMP },
            { "modifiedDate", Types.TIMESTAMP },
            { "leagueId", Types.BIGINT },
            { "number_", Types.VARCHAR }
        };
    public static final String TABLE_SQL_CREATE = "create table LM_LeagueDay (uuid_ VARCHAR(75) null,leagueDayId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,leagueId LONG,number_ VARCHAR(75) null)";
    public static final String TABLE_SQL_DROP = "drop table LM_LeagueDay";
    public static final String ORDER_BY_JPQL = " ORDER BY leagueDay.leagueDayId ASC";
    public static final String ORDER_BY_SQL = " ORDER BY LM_LeagueDay.leagueDayId ASC";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.es.svalero.leaguemanagement.model.LeagueDay"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.es.svalero.leaguemanagement.model.LeagueDay"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.column.bitmask.enabled.es.svalero.leaguemanagement.model.LeagueDay"),
            true);
    public static long COMPANYID_COLUMN_BITMASK = 1L;
    public static long GROUPID_COLUMN_BITMASK = 2L;
    public static long LEAGUEID_COLUMN_BITMASK = 4L;
    public static long UUID_COLUMN_BITMASK = 8L;
    public static long LEAGUEDAYID_COLUMN_BITMASK = 16L;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.es.svalero.leaguemanagement.model.LeagueDay"));
    private static ClassLoader _classLoader = LeagueDay.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            LeagueDay.class
        };
    private String _uuid;
    private String _originalUuid;
    private long _leagueDayId;
    private long _groupId;
    private long _originalGroupId;
    private boolean _setOriginalGroupId;
    private long _companyId;
    private long _originalCompanyId;
    private boolean _setOriginalCompanyId;
    private long _userId;
    private String _userUuid;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private long _leagueId;
    private long _originalLeagueId;
    private boolean _setOriginalLeagueId;
    private String _number;
    private long _columnBitmask;
    private LeagueDay _escapedModel;

    public LeagueDayModelImpl() {
    }

    /**
     * Converts the soap model instance into a normal model instance.
     *
     * @param soapModel the soap model instance to convert
     * @return the normal model instance
     */
    public static LeagueDay toModel(LeagueDaySoap soapModel) {
        if (soapModel == null) {
            return null;
        }

        LeagueDay model = new LeagueDayImpl();

        model.setUuid(soapModel.getUuid());
        model.setLeagueDayId(soapModel.getLeagueDayId());
        model.setGroupId(soapModel.getGroupId());
        model.setCompanyId(soapModel.getCompanyId());
        model.setUserId(soapModel.getUserId());
        model.setUserName(soapModel.getUserName());
        model.setCreateDate(soapModel.getCreateDate());
        model.setModifiedDate(soapModel.getModifiedDate());
        model.setLeagueId(soapModel.getLeagueId());
        model.setNumber(soapModel.getNumber());

        return model;
    }

    /**
     * Converts the soap model instances into normal model instances.
     *
     * @param soapModels the soap model instances to convert
     * @return the normal model instances
     */
    public static List<LeagueDay> toModels(LeagueDaySoap[] soapModels) {
        if (soapModels == null) {
            return null;
        }

        List<LeagueDay> models = new ArrayList<LeagueDay>(soapModels.length);

        for (LeagueDaySoap soapModel : soapModels) {
            models.add(toModel(soapModel));
        }

        return models;
    }

    @Override
    public long getPrimaryKey() {
        return _leagueDayId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setLeagueDayId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _leagueDayId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Class<?> getModelClass() {
        return LeagueDay.class;
    }

    @Override
    public String getModelClassName() {
        return LeagueDay.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("uuid", getUuid());
        attributes.put("leagueDayId", getLeagueDayId());
        attributes.put("groupId", getGroupId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("userName", getUserName());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("leagueId", getLeagueId());
        attributes.put("number", getNumber());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String uuid = (String) attributes.get("uuid");

        if (uuid != null) {
            setUuid(uuid);
        }

        Long leagueDayId = (Long) attributes.get("leagueDayId");

        if (leagueDayId != null) {
            setLeagueDayId(leagueDayId);
        }

        Long groupId = (Long) attributes.get("groupId");

        if (groupId != null) {
            setGroupId(groupId);
        }

        Long companyId = (Long) attributes.get("companyId");

        if (companyId != null) {
            setCompanyId(companyId);
        }

        Long userId = (Long) attributes.get("userId");

        if (userId != null) {
            setUserId(userId);
        }

        String userName = (String) attributes.get("userName");

        if (userName != null) {
            setUserName(userName);
        }

        Date createDate = (Date) attributes.get("createDate");

        if (createDate != null) {
            setCreateDate(createDate);
        }

        Date modifiedDate = (Date) attributes.get("modifiedDate");

        if (modifiedDate != null) {
            setModifiedDate(modifiedDate);
        }

        Long leagueId = (Long) attributes.get("leagueId");

        if (leagueId != null) {
            setLeagueId(leagueId);
        }

        String number = (String) attributes.get("number");

        if (number != null) {
            setNumber(number);
        }
    }

    @JSON
    @Override
    public String getUuid() {
        if (_uuid == null) {
            return StringPool.BLANK;
        } else {
            return _uuid;
        }
    }

    @Override
    public void setUuid(String uuid) {
        if (_originalUuid == null) {
            _originalUuid = _uuid;
        }

        _uuid = uuid;
    }

    public String getOriginalUuid() {
        return GetterUtil.getString(_originalUuid);
    }

    @JSON
    @Override
    public long getLeagueDayId() {
        return _leagueDayId;
    }

    @Override
    public void setLeagueDayId(long leagueDayId) {
        _leagueDayId = leagueDayId;
    }

    @JSON
    @Override
    public long getGroupId() {
        return _groupId;
    }

    @Override
    public void setGroupId(long groupId) {
        _columnBitmask |= GROUPID_COLUMN_BITMASK;

        if (!_setOriginalGroupId) {
            _setOriginalGroupId = true;

            _originalGroupId = _groupId;
        }

        _groupId = groupId;
    }

    public long getOriginalGroupId() {
        return _originalGroupId;
    }

    @JSON
    @Override
    public long getCompanyId() {
        return _companyId;
    }

    @Override
    public void setCompanyId(long companyId) {
        _columnBitmask |= COMPANYID_COLUMN_BITMASK;

        if (!_setOriginalCompanyId) {
            _setOriginalCompanyId = true;

            _originalCompanyId = _companyId;
        }

        _companyId = companyId;
    }

    public long getOriginalCompanyId() {
        return _originalCompanyId;
    }

    @JSON
    @Override
    public long getUserId() {
        return _userId;
    }

    @Override
    public void setUserId(long userId) {
        _userId = userId;
    }

    @Override
    public String getUserUuid() throws SystemException {
        return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
    }

    @Override
    public void setUserUuid(String userUuid) {
        _userUuid = userUuid;
    }

    @JSON
    @Override
    public String getUserName() {
        if (_userName == null) {
            return StringPool.BLANK;
        } else {
            return _userName;
        }
    }

    @Override
    public void setUserName(String userName) {
        _userName = userName;
    }

    @JSON
    @Override
    public Date getCreateDate() {
        return _createDate;
    }

    @Override
    public void setCreateDate(Date createDate) {
        _createDate = createDate;
    }

    @JSON
    @Override
    public Date getModifiedDate() {
        return _modifiedDate;
    }

    @Override
    public void setModifiedDate(Date modifiedDate) {
        _modifiedDate = modifiedDate;
    }

    @JSON
    @Override
    public long getLeagueId() {
        return _leagueId;
    }

    @Override
    public void setLeagueId(long leagueId) {
        _columnBitmask |= LEAGUEID_COLUMN_BITMASK;

        if (!_setOriginalLeagueId) {
            _setOriginalLeagueId = true;

            _originalLeagueId = _leagueId;
        }

        _leagueId = leagueId;
    }

    public long getOriginalLeagueId() {
        return _originalLeagueId;
    }

    @JSON
    @Override
    public String getNumber() {
        if (_number == null) {
            return StringPool.BLANK;
        } else {
            return _number;
        }
    }

    @Override
    public void setNumber(String number) {
        _number = number;
    }

    @Override
    public StagedModelType getStagedModelType() {
        return new StagedModelType(PortalUtil.getClassNameId(
                LeagueDay.class.getName()));
    }

    public long getColumnBitmask() {
        return _columnBitmask;
    }

    @Override
    public ExpandoBridge getExpandoBridge() {
        return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
            LeagueDay.class.getName(), getPrimaryKey());
    }

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        ExpandoBridge expandoBridge = getExpandoBridge();

        expandoBridge.setAttributes(serviceContext);
    }

    @Override
    public LeagueDay toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (LeagueDay) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        LeagueDayImpl leagueDayImpl = new LeagueDayImpl();

        leagueDayImpl.setUuid(getUuid());
        leagueDayImpl.setLeagueDayId(getLeagueDayId());
        leagueDayImpl.setGroupId(getGroupId());
        leagueDayImpl.setCompanyId(getCompanyId());
        leagueDayImpl.setUserId(getUserId());
        leagueDayImpl.setUserName(getUserName());
        leagueDayImpl.setCreateDate(getCreateDate());
        leagueDayImpl.setModifiedDate(getModifiedDate());
        leagueDayImpl.setLeagueId(getLeagueId());
        leagueDayImpl.setNumber(getNumber());

        leagueDayImpl.resetOriginalValues();

        return leagueDayImpl;
    }

    @Override
    public int compareTo(LeagueDay leagueDay) {
        long primaryKey = leagueDay.getPrimaryKey();

        if (getPrimaryKey() < primaryKey) {
            return -1;
        } else if (getPrimaryKey() > primaryKey) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof LeagueDay)) {
            return false;
        }

        LeagueDay leagueDay = (LeagueDay) obj;

        long primaryKey = leagueDay.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public void resetOriginalValues() {
        LeagueDayModelImpl leagueDayModelImpl = this;

        leagueDayModelImpl._originalUuid = leagueDayModelImpl._uuid;

        leagueDayModelImpl._originalGroupId = leagueDayModelImpl._groupId;

        leagueDayModelImpl._setOriginalGroupId = false;

        leagueDayModelImpl._originalCompanyId = leagueDayModelImpl._companyId;

        leagueDayModelImpl._setOriginalCompanyId = false;

        leagueDayModelImpl._originalLeagueId = leagueDayModelImpl._leagueId;

        leagueDayModelImpl._setOriginalLeagueId = false;

        leagueDayModelImpl._columnBitmask = 0;
    }

    @Override
    public CacheModel<LeagueDay> toCacheModel() {
        LeagueDayCacheModel leagueDayCacheModel = new LeagueDayCacheModel();

        leagueDayCacheModel.uuid = getUuid();

        String uuid = leagueDayCacheModel.uuid;

        if ((uuid != null) && (uuid.length() == 0)) {
            leagueDayCacheModel.uuid = null;
        }

        leagueDayCacheModel.leagueDayId = getLeagueDayId();

        leagueDayCacheModel.groupId = getGroupId();

        leagueDayCacheModel.companyId = getCompanyId();

        leagueDayCacheModel.userId = getUserId();

        leagueDayCacheModel.userName = getUserName();

        String userName = leagueDayCacheModel.userName;

        if ((userName != null) && (userName.length() == 0)) {
            leagueDayCacheModel.userName = null;
        }

        Date createDate = getCreateDate();

        if (createDate != null) {
            leagueDayCacheModel.createDate = createDate.getTime();
        } else {
            leagueDayCacheModel.createDate = Long.MIN_VALUE;
        }

        Date modifiedDate = getModifiedDate();

        if (modifiedDate != null) {
            leagueDayCacheModel.modifiedDate = modifiedDate.getTime();
        } else {
            leagueDayCacheModel.modifiedDate = Long.MIN_VALUE;
        }

        leagueDayCacheModel.leagueId = getLeagueId();

        leagueDayCacheModel.number = getNumber();

        String number = leagueDayCacheModel.number;

        if ((number != null) && (number.length() == 0)) {
            leagueDayCacheModel.number = null;
        }

        return leagueDayCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(21);

        sb.append("{uuid=");
        sb.append(getUuid());
        sb.append(", leagueDayId=");
        sb.append(getLeagueDayId());
        sb.append(", groupId=");
        sb.append(getGroupId());
        sb.append(", companyId=");
        sb.append(getCompanyId());
        sb.append(", userId=");
        sb.append(getUserId());
        sb.append(", userName=");
        sb.append(getUserName());
        sb.append(", createDate=");
        sb.append(getCreateDate());
        sb.append(", modifiedDate=");
        sb.append(getModifiedDate());
        sb.append(", leagueId=");
        sb.append(getLeagueId());
        sb.append(", number=");
        sb.append(getNumber());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(34);

        sb.append("<model><model-name>");
        sb.append("es.svalero.leaguemanagement.model.LeagueDay");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>uuid</column-name><column-value><![CDATA[");
        sb.append(getUuid());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>leagueDayId</column-name><column-value><![CDATA[");
        sb.append(getLeagueDayId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>groupId</column-name><column-value><![CDATA[");
        sb.append(getGroupId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>companyId</column-name><column-value><![CDATA[");
        sb.append(getCompanyId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>userId</column-name><column-value><![CDATA[");
        sb.append(getUserId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>userName</column-name><column-value><![CDATA[");
        sb.append(getUserName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>createDate</column-name><column-value><![CDATA[");
        sb.append(getCreateDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
        sb.append(getModifiedDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>leagueId</column-name><column-value><![CDATA[");
        sb.append(getLeagueId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>number</column-name><column-value><![CDATA[");
        sb.append(getNumber());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}