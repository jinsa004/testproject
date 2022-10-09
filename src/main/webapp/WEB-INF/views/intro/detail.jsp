<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <!DOCTYPE html>
        <html>

        <head>
            <meta charset="UTF-8">
            <title>Insert title here</title>
            <script src="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-lite.min.js"></script>
            <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css" rel="stylesheet">
            <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
        </head>

        <body>
            <div class="d-flex justify-content-between" var="intro" items="${intro}">
                <h3>제목</h3>
                <div>구독 <i id="iconHeart" class="fa-regular fa-heart"></i></div>
                <div>회사명 <span>${intro.companyName}</span></div>
                <div>주요업무 <span>${intro.introTask}</span></div>
                <div>설립연도 <span>${intro.introBirth}</span></div>
                <div>평균연봉 <span>${intro.introSal}</span></div>
                <div>기업복지 <span>${intro.introWellfare}</span></div>
                <div>회사소개 <span>${intro.introContent}</span></div>
            </div>
        </body>

        <script>
            $("#iconHeart").click(() => {
                let check = $("#iconHeart").hasClass("fa-regular");
                console.log(check);
                if (check == true) {
                    $("#iconHeart").removeClass("fa-regular");
                    $("#iconHeart").addClass("fa-solid");
                    $("#iconHeart").css("color", "red");
                } else {
                    $("#iconHeart").removeClass("fa-solid");
                    $("#iconHeart").addClass("fa-regular");
                    $("#iconHeart").css("color", "black");
                }
            });
        </script>

        </html>