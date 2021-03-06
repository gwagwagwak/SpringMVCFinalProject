<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%-- <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c-rt"%>
<%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="fmt-rt"%> --%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
	<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ page import="java.util.*"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link rel="stylesheet" type="text/css"
		href="//netdna.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css">
<!-- jquery 추가 -->
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/js/jquery-3.1.1.js"></script>

<!-- <script type="text/javascript" src="http:code.jquery.com/jquery-1.8.3.min.js"></script> -->
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>

<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/js/main.js"></script>

<!-- 댓글 작성 추가문  -->
<link
	href="//netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>


<%-- <script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/js/plugins/validate/jquery.validate.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/js/plugins/validate/additional-methods.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/js/plugins/validate/messages_ko.js"></script> --%>
<style>
.panel-shadow {
	box-shadow: rgba(0, 0, 0, 0.3) 7px 7px 7px;
}

.panel-white {
	border: 1px solid #dddddd;
}

.panel-white  .panel-heading {
	color: #333;
	background-color: #fff;
	border-color: #ddd;
}

.panel-white  .panel-footer {
	background-color: #fff;
	border-color: #ddd;
}

.post .post-heading {
	height: 95px;
	padding: 20px 15px;
}

.post .post-heading .avatar {
	width: 60px;
	height: 60px;
	display: block;
	margin-right: 15px;
}

.post .post-heading .meta .title {
	margin-bottom: 0;
}

.post .post-heading .meta .title a {
	color: black;
}

.post .post-heading .meta .title a:hover {
	color: #aaaaaa;
}

.post .post-heading .meta .time {
	margin-top: 8px;
	color: #999;
}

.post .post-image .image {
	width: 100%;
	height: auto;
}

.post .post-description {
	padding: 15px;
}

.post .post-description p {
	font-size: 14px;
}

.post .post-description .stats {
	margin-top: 20px;
}

.post .post-description .stats .stat-item {
	display: inline-block;
	margin-right: 5px;
}

.post .post-description .stats .stat-item .icon {
	margin-right: 8px;
}

.post .post-footer {
	border-top: 1px solid #ddd;
	padding: 15px;
}

.post .post-footer .input-group-addon a {
	color: #454545;
}

.post .post-footer .comments-list {
	padding: 0;
	margin-top: 20px;
	list-style-type: none;
}

.post .post-footer .comments-list .comment {
	display: block;
	width: 100%;
	margin: 20px 0;
}

.post .post-footer .comments-list .comment .avatar {
	width: 35px;
	height: 35px;
}

.post .post-footer .comments-list .comment .comment-heading {
	display: block;
	width: 100%;
}

.post .post-footer .comments-list .comment .comment-heading .user {
	font-size: 14px;
	font-weight: bold;
	display: inline;
	margin-top: 0;
	margin-right: 10px;
}

.post .post-footer .comments-list .comment .comment-heading .time {
	font-size: 12px;
	color: #aaa;
	margin-top: 0;
	display: inline;
}

.post .post-footer .comments-list .comment .comment-body {
	margin-left: 50px;
}

.post .post-footer .comments-list .comment>.comments-list {
	margin-left: 50px;
}
</style>

<title>Insert title here</title>
<script>
	$(function() {
		listReply("1"); //첫번째 페이지 댓글 목록이 나옴
		
		$("#btnReply").click(function() {
			reply();
		});
		$("#btnList").click(function() {
			location.href = "getQnaList.do";
		});
		$("#btnUpdate").click(function() {
			location.href = "qnaUpdatePage.do?q_no=${qna.q_no}";
		});
		$("#btnDelete").click(function() {
			if (confirm("정말 삭제하시겠습니까?")) {
				document.form1.action = "qnaDelete.do";
				document.form1.submit();
			}

			/* location.href = "qnaDelete.do?q_no=${qna.q_no}"; */
		});
	});

	function reply() {
		var comt_content = $("#comt_content").val(); //댓글내용
		var comt_textid = "${qna.q_no}"; //원글 번호
		var param = {
			"comt_content" : comt_content,
			"comt_textid" : comt_textid
		};
		$.ajax({
			type : "post",
			url : "commentInsert.do",
			data : param,
			success : function() {
				alert("댓글이 등록되었습니다.");	
				listReply("1");
			}/* ,
			dataType : 'json', 		
			data : param,																			error: function(req, status, errThrown) {
																												alert("network error occur");
																											} */
		});
	}
	
	
	
	
	
	  function listReply(num) {
			$.ajax({
				type : "post",
				url : "getCommentList.do?q_no=${qna.q_no}&curPage=" + num,
				dataType:'json',
				async:false,
				success : function(data, status, xhr) {
					console.log(data);
					
					alert("댓글리스트 가져오기 성공  " + data);
					var list = data.result;
					//$("#listReply").html(result); //listReply
					
				}
			});
		}  

	/*댓글 리스트 불러오기  */
	/* function listReply(num) {
		$.ajax({
			type : "post",
			url : "getCommentList.do?q_no=${qna.q_no}&curPage=" + num,
			success : function(result) {
				console.log(result);
				alert("댓글리스트 가져오기 성공");
				("#listReply").html(result); //listReply
				
			}
		});
	}  */
