<%@include file="/html/init.jsp"%>

<%
    long leagueId = Long.valueOf((Long) renderRequest
            .getAttribute("leagueId"));

    String subtab = (String) renderRequest
    .getAttribute("subtab");

%>

<aui:nav cssClass="nav-tabs">

    <%
        List<League> leagues = LeagueLocalServiceUtil
                    .getLeagues(scopeGroupId);
            for (int i = 0; i < leagues.size(); i++) {
                League curLeague = (League) leagues.get(i);

                String cssClass = StringPool.BLANK;

                if (curLeague.getLeagueId() == leagueId) {
               		cssClass = "active";
                }
    %>

    <portlet:renderURL var="viewPageURL">
        <portlet:param name="mvcPath" value="/html/leaguemanagement/view.jsp" />
        <portlet:param name="leagueId"
            value="<%=String.valueOf(curLeague.getLeagueId())%>" />
    </portlet:renderURL>

    <aui:nav-item cssClass="<%=cssClass%>" href="<%=viewPageURL%>"
        label="<%=HtmlUtil.escape(curLeague.getName())%>" />

    <%
        }
    %>

</aui:nav>

<aui:button-row cssClass="league-buttons">

    <portlet:renderURL var="addLeagueURL">
        <portlet:param name="mvcPath"
            value="/html/leaguemanagement/add_league.jsp" />
    </portlet:renderURL>

    <aui:button onClick="<%=addLeagueURL.toString()%>"
        value="Add League" />
</aui:button-row>

<aui:nav cssClass="nav-tabs">
    <portlet:renderURL var="viewTeamsPageURL">
        <portlet:param name="mvcPath" value="/html/leaguemanagement/view.jsp" />
        <portlet:param name="subtab"
            value="<%= LeagueManagementWebKeys.TEAMS_SUBTAB %>" />    
    </portlet:renderURL>
    <portlet:renderURL var="viewDayPageURL">
        <portlet:param name="mvcPath" value="/html/leaguemanagement/view.jsp" />
        <portlet:param name="subtab"
            value="<%= LeagueManagementWebKeys.DAYS_SUBTAB %>" />    
    </portlet:renderURL>
    <%
    
    String cssTeamClass = "active";
    String cssDayClass = StringPool.BLANK;
	
    if(LeagueManagementWebKeys.DAYS_SUBTAB.equals(subtab)) {
    	cssTeamClass = StringPool.BLANK;
    	cssDayClass = "active";
    }

    %>
   	<aui:nav-item cssClass="<%= cssTeamClass %>" href="<%=viewTeamsPageURL%>" label="Equipos" />
	<aui:nav-item cssClass="<%= cssDayClass %>" href="<%=viewDayPageURL%>" label="Jornadas" />
</aui:nav>
<c:if test="<%= LeagueManagementWebKeys.TEAMS_SUBTAB.equals(subtab) %>">
	<%@include file="/html/leaguemanagement/view_teams.jsp"%>
</c:if>
<c:if test="<%= LeagueManagementWebKeys.DAYS_SUBTAB.equals(subtab) %>">
	<%@include file="/html/leaguemanagement/view_days.jsp"%>
</c:if>