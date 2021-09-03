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
			<th>num</th><th>title</th><th>contents</th><th>writer</th><th>regdate</th><th>hits</th>
		</tr>
		
		<c:forEach items="${list}" var="dto">
		<tr>
			<td>${dto.num}</td>
			<td>${dto.title}</td>
			<td>${dto.contents}</td>
			<td>${dto.writer}</td>
			<td>${dto.regdate}</td>
			<td>${dto.hits}</td>
		</tr>
		</c:forEach>
		</table>
	</div>
	</div>
</body>
</html>