<aui:button-row cssClass="league-buttons">

    <portlet:renderURL var="addTeamURL">
        <portlet:param name="mvcPath"
            value="/html/leaguemanagement/add_team.jsp" />
        <portlet:param name="leagueId"
            value="<%=String.valueOf(leagueId)%>" />
    </portlet:renderURL>

    <aui:button onClick="<%=addTeamURL.toString()%>"
        value="Add Team" />
</aui:button-row>
<liferay-ui:search-container>
    <liferay-ui:search-container-results
        results="<%=TeamLocalServiceUtil.getTeams(scopeGroupId,
                        leagueId)%>" />

    <liferay-ui:search-container-row
        className="es.svalero.leaguemanagement.model.Team" modelVar="team">
        <liferay-ui:search-container-column-text property="name" />
    </liferay-ui:search-container-row>

    <liferay-ui:search-iterator />
</liferay-ui:search-container>