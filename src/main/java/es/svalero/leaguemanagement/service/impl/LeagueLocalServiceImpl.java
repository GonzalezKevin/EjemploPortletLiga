package es.svalero.leaguemanagement.service.impl;

import java.util.Date;
import java.util.List;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;

import es.svalero.leaguemanagement.model.League;
import es.svalero.leaguemanagement.service.base.LeagueLocalServiceBaseImpl;

/**
 * The implementation of the league local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link es.svalero.leaguemanagement.service.LeagueLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see es.svalero.leaguemanagement.service.base.LeagueLocalServiceBaseImpl
 * @see es.svalero.leaguemanagement.service.LeagueLocalServiceUtil
 */
public class LeagueLocalServiceImpl extends LeagueLocalServiceBaseImpl {
	public List<League> getLeagues(long groupId) throws SystemException {
		return leaguePersistence.findByGroupId(groupId);
	}

	public int countByGroupId(long groupId) throws SystemException {
		return leaguePersistence.countByGroupId(groupId);
	}
	
	public League addLeague(long userId, String name, ServiceContext serviceContext)
			throws SystemException, PortalException {
		long groupId = serviceContext.getScopeGroupId();

		User user = userPersistence.findByPrimaryKey(userId);

		Date now = new Date();

		long leagueId = counterLocalService.increment();

		League league = leaguePersistence.create(leagueId);

		league.setUuid(serviceContext.getUuid());
		league.setUserId(userId);
		league.setGroupId(groupId);
		league.setCompanyId(user.getCompanyId());
		league.setUserName(user.getFullName());
		league.setCreateDate(serviceContext.getCreateDate(now));
		league.setModifiedDate(serviceContext.getModifiedDate(now));
		league.setName(name);
		league.setExpandoBridgeAttributes(serviceContext);

		leaguePersistence.update(league);

		return league;
	}
}
