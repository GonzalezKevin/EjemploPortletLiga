package es.svalero.leaguemanagement.service.impl;

import java.util.Date;
import java.util.List;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;

import es.svalero.leaguemanagement.model.Team;
import es.svalero.leaguemanagement.service.base.TeamLocalServiceBaseImpl;

/**
 * The implementation of the team local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link es.svalero.leaguemanagement.service.TeamLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see es.svalero.leaguemanagement.service.base.TeamLocalServiceBaseImpl
 * @see es.svalero.leaguemanagement.service.TeamLocalServiceUtil
 */
public class TeamLocalServiceImpl extends TeamLocalServiceBaseImpl {
	public Team addTeam(long userId, long leagueId, String name, ServiceContext serviceContext)
			throws SystemException, PortalException {
		long groupId = serviceContext.getScopeGroupId();

		User user = userPersistence.findByPrimaryKey(userId);

		Date now = new Date();

		long teamId = counterLocalService.increment();

		Team team = teamPersistence.create(teamId);

		team.setUuid(serviceContext.getUuid());
		team.setUserId(userId);
		team.setLeagueId(leagueId);
		team.setGroupId(groupId);
		team.setCompanyId(user.getCompanyId());
		team.setUserName(user.getFullName());
		team.setCreateDate(serviceContext.getCreateDate(now));
		team.setModifiedDate(serviceContext.getModifiedDate(now));
		team.setName(name);
		team.setExpandoBridgeAttributes(serviceContext);

		teamPersistence.update(team);

		return team;
	}
	
	public List<Team> getTeams(long groupId, long leagueId) throws SystemException {
		return teamPersistence.findByGroupIdAndLeagueId(groupId, leagueId);
	}
	
	public int countByGroupIdAndLeagueId(long groupId, long leagueId) throws SystemException {
		return teamPersistence.countByGroupIdAndLeagueId(groupId, leagueId);
	}
}
