package es.svalero.leaguemanagement.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import es.svalero.leaguemanagement.model.LeagueDay;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing LeagueDay in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see LeagueDay
 * @generated
 */
public class LeagueDayCacheModel implements CacheModel<LeagueDay>,
    Externalizable {
    public String uuid;
    public long leagueDayId;
    public long groupId;
    public long companyId;
    public long userId;
    public String userName;
    public long createDate;
    public long modifiedDate;
    public long leagueId;
    public String number;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(21);

        sb.append("{uuid=");
        sb.append(uuid);
        sb.append(", leagueDayId=");
        sb.append(leagueDayId);
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
        sb.append(", number=");
        sb.append(number);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public LeagueDay toEntityModel() {
        LeagueDayImpl leagueDayImpl = new LeagueDayImpl();

        if (uuid == null) {
            leagueDayImpl.setUuid(StringPool.BLANK);
        } else {
            leagueDayImpl.setUuid(uuid);
        }

        leagueDayImpl.setLeagueDayId(leagueDayId);
        leagueDayImpl.setGroupId(groupId);
        leagueDayImpl.setCompanyId(companyId);
        leagueDayImpl.setUserId(userId);

        if (userName == null) {
            leagueDayImpl.setUserName(StringPool.BLANK);
        } else {
            leagueDayImpl.setUserName(userName);
        }

        if (createDate == Long.MIN_VALUE) {
            leagueDayImpl.setCreateDate(null);
        } else {
            leagueDayImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            leagueDayImpl.setModifiedDate(null);
        } else {
            leagueDayImpl.setModifiedDate(new Date(modifiedDate));
        }

        leagueDayImpl.setLeagueId(leagueId);

        if (number == null) {
            leagueDayImpl.setNumber(StringPool.BLANK);
        } else {
            leagueDayImpl.setNumber(number);
        }

        leagueDayImpl.resetOriginalValues();

        return leagueDayImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        uuid = objectInput.readUTF();
        leagueDayId = objectInput.readLong();
        groupId = objectInput.readLong();
        companyId = objectInput.readLong();
        userId = objectInput.readLong();
        userName = objectInput.readUTF();
        createDate = objectInput.readLong();
        modifiedDate = objectInput.readLong();
        leagueId = objectInput.readLong();
        number = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        if (uuid == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(uuid);
        }

        objectOutput.writeLong(leagueDayId);
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

        if (number == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(number);
        }
    }
}
