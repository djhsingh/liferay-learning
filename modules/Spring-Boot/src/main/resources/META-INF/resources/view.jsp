<%@ include file="/init.jsp" %>

<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<script type="text/javascript" charset="utf8" src="https://code.jquery.com/jquery-3.3.1.js"></script>
<script type="text/javascript" charset="utf8" src="https://cdn.datatables.net/1.10.16/js/jquery.dataTables.min.js"></script>
<script type="text/javascript" charset="utf8" src="https://cdn.datatables.net/1.10.16/js/dataTables.jqueryui.min.js"></script>
<link rel="stylesheet" type="text/css" href="https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css" />
<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.16/css/dataTables.jqueryui.min.css" />


<body>
<table id="example" class="table table-bordered table-striped table-dark" style="width:100%">
	<thead>
	<tr>
		<th>ID</th>
		<th>Name</th>
		<th>Color</th>
	</tr>
	</thead>
	<tbody>
	<c:forEach items="${pets}" var="pet">

		<tr>
			<td>${pet.id}</td>
			<td>${pet.name}</td>
			<td>${pet.color}</td>
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
				"sWidth": "20%"
			}, {
				"sWidth": "40%"
			}, {
				"sWidth": "40%"
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