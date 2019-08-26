<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="kr">
<head>
<title>Login V19</title>
<meta charset="UTF-8">



<meta name="viewport" content="width=device-width, initial-scale=1">


<!-- href="${pageContext.request.contextPath}/WEB-INF/views/css/bootstrap.css" 
	경로를 이렇게 바꿔야 한다.

-->




<link rel="icon" type="image/png" href="${pageContext.request.contextPath}/resources/ky/images/icons/favicon.ico" />

<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/ky/bootstrap/css/bootstrap.min.css">

<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/ky/fonts/font-awesome-4.7.0/css/font-awesome.min.css">

<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/ky/fonts/Linearicons-Free-v1.0.0/icon-font.min.css">

<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/ky/vendor/animate/animate.css">

<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/ky/vendor/css-hamburgers/hamburgers.min.css">

<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/ky/vendor/animsition/css/animsition.min.css">

<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/ky/vendor/select2/select2.min.css">

<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/ky/vendor/daterangepicker/daterangepicker.css">

<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/ky/css/util.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/ky/css/main.css">

</head>
<body>
<div class="limiter">
<div class="container-login100">
<div class="wrap-login100 p-l-55 p-r-55 p-t-65 p-b-50">
<form class="login100-form validate-form">
<span class="login100-form-title p-b-33">
Account Login
</span>
<div class="wrap-input100 validate-input" data-validate="Valid email is required: ex@abc.xyz">
<input class="input100" type="text" name="email" placeholder="Email">
<span class="focus-input100-1"></span>
<span class="focus-input100-2"></span>
</div>
<div class="wrap-input100 rs1 validate-input" data-validate="Password is required">
<input class="input100" type="password" name="pass" placeholder="Password">
<span class="focus-input100-1"></span>
<span class="focus-input100-2"></span>
</div>
<div class="container-login100-form-btn m-t-20">
<button class="login100-form-btn">
Sign in
</button>
</div>
<div class="text-center p-t-45 p-b-4">
<span class="txt1">
Forgot
</span>
<a href="#" class="txt2 hov1">				<!-- 비밀번호 아이디 찾기 창 만들어야함  -->
Username / Password?
</a>
</div>
<div class="text-center">
<span class="txt1">
Create an account?
</span>
<a href="join_first.do" class="txt2 hov1">
Sign up
</a>
</div>
</form>
</div>
</div>
</div>

<script src="${pageContext.request.contextPath}/resources/ky/vendor/jquery/jquery-3.2.1.min.js" type="316b18eceb43e80710373d2e-text/javascript"></script>

<script src="${pageContext.request.contextPath}/resources/ky/vendor/animsition/js/animsition.min.js" type="316b18eceb43e80710373d2e-text/javascript"></script>

<script src="${pageContext.request.contextPath}/resources/ky/vendor/bootstrap/js/popper.js" type="316b18eceb43e80710373d2e-text/javascript"></script>
<script src="${pageContext.request.contextPath}/resources/ky/vendor/bootstrap/js/bootstrap.min.js" type="316b18eceb43e80710373d2e-text/javascript"></script>

<script src="${pageContext.request.contextPath}/resources/ky/vendor/select2/select2.min.js" type="316b18eceb43e80710373d2e-text/javascript"></script>

<script src="${pageContext.request.contextPath}/resources/ky/vendor/daterangepicker/moment.min.js" type="316b18eceb43e80710373d2e-text/javascript"></script>
<script src="${pageContext.request.contextPath}/resources/ky/vendor/daterangepicker/daterangepicker.js" type="316b18eceb43e80710373d2e-text/javascript"></script>

<script src="${pageContext.request.contextPath}/resources/ky/vendor/countdowntime/countdowntime.js" type="316b18eceb43e80710373d2e-text/javascript"></script>

<script src="${pageContext.request.contextPath}/resources/ky/js/main.js" type="316b18eceb43e80710373d2e-text/javascript"></script>

<script async src="https://www.googletagmanager.com/gtag/js?id=UA-23581568-13" type="316b18eceb43e80710373d2e-text/javascript"></script>
<script type="316b18eceb43e80710373d2e-text/javascript">
	  window.dataLayer = window.dataLayer || [];
	  function gtag(){dataLayer.push(arguments);}
	  gtag('js', new Date());

	  gtag('config', 'UA-23581568-13');
	</script>
<script src="https://ajax.cloudflare.com/cdn-cgi/scripts/95c75768/cloudflare-static/rocket-loader.min.js" data-cf-settings="316b18eceb43e80710373d2e-|49" defer=""></script></body>
</html>
