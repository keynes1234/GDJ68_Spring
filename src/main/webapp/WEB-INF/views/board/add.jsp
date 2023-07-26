<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../temp/bootStrap.jsp"></c:import>
</head>
<body>
<c:import url="../temp/header.jsp"></c:import>
	
	<section class="container mt-5">
	<h1 class="my-4">Notice Add Page</h1>
	
	<form action="./add" method="post">

		<div class="mb-3">
		  <label for="noticeSubject" class="form-label">SUBJECT</label>
		  <input type="text" name="noticeSubject" class="form-control" id="noticeSubject" placeholder="SUBJECT">
		</div>
		
		<div class="mb-3">
		  <label for="noticeName" class="form-label">NAME</label>
		  <input type="text" name="noticeName" class="form-control" id="noticeName" placeholder="NAME">
		</div>
		
		
		
		<div class="mb-3">
		  <label for="noticeContents" class="form-label">NOTICECONTENTS</label>
		  <textarea class="form-control" name="noticeContents" id="noticeContents" ></textarea>
		</div>	
		

		<div class="my-3">
			<button type="submit" class="btn btn-danger">글쓰기</button>
		</div>

	</form>
	</section>
</body>
</html>