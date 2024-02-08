<%@ include file="/META-INF/resources/init.jsp" %>
<%@ page import="djh.learn.builder.easyLiferay.service.PersonServiceUtil" %>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="djh.learn.builder.easyLiferay.model.Person" %>
<%@ page import="com.liferay.portal.kernel.util.PortalUtil" %>
<%
    Person person = PersonServiceUtil.getPersonById(Long.parseLong(ParamUtil.getString(renderRequest,"personId")));

%>
<portlet:renderURL var="editGreetingURL">

    <portlet:param name="jspPage" value="/view.jsp" />

</portlet:renderURL>
<c:set var="person" value="<%=person %>"/>
                <div class="card" >
                    <div class="card-body">
                        <h5 class="card-title">${person.name}</h5>
                        <p class="card-text">${person.name} is ${person.age} old and he is <c:if test="${person.married}">married</c:if><c:if test="${!person.married}">not married</c:if>.</p>
                        <a href="<%= editGreetingURL %>" class="btn btn-primary">Go Back</a>
                    </div>
                </div>