</script>


</head>
<body>

	
	<div class="container">

		<h2>
			Q&A
			<hr>
		</h2>


		<div class="col-sm-16">
			<div class="panel panel-white post panel-shadow">
<!-- 제목 -->
				<div class="post-heading">
					<div class="pull-left meta">
					
						<div class="title h1">
						${qna.q_title}
						</div>
					<h6 class="text-muted time"> &nbsp;&nbsp;&nbsp;&nbsp;${qna.q_divide}</h6>
					</div>
				</div>
	
			
<!--회원정보  -->			
				<div class="post-heading">
					<div class="pull-left image">
						<img src="http://bootdey.com/img/Content/user_1.jpg"
							class="img-circle avatar" alt="user profile image">
					</div>
					<div class="pull-left meta">
						<div class="title h5">
							<a href="#">
								<b style="font-size:16px;">${loginMember.m_fname}${loginMember.m_lname}</b>
							</a>
						</div>
						<h5 class="pull-right text-muted time">
							<fmt:formatDate value="${qna.q_date}" pattern="yyyy-MM-dd HH:mm:ss" />
						</h5>
					</div>
				</div>
				
<!-- 내용  -->
				<div class="post-description">
				<br>
					<p style="font-size:18px;">
						${qna.q_content}
					</p>
				</div>
				
				<br>
<!--버튼  -->
				<div class="post-description">
					<!-- buttons -->
						<div class="stats">
						
						<c:choose>
						<c:when test="${loginMember.m_email == qna.q_writer}">
						
							<button class="btn btn-default stat-item" id="btnUpdate"> 
								<strong>Update</strong>
								<!-- <i	class="fa fa-thumbs-up icon"></i>2 -->
							</button> 
						
							<button class="btn btn-default stat-item" id="btnDelete"> 
								<strong>Delete</strong>
								<!-- <i	class="fa fa-share icon"></i>12 -->
							</button>
						
							<button class="pull-right btn btn-default stat-item" id="btnList"> 
								<strong>List</strong>
								<!-- <i	class="fa fa-share icon"></i>12 -->
							</button>
						</c:when>
						<c:otherwise>
							<button class="btn btn-default stat-item" id="btnList"> 
									<strong>List</strong>
									<!-- <i	class="fa fa-share icon"></i>12 -->
							</button>
						</c:otherwise>
						</c:choose>
							<!-- 	<a href="#" class="btn btn-default stat-item"> 	
							 	<i class="fa fa-thumbs-up icon"></i>2
							</a> 
							<a href="#" class="btn btn-default stat-item"> 
								<i class="fa fa-share icon"></i>12
							</a> -->
						</div>
				</div>
				
<!--댓글 작성 및 댓글 리스트 출력  -->
				<div class="post-footer">
<!-- 댓글 작성 버튼  -->
				<div class="alert alert-info" style="line-height:5px; margin-bottom:2px; padding-left:10px;">
 					<strong>Write Comment for Paypal User!</strong> 
				</div>



					<div class="input-group">
					
				
						<!-- <input class="form-control" placeholder="Add a comment" type="text"> -->
						 <textarea class="form-control" rows="3" name="comt_content" id="comt_content"
										placeholder="Write in your wall" autofocus="">
						</textarea>
						
						<span class="input-group-addon"> 
							<a id="btnReply" href="#">
								<!-- <i class="fa fa-edit"></i> -->
								<span class="glyphicon glyphicon-pencil"></span>
							</a>
						</span>
					</div>
<!--관리자 댓글 리스트  -->	
			<%-- <c:if test="${qna.q_complete == '답변완료'}" > --%>					
					<ul class="comments-list">
						<li class="comment">
						<a class="pull-left" href="#"> 
							<img class="avatar" src="http://bootdey.com/img/Content/user_1.jpg" alt="avatar">
						</a>
							<div class="comment-body">
								<div class="comment-heading">
									<h4 class="user">Administrator</h4>
									<h5 class="time">댓글 단 시간</h5>
								</div>
								<p>댓글 내용</p>
							</div>
								
						
			
