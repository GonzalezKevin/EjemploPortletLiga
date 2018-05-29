package es.svalero.leaguemanagement.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import es.svalero.leaguemanagement.model.LeagueDay;
import es.svalero.leaguemanagement.service.LeagueDayLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class LeagueDayActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public LeagueDayActionableDynamicQuery() throws SystemException {
        setBaseLocalService(LeagueDayLocalServiceUtil.getService());
        setClass(LeagueDay.class);

        setClassLoader(es.svalero.leaguemanagement.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("leagueDayId");
    }
}
