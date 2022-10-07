<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>게시글제목</th>
				<th>작성자이름</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="noticeList" items="${noticeList}">
				<tr>
					<td>${noticeList.noticeTitle}</td>
					<td>${noticeList.noticeConame}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>