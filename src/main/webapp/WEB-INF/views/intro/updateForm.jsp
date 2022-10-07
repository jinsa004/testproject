<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
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
                    <input id="id" type="hidden" value="${intro.introId}">
                    <input id="introTitle" type="text" class="form-control" placeholder="Enter introTitle">
                    <input id="introBirth" type="text" class="form-control" placeholder="Enter introBirth">
                    <input id="introTask" type="text" class="form-control" placeholder="Enter introTask">
                </div>
                <button id="btnUpdate" type="button" class="btn btn-primary">기업소개수정</button>
            </form>
        </div>

        <script>
            $("#btnUpdate").click(() => {
                update();
            });

            function update() {
                let data = {
                    introTitle: $("#introTitle").val(),
                    introBirth: $("#introBirth").val(),
                    introTask: $("#introTask").val()
                };

                let introId = $("#introId").val();

                $.ajax("/update/" + introId, {
                    type: "PUT",
                    dataType: "json", // 응답 데이터
                    data: JSON.stringify(data), // http body에 들고갈 요청 데이터
                    headers: { // http header에 들고갈 요청 데이터
                        "Content-Type": "application/json; charset=utf-8"
                    }
                }).done((res) => {
                    if (res.code == 1) {
                        alert("수정 완료");
                        location.reload;
                    } else {
                        alert("업데이트에 실패하였습니다");
                    }
                });
            }
        </script>