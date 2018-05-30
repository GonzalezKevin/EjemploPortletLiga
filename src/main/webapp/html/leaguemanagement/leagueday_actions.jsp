<%@include file="/html/init.jsp"%>

<%
String mvcPath = ParamUtil.getString(request, "mvcPath");

ResultRow row = (ResultRow)request.getAttribute(LeagueManagementWebKeys.SEARCH_CONTAINER_RESULT_ROW);

LeagueDay leagueDay = (LeagueDay)row.getObject(); 
%>
<liferay-ui:icon-menu>
		<portlet:renderURL var="addMatchURL">
			<portlet:param name="leagueDayId"
				value="<%= String.valueOf(leagueDay.getLeagueDayId()) %>" />
			<portlet:param name="mvcPath" value="/html/leaguemanagement/add_match.jsp" />
		</portlet:renderURL>

		<liferay-ui:icon image="add" message="Añadir Partido"
			url="<%= addMatchURL.toString() %>" />

</liferay-ui:icon-menu>
