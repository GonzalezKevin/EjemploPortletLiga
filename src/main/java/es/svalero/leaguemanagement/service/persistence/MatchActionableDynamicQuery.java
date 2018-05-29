package es.svalero.leaguemanagement.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import es.svalero.leaguemanagement.model.Match;
import es.svalero.leaguemanagement.service.MatchLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class MatchActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public MatchActionableDynamicQuery() throws SystemException {
        setBaseLocalService(MatchLocalServiceUtil.getService());
        setClass(Match.class);

        setClassLoader(es.svalero.leaguemanagement.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("matchId");
    }
}
