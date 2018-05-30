<%@include file = "/html/init.jsp" %>

<portlet:renderURL var="viewURL">
    <portlet:param name="mvcPath" value="/html/leaguemanagement/view.jsp"></portlet:param>
</portlet:renderURL>

<portlet:actionURL name="addDay" var="addDayURL"></portlet:actionURL>
<aui:form action="<%= addDayURL %>" name="<portlet:namespace />fm">
        <aui:fieldset>
            <aui:input name="number" />
			<aui:input name='leagueId' type='hidden'
				value='<%=ParamUtil.getString(renderRequest, "leagueId")%>' />
        </aui:fieldset>

        <aui:button-row>

            <aui:button type="submit"></aui:button>
            <aui:button type="cancel" onClick="<%= viewURL %>"></aui:button>

        </aui:button-row>
</aui:form>