<!-- 일반 댓글 리스트 반복문 -->				
	
							<ul class="comments-list">
								
								<li class="comment">
								<a class="pull-left" href="#"> 
									<img class="avatar" src="http://bootdey.com/img/Content/user_3.jpg" alt="avatar">
								</a>
									<div class="comment-body">
										<div class="comment-heading">
											<h4 class="user">Ryan Haywood</h4>
											<h5 class="time">3 minutes ago</h5>
										</div>
										<p>Relax my friend</p>
									</div>
								</li>
							</ul>
<!-- 댓글 반복문  -->		
	
				<c:if test="${not empty commentlist}">
					<c:forEach var="row" items="${commentlist}">
							<ul class="comments-list">
								
								<li class="comment">
								<a class="pull-left" href="#"> 
									<img class="avatar" src="http://bootdey.com/img/Content/user_3.jpg" alt="avatar">
								</a>
									<div class="comment-body">
										<div class="comment-heading">
											<h4 class="user"> 
												<img class="avatar" src="http://bootdey.com/img/Content/user_2.jpg"
												alt="avatar">
											</h4>
											<h5 class="time">${row.comt_date}</h5>
										</div>
										<p>	${row.comt_content}</p>
									</div>
								</li>
								<!--  <img
										class="avatar" src="http://bootdey.com/img/Content/user_2.jpg"
										alt="avatar"> -->
							</ul>
				</c:forEach>
			</c:if>
							
							
							
						</li>
					</ul>
				</div>
			</div>
		</div>
	</div>

	<%-- 	<h2>게시물 보기 연습2</h2>
	<form id="form1" name="form1" method="post" action="">
		<div>
			작성일자 :
			${qna.q_date}
			<fmt:formatDate value="${qna.q_date}" pattern="yyyy-MM-dd" />
			<fmt:formatDate value="${row.q_date}" pattern="yyyy-MM-dd" />
		</div>
		<div>이름:${qna.q_writer}</div>
		<div>제목:${qna.q_title}</div>
		<div>분류:${qna.q_divide}</div>
		<div>
			내용:
			<textarea rows="4" cols="80" name="q_content" id="q_content" readonly>${qna.q_content}</textarea>
		</div>
		<div>${qna.q_replytype}</div>
		<div>${qna.q_private}</div>
		<div>${qna.q_complete}</div>
		<br> <br>
		<div>
			<input type="hidden" name="q_no" value="${qna.q_no}">
			<c:if test="${sessionScope.userid == qna.writer}">
			<c:if test="${loginMember.m_email == qna.q_writer}">
				<button type="button" id="btnUpdate">수정</button>
				<button type="button" id="btnDelete">삭제</button>
			</c:if>
			<button type="button" id="btnList">목록</button>
		</div>
	</form>
 --%>

	<!-- <br> -->
	<!-- 댓글 작성 란 -->
	<!-- <div style="width: 700px; text-align: center"> -->
	<!--현재는 로그인을 해야만 보임  -->
	<%-- <c:if test="${sessionScope.userid != null}"> --%>
	<!-- <textarea rows="5" cols="80" name="comt_content" id="comt_content"
			placeholder="댓글을 작성하세요">
				
			</textarea>
		<br>
		<button type="button" id="btnReply">댓글 작성</button> -->
	<%-- </c:if> --%>
	<!-- </div> -->

	<%-- 
	<div class="container">
		<h2>Q&A</h2>
		<hr>
		<div class="row">
			<form id="form1" name="form1" method="post" action="">
				<div class="container-fluid">
					<div class="row">
						<div class="col-sm-2 col-md-6">
							<p>qna 게시글의 제목입니다.</p>
						</div>
						<div class="col-sm-10 col-md-6">
							<p>
								<fmt:formatDate value="${qna.q_date}" pattern="yyyy-MM-dd" />
							</p>
						</div>
					</div>
				</div>

				<div class="container-fluid">
					<div class="row">
						<div class="col-sm-2 col-md-6">
							<p>${qna.q_writer}</p>
						</div>

					</div>
				</div>
				<div class="container-fluid">
					<div class="row">
						<div>

							<textarea rows="4" cols="80" name="q_content" id="q_content"
								readonly>${qna.q_content}</textarea>
						</div>
					</div>
				</div> --%>





	<%-- 	<div>
					작성일자 :
					${qna.q_date}
					<fmt:formatDate value="${qna.q_date}" pattern="yyyy-MM-dd" />
					<fmt:formatDate value="${row.q_date}" pattern="yyyy-MM-dd" />
				</div>
				<div>이름:${qna.q_writer}</div>
				<div>제목:${qna.q_title}</div>
				<div>분류:${qna.q_divide}</div>
				<div>
					
					<textarea rows="4" cols="80" name="q_content" id="q_content"
						readonly>${qna.q_content}</textarea>
				</div>
				 --%>
