<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!--순서 조심 !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	1. jqueyr.min.js
	2. bootstrap.min.js
	3. bootstrap.min.css
  -->
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<style>
.ds-btn li{ list-style:none; float:left; padding:10px; }
.ds-btn li a span{padding-left:15px;padding-right:5px;width:100%;display:inline-block; text-align:left;}
.ds-btn li a span small{width:100%; display:inline-block; text-align:left;}
</style>
</head>
<body>

	<hr>
	<div class="container bootstrap snippet">
		<div class="row">
			<div class="col-sm-10">
				<h1>Profile</h1>
			</div>
			<div class="col-sm-2">
				<a href="/users" class="pull-right"><img title="profile image"
					class="img-circle img-responsive"
					src="http://www.gravatar.com/avatar/28fd20ccec6865e2d5f0e1f4446eb7bf?s=100"></a>
			</div>
		</div>
		<div class="row">
			<div class="col-sm-3">
				<!--left col-->

				<ul class="list-group">
					<li class="list-group-item text-muted">Profile</li>
					<li class="list-group-item text-right"><span class="pull-left"><strong>Real
								name</strong></span> ${loginMember.m_fname}${loginMember.m_lname}</li>
					<li class="list-group-item text-right"><span class="pull-left"><strong>Joined</strong></span>
						<fmt:parseDate value="${loginMember.m_joindate}" var="m_joindate"
							pattern="yyyy-MM-dd HH:mm:ss.S" scope="page" /> <fmt:formatDate
							value="${m_joindate}" pattern="yyyy.MM.dd" /></li>
					<li class="list-group-item text-right"><span class="pull-left"><strong>Type</strong></span>
						<c:choose>
							<c:when test="${loginMember.m_type eq 1}">
            			Administrator
            		</c:when>
							<c:when test="${loginMember.m_type eq 2}">
            			Personal
            		</c:when>
							<c:otherwise>
            			Business
            		</c:otherwise>
						</c:choose></li>
					<%--    <fmt:formatDate value="${loginMember.m_joindate}" pattern="yyyy-MM-dd" /> --%>
				</ul>

				<div class="panel panel-default">
					<div class="panel-heading">
						<Strong>E-mail </Strong><i class="fa fa-link fa-1x"></i>
					</div>
					<div class="panel-body">
						<a href="http://bootnipets.com">${loginMember.m_email}</a>
					</div>
				</div>


				<ul class="list-group">
					<li class="list-group-item text-muted">Activity <i
						class="fa fa-dashboard fa-1x"></i></li>
					<li class="list-group-item text-right"><span class="pull-left"><strong>Shares</strong></span>
						125</li>
					<li class="list-group-item text-right"><span class="pull-left"><strong>Likes</strong></span>
						13</li>
					<li class="list-group-item text-right"><span class="pull-left"><strong>Posts</strong></span>
						37</li>
					<li class="list-group-item text-right"><span class="pull-left"><strong>Followers</strong></span>
						78</li>
				</ul>

				<div class="panel panel-default">
					<div class="panel-heading">Social Media</div>
					<div class="panel-body">
						<i class="fa fa-facebook fa-2x"></i> <i class="fa fa-github fa-2x"></i>
						<i class="fa fa-twitter fa-2x"></i> <i
							class="fa fa-pinterest fa-2x"></i> <i
							class="fa fa-google-plus fa-2x"></i>
					</div>
				</div>

			</div>
			<!--/col-3-->
			<div class="col-sm-9">
<!-- 회원 네브바 -->
				<ul class="nav nav-tabs" id="myTab">
					<li class="active"><a href="#home" data-toggle="tab">Home</a></li>
					<li><a href="#messages" data-toggle="tab">My QnA</a></li>
					<li><a href="#settings" data-toggle="tab">Settings</a></li>
					<li><a href="#security" data-toggle="tab">Security</a></li>
				</ul>

				<div class="tab-content">

<!-- 회원 정보-->
					<div class="tab-pane active" id="home">
						<div class="table-responsive">

							<table class="table table-hover">
								<thead>
									<tr>
										<th>#</th>
										<th>Label 1</th>
										<th>Label 2</th>
										<th>Label 3</th>
										<th>Label</th>
										<th>Label</th>
										<th>Label</th>
									</tr>
								</thead>
								<tbody id="items_home">
									<tr>
										<td>1</td>
										<td>Table cell</td>
										<td>Table cell</td>
										<td>Table cell</td>
										<td>Table cell</td>
										<td>Table cell</td>
										<td>Table cell</td>
									</tr>
									<tr>
										<td>2</td>
										<td>Table cell</td>
										<td>Table cell</td>
										<td>Table cell</td>
										<td>Table cell</td>
										<td>Table cell</td>
										<td>Table cell</td>
									</tr>
									<tr>
										<td>3</td>
										<td>Table cell</td>
										<td>Table cell</td>
										<td>Table cell</td>
										<td>Table cell</td>
										<td>Table cell</td>
										<td>Table cell</td>
									</tr>
									<tr>
										<td>4</td>
										<td>Table cell</td>
										<td>Table cell</td>
										<td>Table cell</td>
										<td>Table cell</td>
										<td>Table cell</td>
										<td>Table cell</td>
									</tr>
									<tr>
										<td>5</td>
										<td>Table cell</td>
										<td>Table cell</td>
										<td>Table cell</td>
										<td>Table cell</td>
										<td>Table cell</td>
										<td>Table cell</td>
									</tr>
									<tr>
										<td>6</td>
										<td>Table cell</td>
										<td>Table cell</td>
										<td>Table cell</td>
										<td>Table cell</td>
										<td>Table cell</td>
										<td>Table cell</td>
									</tr>
									<tr>
										<td>7</td>
										<td>Table cell</td>
										<td>Table cell</td>
										<td>Table cell</td>
										<td>Table cell</td>
										<td>Table cell</td>
										<td>Table cell</td>
									</tr>
									
								</tbody>
							</table>

							<hr>

							<div class="row">
								<div class="col-md-4 col-md-offset-4 text-center">
									<ul class="pagination" id="myPager"></ul>
								</div>
							</div>
						</div>
						<!--/table-resp-->

						<hr>

					</div>

