<%@include file = "/html/init.jsp" %>

<portlet:actionURL name="addMatch" var="addMatchURL"></portlet:actionURL>
<aui:form action="<%= addMatchURL %>" name="<portlet:namespace />fm">
        <aui:fieldset>
            <aui:input name="name" />
			<aui:input name='leagueDayId' type='hidden'
				value='<%=ParamUtil.getString(renderRequest, "leagueDayId")%>' />
        </aui:fieldset>

        <aui:button-row>

            <aui:button type="submit"></aui:button>
            <aui:button type="cancel" onClick="<%= viewURL %>"></aui:button>

        </aui:button-row>
</aui:form>