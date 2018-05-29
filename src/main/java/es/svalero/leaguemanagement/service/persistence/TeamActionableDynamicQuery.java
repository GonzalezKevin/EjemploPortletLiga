package es.svalero.leaguemanagement.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import es.svalero.leaguemanagement.model.Team;
import es.svalero.leaguemanagement.service.TeamLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class TeamActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public TeamActionableDynamicQuery() throws SystemException {
        setBaseLocalService(TeamLocalServiceUtil.getService());
        setClass(Team.class);

        setClassLoader(es.svalero.leaguemanagement.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("teamId");
    }
}
