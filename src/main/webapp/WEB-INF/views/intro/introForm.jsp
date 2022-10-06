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
                <input name="introTitle" type="text" class="form-control" placeholder="Enter introTitle">
                <input name="introBirth" type="text" class="form-control" placeholder="Enter introBirth">
                <input name="introTask" type="text" class="form-control" placeholder="Enter introTask">
                <input name="introSal" type="text" class="form-control" placeholder="Enter introSal">
                <input name="introWellfare" type="text" class="form-control" placeholder="Enter introWellfare">
                <input name="introContent" type="text" class="form-control" placeholder="Enter introContent">
                <input name="introLocation" type="text" class="form-control" placeholder="Enter introLocation">
                <input name="jobId" type="text" class="form-control" placeholder="Enter jobId">
                <input name="introImage" type="text" class="form-control" placeholder="Enter introImage">
            </div>
            <button type="submit" class="btn btn-primary">공고등록</button>
        </form>
    </div>
</body>
</html>