package es.svalero.leaguemanagement.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link es.svalero.leaguemanagement.service.http.MatchServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see es.svalero.leaguemanagement.service.http.MatchServiceSoap
 * @generated
 */
public class MatchSoap implements Serializable {
    private String _uuid;
    private long _matchId;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private long _localTeamId;
    private long _visitingTeamId;
    private int _localScore;
    private int _visitingScore;

    public MatchSoap() {
    }

    public static MatchSoap toSoapModel(Match model) {
        MatchSoap soapModel = new MatchSoap();

        soapModel.setUuid(model.getUuid());
        soapModel.setMatchId(model.getMatchId());
        soapModel.setGroupId(model.getGroupId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setUserId(model.getUserId());
        soapModel.setUserName(model.getUserName());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setModifiedDate(model.getModifiedDate());
        soapModel.setLocalTeamId(model.getLocalTeamId());
        soapModel.setVisitingTeamId(model.getVisitingTeamId());
        soapModel.setLocalScore(model.getLocalScore());
        soapModel.setVisitingScore(model.getVisitingScore());

        return soapModel;
    }

    public static MatchSoap[] toSoapModels(Match[] models) {
        MatchSoap[] soapModels = new MatchSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static MatchSoap[][] toSoapModels(Match[][] models) {
        MatchSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new MatchSoap[models.length][models[0].length];
        } else {
            soapModels = new MatchSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static MatchSoap[] toSoapModels(List<Match> models) {
        List<MatchSoap> soapModels = new ArrayList<MatchSoap>(models.size());

        for (Match model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new MatchSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _matchId;
    }

    public void setPrimaryKey(long pk) {
        setMatchId(pk);
    }

    public String getUuid() {
        return _uuid;
    }

    public void setUuid(String uuid) {
        _uuid = uuid;
    }

    public long getMatchId() {
        return _matchId;
    }

    public void setMatchId(long matchId) {
        _matchId = matchId;
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

    public long getLocalTeamId() {
        return _localTeamId;
    }

    public void setLocalTeamId(long localTeamId) {
        _localTeamId = localTeamId;
    }

    public long getVisitingTeamId() {
        return _visitingTeamId;
    }

    public void setVisitingTeamId(long visitingTeamId) {
        _visitingTeamId = visitingTeamId;
    }

    public int getLocalScore() {
        return _localScore;
    }

    public void setLocalScore(int localScore) {
        _localScore = localScore;
    }

    public int getVisitingScore() {
        return _visitingScore;
    }

    public void setVisitingScore(int visitingScore) {
        _visitingScore = visitingScore;
    }
}
