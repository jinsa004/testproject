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
            <button type="button" onclick="btnDeleteNotice()" class="btn btn-primary">공고삭제</button>
        </form>
    </div>

<script>
function btnDeleteNotice(){

	$.ajax("/notice/2", {
		type: "DELETE",
		dataType: "json"
	}).done((res) => {
		if (res.code == 1) {
            alert("공고삭제에 성공하였습니다.");
			location.href="/";
		} else {
            alert("공고삭제에 실패하였습니다.");
		}
	});
}
</script>
</body>
</html>