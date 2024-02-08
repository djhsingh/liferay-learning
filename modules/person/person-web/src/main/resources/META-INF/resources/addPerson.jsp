<%@ page import="djh.learn.builder.easyLiferay.service.PersonServiceUtil" %>
<%@ page import="djh.learn.builder.easyLiferay.model.Person" %>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ include file="/init.jsp" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<portlet:actionURL var="actionPerson" name="actionPerson" ></portlet:actionURL>

<liferay-ui:error key="isEmpty" message="The field can not be empty"/>
<liferay-ui:error key="lessAge" message="Age should be greater than 10 and less than 100"/>
<liferay-ui:success key="successEntry" message="You have successfully Added the new Entry"/>
<%
	String personId = ParamUtil.getString(renderRequest,"personId");
	Person person=null;
	if(!personId.isEmpty()) {
	person = PersonServiceUtil.getPersonById(Long.parseLong(personId));
	}

%>
<c:set var="person" value="<%=person %>"/>
<c:if test="${person.personId eq null}">
	<h2>Add New Person</h2>
</c:if>
<c:if test="${person.personId ne null}">
<h2>Update ${person.name} Person Details....</h2></c:if>
<div class="container">
	<form action="<%=actionPerson %>" method="post">
		<input class="form-control" type="hidden" name="<portlet:namespace/>personId" value="${person.personId}"/>
		<div class="row">
			<div class="col-6">
				Name:<input class="form-control" type="text" name="<portlet:namespace/>name" value="${person.name}"/>
			</div>
			<div class="col-6">
				Age:<input class="form-control" type="number" name="<portlet:namespace/>age" value="<c:if test="${person.personId ne ''}">${person.age}</c:if><c:if test="${person.personId eq ''}">0</c:if>"/>
			</div>
		</div>
		<div class="row">
			<div class="col-6">
						Married?:<select class="form-control" name="<portlet:namespace/>married" value="${person.married}">
									<option disabled>Select Option</option>
									<option value="true">Yes</option>
									<option value="false">No</option>
						</select>
			</div>
			<div class="col-6" style="margin-top: 25px;">
				<input type="submit" class="btn btn-primary" value="Submit"/>
			</div>
		</div>
	</form>
</div>