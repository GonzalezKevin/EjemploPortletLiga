package es.svalero.leaguemanagement.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import es.svalero.leaguemanagement.model.Team;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Team in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Team
 * @generated
 */
public class TeamCacheModel implements CacheModel<Team>, Externalizable {
    public String uuid;
    public long teamId;
    public long groupId;
    public long companyId;
    public long userId;
    public String userName;
    public long createDate;
    public long modifiedDate;
    public long leagueId;
    public String name;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(21);

        sb.append("{uuid=");
        sb.append(uuid);
        sb.append(", teamId=");
        sb.append(teamId);
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
        sb.append(", leagueId=");
        sb.append(leagueId);
        sb.append(", name=");
        sb.append(name);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Team toEntityModel() {
        TeamImpl teamImpl = new TeamImpl();

        if (uuid == null) {
            teamImpl.setUuid(StringPool.BLANK);
        } else {
            teamImpl.setUuid(uuid);
        }

        teamImpl.setTeamId(teamId);
        teamImpl.setGroupId(groupId);
        teamImpl.setCompanyId(companyId);
        teamImpl.setUserId(userId);

        if (userName == null) {
            teamImpl.setUserName(StringPool.BLANK);
        } else {
            teamImpl.setUserName(userName);
        }

        if (createDate == Long.MIN_VALUE) {
            teamImpl.setCreateDate(null);
        } else {
            teamImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            teamImpl.setModifiedDate(null);
        } else {
            teamImpl.setModifiedDate(new Date(modifiedDate));
        }

        teamImpl.setLeagueId(leagueId);

        if (name == null) {
            teamImpl.setName(StringPool.BLANK);
        } else {
            teamImpl.setName(name);
        }

        teamImpl.resetOriginalValues();

        return teamImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        uuid = objectInput.readUTF();
        teamId = objectInput.readLong();
        groupId = objectInput.readLong();
        companyId = objectInput.readLong();
        userId = objectInput.readLong();
        userName = objectInput.readUTF();
        createDate = objectInput.readLong();
        modifiedDate = objectInput.readLong();
        leagueId = objectInput.readLong();
        name = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        if (uuid == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(uuid);
        }

        objectOutput.writeLong(teamId);
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
        objectOutput.writeLong(leagueId);

        if (name == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(name);
        }
    }
}
