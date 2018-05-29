package es.svalero.leaguemanagement.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link es.svalero.leaguemanagement.service.http.TeamServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see es.svalero.leaguemanagement.service.http.TeamServiceSoap
 * @generated
 */
public class TeamSoap implements Serializable {
    private String _uuid;
    private long _teamId;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private long _leagueId;
    private String _name;

    public TeamSoap() {
    }

    public static TeamSoap toSoapModel(Team model) {
        TeamSoap soapModel = new TeamSoap();

        soapModel.setUuid(model.getUuid());
        soapModel.setTeamId(model.getTeamId());
        soapModel.setGroupId(model.getGroupId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setUserId(model.getUserId());
        soapModel.setUserName(model.getUserName());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setModifiedDate(model.getModifiedDate());
        soapModel.setLeagueId(model.getLeagueId());
        soapModel.setName(model.getName());

        return soapModel;
    }

    public static TeamSoap[] toSoapModels(Team[] models) {
        TeamSoap[] soapModels = new TeamSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static TeamSoap[][] toSoapModels(Team[][] models) {
        TeamSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new TeamSoap[models.length][models[0].length];
        } else {
            soapModels = new TeamSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static TeamSoap[] toSoapModels(List<Team> models) {
        List<TeamSoap> soapModels = new ArrayList<TeamSoap>(models.size());

        for (Team model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new TeamSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _teamId;
    }

    public void setPrimaryKey(long pk) {
        setTeamId(pk);
    }

    public String getUuid() {
        return _uuid;
    }

    public void setUuid(String uuid) {
        _uuid = uuid;
    }

    public long getTeamId() {
        return _teamId;
    }

    public void setTeamId(long teamId) {
        _teamId = teamId;
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

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }
}
