<%@ include file="/init.jsp" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<portlet:actionURL var="actionUrl" name="action" ></portlet:actionURL>

<liferay-ui:error key="notNumber" message="Phone Number not Contain Alphabets"/>
<liferay-ui:error key="lessLength" message="Phone Number Must be of 10 Digit"/>
<liferay-ui:success key="success" message="Phone Number is correct"/>

<div class="container">
	<form action="<%=actionUrl %>" method="post">
		<div class="row">
			<div class="col-6">
				PhoneNumber:<input class="form-control" type="text" name="<portlet:namespace/>phone" value="${phoneNumber}">
			</div>
		</div>
		<div class="row">
			<div class="col-6">
				<input type="submit" class="btn btn-primary" value="Submit">
			</div>
		</div>
	</form>
</div>