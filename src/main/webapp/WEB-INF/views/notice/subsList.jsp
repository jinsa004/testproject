<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <!DOCTYPE html>
        <html>

        <head>
            <meta charset="UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1">
            <title>Insert title here</title>
        </head>

        <body>
            <div class="container">
                <form>
                    <c:forEach var="noticeList" items="${noticeList}">
                        <ul>
                            <li>${noticeList.noticeTitle}</li>
                            <li>${noticeList.noticeConame}</li>
                        </ul>
                    </c:forEach>
                </form>
            </div>
        </body>

        </html>