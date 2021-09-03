<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../temp/boot_head.jsp"></c:import>
</head>
<body>
<c:import url="../temp/boot_nav.jsp"></c:import>
	<h1>List</h1>
	<div class="container-fluid">
	<div class="col-md-7 my-2 mx-auto">
		<table class="table table-striped">
		<tr>
			<th>Num</th><th>Title</th><th>Contents</th><th>Writer</th><th>Regdate</th><th>Hits</th>
		</tr>
		
		<c:forEach items="${list}" var="dto">
		<tr>
			<td>${dto.Num}</td>
			<td>${dto.Title}</td>
			<td>${dto.Contents}</td>
			<td>${dto.Writer}</td>
			<td>${dto.Regdate}</td>
			<td>${dto.Hits}</td>
		</tr>
		</c:forEach>
		</table>
	</div>
	</div>
</body>
</html>