<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<title>Insert title here</title>
</head>
<body>
    <div class="container">
        <form>
            <div class="mb-3 mt-3">
                <input id="introTitle" type="text" class="form-control" placeholder="Enter introTitle">
                <input id="introBirth" type="text" class="form-control" placeholder="Enter introBirth">
                <input id="introTask" type="text" class="form-control" placeholder="Enter introTask">
            </div>
            <button id="btnInsert" type="button" class="btn btn-primary">기업소개등록</button>
        </form>
    </div>

    <script>
        $("#btnInsert").click(()=>{
            insert();
        });
        
        function insert(){
            let data = {
                introTitle: $("#introTitle").val(),
                introBirth: $("#introBirth").val(),
                introTask: $("#introTask").val()
            }
            $.ajax("/insert",{
                type: "POST",
                dataType: "json",
                data: JSON.stringify(data), // http body에 들고갈 요청 데이터
                headers: { // http header에 들고갈 요청 데이터
                    "Content-Type": "application/json; charset=utf-8"
                }
            }).done((res)=>{
                if(res.code == 1){ // 성공
                    alert("등록성공");
                    location.reload;
                }else{ // 실패
                    alert("기업소개등록에 실패하였습니다.");
                }
            });
        }
    </script>