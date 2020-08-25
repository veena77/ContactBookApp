
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 style="text-align: center; color: teal;">All Contacts List</h1>

	<table border="1">
		<thead>
			<tr>
				<th>Sr No</th>
				<th>Contact Name</th>
				<th>EmailId</th>
				<th>Phone No</th>
				<th>Action</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="contact" items="${listDTO}" varStatus="index">
				<tr>
					<td>${index.count}</td>
					<td>${contact.cname}</td>
					<td>${contact.mailId}</td>
					<td>${contact.mbNo}</td>
								<td><a href="editContact?cid=${contact.cid}"><img alt="edit" src="images/edit.jpg" style="width:30px;height: 30px"></a>&nbsp;|&nbsp;
									<a href="deleteContact?cid=${contact.cid }"><img alt="delete" src="images/delete.jpg" style="width:30px;height: 30px"></a></td>
			</c:forEach>
		</tbody>
	</table>
<h2>${resMsg}</h2>	
				<!-- <a href="saveContact"><img alt="add" src="images/add.jpg" style="width:50px;height: 50px"></a> -->
</body>
</html>