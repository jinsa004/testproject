<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>
</head>
<body>
    <div class="container">
        <form action="/insert" method="post">
            <div class="mb-3 mt-3">
                <input name="noticeTitle" type="text" class="form-control" placeholder="Enter noticeTitle">
                <input name="noticeConame" type="text" class="form-control" placeholder="Enter noticeConame">
                <input name="noticeImage" type="text" class="form-control" placeholder="Enter noticeImage">
                <input name="noticePeriod" type="text" class="form-control" placeholder="Enter noticePeriod">
                <input name="noticeDept" type="text" class="form-control" placeholder="Enter noticeDept">
                <input name="noticePosition" type="text" class="form-control" placeholder="Enter noticePosition">
                <input name="noticeTask" type="text" class="form-control" placeholder="Enter noticeTask">
                <input name="noticeSal" type="text" class="form-control" placeholder="Enter noticeSal">
                <input name="noticeQual" type="text" class="form-control" placeholder="Enter noticeQual">
                <input name="noticeCareer" type="text" class="form-control" placeholder="Enter noticeCareer">
                <input name="noticeWellfare" type="text" class="form-control" placeholder="Enter noticeWellfare">
                <input name="companyId" type="text" class="form-control" placeholder="Enter companyId">
            </div>
            <button type="submit" class="btn btn-primary">공고등록</button>
        </form>
    </div>
</body>
</html>