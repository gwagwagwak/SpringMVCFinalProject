<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link
	href="//netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css"
	rel="stylesheet">
<link
	href="//netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.min.css"
	rel="stylesheet">
<script src="https://code.jquery.com/jquery-2.1.0.js"></script>
<script
	src="//netdna.bootstrapcdn.com/bootstrap/3.1.0/js/bootstrap.min.js"></script>

<style>
label.btn span {
	font-size: 1.5em;
}

label input[type="radio"] ~ i.fa.fa-circle-o {
	color: #c8c8c8;
	display: inline;
}

label input[type="radio"] ~ i.fa.fa-dot-circle-o {
	display: none;
}

label input[type="radio"]:checked ~ i.fa.fa-circle-o {
	display: none;
}

label input[type="radio"]:checked ~ i.fa.fa-dot-circle-o {
	color: #7AA3CC;
	display: inline;
}

label:hover input[type="radio"] ~ i.fa {
	color: #7AA3CC;
}

label input[type="checkbox"] ~ i.fa.fa-square-o {
	color: #c8c8c8;
	display: inline;
}

label input[type="checkbox"] ~ i.fa.fa-check-square-o {
	display: none;
}

label input[type="checkbox"]:checked ~ i.fa.fa-square-o {
	display: none;
}

label input[type="checkbox"]:checked ~ i.fa.fa-check-square-o {
	color: #7AA3CC;
	display: inline;
}

label:hover input[type="checkbox"] ~ i.fa {
	color: #7AA3CC;
}

div[data-toggle="buttons"] label.active {
	color: #7AA3CC;
}

div[data-toggle="buttons"] label {
	display: inline-block;
	padding: 6px 12px;
	margin-bottom: 0;
	font-size: 14px;
	font-weight: normal;
	line-height: 2em;
	text-align: left;
	white-space: nowrap;
	vertical-align: top;
	cursor: pointer;
	background-color: none;
	border: 0px solid #c8c8c8;
	border-radius: 3px;
	color: #c8c8c8;
	-webkit-user-select: none;
	-moz-user-select: none;
	-ms-user-select: none;
	-o-user-select: none;
	user-select: none;
}

div[data-toggle="buttons"] label:hover {
	color: #7AA3CC;
}

div[data-toggle="buttons"] label:active, div[data-toggle="buttons"] label.active
	{
	-webkit-box-shadow: none;
	box-shadow: none;
}
</style>
<title>Insert title here</title>
</head>
<body>

	<div class="container">


		<div class="row">
			<div class="col-xs-12">
				<br> Vertical radio: <br>
				<div class="btn-group btn-group-vertical" data-toggle="buttons">
					<label class="btn active"> <input type="radio"
						name='gender1' checked><i class="fa fa-circle-o fa-2x"></i><i
						class="fa fa-dot-circle-o fa-2x"></i> <span> Male</span>
					</label> <label class="btn"> <input type="radio" name='gender1'><i
						class="fa fa-circle-o fa-2x"></i><i
						class="fa fa-dot-circle-o fa-2x"></i><span> Female</span>
					</label>
				</div>

			</div>
		</div>


		<div class="row">
			<div class="col-xs-12">
				<hr>
				Vertical checkbox: <br>
				<div class="btn-group btn-group-vertical" data-toggle="buttons">
					<label class="btn active"> <input type="checkbox"
						name='email1' checked><i class="fa fa-square-o fa-2x"></i><i
						class="fa fa-check-square-o fa-2x"></i> <span> Marketing
							Email</span>
					</label> <label class="btn"> <input type="checkbox" name='email2'><i
						class="fa fa-square-o fa-2x"></i><i
						class="fa fa-check-square-o fa-2x"></i><span> Alert Email</span>
					</label> <label class="btn"> <input type="checkbox" name='email3'><i
						class="fa fa-square-o fa-2x"></i><i
						class="fa fa-check-square-o fa-2x"></i><span> Account Email</span>
					</label>
				</div>


			</div>
		</div>

		<div class="row">
			<div class="col-xs-12">
				<hr>
				Horizontal radio: <br>
				<div class="btn-group" data-toggle="buttons">
					<label class="btn active"> <input type="radio"
						name='gender2' checked><i class="fa fa-circle-o fa-2x"></i><i
						class="fa fa-check-circle-o fa-2x"></i><span> Male</span>
					</label> <label class="btn"> <input type="radio" name='gender2'><i
						class="fa fa-circle-o fa-2x"></i><i
						class="fa fa-check-circle-o fa-2x"></i><span> Female</span>
					</label>
				</div>


			</div>
		</div>
		<hr>
		Horizontal checkbox: <br>

		<div class="btn-group btn-group" data-toggle="buttons">
			<label class="btn active"> <input type="checkbox"
				name='email1' checked><i class="fa fa-square-o fa-2x"></i><i
				class="fa fa-check-square-o fa-2x"></i><span> Marketing Email
			</label> <label class="btn"> <input type="checkbox" name='email2'><i
				class="fa fa-square-o fa-2x"></i><i
				class="fa fa-check-square-o fa-2x"></i><span> Alert Email</span>
			</label> <label class="btn"> <input type="checkbox" name='email3'><i
				class="fa fa-square-o fa-2x"></i><i
				class="fa fa-check-square-o fa-2x"></i><span> Account Email</span>
			</label>
		</div>

	</div>
	</div>

	<br>
	</div>
	
	<div class="container" role="main">

			<h2>Q&A</h2>
			<hr>
			<br> <br>

			<form name="form" id="form" role="form" method="post"
				action="${pageContext.request.contextPath}/board/saveBoard">

				<div class="mb-3">

					<label for="title">제목</label> <input type="text"
						class="form-control" name="title" id="title"
						placeholder="제목을 입력해 주세요">
				</div>

				<div class="mb-3">
					<label for="reg_id">질문 유형</label>
					<div class="container">

						<form>
							<div class="form-group">
								<select class="form-control" id="sel1">
									<option>비밀번호</option>
									<option>계정 설정</option>
									<option>계정 제한</option>
									<option>결제</option>
									<option>비즈니스 솔루션</option>
								</select>
							</div>
						</form>
					</div>

					<div class="mb-3">

						<label for="content">내용</label>

						<textarea class="form-control" rows="5" name="content"
							id="content" placeholder="내용을 입력해 주세요"></textarea>

					</div>

					<div class="mb-3">
						<label for="tag">TAG</label> <input type="text"
							class="form-control" name="tag" id="tag"
							placeholder="태그를 입력해 주세요">
					</div>

					<div class="mb-3">
						<label for="tag">비밀 글</label> <input type="text"
							class="form-control" name="tag" id="tag"
							placeholder="태그를 입력해 주세요">
					</div>

					<div class="mb-3">
						<label for="tag">답변 유형</label> <input type="text"
							class="form-control" name="tag" id="tag"
							placeholder="태그를 입력해 주세요">
					</div>
			</form>
			</div>
</body>
</html>