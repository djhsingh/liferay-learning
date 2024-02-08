<%@ include file="/init.jsp" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<portlet:actionURL var="actionUrl" name="action" ></portlet:actionURL>

<liferay-ui:success key="success-key" message="Successfully" />
<liferay-ui:error key="error-key" message="Error occured"/>

		<div class="container">
			<form action="<%=actionUrl %>" method="post">
				<div class="row">
					<div class="col-6">
						Name:<input class="form-control" type="text" name="name" ><br>
					</div>
					<div class="col-6">
						Password:<input class="form-control" type="password" name="pass"><br>
					</div>
				</div>
				<div class="row">
					<div class="col-6">
						<input type="submit" class="btn btn-primary" value="Submit">
					</div>
				</div>
			</form>
		</div>