<%@ include file="/init.jsp" %>

<p>
	<b><liferay-ui:message key="filedownload.caption"/></b>
</p>

		<table>
			<thead>
			<th>name</th>
			<th>downlaod</th>
			</thead>
			<tbody>
				<c:forEach items="${files}" var="file">
					<tr>
						<td>${file.getName()}</td>
						<td><a download="" target="_blank" href="${file.getPath()}">Downlaod</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
${url}
<a  href="${url}">Downlaod</a></td>
