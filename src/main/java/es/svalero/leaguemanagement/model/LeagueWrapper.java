package es.svalero.leaguemanagement.model;

import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link League}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see League
 * @generated
 */
public class LeagueWrapper implements League, ModelWrapper<League> {
    private League _league;

    public LeagueWrapper(League league) {
        _league = league;
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

    /**
    * Returns the primary key of this league.
    *
    * @return the primary key of this league
    */
    @Override
    public long getPrimaryKey() {
        return _league.getPrimaryKey();
    }

    /**
    * Sets the primary key of this league.
    *
    * @param primaryKey the primary key of this league
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _league.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the uuid of this league.
    *
    * @return the uuid of this league
    */
    @Override
    public java.lang.String getUuid() {
        return _league.getUuid();
    }

    /**
    * Sets the uuid of this league.
    *
    * @param uuid the uuid of this league
    */
    @Override
    public void setUuid(java.lang.String uuid) {
        _league.setUuid(uuid);
    }

    /**
    * Returns the league ID of this league.
    *
    * @return the league ID of this league
    */
    @Override
    public long getLeagueId() {
        return _league.getLeagueId();
    }

    /**
    * Sets the league ID of this league.
    *
    * @param leagueId the league ID of this league
    */
    @Override
    public void setLeagueId(long leagueId) {
        _league.setLeagueId(leagueId);
    }

    /**
    * Returns the group ID of this league.
    *
    * @return the group ID of this league
    */
    @Override
    public long getGroupId() {
        return _league.getGroupId();
    }

    /**
    * Sets the group ID of this league.
    *
    * @param groupId the group ID of this league
    */
    @Override
    public void setGroupId(long groupId) {
        _league.setGroupId(groupId);
    }

    /**
    * Returns the company ID of this league.
    *
    * @return the company ID of this league
    */
    @Override
    public long getCompanyId() {
        return _league.getCompanyId();
    }

    /**
    * Sets the company ID of this league.
    *
    * @param companyId the company ID of this league
    */
    @Override
    public void setCompanyId(long companyId) {
        _league.setCompanyId(companyId);
    }

    /**
    * Returns the user ID of this league.
    *
    * @return the user ID of this league
    */
    @Override
    public long getUserId() {
        return _league.getUserId();
    }

    /**
    * Sets the user ID of this league.
    *
    * @param userId the user ID of this league
    */
    @Override
    public void setUserId(long userId) {
        _league.setUserId(userId);
    }

    /**
    * Returns the user uuid of this league.
    *
    * @return the user uuid of this league
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _league.getUserUuid();
    }

    /**
    * Sets the user uuid of this league.
    *
    * @param userUuid the user uuid of this league
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _league.setUserUuid(userUuid);
    }

    /**
    * Returns the user name of this league.
    *
    * @return the user name of this league
    */
    @Override
    public java.lang.String getUserName() {
        return _league.getUserName();
    }

    /**
    * Sets the user name of this league.
    *
    * @param userName the user name of this league
    */
    @Override
    public void setUserName(java.lang.String userName) {
        _league.setUserName(userName);
    }

    /**
    * Returns the create date of this league.
    *
    * @return the create date of this league
    */
    @Override
    public java.util.Date getCreateDate() {
        return _league.getCreateDate();
    }

    /**
    * Sets the create date of this league.
    *
    * @param createDate the create date of this league
    */
    @Override
    public void setCreateDate(java.util.Date createDate) {
        _league.setCreateDate(createDate);
    }

    /**
    * Returns the modified date of this league.
    *
    * @return the modified date of this league
    */
    @Override
    public java.util.Date getModifiedDate() {
        return _league.getModifiedDate();
    }

    /**
    * Sets the modified date of this league.
    *
    * @param modifiedDate the modified date of this league
    */
    @Override
    public void setModifiedDate(java.util.Date modifiedDate) {
        _league.setModifiedDate(modifiedDate);
    }

    /**
    * Returns the name of this league.
    *
    * @return the name of this league
    */
    @Override
    public java.lang.String getName() {
        return _league.getName();
    }

    /**
    * Sets the name of this league.
    *
    * @param name the name of this league
    */
    @Override
    public void setName(java.lang.String name) {
        _league.setName(name);
    }

    @Override
    public boolean isNew() {
        return _league.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _league.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _league.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _league.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _league.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _league.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _league.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _league.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _league.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _league.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _league.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new LeagueWrapper((League) _league.clone());
    }

    @Override
    public int compareTo(es.svalero.leaguemanagement.model.League league) {
        return _league.compareTo(league);
    }

    @Override
    public int hashCode() {
        return _league.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<es.svalero.leaguemanagement.model.League> toCacheModel() {
        return _league.toCacheModel();
    }

    @Override
    public es.svalero.leaguemanagement.model.League toEscapedModel() {
        return new LeagueWrapper(_league.toEscapedModel());
    }

    @Override
    public es.svalero.leaguemanagement.model.League toUnescapedModel() {
        return new LeagueWrapper(_league.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _league.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _league.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _league.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof LeagueWrapper)) {
            return false;
        }

        LeagueWrapper leagueWrapper = (LeagueWrapper) obj;

        if (Validator.equals(_league, leagueWrapper._league)) {
            return true;
        }

        return false;
    }

    @Override
    public StagedModelType getStagedModelType() {
        return _league.getStagedModelType();
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public League getWrappedLeague() {
        return _league;
    }

    @Override
    public League getWrappedModel() {
        return _league;
    }

    @Override
    public void resetOriginalValues() {
        _league.resetOriginalValues();
    }
}
