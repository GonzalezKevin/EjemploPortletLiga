package es.svalero.leaguemanagement.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import es.svalero.leaguemanagement.service.ClpSerializer;
import es.svalero.leaguemanagement.service.LeagueDayLocalServiceUtil;
import es.svalero.leaguemanagement.service.LeagueDayServiceUtil;
import es.svalero.leaguemanagement.service.LeagueLocalServiceUtil;
import es.svalero.leaguemanagement.service.LeagueServiceUtil;
import es.svalero.leaguemanagement.service.MatchLocalServiceUtil;
import es.svalero.leaguemanagement.service.MatchServiceUtil;
import es.svalero.leaguemanagement.service.TeamLocalServiceUtil;
import es.svalero.leaguemanagement.service.TeamServiceUtil;


public class ClpMessageListener extends BaseMessageListener {
    public static String getServletContextName() {
        return ClpSerializer.getServletContextName();
    }

    @Override
    protected void doReceive(Message message) throws Exception {
        String command = message.getString("command");
        String servletContextName = message.getString("servletContextName");

        if (command.equals("undeploy") &&
                servletContextName.equals(getServletContextName())) {
            LeagueLocalServiceUtil.clearService();

            LeagueServiceUtil.clearService();
            LeagueDayLocalServiceUtil.clearService();

            LeagueDayServiceUtil.clearService();
            MatchLocalServiceUtil.clearService();

            MatchServiceUtil.clearService();
            TeamLocalServiceUtil.clearService();

            TeamServiceUtil.clearService();
        }
    }
}
