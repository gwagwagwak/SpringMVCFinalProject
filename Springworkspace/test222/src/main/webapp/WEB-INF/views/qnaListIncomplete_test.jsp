<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>Home</title>


<link
	href="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/css/bootstrap-combined.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<!------ Include the above in your HEAD tag ---------->
<style>
thead {
	background-color: #ADD8E6;
	font-size: 17px;
}
</style>
</head>

<!--qna list table~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~  -->


<div class="container">
	<div class="alert alert-success">
		<strong>Success!</strong> Indicates a successful or positive action.
	</div>

<!-- 완료, 미완료 구분 버튼 ===================================================================== -->
	<div class="btn-toolbar">
		<!-- <button class="btn btn-primary">New User</button> -->

		<button class="btn">
			<strong>Complete</strong>
		</button>
		<button class="btn disabled">
			<strong>Incomplete</strong>
		</button>
	</div>
	
	<!-- 테이블 리스트 =============================================================================== -->
	<div class="well">
		<table class="table">
			<thead>
				<tr>
					<th>No.</th>
					<th>Division</th>
					<th>Title</th>
					<th>Writer</th>
					<th>Date</th>
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

					<td><i class="icon-remove"></i> <a href="user.html"><i
							class="icon-pencil"></i></a> <!-- <a
							href="#myModal" role="button" data-toggle="modal"><i
								class="icon-remove"></i></a> --></td>
				</tr>
				<tr>
					<td>2</td>
					<td>Ashley</td>
					<td>Jacobs</td>
					<td>ash11927</td>
					<td>ash11927</td>
					<td><i class="icon-remove"></i> <a href="user.html"><i
							class="icon-pencil"></i></a> <!-- <a
							href="#myModal" role="button" data-toggle="modal"><i
								class="icon-remove"></i></a> --></td>
				</tr>
				<tr>
					<td>3</td>
					<td>Audrey</td>
					<td>Ann</td>
					<td>audann84</td>
					<td>audann84</td>
					<td>
					<i class="icon-remove"></i> 
					<a href="user.html"><i class="icon-pencil"></i></a> <!-- <a
							href="#myModal" role="button" data-toggle="modal"><i
								class="icon-remove"></i></a> --></td>
				</tr>
				<tr>
					<td>4</td>
					<td>John</td>
					<td>Robinson</td>
					<td>jr5527</td>
					<td>jr5527</td>
					<td>
					<i class="icon-remove"></i> 
					<a href="user.html"><i class="icon-pencil"></i></a> <!-- <a
							href="#myModal" role="button" data-toggle="modal"><i
								class="icon-remove"></i></a> --></td>
				</tr>
				<tr>
					<td>5</td>
					<td>Aaron</td>
					<td>Butler</td>
					<td>aaron_butler</td>
					<td>aaron_butler</td>
					<td>
					<i class="icon-remove"></i> 
					<a href="user.html"><i class="icon-pencil"></i></a> <!-- <a
							href="#myModal" role="button" data-toggle="modal"><i
								class="icon-remove"></i></a> --></td>
				</tr>
				<tr>
					<td>6</td>
					<td>Chris</td>
					<td>Albert</td>
					<td>cab79</td>
					<td>cab79</td>
					<td>
					<i class="icon-remove"></i> 
					<a href="user.html"><i class="icon-pencil"></i></a> <!-- <a
							href="#myModal" role="button" data-toggle="modal"><i
								class="icon-remove"></i></a> --></td>

				</tr>
			</tbody>
		</table>
	</div>

	<!-- 페이지네이션~!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! -->
	<div class="pagination" align="center">
		<ul>
			<li><a href="#">Prev</a></li>
			<li><a href="#">1</a></li>
			<li><a href="#">2</a></li>
			<li><a href="#">3</a></li>
			<li><a href="#">4</a></li>
			<li><a href="#">Next</a></li>
		</ul>
	</div>
</div>




<div class="modal small hide fade" id="myModal" tabindex="-1"
	role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-header">
		<button type="button" class="close" data-dismiss="modal"
			aria-hidden="true">×</button>
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