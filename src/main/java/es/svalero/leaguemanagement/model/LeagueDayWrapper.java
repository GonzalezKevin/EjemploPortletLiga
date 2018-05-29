package es.svalero.leaguemanagement.model;

import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link LeagueDay}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LeagueDay
 * @generated
 */
public class LeagueDayWrapper implements LeagueDay, ModelWrapper<LeagueDay> {
    private LeagueDay _leagueDay;

    public LeagueDayWrapper(LeagueDay leagueDay) {
        _leagueDay = leagueDay;
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

    /**
    * Returns the primary key of this league day.
    *
    * @return the primary key of this league day
    */
    @Override
    public long getPrimaryKey() {
        return _leagueDay.getPrimaryKey();
    }

    /**
    * Sets the primary key of this league day.
    *
    * @param primaryKey the primary key of this league day
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _leagueDay.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the uuid of this league day.
    *
    * @return the uuid of this league day
    */
    @Override
    public java.lang.String getUuid() {
        return _leagueDay.getUuid();
    }

    /**
    * Sets the uuid of this league day.
    *
    * @param uuid the uuid of this league day
    */
    @Override
    public void setUuid(java.lang.String uuid) {
        _leagueDay.setUuid(uuid);
    }

    /**
    * Returns the league day ID of this league day.
    *
    * @return the league day ID of this league day
    */
    @Override
    public long getLeagueDayId() {
        return _leagueDay.getLeagueDayId();
    }

    /**
    * Sets the league day ID of this league day.
    *
    * @param leagueDayId the league day ID of this league day
    */
    @Override
    public void setLeagueDayId(long leagueDayId) {
        _leagueDay.setLeagueDayId(leagueDayId);
    }

    /**
    * Returns the group ID of this league day.
    *
    * @return the group ID of this league day
    */
    @Override
    public long getGroupId() {
        return _leagueDay.getGroupId();
    }

    /**
    * Sets the group ID of this league day.
    *
    * @param groupId the group ID of this league day
    */
    @Override
    public void setGroupId(long groupId) {
        _leagueDay.setGroupId(groupId);
    }

    /**
    * Returns the company ID of this league day.
    *
    * @return the company ID of this league day
    */
    @Override
    public long getCompanyId() {
        return _leagueDay.getCompanyId();
    }

    /**
    * Sets the company ID of this league day.
    *
    * @param companyId the company ID of this league day
    */
    @Override
    public void setCompanyId(long companyId) {
        _leagueDay.setCompanyId(companyId);
    }

    /**
    * Returns the user ID of this league day.
    *
    * @return the user ID of this league day
    */
    @Override
    public long getUserId() {
        return _leagueDay.getUserId();
    }

    /**
    * Sets the user ID of this league day.
    *
    * @param userId the user ID of this league day
    */
    @Override
    public void setUserId(long userId) {
        _leagueDay.setUserId(userId);
    }

    /**
    * Returns the user uuid of this league day.
    *
    * @return the user uuid of this league day
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _leagueDay.getUserUuid();
    }

    /**
    * Sets the user uuid of this league day.
    *
    * @param userUuid the user uuid of this league day
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _leagueDay.setUserUuid(userUuid);
    }

    /**
    * Returns the user name of this league day.
    *
    * @return the user name of this league day
    */
    @Override
    public java.lang.String getUserName() {
        return _leagueDay.getUserName();
    }

    /**
    * Sets the user name of this league day.
    *
    * @param userName the user name of this league day
    */
    @Override
    public void setUserName(java.lang.String userName) {
        _leagueDay.setUserName(userName);
    }

    /**
    * Returns the create date of this league day.
    *
    * @return the create date of this league day
    */
    @Override
    public java.util.Date getCreateDate() {
        return _leagueDay.getCreateDate();
    }

    /**
    * Sets the create date of this league day.
    *
    * @param createDate the create date of this league day
    */
    @Override
    public void setCreateDate(java.util.Date createDate) {
        _leagueDay.setCreateDate(createDate);
    }

    /**
    * Returns the modified date of this league day.
    *
    * @return the modified date of this league day
    */
    @Override
    public java.util.Date getModifiedDate() {
        return _leagueDay.getModifiedDate();
    }

    /**
    * Sets the modified date of this league day.
    *
    * @param modifiedDate the modified date of this league day
    */
    @Override
    public void setModifiedDate(java.util.Date modifiedDate) {
        _leagueDay.setModifiedDate(modifiedDate);
    }

    /**
    * Returns the league ID of this league day.
    *
    * @return the league ID of this league day
    */
    @Override
    public long getLeagueId() {
        return _leagueDay.getLeagueId();
    }

    /**
    * Sets the league ID of this league day.
    *
    * @param leagueId the league ID of this league day
    */
    @Override
    public void setLeagueId(long leagueId) {
        _leagueDay.setLeagueId(leagueId);
    }

    /**
    * Returns the number of this league day.
    *
    * @return the number of this league day
    */
    @Override
    public java.lang.String getNumber() {
        return _leagueDay.getNumber();
    }

    /**
    * Sets the number of this league day.
    *
    * @param number the number of this league day
    */
    @Override
    public void setNumber(java.lang.String number) {
        _leagueDay.setNumber(number);
    }

    @Override
    public boolean isNew() {
        return _leagueDay.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _leagueDay.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _leagueDay.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _leagueDay.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _leagueDay.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _leagueDay.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _leagueDay.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _leagueDay.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _leagueDay.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _leagueDay.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _leagueDay.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new LeagueDayWrapper((LeagueDay) _leagueDay.clone());
    }

    @Override
    public int compareTo(es.svalero.leaguemanagement.model.LeagueDay leagueDay) {
        return _leagueDay.compareTo(leagueDay);
    }

    @Override
    public int hashCode() {
        return _leagueDay.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<es.svalero.leaguemanagement.model.LeagueDay> toCacheModel() {
        return _leagueDay.toCacheModel();
    }

    @Override
    public es.svalero.leaguemanagement.model.LeagueDay toEscapedModel() {
        return new LeagueDayWrapper(_leagueDay.toEscapedModel());
    }

    @Override
    public es.svalero.leaguemanagement.model.LeagueDay toUnescapedModel() {
        return new LeagueDayWrapper(_leagueDay.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _leagueDay.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _leagueDay.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _leagueDay.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof LeagueDayWrapper)) {
            return false;
        }

        LeagueDayWrapper leagueDayWrapper = (LeagueDayWrapper) obj;

        if (Validator.equals(_leagueDay, leagueDayWrapper._leagueDay)) {
            return true;
        }

        return false;
    }

    @Override
    public StagedModelType getStagedModelType() {
        return _leagueDay.getStagedModelType();
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public LeagueDay getWrappedLeagueDay() {
        return _leagueDay;
    }

    @Override
    public LeagueDay getWrappedModel() {
        return _leagueDay;
    }

    @Override
    public void resetOriginalValues() {
        _leagueDay.resetOriginalValues();
    }
}
