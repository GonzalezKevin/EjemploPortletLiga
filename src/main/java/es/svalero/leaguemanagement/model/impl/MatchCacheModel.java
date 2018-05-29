package es.svalero.leaguemanagement.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import es.svalero.leaguemanagement.model.Match;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Match in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Match
 * @generated
 */
public class MatchCacheModel implements CacheModel<Match>, Externalizable {
    public String uuid;
    public long matchId;
    public long groupId;
    public long companyId;
    public long userId;
    public String userName;
    public long createDate;
    public long modifiedDate;
    public long localTeamId;
    public long visitingTeamId;
    public int localScore;
    public int visitingScore;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(25);

        sb.append("{uuid=");
        sb.append(uuid);
        sb.append(", matchId=");
        sb.append(matchId);
        sb.append(", groupId=");
        sb.append(groupId);
        sb.append(", companyId=");
        sb.append(companyId);
        sb.append(", userId=");
        sb.append(userId);
        sb.append(", userName=");
        sb.append(userName);
        sb.append(", createDate=");
        sb.append(createDate);
        sb.append(", modifiedDate=");
        sb.append(modifiedDate);
        sb.append(", localTeamId=");
        sb.append(localTeamId);
        sb.append(", visitingTeamId=");
        sb.append(visitingTeamId);
        sb.append(", localScore=");
        sb.append(localScore);
        sb.append(", visitingScore=");
        sb.append(visitingScore);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Match toEntityModel() {
        MatchImpl matchImpl = new MatchImpl();

        if (uuid == null) {
            matchImpl.setUuid(StringPool.BLANK);
        } else {
            matchImpl.setUuid(uuid);
        }

        matchImpl.setMatchId(matchId);
        matchImpl.setGroupId(groupId);
        matchImpl.setCompanyId(companyId);
        matchImpl.setUserId(userId);

        if (userName == null) {
            matchImpl.setUserName(StringPool.BLANK);
        } else {
            matchImpl.setUserName(userName);
        }

        if (createDate == Long.MIN_VALUE) {
            matchImpl.setCreateDate(null);
        } else {
            matchImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            matchImpl.setModifiedDate(null);
        } else {
            matchImpl.setModifiedDate(new Date(modifiedDate));
        }

        matchImpl.setLocalTeamId(localTeamId);
        matchImpl.setVisitingTeamId(visitingTeamId);
        matchImpl.setLocalScore(localScore);
        matchImpl.setVisitingScore(visitingScore);

        matchImpl.resetOriginalValues();

        return matchImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        uuid = objectInput.readUTF();
        matchId = objectInput.readLong();
        groupId = objectInput.readLong();
        companyId = objectInput.readLong();
        userId = objectInput.readLong();
        userName = objectInput.readUTF();
        createDate = objectInput.readLong();
        modifiedDate = objectInput.readLong();
        localTeamId = objectInput.readLong();
        visitingTeamId = objectInput.readLong();
        localScore = objectInput.readInt();
        visitingScore = objectInput.readInt();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        if (uuid == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(uuid);
        }

        objectOutput.writeLong(matchId);
        objectOutput.writeLong(groupId);
        objectOutput.writeLong(companyId);
        objectOutput.writeLong(userId);

        if (userName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(userName);
        }

        objectOutput.writeLong(createDate);
        objectOutput.writeLong(modifiedDate);
        objectOutput.writeLong(localTeamId);
        objectOutput.writeLong(visitingTeamId);
        objectOutput.writeInt(localScore);
        objectOutput.writeInt(visitingScore);
    }
}
