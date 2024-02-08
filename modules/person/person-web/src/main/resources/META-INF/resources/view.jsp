<%@ page import="djh.learn.builder.easyLiferay.model.Person" %>
<%@ page import="djh.learn.builder.easyLiferay.service.PersonService" %>
<%@ page import="djh.learn.builder.easyLiferay.service.PersonServiceUtil" %>
<%@ page import="java.util.List" %>
<%@ page import="javax.portlet.PortletURL" %>
<%@ include file="/META-INF/resources/init.jsp" %>

<style>
	.personName:hover{
		color: green !important;
	}
</style>

<%
	PortletURL actionURL = renderResponse.createRenderURL();

%>
<liferay-ui:success key="success" message="You have successfully Deleted the Entry"/>
<liferay-ui:success key="successEntryAdded" message="You have successfully Added the Entry"/>
<liferay-ui:success key="successEntryUpdated" message="You have successfully Updated the Entry"/>

<portlet:renderURL var="addPersonURL">
	<portlet:param name="jspPage" value="/addPerson.jsp" />
</portlet:renderURL>
<a href="<%= addPersonURL %>" class="btn btn-danger">Add New Person</a>
<liferay-ui:search-container iteratorURL="<%= actionURL %>" delta="4" emptyResultsMessage="No Results Found"  orderByType="asc" orderByCol="personId">
	<liferay-ui:search-container-results results="${persons}" >
	</liferay-ui:search-container-results>

	<liferay-ui:search-container-row className="djh.learn.builder.easyLiferay.model.Person" modelVar="person" keyProperty="personId" >
		<portlet:renderURL var="rowURL">
			<portlet:param name="personId" value="${person.personId}" />
			<portlet:param name="mvcPath" value="/personView.jsp"/>
		</portlet:renderURL>
		<portlet:renderURL var="rowUpdateURL">
			<portlet:param name="personId" value="${person.personId}" />
			<portlet:param name="mvcPath" value="/addPerson.jsp"/>
		</portlet:renderURL>
		<portlet:resourceURL var="rowDeleteURL" id="deleteRow">
			<portlet:param name="personId" value="${person.personId}"/>
			<portlet:param name="redirectUrl" value="/view.jsp"/>
		</portlet:resourceURL>
		<liferay-ui:search-container-column-text property="personId" name="ID" orderableProperty="personId" orderable="true"/>
		<liferay-ui:search-container-column-text property="name" name="Person Name" cssClass="personName" href="${rowURL}" orderableProperty="name" orderable="true"/>
		<liferay-ui:search-container-column-text property="age" name="Person Age" orderableProperty="age" orderable="true" />
		<liferay-ui:search-container-column-text property="married" name="Married" orderableProperty="married" orderable="true" />
		<liferay-ui:search-container-column-text name="Update" value="Update" href="${rowUpdateURL}" />
		<liferay-ui:search-container-column-text name="Delete" value="Delete" href="${rowDeleteURL}"  />

	</liferay-ui:search-container-row>
	<liferay-ui:search-iterator searchContainer="<%= searchContainer %>" paginate="true" />
</liferay-ui:search-container>