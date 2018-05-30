<aui:button-row cssClass="league-buttons">

    <portlet:renderURL var="addDayURL">
        <portlet:param name="mvcPath"
            value="/html/leaguemanagement/add_day.jsp" />
        <portlet:param name="leagueId"
            value="<%=String.valueOf(leagueId)%>" />
    </portlet:renderURL>

    <aui:button onClick="<%=addDayURL.toString()%>"
        value="Add League Day" />
</aui:button-row>
<liferay-ui:search-container>
    <liferay-ui:search-container-results
        results="<%=LeagueDayLocalServiceUtil.getLeagueDays(scopeGroupId,
                        leagueId)%>" />

    <liferay-ui:search-container-row
        className="es.svalero.leaguemanagement.model.LeagueDay" modelVar="leagueDay">
        <liferay-ui:search-container-column-text property="number" />
		<liferay-ui:search-container-column-jsp path="/html/leaguemanagement/leagueday_actions.jsp" align="right" />
    </liferay-ui:search-container-row>

    <liferay-ui:search-iterator />
</liferay-ui:search-container>