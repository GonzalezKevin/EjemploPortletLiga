package es.svalero.leaguemanagement.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link es.svalero.leaguemanagement.service.http.LeagueDayServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see es.svalero.leaguemanagement.service.http.LeagueDayServiceSoap
 * @generated
 */
public class LeagueDaySoap implements Serializable {
    private String _uuid;
    private long _leagueDayId;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private long _leagueId;
    private String _number;

    public LeagueDaySoap() {
    }

    public static LeagueDaySoap toSoapModel(LeagueDay model) {
        LeagueDaySoap soapModel = new LeagueDaySoap();

        soapModel.setUuid(model.getUuid());
        soapModel.setLeagueDayId(model.getLeagueDayId());
        soapModel.setGroupId(model.getGroupId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setUserId(model.getUserId());
        soapModel.setUserName(model.getUserName());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setModifiedDate(model.getModifiedDate());
        soapModel.setLeagueId(model.getLeagueId());
        soapModel.setNumber(model.getNumber());

        return soapModel;
    }

    public static LeagueDaySoap[] toSoapModels(LeagueDay[] models) {
        LeagueDaySoap[] soapModels = new LeagueDaySoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static LeagueDaySoap[][] toSoapModels(LeagueDay[][] models) {
        LeagueDaySoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new LeagueDaySoap[models.length][models[0].length];
        } else {
            soapModels = new LeagueDaySoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static LeagueDaySoap[] toSoapModels(List<LeagueDay> models) {
        List<LeagueDaySoap> soapModels = new ArrayList<LeagueDaySoap>(models.size());

        for (LeagueDay model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new LeagueDaySoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _leagueDayId;
    }

    public void setPrimaryKey(long pk) {
        setLeagueDayId(pk);
    }

    public String getUuid() {
        return _uuid;
    }

    public void setUuid(String uuid) {
        _uuid = uuid;
    }

    public long getLeagueDayId() {
        return _leagueDayId;
    }

    public void setLeagueDayId(long leagueDayId) {
        _leagueDayId = leagueDayId;
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

    public long getLeagueId() {
        return _leagueId;
    }

    public void setLeagueId(long leagueId) {
        _leagueId = leagueId;
    }

    public String getNumber() {
        return _number;
    }

    public void setNumber(String number) {
        _number = number;
    }
}
