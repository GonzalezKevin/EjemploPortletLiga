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
import es.svalero.leaguemanagement.service.MatchLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class MatchClp extends BaseModelImpl<Match> implements Match {
    private String _uuid;
    private long _matchId;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userUuid;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private long _localTeamId;
    private long _visitingTeamId;
    private int _localScore;
    private int _visitingScore;
    private BaseModel<?> _matchRemoteModel;
    private Class<?> _clpSerializerClass = es.svalero.leaguemanagement.service.ClpSerializer.class;

    public MatchClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return Match.class;
    }

    @Override
    public String getModelClassName() {
        return Match.class.getName();
    }

    @Override
    public long getPrimaryKey() {
        return _matchId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setMatchId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _matchId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("uuid", getUuid());
        attributes.put("matchId", getMatchId());
        attributes.put("groupId", getGroupId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("userName", getUserName());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("localTeamId", getLocalTeamId());
        attributes.put("visitingTeamId", getVisitingTeamId());
        attributes.put("localScore", getLocalScore());
        attributes.put("visitingScore", getVisitingScore());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String uuid = (String) attributes.get("uuid");

        if (uuid != null) {
            setUuid(uuid);
        }

        Long matchId = (Long) attributes.get("matchId");

        if (matchId != null) {
            setMatchId(matchId);
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

        Long localTeamId = (Long) attributes.get("localTeamId");

        if (localTeamId != null) {
            setLocalTeamId(localTeamId);
        }

        Long visitingTeamId = (Long) attributes.get("visitingTeamId");

        if (visitingTeamId != null) {
            setVisitingTeamId(visitingTeamId);
        }

        Integer localScore = (Integer) attributes.get("localScore");

        if (localScore != null) {
            setLocalScore(localScore);
        }

        Integer visitingScore = (Integer) attributes.get("visitingScore");

        if (visitingScore != null) {
            setVisitingScore(visitingScore);
        }
    }

    @Override
    public String getUuid() {
        return _uuid;
    }

    @Override
    public void setUuid(String uuid) {
        _uuid = uuid;

        if (_matchRemoteModel != null) {
            try {
                Class<?> clazz = _matchRemoteModel.getClass();

                Method method = clazz.getMethod("setUuid", String.class);

                method.invoke(_matchRemoteModel, uuid);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getMatchId() {
        return _matchId;
    }

    @Override
    public void setMatchId(long matchId) {
        _matchId = matchId;

        if (_matchRemoteModel != null) {
            try {
                Class<?> clazz = _matchRemoteModel.getClass();

                Method method = clazz.getMethod("setMatchId", long.class);

                method.invoke(_matchRemoteModel, matchId);
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

        if (_matchRemoteModel != null) {
            try {
                Class<?> clazz = _matchRemoteModel.getClass();

                Method method = clazz.getMethod("setGroupId", long.class);

                method.invoke(_matchRemoteModel, groupId);
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

        if (_matchRemoteModel != null) {
            try {
                Class<?> clazz = _matchRemoteModel.getClass();

                Method method = clazz.getMethod("setCompanyId", long.class);

                method.invoke(_matchRemoteModel, companyId);
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

        if (_matchRemoteModel != null) {
            try {
                Class<?> clazz = _matchRemoteModel.getClass();

                Method method = clazz.getMethod("setUserId", long.class);

                method.invoke(_matchRemoteModel, userId);
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

        if (_matchRemoteModel != null) {
            try {
                Class<?> clazz = _matchRemoteModel.getClass();

                Method method = clazz.getMethod("setUserName", String.class);

                method.invoke(_matchRemoteModel, userName);
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

        if (_matchRemoteModel != null) {
            try {
                Class<?> clazz = _matchRemoteModel.getClass();

                Method method = clazz.getMethod("setCreateDate", Date.class);

                method.invoke(_matchRemoteModel, createDate);
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

        if (_matchRemoteModel != null) {
            try {
                Class<?> clazz = _matchRemoteModel.getClass();

                Method method = clazz.getMethod("setModifiedDate", Date.class);

                method.invoke(_matchRemoteModel, modifiedDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getLocalTeamId() {
        return _localTeamId;
    }

    @Override
    public void setLocalTeamId(long localTeamId) {
        _localTeamId = localTeamId;

        if (_matchRemoteModel != null) {
            try {
                Class<?> clazz = _matchRemoteModel.getClass();

                Method method = clazz.getMethod("setLocalTeamId", long.class);

                method.invoke(_matchRemoteModel, localTeamId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getVisitingTeamId() {
        return _visitingTeamId;
    }

    @Override
    public void setVisitingTeamId(long visitingTeamId) {
        _visitingTeamId = visitingTeamId;

        if (_matchRemoteModel != null) {
            try {
                Class<?> clazz = _matchRemoteModel.getClass();

                Method method = clazz.getMethod("setVisitingTeamId", long.class);

                method.invoke(_matchRemoteModel, visitingTeamId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getLocalScore() {
        return _localScore;
    }

    @Override
    public void setLocalScore(int localScore) {
        _localScore = localScore;

        if (_matchRemoteModel != null) {
            try {
                Class<?> clazz = _matchRemoteModel.getClass();

                Method method = clazz.getMethod("setLocalScore", int.class);

                method.invoke(_matchRemoteModel, localScore);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getVisitingScore() {
        return _visitingScore;
    }

    @Override
    public void setVisitingScore(int visitingScore) {
        _visitingScore = visitingScore;

        if (_matchRemoteModel != null) {
            try {
                Class<?> clazz = _matchRemoteModel.getClass();

                Method method = clazz.getMethod("setVisitingScore", int.class);

                method.invoke(_matchRemoteModel, visitingScore);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public StagedModelType getStagedModelType() {
        return new StagedModelType(PortalUtil.getClassNameId(
                Match.class.getName()));
    }

    public BaseModel<?> getMatchRemoteModel() {
        return _matchRemoteModel;
    }

    public void setMatchRemoteModel(BaseModel<?> matchRemoteModel) {
        _matchRemoteModel = matchRemoteModel;
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

        Class<?> remoteModelClass = _matchRemoteModel.getClass();

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

        Object returnValue = method.invoke(_matchRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            MatchLocalServiceUtil.addMatch(this);
        } else {
            MatchLocalServiceUtil.updateMatch(this);
        }
    }

    @Override
    public Match toEscapedModel() {
        return (Match) ProxyUtil.newProxyInstance(Match.class.getClassLoader(),
            new Class[] { Match.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        MatchClp clone = new MatchClp();

        clone.setUuid(getUuid());
        clone.setMatchId(getMatchId());
        clone.setGroupId(getGroupId());
        clone.setCompanyId(getCompanyId());
        clone.setUserId(getUserId());
        clone.setUserName(getUserName());
        clone.setCreateDate(getCreateDate());
        clone.setModifiedDate(getModifiedDate());
        clone.setLocalTeamId(getLocalTeamId());
        clone.setVisitingTeamId(getVisitingTeamId());
        clone.setLocalScore(getLocalScore());
        clone.setVisitingScore(getVisitingScore());

        return clone;
    }

    @Override
    public int compareTo(Match match) {
        long primaryKey = match.getPrimaryKey();

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

        if (!(obj instanceof MatchClp)) {
            return false;
        }

        MatchClp match = (MatchClp) obj;

        long primaryKey = match.getPrimaryKey();

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
        StringBundler sb = new StringBundler(25);

        sb.append("{uuid=");
        sb.append(getUuid());
        sb.append(", matchId=");
        sb.append(getMatchId());
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
        sb.append(", localTeamId=");
        sb.append(getLocalTeamId());
        sb.append(", visitingTeamId=");
        sb.append(getVisitingTeamId());
        sb.append(", localScore=");
        sb.append(getLocalScore());
        sb.append(", visitingScore=");
        sb.append(getVisitingScore());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(40);

        sb.append("<model><model-name>");
        sb.append("es.svalero.leaguemanagement.model.Match");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>uuid</column-name><column-value><![CDATA[");
        sb.append(getUuid());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>matchId</column-name><column-value><![CDATA[");
        sb.append(getMatchId());
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
            "<column><column-name>localTeamId</column-name><column-value><![CDATA[");
        sb.append(getLocalTeamId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>visitingTeamId</column-name><column-value><![CDATA[");
        sb.append(getVisitingTeamId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>localScore</column-name><column-value><![CDATA[");
        sb.append(getLocalScore());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>visitingScore</column-name><column-value><![CDATA[");
        sb.append(getVisitingScore());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
