package es.svalero.leaguemanagement.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import es.svalero.leaguemanagement.model.League;
import es.svalero.leaguemanagement.service.LeagueLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class LeagueActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public LeagueActionableDynamicQuery() throws SystemException {
        setBaseLocalService(LeagueLocalServiceUtil.getService());
        setClass(League.class);

        setClassLoader(es.svalero.leaguemanagement.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("leagueId");
    }
}
