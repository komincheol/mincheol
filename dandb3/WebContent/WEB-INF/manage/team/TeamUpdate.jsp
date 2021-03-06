<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
	<meta charset="UTF-8">

	<!-- Bootstrap -->
	<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css"> 
	<script src="http://code.jquery.com/jquery-latest.min.js"></script> 
	<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
	
	<title>팀 수정 페이지</title>

</head>
<body>
<div class="container">

<form action="teamUpdateAction" method="post">

	<label> 팀 수정 페이지 </label>
	
	<div class="form-group row">
		<label for="teamId" class="col-2 col-form-label">팀 아이디</label>
		<input type="text" id="teamId" name="teamId">
		<p class="navbar-text">${teamVO.teamId}</p>
	</div>
	
	<div class="form-group row">
		<label for="teamName" class="col-2 col-form-label"> 팀 이름 </label>
		<input type="text" id="teamName" name="teamName" value="${teamVO.teamName}"/>
	</div>
	
	<div class="form-group row">
		<label for="teamName" class="col-2 col-form-label"> 팀 날짜 </label>
		<input type="text" id="teamDay" name="teamDay" value="${teamVO.teamDay}" />
	</div>
	
	<div class="form-group row">
		<label for="teamName" class="col-2 col-form-label"> 팀 장소 </label>
		<input type="text" id="location" name="location" value="${teamVO.location}" />
	</div>
	
	<div class="form-group row">
		<label for="teamName" class="col-2 col-form-label"> 메인 시간 </label>
		<input type="text" id="mainTime" name="mainTime" value="${teamVO.mainTime}" />
	</div>
	
	<div class="form-group row">
		<label for="teamName" class="col-2 col-form-label"> 준비 시간 </label>
		<input type="text" id="preTime" name="preTime" value="${teamVO.preTime}" />
	</div>
	
	<div class="form-group row">
		<label for="teamName" class="col-2 col-form-label"> 팀소개 </label>
		<input type="text" id="teamUrl" name="teamUrl" value="${teamVO.teamUrl}" />
	</div>
	
	<button type="submit" class="btn btn-primary">Submit</button>
</form>

</div>

</body>
</html>