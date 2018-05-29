package es.svalero.leaguemanagement.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import es.svalero.leaguemanagement.model.League;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing League in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see League
 * @generated
 */
public class LeagueCacheModel implements CacheModel<League>, Externalizable {
    public String uuid;
    public long leagueId;
    public long groupId;
    public long companyId;
    public long userId;
    public String userName;
    public long createDate;
    public long modifiedDate;
    public String name;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(19);

        sb.append("{uuid=");
        sb.append(uuid);
        sb.append(", leagueId=");
        sb.append(leagueId);
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
        sb.append(", name=");
        sb.append(name);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public League toEntityModel() {
        LeagueImpl leagueImpl = new LeagueImpl();

        if (uuid == null) {
            leagueImpl.setUuid(StringPool.BLANK);
        } else {
            leagueImpl.setUuid(uuid);
        }

        leagueImpl.setLeagueId(leagueId);
        leagueImpl.setGroupId(groupId);
        leagueImpl.setCompanyId(companyId);
        leagueImpl.setUserId(userId);

        if (userName == null) {
            leagueImpl.setUserName(StringPool.BLANK);
        } else {
            leagueImpl.setUserName(userName);
        }

        if (createDate == Long.MIN_VALUE) {
            leagueImpl.setCreateDate(null);
        } else {
            leagueImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            leagueImpl.setModifiedDate(null);
        } else {
            leagueImpl.setModifiedDate(new Date(modifiedDate));
        }

        if (name == null) {
            leagueImpl.setName(StringPool.BLANK);
        } else {
            leagueImpl.setName(name);
        }

        leagueImpl.resetOriginalValues();

        return leagueImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        uuid = objectInput.readUTF();
        leagueId = objectInput.readLong();
        groupId = objectInput.readLong();
        companyId = objectInput.readLong();
        userId = objectInput.readLong();
        userName = objectInput.readUTF();
        createDate = objectInput.readLong();
        modifiedDate = objectInput.readLong();
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

        objectOutput.writeLong(leagueId);
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

        if (name == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(name);
        }
    }
}
