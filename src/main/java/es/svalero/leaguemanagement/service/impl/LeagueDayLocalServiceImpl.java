package es.svalero.leaguemanagement.service.impl;

import java.util.Date;
import java.util.List;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;

import es.svalero.leaguemanagement.model.LeagueDay;
import es.svalero.leaguemanagement.service.base.LeagueDayLocalServiceBaseImpl;

/**
 * The implementation of the league day local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link es.svalero.leaguemanagement.service.LeagueDayLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see es.svalero.leaguemanagement.service.base.LeagueDayLocalServiceBaseImpl
 * @see es.svalero.leaguemanagement.service.LeagueDayLocalServiceUtil
 */
public class LeagueDayLocalServiceImpl extends LeagueDayLocalServiceBaseImpl {
	public LeagueDay addLeagueDay(long userId, long leagueId, String number, ServiceContext serviceContext)
			throws SystemException, PortalException {
		long groupId = serviceContext.getScopeGroupId();

		User user = userPersistence.findByPrimaryKey(userId);

		Date now = new Date();

		long leagueDayId = counterLocalService.increment();

		LeagueDay leagueDay = leagueDayPersistence.create(leagueDayId);

		leagueDay.setUuid(serviceContext.getUuid());
		leagueDay.setUserId(userId);
		leagueDay.setLeagueId(leagueId);
		leagueDay.setGroupId(groupId);
		leagueDay.setCompanyId(user.getCompanyId());
		leagueDay.setUserName(user.getFullName());
		leagueDay.setCreateDate(serviceContext.getCreateDate(now));
		leagueDay.setModifiedDate(serviceContext.getModifiedDate(now));
		leagueDay.setNumber(number);
		leagueDay.setExpandoBridgeAttributes(serviceContext);

		leagueDayPersistence.update(leagueDay);

		return leagueDay;
	}
	
	public List<LeagueDay> getLeagueDays(long groupId, long leagueId) throws SystemException {
		return leagueDayPersistence.findByGroupIdAndLeagueId(groupId, leagueId);
	}
	
	public int countByGroupIdAndLeagueId(long groupId, long leagueId) throws SystemException {
		return leagueDayPersistence.countByGroupIdAndLeagueId(groupId, leagueId);
	}
}
