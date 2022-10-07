<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <!DOCTYPE html>
        <html lang="en">

        <head>
            <title>Blog</title>
            <meta charset="utf-8">
            <meta name="viewport" content="width=device-width, initial-scale=1">
            <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
            <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"></script>
            <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
            <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css" rel="stylesheet">
            <link href="/css/style.css" rel="stylesheet">
        </head>

        <body>
            <table class="table table-striped">
                <thead>
                    <tr>
                        <th>번호</th>
                        <th>이메일</th>
                        <th>이름</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="company" items="${companyList}">
                        <tr>
                            <td>${company.companyId}</td>
                            <td>${company.companyEmail}</td>
                            <th>${company.companyName}</th>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </body>