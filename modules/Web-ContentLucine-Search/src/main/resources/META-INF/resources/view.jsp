<%@ include file="/init.jsp" %>

<%@page import="java.util.Locale"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<portlet:defineObjects />

<portlet:actionURL var="searchURL" name="searchArticle"/>

	<div class="container">
		<aui:form action="${searchURL}" method="POST">
		<div class="row">
			<div class="col-12">
				<aui:input name="keyword"  cssClass="form-control" label="Search Article"/>
		</div>
			<div class="col-6">
				<aui:button type="submit" cssClass="brn btn-primary" value="Search" />
			</div>
		</div>
		</aui:form>
	</div>