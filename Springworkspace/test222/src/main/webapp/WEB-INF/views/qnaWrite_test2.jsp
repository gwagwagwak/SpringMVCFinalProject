<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
</head>

<!-- body\==================================================================== -->
<body class="landing-page landing-page1">

	<!-- 네비게이션 -->

	<!-- <nav class="navbar navbar-transparent navbar-fixed-top" role="navigation"> -->
	<nav class="navbar navbar-dark bg-primary">
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


	<!--  -->
	<%-- <div class="wrapper">
		<div class="parallax filter-gradient blue" data-color="blue">
			<div class="parallax-background">
				<img class="parallax-background-image"
					src="${pageContext.request.contextPath}/resources/img/bg3.jpg">
			</div>
			<div class="container">
				<div class="row">
					<div class="col-md-5 hidden-xs">
						<div class="parallax-image">
							<img class="phone"
								src="${pageContext.request.contextPath}/resources/img/iphone3.png"
								style="margin-top: 20px" />
						</div>
					</div>
					<div class="col-md-6 col-md-offset-1">
						<div class="description">
							<h2>Awesome landing page.</h2>
							<br>
							<h5>Be amazed by the best looking bootstrap landing page on
								the web! Your new app deserves an amazing page to show all of
								its features. Clear visual, light colours and beautifully
								aligned elements - they all try to make the users aware of your
								great app features!</h5>
						</div>
						<div class="buttons">
							<button class="btn btn-fill btn-neutral">
								<i class="fa fa-apple"></i> Appstore
							</button>
							<button class="btn btn-simple btn-neutral">
								<i class="fa fa-android"></i>
							</button>
							<button class="btn btn-simple btn-neutral">
								<i class="fa fa-windows"></i>
							</button>
						</div>
					</div>
				</div>
			</div>
		</div> --%>

	<div class="section section-gray section-clients"
		style="margin-top: 100px">
		<div class="container text-center">
			<h4 class="header-text">Friends in high places</h4>
			<p>
				Build customer confidence by listing your users! Anyone who has used
				your service and has been pleased with it should have a place here!
				From Fortune 500 to start-ups, all your app enthusiasts will be glad
				to be featured in this section. Moreover, users will feel confident
				seing someone vouching for your product!<br>
			</p>
			<div class="logos">
				<ul class="list-unstyled">
					<li><img
						src="${pageContext.request.contextPath}/resources/img/adobe.png" /></li>
					<li><img
						src="${pageContext.request.contextPath}/resources/img/zendesk.png" /></li>
					<li><img
						src="${pageContext.request.contextPath}/resources/img/ebay.png" /></li>
					<li><img
						src="${pageContext.request.contextPath}/resources/img/evernote.png" /></li>
					<li><img
						src="${pageContext.request.contextPath}/resources/img/airbnb.png" /></li>
					<li><img
						src="${pageContext.request.contextPath}/resources/img/zappos.png" /></li>
				</ul>
			</div>
		</div>
	</div>

	<hr>




	<!-- 글쓰기 구간  -->
	<div align=center style="margin-top: 50px">
		<div class="container">
			<form method="post" action="writeAction.do">

				<table class="table">
					<thead>

						<tr
							style="text-align: left; height: 60px; background-color: #fec503; font-size: 20px; border-color: #1a1a1a; border: 1px">
							<th colspan="2"
								style="text-align: center; height: 60px; background-color: #777799; font-size: 20px; width: 8%; color: white;">
								QnA</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td bgcolor="#5D5D5D" width="15%">
								<div align="CENTER">
									<strong>닉네임</strong>
								</div>
							</td>
							<td style="background-color: #f7f7f7;"><input type="text"
								class="form-control" name="nickname" maxlength="50"
								value=<%-- <%=nickname%> --%> readonly></td>
						</tr>
						<tr>
							<td width="80" bgcolor="#5D5D5D">
								<div align="center">
									<strong>타입</strong>
								</div>
							</td>
							<td style="background-color: #f7f7f7;"><input type="text"
								class="form-control" value="게시판" name="b_type" maxlength="50"
								readonly></td>
						</tr>
						<tr>
							<td width="80" bgcolor="#5D5D5D">
								<div align="center">
									<strong>제목</strong>
								</div>
							</td>
							<td bgcolor="#f7f7f7"><input type="text"
								class="form-control" placeholder="글 제목" name="title"
								maxlength="50"></td>
						</tr>
						<tr>
							<td width="80" bgcolor="#5D5D5D">
								<div align="center">
									<strong>내용</strong>
								</div>
							</td>
							<td bgcolor="#f7f7f7"><textarea class="form-control"
									placeholder="글 내용" name="content" maxlength="2000"
									style="height: 350px"></textarea></td>
						</tr>
					</tbody>
				</table>

				<!-- 체크 박스 -->
				<div class="container">
					<div class="row">
						<div class="col" align="left">
							<p>
								<strong>답변 유형</strong>
							</p>
							<div class="custom-control custom-checkbox">
								<input type="checkbox" id="jb-checkbox"
									class="custom-control-input"> <label
									class="custom-control-label" for="jb-checkbox">이메일로 답변
									받기</label>
							</div>
							<p>
								<strong>공개 여부</strong>
							</p>
							<div class="custom-control custom-radio">
								<input type="radio" name="jb-radio" id="jb-radio-1"
									class="custom-control-input"> <label
									class="custom-control-label" for="jb-radio-1">공개</label>
							</div>
							<div class="custom-control custom-radio">
								<input type="radio" name="jb-radio" id="jb-radio-2"
									class="custom-control-input"> <label
									class="custom-control-label" for="jb-radio-2">비공개</label>
							</div>
						</div>
					</div>
				</div>
				<br>
				<br>

				<!-- <a href="bbsAction.do?pageNumber=1" class="btn btn-success btn-arraw-left">목록</a> -->
				<a href="bbsAction.do?pageNumber=1"
					class="btn btn-primary pull-left">목록</a> <input type="submit"
					class="btn btn-primary pull-right" value="글쓰기">
				<!-- <input type="button" class="btn btn-warning pull-right" value=""> -->
			</form>


		</div>
	</div>




	<div class="section section-presentation">
		<div class="container">
			<div class="row">
				<div class="col-md-6">
					<div class="description">
						<h4 class="header-text">It's beautiful</h4>
						<p>And your app is also probably social, awesome, easy-to-use
							and vital to users. This is the place to enlist all the good
							things that your app has to share. Focus on the benefits that the
							uers will receive. Try to combine imaginery with text and show
							meaningful printscreens from your app, that will make it clear
							what exactly the basic functions are.</p>
						<p>Try to make it very clear for the people browsing the page
							that this product will enrich their life and will make a nice
							addition to the homescreen.
						<p>
					</div>
				</div>
				<div class="col-md-5 col-md-offset-1 hidden-xs">
					<img src="${pageContext.request.contextPath}/resources/img/mac.png" />
				</div>
			</div>
		</div>
	</div>
	<div class="section section-demo">
		<div class="container">
			<div class="row">
				<div class="col-md-6">
					<div id="description-carousel" class="carousel fade"
						data-ride="carousel">
						<div class="carousel-inner">
							<div class="item">
								<img
									src="${pageContext.request.contextPath}/resources/img/home_33.jpg"
									alt="">
							</div>
							<div class="item active">
								<img
									src="${pageContext.request.contextPath}/resources/img/home_22.jpg"
									alt="">
							</div>
							<div class="item">
								<img
									src="${pageContext.request.contextPath}/resources/img/home_11.jpg"
									alt="">
							</div>
						</div>
						<ol class="carousel-indicators carousel-indicators-blue">
							<li data-target="#description-carousel" data-slide-to="0"
								class=""></li>
							<li data-target="#description-carousel" data-slide-to="1"
								class="active"></li>
							<li data-target="#description-carousel" data-slide-to="2"
								class=""></li>
						</ol>
					</div>
				</div>
				<div class="col-md-5 col-md-offset-1">
					<h4 class="header-text">Easy to integrate</h4>
					<p>With all the apps that users love! Make it easy for users to
						share, like, post and tweet their favourite things from the app.
						Be sure to let users know they continue to remain connected while
						using your app!</p>
					<a href="http://www.creative-tim.com/product/awesome-landing-page"
						id="Demo3" class="btn btn-fill btn-info" data-button="info">Get
						Free Demo</a>
				</div>
			</div>
		</div>
	</div>
	<div class="section section-features">
		<div class="container">
			<h4 class="header-text text-center">Features</h4>
			<div class="row">
				<div class="col-md-4">
					<div class="card card-blue">
						<div class="icon">
							<i class="pe-7s-note2"></i>
						</div>
						<div class="text">
							<h4>Online Customers Management</h4>
							<p>All appointments sync with your Google calendar so your
								availability is always up to date. See your schedule at a glance
								from any device.</p>
						</div>
					</div>
				</div>
				<div class="col-md-4">
					<div class="card card-blue">
						<div class="icon">
							<i class="pe-7s-bell"></i>
						</div>
						<h4>Smart Notifications on hands</h4>
						<p>Automatic text and email reminders make sure customers
							always remember their upcoming appointments.</p>
					</div>
				</div>
				<div class="col-md-4">
					<div class="card card-blue">
						<div class="icon">
							<i class="pe-7s-graph1"></i>
						</div>
						<h4>Know your business better now</h4>
						<p>Take payments and run your business on the go, in your
							store and then see how it all adds up with analytics.</p>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div class="section section-testimonial">
		<div class="container">
			<h4 class="header-text text-center">What people think</h4>
			<div id="carousel-example-generic" class="carousel fade"
				data-ride="carousel">
				<!-- Wrapper for slides -->
				<div class="carousel-inner" role="listbox">
					<div class="item">
						<div class="mask">
							<img
								src="${pageContext.request.contextPath}/resources/img/face-4.jpg">
						</div>
						<div class="carousel-testimonial-caption">
							<p>Jay Z, Producer</p>
							<h3>"I absolutely love your app! It's truly amazing and
								looks awesome!"</h3>
						</div>
					</div>
					<div class="item active">
						<div class="mask">
							<img
								src="${pageContext.request.contextPath}/resources/img/face-3.jpg">
						</div>
						<div class="carousel-testimonial-caption">
							<p>Drake, Artist</p>
							<h3>"This is one of the most awesome apps I've ever seen!
								Wish you luck Creative Tim!"</h3>
						</div>
					</div>
					<div class="item">
						<div class="mask">
							<img
								src="${pageContext.request.contextPath}/resources/img/face-2.jpg">
						</div>
						<div class="carousel-testimonial-caption">
							<p>Rick Ross, Musician</p>
							<h3>"Loving this! Just picked it up the other day. Thank you
								for the work you put into this."</h3>
						</div>
					</div>
				</div>
				<ol class="carousel-indicators carousel-indicators-blue">
					<li data-target="#carousel-example-generic" data-slide-to="0"
						class="active"></li>
					<li data-target="#carousel-example-generic" data-slide-to="1"></li>
					<li data-target="#carousel-example-generic" data-slide-to="2"></li>
				</ol>
			</div>
		</div>
	</div>
	<div class="section section-no-padding">
		<div class="parallax filter-gradient blue" data-color="blue">
			<div class="parallax-background">
				<img class="parallax-background-image"
					src="${pageContext.request.contextPath}/resources/img/bg3.jpg" />
			</div>
			<div class="info">
				<h1>Download this landing page for free!</h1>
				<p>Beautiful multipurpose bootstrap landing page.</p>
				<a href="http://www.creative-tim.com/product/awesome-landing-page"
					class="btn btn-neutral btn-lg btn-fill">DOWNLOAD</a>
			</div>
		</div>
	</div>
	<div id="plusfriend-chat-button"
		style="position: fixed; bottom: 5px; right: 5px;"></div>



	<footer class="footer">
	<div class="container">
		<nav class="pull-left">
		<ul>
			<li><a href="#"> Home </a></li>
			<li><a href="#"> Company </a></li>
			<li><a href="#"> Portfolio </a></li>
			<li><a href="#"> Blog </a></li>
		</ul>
		</nav>
		<div class="social-area pull-right">
			<a class="btn btn-social btn-facebook btn-simple"> <i
				class="fa fa-facebook-square"></i>
			</a> <a class="btn btn-social btn-twitter btn-simple"> <i
				class="fa fa-twitter"></i>
			</a> <a class="btn btn-social btn-pinterest btn-simple"> <i
				class="fa fa-pinterest"></i>
			</a>
		</div>
		<div class="copyright">
			&copy; 2016 <a href="http://www.creative-tim.com">Creative Tim</a>,
			made with love
		</div>
	</div>
	</footer>
	</div>

</body>
<script type='text/javascript'>
	//<![CDATA[
	// 사용할 앱의 JavaScript 키를 설정해 주세요.
	Kakao.init('15bec6ab92e405aaac398891fbd4cb2f');
	// 스토리 공유 버튼을 생성합니다.
	Kakao.PlusFriend.createChatButton({
		container : '#plusfriend-chat-button',
		plusFriendId : '_xcjxbiT',
		title : 'consult',
		size : 'small',
		color : 'yellow',
		shape : 'pc',
		supportMultipleDensities : true
	});
	//]]>
</script>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
<script
	src="${pageContext.request.contextPath}/resources/js/jquery-1.10.2.js"
	type="text/javascript"></script>
<script
	src="${pageContext.request.contextPath}/resources/js/jquery-ui-1.10.4.custom.min.js"
	type="text/javascript"></script>
<script
	src="${pageContext.request.contextPath}/resources/js/bootstrap.js"
	type="text/javascript"></script>
<script
	src="${pageContext.request.contextPath}/resources/js/awesome-landing-page.js"
	type="text/javascript"></script>
</html>
