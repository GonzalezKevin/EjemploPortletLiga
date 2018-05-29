package es.svalero.leaguemanagement.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link es.svalero.leaguemanagement.service.http.LeagueServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see es.svalero.leaguemanagement.service.http.LeagueServiceSoap
 * @generated
 */
public class LeagueSoap implements Serializable {
    private String _uuid;
    private long _leagueId;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private String _name;

    public LeagueSoap() {
    }

    public static LeagueSoap toSoapModel(League model) {
        LeagueSoap soapModel = new LeagueSoap();

        soapModel.setUuid(model.getUuid());
        soapModel.setLeagueId(model.getLeagueId());
        soapModel.setGroupId(model.getGroupId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setUserId(model.getUserId());
        soapModel.setUserName(model.getUserName());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setModifiedDate(model.getModifiedDate());
        soapModel.setName(model.getName());

        return soapModel;
    }

    public static LeagueSoap[] toSoapModels(League[] models) {
        LeagueSoap[] soapModels = new LeagueSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static LeagueSoap[][] toSoapModels(League[][] models) {
        LeagueSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new LeagueSoap[models.length][models[0].length];
        } else {
            soapModels = new LeagueSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static LeagueSoap[] toSoapModels(List<League> models) {
        List<LeagueSoap> soapModels = new ArrayList<LeagueSoap>(models.size());

        for (League model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new LeagueSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _leagueId;
    }

    public void setPrimaryKey(long pk) {
        setLeagueId(pk);
    }

    public String getUuid() {
        return _uuid;
    }

    public void setUuid(String uuid) {
        _uuid = uuid;
    }

    public long getLeagueId() {
        return _leagueId;
    }

    public void setLeagueId(long leagueId) {
        _leagueId = leagueId;
    }

    public long getGroupId() {
        return _groupId;
    }

    public void setGroupId(long groupId) {
        _groupId = groupId;
    }

    public long getCompanyId() {
        return _companyId;
    }

    public void setCompanyId(long companyId) {
        _companyId = companyId;
    }

    public long getUserId() {
        return _userId;
    }

    public void setUserId(long userId) {
        _userId = userId;
    }

    public String getUserName() {
        return _userName;
    }

    public void setUserName(String userName) {
        _userName = userName;
    }

    public Date getCreateDate() {
        return _createDate;
    }

    public void setCreateDate(Date createDate) {
        _createDate = createDate;
    }

    public Date getModifiedDate() {
        return _modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        _modifiedDate = modifiedDate;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }
}
