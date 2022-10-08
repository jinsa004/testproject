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
                <input id="noticeTitle" type="text" class="form-control" placeholder="Enter noticeTitle">
                <input id="noticeConame" type="text" class="form-control" placeholder="Enter noticeConame">
                <input id="noticeId" type="text" class="form-control" placeholder="Enter noticeId">
            </div>
            <button type="button" onclick="btnUpdateNotice()" class="btn btn-primary">수정하기</button>
        </form>
    </div>

<script>
function btnUpdateNotice(){
    let data = {
        noticeTitle : $("#noticeTitle").val(),
        noticeConame : $("#noticeConame").val(),
        noticeId : $("#noticeId").val()
		};
        
        console.log(data);
	$.ajax("/noticeSave", {
		type: "PUT",
		dataType: "json",
		data: JSON.stringify(data),
		headers: {
			"Content-Type": "application/json; charset=utf-8"
		}
	}).done((res) => {
		if (res.code == 1) {
            alert("수정에 성공하였습니다.");
			location.href="/";
		} else {
            alert("수정에 실패하였습니다.");
		}
	});
}
</script>
</body>
</html>