<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>bookInfo</h1>
	<table border="1">
		<thead>
			<tr>
				<th>ID</th>
				<th>제목</th>
				<th>저자</th>
				<th>ISBN</th>
				<th>장르</th>
				<th>등록날짜</th>
			</tr>
		</thead>
		<tbody>
				<tr>
					<td>${bookInfo.id}</td>
					<td>${bookInfo.title}</td>
					<td>${bookInfo.author}</td>
					<td>${bookInfo.isbn}</td>
					<td>${bookInfo.author}</td>
					<td>${bookInfo.createdAt}</td>
				</tr>
		</tbody>
	</table>
</body>
</html>