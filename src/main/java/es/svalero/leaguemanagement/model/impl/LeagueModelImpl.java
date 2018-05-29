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

import es.svalero.leaguemanagement.model.League;
import es.svalero.leaguemanagement.model.LeagueModel;
import es.svalero.leaguemanagement.model.LeagueSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the League service. Represents a row in the &quot;LM_League&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link es.svalero.leaguemanagement.model.LeagueModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link LeagueImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LeagueImpl
 * @see es.svalero.leaguemanagement.model.League
 * @see es.svalero.leaguemanagement.model.LeagueModel
 * @generated
 */
@JSON(strict = true)
public class LeagueModelImpl extends BaseModelImpl<League>
    implements LeagueModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a league model instance should use the {@link es.svalero.leaguemanagement.model.League} interface instead.
     */
    public static final String TABLE_NAME = "LM_League";
    public static final Object[][] TABLE_COLUMNS = {
            { "uuid_", Types.VARCHAR },
            { "leagueId", Types.BIGINT },
            { "groupId", Types.BIGINT },
            { "companyId", Types.BIGINT },
            { "userId", Types.BIGINT },
            { "userName", Types.VARCHAR },
            { "createDate", Types.TIMESTAMP },
            { "modifiedDate", Types.TIMESTAMP },
            { "name", Types.VARCHAR }
        };
    public static final String TABLE_SQL_CREATE = "create table LM_League (uuid_ VARCHAR(75) null,leagueId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,name VARCHAR(75) null)";
    public static final String TABLE_SQL_DROP = "drop table LM_League";
    public static final String ORDER_BY_JPQL = " ORDER BY league.leagueId ASC";
    public static final String ORDER_BY_SQL = " ORDER BY LM_League.leagueId ASC";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.es.svalero.leaguemanagement.model.League"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.es.svalero.leaguemanagement.model.League"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.column.bitmask.enabled.es.svalero.leaguemanagement.model.League"),
            true);
    public static long COMPANYID_COLUMN_BITMASK = 1L;
    public static long GROUPID_COLUMN_BITMASK = 2L;
    public static long UUID_COLUMN_BITMASK = 4L;
    public static long LEAGUEID_COLUMN_BITMASK = 8L;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.es.svalero.leaguemanagement.model.League"));
    private static ClassLoader _classLoader = League.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] { League.class };
    private String _uuid;
    private String _originalUuid;
    private long _leagueId;
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
    private String _name;
    private long _columnBitmask;
    private League _escapedModel;

    public LeagueModelImpl() {
    }

    /**
     * Converts the soap model instance into a normal model instance.
     *
     * @param soapModel the soap model instance to convert
     * @return the normal model instance
     */
    public static League toModel(LeagueSoap soapModel) {
        if (soapModel == null) {
            return null;
        }

        League model = new LeagueImpl();

        model.setUuid(soapModel.getUuid());
        model.setLeagueId(soapModel.getLeagueId());
        model.setGroupId(soapModel.getGroupId());
        model.setCompanyId(soapModel.getCompanyId());
        model.setUserId(soapModel.getUserId());
        model.setUserName(soapModel.getUserName());
        model.setCreateDate(soapModel.getCreateDate());
        model.setModifiedDate(soapModel.getModifiedDate());
        model.setName(soapModel.getName());

        return model;
    }

    /**
     * Converts the soap model instances into normal model instances.
     *
     * @param soapModels the soap model instances to convert
     * @return the normal model instances
     */
    public static List<League> toModels(LeagueSoap[] soapModels) {
        if (soapModels == null) {
            return null;
        }

        List<League> models = new ArrayList<League>(soapModels.length);

        for (LeagueSoap soapModel : soapModels) {
            models.add(toModel(soapModel));
        }

        return models;
    }

    @Override
    public long getPrimaryKey() {
        return _leagueId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setLeagueId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _leagueId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Class<?> getModelClass() {
        return League.class;
    }

    @Override
    public String getModelClassName() {
        return League.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("uuid", getUuid());
        attributes.put("leagueId", getLeagueId());
        attributes.put("groupId", getGroupId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("userName", getUserName());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("name", getName());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String uuid = (String) attributes.get("uuid");

        if (uuid != null) {
            setUuid(uuid);
        }

        Long leagueId = (Long) attributes.get("leagueId");

        if (leagueId != null) {
            setLeagueId(leagueId);
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

        String name = (String) attributes.get("name");

        if (name != null) {
            setName(name);
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
    public long getLeagueId() {
        return _leagueId;
    }

    @Override
    public void setLeagueId(long leagueId) {
        _leagueId = leagueId;
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
    public String getName() {
        if (_name == null) {
            return StringPool.BLANK;
        } else {
            return _name;
        }
    }

    @Override
    public void setName(String name) {
        _name = name;
    }

    @Override
    public StagedModelType getStagedModelType() {
        return new StagedModelType(PortalUtil.getClassNameId(
                League.class.getName()));
    }

    public long getColumnBitmask() {
        return _columnBitmask;
    }

    @Override
    public ExpandoBridge getExpandoBridge() {
        return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
            League.class.getName(), getPrimaryKey());
    }

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        ExpandoBridge expandoBridge = getExpandoBridge();

        expandoBridge.setAttributes(serviceContext);
    }

    @Override
    public League toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (League) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        LeagueImpl leagueImpl = new LeagueImpl();

        leagueImpl.setUuid(getUuid());
        leagueImpl.setLeagueId(getLeagueId());
        leagueImpl.setGroupId(getGroupId());
        leagueImpl.setCompanyId(getCompanyId());
        leagueImpl.setUserId(getUserId());
        leagueImpl.setUserName(getUserName());
        leagueImpl.setCreateDate(getCreateDate());
        leagueImpl.setModifiedDate(getModifiedDate());
        leagueImpl.setName(getName());

        leagueImpl.resetOriginalValues();

        return leagueImpl;
    }

    @Override
    public int compareTo(League league) {
        long primaryKey = league.getPrimaryKey();

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

        if (!(obj instanceof League)) {
            return false;
        }

        League league = (League) obj;

        long primaryKey = league.getPrimaryKey();

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
        LeagueModelImpl leagueModelImpl = this;

        leagueModelImpl._originalUuid = leagueModelImpl._uuid;

        leagueModelImpl._originalGroupId = leagueModelImpl._groupId;

        leagueModelImpl._setOriginalGroupId = false;

        leagueModelImpl._originalCompanyId = leagueModelImpl._companyId;

        leagueModelImpl._setOriginalCompanyId = false;

        leagueModelImpl._columnBitmask = 0;
    }

    @Override
    public CacheModel<League> toCacheModel() {
        LeagueCacheModel leagueCacheModel = new LeagueCacheModel();

        leagueCacheModel.uuid = getUuid();

        String uuid = leagueCacheModel.uuid;

        if ((uuid != null) && (uuid.length() == 0)) {
            leagueCacheModel.uuid = null;
        }

        leagueCacheModel.leagueId = getLeagueId();

        leagueCacheModel.groupId = getGroupId();

        leagueCacheModel.companyId = getCompanyId();

        leagueCacheModel.userId = getUserId();

        leagueCacheModel.userName = getUserName();

        String userName = leagueCacheModel.userName;

        if ((userName != null) && (userName.length() == 0)) {
            leagueCacheModel.userName = null;
        }

        Date createDate = getCreateDate();

        if (createDate != null) {
            leagueCacheModel.createDate = createDate.getTime();
        } else {
            leagueCacheModel.createDate = Long.MIN_VALUE;
        }

        Date modifiedDate = getModifiedDate();

        if (modifiedDate != null) {
            leagueCacheModel.modifiedDate = modifiedDate.getTime();
        } else {
            leagueCacheModel.modifiedDate = Long.MIN_VALUE;
        }

        leagueCacheModel.name = getName();

        String name = leagueCacheModel.name;

        if ((name != null) && (name.length() == 0)) {
            leagueCacheModel.name = null;
        }

        return leagueCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(19);

        sb.append("{uuid=");
        sb.append(getUuid());
        sb.append(", leagueId=");
        sb.append(getLeagueId());
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
        sb.append(", name=");
        sb.append(getName());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(31);

        sb.append("<model><model-name>");
        sb.append("es.svalero.leaguemanagement.model.League");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>uuid</column-name><column-value><![CDATA[");
        sb.append(getUuid());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>leagueId</column-name><column-value><![CDATA[");
        sb.append(getLeagueId());
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
            "<column><column-name>name</column-name><column-value><![CDATA[");
        sb.append(getName());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}