package es.svalero.leaguemanagement.portlet;

import java.io.IOException;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.util.bridges.mvc.MVCPortlet;

import es.svalero.leaguemanagement.model.League;
import es.svalero.leaguemanagement.model.Team;
import es.svalero.leaguemanagement.service.LeagueDayLocalServiceUtil;
import es.svalero.leaguemanagement.service.LeagueLocalServiceUtil;
import es.svalero.leaguemanagement.service.TeamLocalServiceUtil;
import es.svalero.leaguemanagement.util.LeagueManagementWebKeys;

/**
 * Portlet implementation class LeagueManagmentPortlet
 */
public class LeagueManagementPortlet extends MVCPortlet {
	
	public void addLeague(ActionRequest request, ActionResponse response) throws PortalException, SystemException {

		ServiceContext serviceContext = ServiceContextFactory.getInstance(League.class.getName(), request);

		String name = ParamUtil.getString(request, "name");

		try {
			LeagueLocalServiceUtil.addLeague(serviceContext.getUserId(), name, serviceContext);
			SessionMessages.add(request, "leagueAdded");

		} catch (Exception e) {
			SessionErrors.add(request, e.getClass().getName());

			response.setRenderParameter("mvcPath", "/html/leaguemanagement/add_league.jsp");
		}

	}
	
	public void addTeam(ActionRequest request, ActionResponse response) throws PortalException, SystemException {

		ServiceContext serviceContext = ServiceContextFactory.getInstance(League.class.getName(), request);

		String name = ParamUtil.getString(request, "name");
		long leagueId = ParamUtil.getLong(request, "leagueId");

		try {
			TeamLocalServiceUtil.addTeam(serviceContext.getUserId(), leagueId, name, serviceContext);
			SessionMessages.add(request, "teamAdded");

		} catch (Exception e) {
			SessionErrors.add(request, e.getClass().getName());

			response.setRenderParameter("mvcPath", "/html/leaguemanagement/add_team.jsp");
		}

	}
	
	public void addDay(ActionRequest request, ActionResponse response) throws PortalException, SystemException {

		ServiceContext serviceContext = ServiceContextFactory.getInstance(League.class.getName(), request);

		String number = ParamUtil.getString(request, "number");
		long leagueId = ParamUtil.getLong(request, "leagueId");

		try {
			LeagueDayLocalServiceUtil.addLeagueDay(serviceContext.getUserId(), leagueId, number, serviceContext);
			SessionMessages.add(request, "dayAdded");

		} catch (Exception e) {
			SessionErrors.add(request, e.getClass().getName());

			response.setRenderParameter("mvcPath", "/html/leaguemanagement/add_team.jsp");
		}

	}

	@Override
	public void render(RenderRequest renderRequest,
	        RenderResponse renderResponse) throws PortletException, IOException {

	    try {
	        ServiceContext serviceContext = ServiceContextFactory.getInstance(
	                League.class.getName(), renderRequest);

	        long groupId = serviceContext.getScopeGroupId();

	        long leagueId = ParamUtil.getLong(renderRequest, "leagueId");
	        String subtab = ParamUtil.getString(renderRequest, "subtab", LeagueManagementWebKeys.TEAMS_SUBTAB);

	        List<League> leagues = LeagueLocalServiceUtil
	                .getLeagues(groupId);

	        /*if (leagues.size() == 0) {
	        	League league = LeagueLocalServiceUtil.addLeague(
	                    serviceContext.getUserId(), "Main", serviceContext);

	            leagueId = league.getLeagueId();

	        }*/

	        if (!(leagueId > 0)) {
	        	leagueId = leagues.get(0).getLeagueId();
	        }

	        renderRequest.setAttribute("leagueId", leagueId);
	        renderRequest.setAttribute("subtab", subtab);

	    } catch (Exception e) {

	        throw new PortletException(e);
	    }

	    super.render(renderRequest, renderResponse);

	}
}