<!-- 	<br>
	<br> -->


	<%-- <div>
		<input type="hidden" name="q_no" value="${qna.q_no}">
		<c:if test="${sessionScope.userid == qna.writer}">
		<c:if test="${loginMember.m_email == qna.q_writer}">
			<button type="button" id="btnUpdate">수정</button>
			<button type="button" id="btnDelete">삭제</button>
		</c:if>
		<button type="button" id="btnList">목록</button>
	</div>
 --%>

<!-- 
	</form> -->

	<!-- <div class="ui-group-buttons">
				<a href="http://www.jquery2dotnet.com" class="btn btn-danger"
					role="button"><span class="glyphicon glyphicon-pencil"
					style="padding-right: 4px;"></span>Compose</a>
				<div class="or"></div>
				<a href="http://www.jquery2dotnet.com" class="btn btn-danger"
					role="button"><span class="glyphicon glyphicon-inbox"
					style="padding-right: 4px;"></span>Inbox</a>
				<div class="or"></div>
				<a href="http://www.jquery2dotnet.com" class="btn btn-danger"
					role="button"><span class="glyphicon glyphicon-send"
					style="padding-right: 4px;"></span>Send</a>
			</div> -->



	<!-- 댓글 입력 및 댓글 리스트  -->
	<!-- 		<div class="panel panel-default widget">

				<div class="panel-heading">
					<span class="glyphicon glyphicon-comment"></span>
					<h3 class="panel-title"><Strong>Comment</Strong></h3>
				</div> -->

	<!--WRITE-->
	<!-- <button type="button" id="btnReply" class="[ btn btn-info ]"
					data-loading-text="Loading...">Post reply</button> -->

	<!-- 	<div class="col">
					<div class="panel-body">
						<form role="form">
							<fieldset>
								<div class="form-group">
									<textarea class="form-control" rows="3"
										placeholder="Write in your wall" autofocus=""></textarea>
									<button type="button" id="btnReply" class="[ btn btn-info ]"
										data-loading-text="Loading...">Post reply</button>
								</div>
							</fieldset>

						</form>
					</div>
				</div>
 -->


	<!-- ajax로 불러온 댓글 -->
	<!-- 	<div class="panel-body">
				<div id="listReply"></div>
			</div> -->


	<!-- <div class="panel-body" id="listReply" -->
	<!--댓글 목록 ajax로 불러옴-->
	<!-- 
				 <div class="panel-body">
					<ul class="list-group">
						<li class="list-group-item">
							<div class="row">
								<div class="col-xs-2 col-md-1">
									<img src="http://placehold.it/80"
										class="img-circle img-responsive" alt="" />
								</div>
								<div class="col-xs-10 col-md-11">
									<div>
										<a href="#"> Congratulations</a>
										<div class="mic-info">
											By: <a href="#">Check My Athletics</a> on 12 Jun 2014
										</div>
									</div>
									<div class="comment-text">We would like to congratulate
										John on his achievement...</div>
								</div>
							</div>
						</li>
					</ul>
				</div>

				<div class="panel-body">
					<ul class="list-group">
						<li class="list-group-item">
							<div class="row">
								<div class="col-xs-2 col-md-1">
									<img src="http://placehold.it/80"
										class="img-circle img-responsive" alt="" />
								</div>
								<div class="col-xs-10 col-md-11">
									<div>
										<a href="#"> Congratulations</a>
										<div class="mic-info">
											By: <a href="#">Check My Athletics</a> on 12 Jun 2014
										</div>
									</div>
									<div class="comment-text">We would like to congratulate
										John on his achievement...</div>
								</div>
							</div>
						</li>
					</ul>
				</div> 
				


			</div>
		</div>
		
	</div>
 -->



	<!-- 댓글 목록 출력 영역 -->
	<!-- 	<div id="listReply"></div> -->


</body>
</html>