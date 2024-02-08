<%@ page import="com.liferay.portal.kernel.model.User" %>
<%@ page import="java.util.List" %>
<%@ page import="djh.learn.builder.easyLiferay.service.PersonServiceUtil" %>
<%@ page import="djh.learn.builder.easyLiferay.model.Person" %>
<%@ include file="/init.jsp" %>

<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<script type="text/javascript" charset="utf8" src="https://code.jquery.com/jquery-3.3.1.js"></script>
<script type="text/javascript" charset="utf8" src="https://cdn.datatables.net/1.10.16/js/jquery.dataTables.min.js"></script>
<script type="text/javascript" charset="utf8" src="https://cdn.datatables.net/1.10.16/js/dataTables.jqueryui.min.js"></script>
<link rel="stylesheet" type="text/css" href="https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css" />
<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.16/css/dataTables.jqueryui.min.css" />


<body>
<table id="example" class="table table-bordered table-striped" style="width:100%">
	<thead>
	<tr>
		<th>ID</th>
		<th>Name</th>
		<th>Age</th>
		<th>Married</th>
		<th>Action</th>
	</tr>
	</thead>
	<tbody>
	<c:forEach items="${persons}" var="person">
		<portlet:resourceURL var="deleteURL">
		</portlet:resourceURL>
		<portlet:renderURL var="updateURL">
			<portlet:param name="personId" value="${person.personId}"/>
		</portlet:renderURL>
		<tr>
			<script type="text/javascript">
				function callServeResource(){
					AUI().use('aui-io-request', function(A){
						var personId = "${person.personId}";
						alert("person id is"+personId);
						A.io.request('<%=deleteURL.toString()%>', {
							method: 'post',
							data: {
								<portlet:namespace />personId: personId,
							}
						});

					});
				}
			</script>
			<td>${person.personId}</td>
			<td>${person.name}</td>
			<td>${person.age}</td>
			<td>${person.married}</td>
			<td><a href="${updateURL}" class="btn btn-secondary">Update</a>  <a onclick="callServeResource()" class="btn btn-danger">Delete</a></td>
		</tr>
	</c:forEach>
	</tbody>
</table>

<script>
	$(function(){
		$("#example").dataTable({
			"iDisplayLength":5, // default page size
			"aLengthMenu": [
				[5, 10, 20, -1],   // per page record options
				[5, 10, 20, "All"]
			],
			"bLengthChange": true, //Customizable page size
			"bSort": true, // for Soring
			"order": [[0, 'asc']],
			"bFilter": true, //search box
			"aaSorting": [],
			"aoColumns": [{// Columns width
				"sWidth": "15%"
			}, {
				"sWidth": "15%"
			}, {
				"sWidth": "20%"
			}, {
				"sWidth": "20%"
			},{
				"sWidth": "30%"
			}],
			"bAutoWidth": false,
			"oLanguage": {
				"sSearch": "Search: ",
				"sEmptyTable": "<div class='portlet-msg-alert'>No User Found</div>" // default message for no data
			},
			"sPaginationType": "full_numbers"
		});
	})
</script>


</body>