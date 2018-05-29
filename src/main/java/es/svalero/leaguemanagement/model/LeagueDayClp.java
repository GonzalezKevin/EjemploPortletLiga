package es.svalero.leaguemanagement.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import es.svalero.leaguemanagement.service.ClpSerializer;
import es.svalero.leaguemanagement.service.LeagueDayLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class LeagueDayClp extends BaseModelImpl<LeagueDay> implements LeagueDay {
    private String _uuid;
    private long _leagueDayId;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userUuid;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private long _leagueId;
    private String _number;
    private BaseModel<?> _leagueDayRemoteModel;
    private Class<?> _clpSerializerClass = es.svalero.leaguemanagement.service.ClpSerializer.class;

    public LeagueDayClp() {
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

    @Override
    public String getUuid() {
        return _uuid;
    }

    @Override
    public void setUuid(String uuid) {
        _uuid = uuid;

        if (_leagueDayRemoteModel != null) {
            try {
                Class<?> clazz = _leagueDayRemoteModel.getClass();

                Method method = clazz.getMethod("setUuid", String.class);

                method.invoke(_leagueDayRemoteModel, uuid);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getLeagueDayId() {
        return _leagueDayId;
    }

    @Override
    public void setLeagueDayId(long leagueDayId) {
        _leagueDayId = leagueDayId;

        if (_leagueDayRemoteModel != null) {
            try {
                Class<?> clazz = _leagueDayRemoteModel.getClass();

                Method method = clazz.getMethod("setLeagueDayId", long.class);

                method.invoke(_leagueDayRemoteModel, leagueDayId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getGroupId() {
        return _groupId;
    }

    @Override
    public void setGroupId(long groupId) {
        _groupId = groupId;

        if (_leagueDayRemoteModel != null) {
            try {
                Class<?> clazz = _leagueDayRemoteModel.getClass();

                Method method = clazz.getMethod("setGroupId", long.class);

                method.invoke(_leagueDayRemoteModel, groupId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getCompanyId() {
        return _companyId;
    }

    @Override
    public void setCompanyId(long companyId) {
        _companyId = companyId;

        if (_leagueDayRemoteModel != null) {
            try {
                Class<?> clazz = _leagueDayRemoteModel.getClass();

                Method method = clazz.getMethod("setCompanyId", long.class);

                method.invoke(_leagueDayRemoteModel, companyId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getUserId() {
        return _userId;
    }

    @Override
    public void setUserId(long userId) {
        _userId = userId;

        if (_leagueDayRemoteModel != null) {
            try {
                Class<?> clazz = _leagueDayRemoteModel.getClass();

                Method method = clazz.getMethod("setUserId", long.class);

                method.invoke(_leagueDayRemoteModel, userId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getUserUuid() throws SystemException {
        return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
    }

    @Override
    public void setUserUuid(String userUuid) {
        _userUuid = userUuid;
    }

    @Override
    public String getUserName() {
        return _userName;
    }

    @Override
    public void setUserName(String userName) {
        _userName = userName;

        if (_leagueDayRemoteModel != null) {
            try {
                Class<?> clazz = _leagueDayRemoteModel.getClass();

                Method method = clazz.getMethod("setUserName", String.class);

                method.invoke(_leagueDayRemoteModel, userName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getCreateDate() {
        return _createDate;
    }

    @Override
    public void setCreateDate(Date createDate) {
        _createDate = createDate;

        if (_leagueDayRemoteModel != null) {
            try {
                Class<?> clazz = _leagueDayRemoteModel.getClass();

                Method method = clazz.getMethod("setCreateDate", Date.class);

                method.invoke(_leagueDayRemoteModel, createDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getModifiedDate() {
        return _modifiedDate;
    }

    @Override
    public void setModifiedDate(Date modifiedDate) {
        _modifiedDate = modifiedDate;

        if (_leagueDayRemoteModel != null) {
            try {
                Class<?> clazz = _leagueDayRemoteModel.getClass();

                Method method = clazz.getMethod("setModifiedDate", Date.class);

                method.invoke(_leagueDayRemoteModel, modifiedDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getLeagueId() {
        return _leagueId;
    }

    @Override
    public void setLeagueId(long leagueId) {
        _leagueId = leagueId;

        if (_leagueDayRemoteModel != null) {
            try {
                Class<?> clazz = _leagueDayRemoteModel.getClass();

                Method method = clazz.getMethod("setLeagueId", long.class);

                method.invoke(_leagueDayRemoteModel, leagueId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getNumber() {
        return _number;
    }

    @Override
    public void setNumber(String number) {
        _number = number;

        if (_leagueDayRemoteModel != null) {
            try {
                Class<?> clazz = _leagueDayRemoteModel.getClass();

                Method method = clazz.getMethod("setNumber", String.class);

                method.invoke(_leagueDayRemoteModel, number);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public StagedModelType getStagedModelType() {
        return new StagedModelType(PortalUtil.getClassNameId(
                LeagueDay.class.getName()));
    }

    public BaseModel<?> getLeagueDayRemoteModel() {
        return _leagueDayRemoteModel;
    }

    public void setLeagueDayRemoteModel(BaseModel<?> leagueDayRemoteModel) {
        _leagueDayRemoteModel = leagueDayRemoteModel;
    }

    public Object invokeOnRemoteModel(String methodName,
        Class<?>[] parameterTypes, Object[] parameterValues)
        throws Exception {
        Object[] remoteParameterValues = new Object[parameterValues.length];

        for (int i = 0; i < parameterValues.length; i++) {
            if (parameterValues[i] != null) {
                remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
            }
        }

        Class<?> remoteModelClass = _leagueDayRemoteModel.getClass();

        ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

        Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i].isPrimitive()) {
                remoteParameterTypes[i] = parameterTypes[i];
            } else {
                String parameterTypeName = parameterTypes[i].getName();

                remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
            }
        }

        Method method = remoteModelClass.getMethod(methodName,
                remoteParameterTypes);

        Object returnValue = method.invoke(_leagueDayRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            LeagueDayLocalServiceUtil.addLeagueDay(this);
        } else {
            LeagueDayLocalServiceUtil.updateLeagueDay(this);
        }
    }

    @Override
    public LeagueDay toEscapedModel() {
        return (LeagueDay) ProxyUtil.newProxyInstance(LeagueDay.class.getClassLoader(),
            new Class[] { LeagueDay.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        LeagueDayClp clone = new LeagueDayClp();

        clone.setUuid(getUuid());
        clone.setLeagueDayId(getLeagueDayId());
        clone.setGroupId(getGroupId());
        clone.setCompanyId(getCompanyId());
        clone.setUserId(getUserId());
        clone.setUserName(getUserName());
        clone.setCreateDate(getCreateDate());
        clone.setModifiedDate(getModifiedDate());
        clone.setLeagueId(getLeagueId());
        clone.setNumber(getNumber());

        return clone;
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

        if (!(obj instanceof LeagueDayClp)) {
            return false;
        }

        LeagueDayClp leagueDay = (LeagueDayClp) obj;

        long primaryKey = leagueDay.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    public Class<?> getClpSerializerClass() {
        return _clpSerializerClass;
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
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