<!-- 회원이 쓴 qnalist-->
					<div class="tab-pane" id="messages">
						<h2></h2>
						<ul class="list-group">
							<li class="list-group-item text-muted">Inbox</li>
							<li class="list-group-item text-right">
								<a href="#"
									class="pull-left">Here is your a link to the latest summary
										report from the..
								</a> 2.13.2014</li>
							<li class="list-group-item text-right"><a href="#"
								class="pull-left">Hi Joe, There has been a request on your
									account since that was..</a> 2.11.2014</li>
							<li class="list-group-item text-right"><a href="#"
								class="pull-left">Nullam sapien massaortor. A lobortis
									vitae, condimentum justo...</a> 2.11.2014</li>
							<li class="list-group-item text-right"><a href="#"
								class="pull-left">Thllam sapien massaortor. A lobortis
									vitae, condimentum justo...</a> 2.11.2014</li>
							<li class="list-group-item text-right"><a href="#"
								class="pull-left">Wesm sapien massaortor. A lobortis vitae,
									condimentum justo...</a> 2.11.2014</li>
							<li class="list-group-item text-right"><a href="#"
								class="pull-left">For therepien massaortor. A lobortis
									vitae, condimentum justo...</a> 2.11.2014</li>
							<li class="list-group-item text-right"><a href="#"
								class="pull-left">Also we, havesapien massaortor. A lobortis
									vitae, condimentum justo...</a> 2.11.2014</li>
							<li class="list-group-item text-right"><a href="#"
								class="pull-left">Swedish chef is assaortor. A lobortis
									vitae, condimentum justo...</a> 2.11.2014</li>
						</ul>
					</div>
					<!--/tab-pane-->

<!--security 부분  -->
						<div class="tab-pane" id="security">
						<hr>
						<!-- <form class="form" action="##" method="post" id="registrationForm"> -->
							
							<div class="form-group" >
								<div class="col-sm-12" style="height:120px;">
									<label for="secu">
										<h1><Strong>Enhance your security for safety ! </Strong></h1>
									</label>
								</div>
								
							</div>
							
						
	<div class="row">
    <ul class="ds-btn">
        <div class="form-group">
        <div class="col-xs-12">
        <li>
               <a class="btn btn-lg btn-warning" style="width: 400px; height: 70px;" href="http://dotstrap.com/">
        <i class="glyphicon glyphicon-question-sign pull-left"></i><span>Security Question<br><small>add your second pw</small></span></a> 
        </li>
        </div>
       </div>
       
      <div class="form-group">
        <div class="col-xs-12">
        <li>
               <a class="btn btn-lg btn-info" href="http://dotstrap.com/" style="width: 400px; height: 70px;">
         <i class="glyphicon glyphicon-wrench pull-left"></i>
         <span>Change Password<br><small>upgrade your pw!</small></span></a> 
        </li>
         </div>
       </div>
    </ul>
    
	</div>
</div>
					<!-- </div> -->

<!-- 회원 정보 수정란-->
					<div class="tab-pane" id="settings">
						<hr>
						<form class="form" action="updateUserInfo.do" method="post" id="registrationForm">

							<div class="form-group">

								<div class="col-xs-12">
									<label for="m_hp"><h4>H.P.</h4></label> <input type="text"
										class="form-control" name="m_hp" id="m_hp" placeholder="H.P."
										title="enter your first name if any.">
								</div>
							</div>

							<div class="form-group">

								<div class="col-xs-12">
									<label for="m_nation"><h4>Nation</h4></label> <input
										type="text" class="form-control" name="m_nation" id="m_nation"
										placeholder="Nation..." title="enter your last name if any.">
								</div>
							</div>

							<div class="form-group">

								<div class="col-xs-12">
									<label for="m_addr"><h4>Address</h4></label> <input type="text"
										class="form-control" name="m_addr" id="m_addr"
										placeholder="Address..."
										title="enter your phone number if any.">
								</div>
							</div>
							<div class="form-group">
								<div class="col-xs-12">
									<br>
									<button class="btn btn-lg btn-success" type="submit">
										<i class="glyphicon glyphicon-ok-sign"></i> Save
									</button>
									<button class="btn btn-lg" type="reset">
										<i class="glyphicon glyphicon-repeat"></i> Reset
									</button>
								</div>
							</div>
						</form>
					</div>

				</div>
				<!--/tab-pane-->
			</div>
			<!--/tab-content-->

		</div>
		<!--/col-9-->
	</div>
	<!--/row-->

</body>
</html>