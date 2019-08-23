
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">
<head>
<style>
@media ( min-width : 768px) {
	.navbar-nav.navbar-center {
		position: absolute;
		left: 50%;
		transform: translatex(-50%);
	}
}
</style>
<meta charset="utf-8" />
<link rel="icon" type="image/png"
	href="${pageContext.request.contextPath}/resources/img/favicon.ico">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
<title>Awesome Landing Page by Creative Tim</title>
<meta
	content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0'
	name='viewport' />
<meta name="viewport" content="width=device-width" />

<link
	href="${pageContext.request.contextPath}/resources/css/bootstrap.css"
	rel="stylesheet" />
<link
	href="${pageContext.request.contextPath}/resources/css/landing-page.css"
	rel="stylesheet" />

<!--     Fonts and icons     -->
<link
	href="http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css"
	rel="stylesheet">
<link
	href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400,300'
	rel='stylesheet' type='text/css'>
<link
	href="${pageContext.request.contextPath}/resources/css/pe-icon-7-stroke.css"
	rel="stylesheet" />


<script src="//developers.kakao.com/sdk/js/kakao.min.js"></script>

<link
	href="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/css/bootstrap-combined.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
</head>

<!-- body\==================================================================== -->
<body class="landing-page landing-page1">

	<!-- 네비게이션 -->

	<!-- <nav class="navbar navbar-transparent navbar-fixed-top" role="navigation"> -->
	<nav class="navbar navbar-dark bg-warning">
	<div class="navbar-header navbar-dark">
		<button type="button" class="navbar-toggle" data-toggle="collapse"
			data-target=".navbar-collapse">
			<span class="icon-bar"></span> <span class="icon-bar"></span> <span
				class="icon-bar"></span>
		</button>
	</div>
	<div class="navbar-collapse collapse">

		<ul class="nav navbar-nav navbar-left">
			<li><a href="#">PayLog</a></li>
		</ul>
		<ul class="nav navbar-nav navbar-center">
			<li><a href="#">개인</a></li>
			<li><a href="#">고객</a></li>
			<li><a href="#">구매</a></li>
		</ul>
		<ul class="nav navbar-nav navbar-right">
			<li><a href="#">로그인</a></li>
			<li><a href="#">회원가입</a></li>
		</ul>
	</div>
	</nav>

	<!--AJAX 처리  -->
	<div class="btn-toolbar">
		<button class="btn btn-primary">답변 완료</button>
		<button class="btn">답변 미완료</button>
		<button class="btn">시간 정렬</button>
	</div>
	<div class="well">
		<table class="table">
			<thead>
				<tr>
					<th>번호</th>
					<th>답변 여부</th>
					<th>구분</th>
					<th>제목</th>
					<th>작성자</th>
					<th>등록일</th>
					<th style="width: 36px;"></th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>1</td>
					<td>Mark</td>
					<td>Tompson</td>
					<td>the_mark7</td>
					<td>the_mark7</td>
					<td>the_mark7</td>
					<td><a href="user.html"><i class="icon-pencil"></i></a> <a
						href="#myModal" role="button" data-toggle="modal"><i
							class="icon-remove"></i></a></td>
				</tr>
				<tr>
					<td>2</td>
					<td>Ashley</td>
					<td>Jacobs</td>
					<td>ash11927</td>
					<td>ash11927</td>
					<td>ash11927</td>
					<td><a href="user.html"><i class="icon-pencil"></i></a> <a
						href="#myModal" role="button" data-toggle="modal"><i
							class="icon-remove"></i></a></td>
				</tr>
				<tr>
					<td>3</td>
					<td>Audrey</td>
					<td>Ann</td>
					<td>audann84</td>
					<td>audann84</td>
					<td>audann84</td>
					<td><a href="user.html"><i class="icon-pencil"></i></a> <a
						href="#myModal" role="button" data-toggle="modal"><i
							class="icon-remove"></i></a></td>
				</tr>
				<tr>
					<td>4</td>
					<td>John</td>
					<td>Robinson</td>
					<td>jr5527</td>
					<td>jr5527</td>
					<td>jr5527</td>
					<td><a href="user.html"><i class="icon-pencil"></i></a> <a
						href="#myModal" role="button" data-toggle="modal"><i
							class="icon-remove"></i></a></td>
				</tr>
				<tr>
					<td>5</td>
					<td>Aaron</td>
					<td>Butler</td>
					<td>aaron_butler</td>
					<td>aaron_butler</td>
					<td>aaron_butler</td>
					<td><a href="user.html"><i class="icon-pencil"></i></a> <a
						href="#myModal" role="button" data-toggle="modal"><i
							class="icon-remove"></i></a></td>
				</tr>
				<tr>
					<td>6</td>
					<td>Chris</td>
					<td>Albert</td>
					<td>cab79</td>
					<td>cab79</td>
					<td>cab79</td>
					<td><a href="user.html"><i class="icon-pencil"></i></a> <a
						href="#myModal" role="button" data-toggle="modal"><i
							class="icon-remove"></i></a></td>
				</tr>
			</tbody>
		</table>
	</div>
	
	
	
	<!--페이지네이션  ===========================================================================================-->
	<div class="pagination">
		<ul>
			<li><a href="#">Prev</a></li>
			<li><a href="#">1</a></li>
			<li><a href="#">2</a></li>
			<li><a href="#">3</a></li>
			<li><a href="#">4</a></li>
			<li><a href="#">Next</a></li>
		</ul>
	</div>
	<div class="modal small hide fade" id="myModal" tabindex="-1"
		role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-header">
			<button type="button" class="close" data-dismiss="modal"
				aria-hidden="true">Ã</button>
			<h3 id="myModalLabel">Delete Confirmation</h3>
		</div>
		<div class="modal-body">
			<p class="error-text">Are you sure you want to delete the user?</p>
		</div>
		<div class="modal-footer">
			<button class="btn" data-dismiss="modal" aria-hidden="true">Cancel</button>
			<button class="btn btn-danger" data-dismiss="modal">Delete</button>
		</div>
	</div>
</body>
</html>