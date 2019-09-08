<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<%-- <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ page import="java.util.*"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="ko" dir="ltr">
<head>
<script
	src="https://www.paypalobjects.com/tagmgmt/codefiles/a26675c5b39095a56a0e060daaf3d1a5.js?conditionId0=4847180"
	crossorigin="anonymous"></script>
<script
	src="https://www.paypalobjects.com/tagmgmt/codefiles/d451fa0e849b5f2668fa8cf1d0a14cf5.js?conditionId0=422975"
	crossorigin="anonymous"></script>
<script
	src="https://www.paypalobjects.com/tagmgmt/codefiles/7ed65b46f3f891f34780d7764b2b3b67.js"
	crossorigin="anonymous"></script>
<script
	src="https://www.paypalobjects.com/tagmgmt/codefiles/07017e4259d02d9db849d2f3b00bc5a1.js?conditionId0=4836836"
	crossorigin="anonymous"></script>
<script
	src="https://www.paypalobjects.com/tagmgmt/codefiles/f154c7dc2715b88c9f449cfbe05c70e2.js?conditionId0=378623"
	crossorigin="anonymous"></script>
<link rel="dns-prefetch" href="//www.paypalobjects.com">
<link rel="dns-prefetch" href="//t.paypal.com">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<script type="text/javascript" async="" crossorigin="anonymous"
	src="https://www.paypalobjects.com/tagmgmt/codefiles/b230a86bb66e0de9cd1faa23a04ac839.js?conditionId0=3241080"></script>
<script
	src="https://www.paypalobjects.com/messaging/chat/v2/node-chat.js"
	defer=""></script>
<script type="text/javascript" async=""
	src="https://www.google-analytics.com/analytics.js" nonce=""></script>
<script nonce="" type="text/javascript"
	src="https://www.paypalobjects.com/pa/js/min/pa.js"></script>
<meta name="viewport"
	content="width=device-width, height=device-height, initial-scale=1.0, minimum-scale=1.0">
<meta charset="utf-8">
<link rel="shortcut icon" sizes="196x196"
	href="https://www.paypalobjects.com/webstatic/icon/pp196.png">
<link rel="shortcut icon" type="image/x-icon"
	href="https://www.paypalobjects.com/webstatic/icon/favicon.ico">
<link rel="icon" type="image/x-icon"
	href="https://www.paypalobjects.com/webstatic/icon/pp32.png">
<link rel="stylesheet"
	href="https://www.paypalobjects.com/ui-web/vx-pattern-lib/2-0-5/paypal-sans.css">
<link rel="preload" as="font" type="font/woff2" crossorigin=""
	href="https://www.paypalobjects.com/ui-web/paypal-sans-small/1-0-0/PayPalSansSmall-Regular.woff2">
<link rel="preload" as="font" type="font/woff2" crossorigin=""
	href="https://www.paypalobjects.com/ui-web/paypal-sans-big/1-0-0/PayPalSansBig-Light.woff2">
<link rel="preload" as="font" type="font/woff2" crossorigin=""
	href="https://www.paypalobjects.com/ui-web/paypal-sans-small/1-0-0/PayPalSansSmall-Medium.woff2">
<link rel="preload" as="font" type="font/woff2" crossorigin=""
	href="https://www.paypalobjects.com/ui-web/paypal-sans-big/1-0-0/PayPalSansBig-Regular.woff2">
<link rel="preload" as="font" type="font/woff2" crossorigin=""
	href="https://www.paypalobjects.com/ui-web/vx-icons/2-0-2/PayPalVXIcons-Regular.woff2">

<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/js/jquery-3.1.1.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/js/plugins/validate/jquery.validate.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/js/plugins/validate/additional-methods.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/js/plugins/validate/messages_ko.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/js/main.js"></script>

<!-- css -->
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">


<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<!-- 다음 도로명 주소 api  -->
<script src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script>
<title>PayPal: 요약</title>

<style>
form * {
	border-radius: 1 !important;
}

form>fieldset>legend {
	font-size: 120%;
}

/* 
/* label.error{
	color:red;
	font-style: italic;
}
input.error{
	border : 1px dotted red !important;
}
  */
</style>


<script>
	/* 다음 도로명 주소 코드  */
	function showPostcode(){
		new daum.Postcode({
			oncomplete : function(data){
				var fullAddr = '';
				var extrAddr = '';
			
				//사용자가 선택한 주소 타입에 따라 해당 주소 값을 가져온다.
				if(data.userSelectedType == 'R'){
					//사용자가 도로명 주소를 선택했을 경우
					fullAddr = data.roadAddress;
				}else{ //사용자가 지번 주소를 선택했을 경우(J)
					fullAddr = data.jibunAddress;
				}
			
				//사용자가 선택한 주소가 도로명 타입일때 조합한다
				if(data.userSelectedType == 'R'){
					//법정동명이 있을 경우 추가함
					if(data.bname !== ''){
						extrAddr += data.bname;
					}
					//법정동명이 있을 경우 추가함
					if(data.buildingName !== ''){
						extrAddr += (extrAddr !== '' ? ', '
							+ data.buildingName : data.buildingName);
					}
					//조합형 주소의 유무에 따라 양쪽 괄호를 추가하여 최종 주소를 만든다.
					fullAddr += (extrAddr !== '' ? ' (' +extrAddr
						+ ')' : '');
				}
				
				
				//우편번호와 주소 정보를 해당 필드에 넣는다. &  5자리 새 우편 번호 사용
				document.getElementById('post_code').value = data.zonecode;  	//우편번호5자리
				document.getElementById('m_addr').value = fullAddr;				//주소값
				//커서를 상세주소 필드로 이동
				document.getElementById('m_addr2').focus();
			}
		}).open();
	}

	
	
	


	/* 에이젝스 회원가입 이메일 중복확인                                 */
	/* $(function(){
		$("#btnCheckId").click(function(){
			var m_email = $("#m_email").val();
			
			if(m_email == "" || m_email==" "){
				alert("이메일을 입력해 주세요.")
			}else{
				var url = "${_ctx}/user/id/available";
				$.post(url, {m_email : m_email}, function(json){
					console.log(json) 
				});
			}
		});
	});
	 */

	/* 회원가입 란 validate  */
	$(function() {
		$("#joinBlock").validate();
		
		/* $("#btnCheckId").click(function(){
			var m_email = $("#m_email").val();
			if(m_email == "" || m_email == " "){
				alert("Email을 입력해 주세요")
			}else{
				var url = "emailputcheck.do"
				//map 키값 형태로  데이터를 url경로로 보낸다
				$.post(url, {m_email : m_email}, function(){	
					console
				});
			}
		}); */
	});

	 function registerCheckFucntion(){
		 var m_email = $("#m_email").val();
		 $.ajax({
			 type : "post",
			url : "emailputcheck.do",
			data : {m_email : m_email},
			success: function(result){
				if(result ==1){
					$("#checkMessage").html('사용할 수 있는 이메일입니다.');
					$("#checkType").attr("class", "modal-content panel-success");
				}else{
					$("#checkMessage").html('사용할 수 없는 이메일입니다.');
					$("#checkType").attr("class", "modal-content panel-warning");
				}
				$("#checkModal").modal("show");
			}
		 });		 
	 }
	function doJoin() {
		if ($("#joinBlock").valid()) {
			alert("Welcome PayLog !!");
		}
	}
	/* 
		
		jQuery.validator.setDefaults({
			debug: true
			success: "valid"
		});
		$("joinBlock").validate({
			rules:{
				m_pw: "required"
				m_pw_check:{
					equalTo: #"m_pw";
				}
			}
		});
	 */

	$(document).ready(
			function() {
				$('#found_site').on(
						'change',
						function() {
							$(this).val() == "other" ? $('#specify').closest(
									'.form-group').show() : $('#specify')
									.closest('.form-group').hide();
						})
			})
</script>
</head>
<body class="vx_root cw_root">
	<div>
		<link rel="stylesheet" type="text/css"
			href="https://www.paypalobjects.com/ui-web/header-footer/1.29.0/header-footer.min.css">
		<style nonce="">
@media print and (max-width: 768px) {
	.vx_globalNav-container {
		display: none;
	}
}
</style>
	</div>
	<h1 class="vx_a11yText">PayPal: 요약</h1>
	<input type="checkbox" id="toggleNavigation"
		class="vx_globalNav-toggleCheckbox">
	<div>
		<div
			class="vx_globalNav-main globalNav-main js_globalNavView js_ppLogo test2"
			role="banner">
			<div id="hc-contextual-help-app" data-locale="ko_KR"
				data-country="KR"></div>
			<div class="vx_globalNav-container">
				<a href="/myaccount/summary" id="header-ppLogo" name="header-logo"
					data-name="header-logo" data-pagename="main:header"
					data-pa-click="true" class="vx_globalNav-brand_desktop" ><span
					class="vx_a11yText">요약</span></a>
				<div class="vx_globalNav-secondaryNav_mobile">
					<div class="vx_globalNav-listItem_mobileLogout">
						<a href="/signout" id="header-logout_mobile"
							name="header-logout_mobile" data-pagename="main:header"
							class="vx_globalNav-link_mobileLogout">로그아웃</a>
					</div>
					<div class="vx_globalNav-listItem_settings">
						<a href="/myaccount/settings" id="header-settings_mobile"
							name="header-settings_mobile" data-pagename="main:header"
							class="vx_globalNav-svgIcon vx_globalNav-link_settings"><img
							src="https://www.paypalobjects.com/ui-web/icons/1-0-0/settings.svg"
							width="26px" height="26px" ><span class="vx_a11yText">설정</span></a>
					</div>
					<div>
						<p class="vx_h5 vx_globalNav-displayName">이름</p>
					</div>
				</div>
				<div class="vx_globalNav-navContainer">
					<nav class="vx_globalNav-nav" role="navigation">
					<ul class="vx_globalNav-list" >
						<li class="vx_isActive"><a href="/myaccount/summary"
							target="_self" id="header-newSummary" name="header-newSummary"
							data-name="header-newSummary" data-pagename="main:header"
							data-pa-click="true" class="vx_globalNav-links js_summary" style="font-size:15px;">요약</a></li>
						<li class=""><a href="/myaccount/transactions/"
							target="_self" id="header-activity" name="header-activity"
							data-name="header-activity" data-pagename="main:header"
							data-pa-click="true" class="vx_globalNav-links js_activity" style="font-size:15px;">활동내역</a></li>
						<li class=""><a href="/myaccount/transfer?from=Header"
							target="_self" id="header-transfer" name="header-transfer"
							data-name="header-transfer" data-pagename="main:header"
							data-pa-click="true" class="vx_globalNav-links js_sendMoney" style="font-size:15px;">카드</a></li>
						
					</ul>
					<ul class="vx_globalNav-list_secondary" >
						<li class="vx_hidden-phone" data-autodisplay="false" style="margin-top:10px;"><a
							href="#" id="header-notifications"
							data-name="header-notifications"
							class="vx_globalNav-svgIcon vx_globalNav-link_notifications vx_isCritical js_notifications js_notificationDesktopBtn cw_popover-trigger"
							data-popover-autodisplay="false"
							data-popover-id="notifications-popover" data-popover-offset="15"
							data-pagename="main:notifications::toggle"
							data-popover-pagename-show="main:notifications:toggle"
							data-popover-pagename-hide="main:notifications:toggle"
							data-pa-click="true"><img style="pointer-events: none"
								class="notifications-icon"
								src="https://www.paypalobjects.com/ui-web/icons/1-0-0/notifications.svg"
								width="32px" height="32px" style="margin-top:10px;"
								><span class="vx_a11yText">알림</span></a>
						<div id="notifications-popover"
								class="cw_popover-container cw_notifications-container"
								tabindex="0">
								<div id="cw_tab-list" class="cw_tab-list">
									<button id="cw_tab-notifications"
										data-panel="cw_panel-notifications"
										class="cw_tab cw_tab_notifications cw_tab_selected"
										data-pagename="main:notifications:toggleNotifs">
										알림(<span id="notificationCount">0</span>)
									</button>
									<button id="cw_tab-messages" data-panel="cw_panel-messages"
										class="cw_tab cw_tab_messages"
										data-pagename="main:notifications:toggleSMC">
										메시지(<span id="messageCount">0</span>)
									</button>
								</div>
								<div class="cw_tab-list-shadow"></div>
								<div class="cw_popover-body">
									<ul class="cw_panel cw_panel_notifications cw_panel_selected"
										id="cw_panel-notifications">
										<li class="cw_notification"><div
												class="cw_notification-subheader">알림</div>
											<div class="cw_notification-description">새로운 알림이 없습니다.</div></li>
									</ul>
									<ul class="cw_panel cw_panel_messages" id="cw_panel-messages">
										<li class="cw_notification"><div
												class="cw_notification-subheader">메시지</div>
											<div class="cw_notification-description">새로운 메시지가 없습니다.</div>
											<a href="/selfhelp/smc/" class="cw_notification-link">메시지
												보기</a></li>
									</ul>
								</div>
							</div></li>
						<li style="margin-top:10px;"><a href="/myaccount/settings" id="header-settings"
							name="header-settings" data-name="header-settings"
							data-pagename="main:header" data-pa-click="true"
							class="vx_globalNav-svgIcon vx_globalNav-link_settings js_settings"><img
								src="https://www.paypalobjects.com/ui-web/icons/1-0-0/settings.svg"
								width="26px" height="26px" ><span class="vx_a11yText">설정</span></a></li>
						<li class="vx_globalNav-listItem_logout" style="margin-top:10px;"><a href="/signout"
							id="header-logout" name="header-logout" data-name="header-logout"
							data-pagename="main:header" data-pa-click="true"
							class="vx_globalNav-link_logout js_logout" style="font-size:15px;">로그아웃</a></li>
					</ul>
					</nav>
				</div>
			</div>
			<div>
				<!--[if lte IE 10]>
				<div class="vx_globalNav-alertContainer vx_globalNav-alertWarning vx_hidden-phone">
					<div class="vx_alert_inline vx_alert-warning">
						<p class="vx_alert-text">브라우저의 버전이 오래되었습니다. 계정의 모든 기능을 보려면 최신 버전을 다운로드하세요.</p>
					</div>
				</div>
			<![endif]-->
			</div>
		</div>
	</div>
	<div class="vx_foreground-container foreground-container ">
		<div>
			<div class="vx_globalNav-main_mobile">
				<div class="vx_globalNav-headerSection_trigger">
					<div class="vx_globalNav-toggleTrigger-container">
						<label class="vx_globalNav-toggleTrigger_animated"
							for="toggleNavigation"><span></span>
						<div class="vx_globalNav-toggleTrigger_animated_open">메뉴</div>
							<div class="vx_globalNav-toggleTrigger_animated_close">닫기</div></label>
					</div>
				</div>
				<div class="vx_globalNav-headerSection_logo">
					<a href="/myaccount/home" id="header-ppLogo_mobile"
						class="vx_globalNav-brand_mobile"><span class="vx_a11yText">요약</span></a>
				</div>
				<ul class="vx_globalNav-headerSection_actions">
					<li
						class="vx_globalNav-actionItem_mobileglobalNav_notificationItem vx_globalNav-notificationItem_mobile"><a
						class="vx_globalNav-svgIcon vx_globalNav-link_notifications notifications_mobile vx_isCritical js_notificationDesktopBtn cw_notifications-mobile-trigger"
						id="header-openNotifications" role="button" title="알림"
						data-popover-autodisplay="false"
						data-modal-id="notifications-mobile"><img
							style="pointer-events: none" class="notifications-icon"
							src="https://www.paypalobjects.com/ui-web/icons/1-0-0/notifications.svg"
							width="32px" height="32px"style="margin-top:10px;"><span class="vx_a11yText">알림</span></a></li>
				</ul>
				<div class="vx_modal-flow" id="notifications-mobile">
					<div class="vx_modal-wrapper cw_notifications-modal-wrapper">
						<div class="vx_modal-content cw_notifications-mobile-content">
							<div id="notifications-mobile-popover"
								class="cw_notifications-mobile-container" tabindex="0">
								<header
									class="vx_modal-header cw_notifications-mobile-content-header">
								<span class="vx_modal-dismiss_trigger"
									data-modal-id="notifications-mobile"><svg
										class="close-icon" width="24" height="24"
										viewBox="0 0 97.998 120" version="1.1"
										xmlns="http://www.w3.org/2000/svg"
										xmlns:xlink="http://www.w3.org/1999/xlink"
										data-id="cw_notifications-mobile-dismiss">
									<path stroke="#2C2E2F" fill="#2C2E2F"
										d="m82.91 99.121q2.8e-14 0.87891-0.53711 1.416-0.53711 0.53711-1.416 0.53711-0.87891 0-1.4648-0.58594l-30.469-30.469c-7.6538 7.6416-22.961 22.925-30.615 30.566q-0.53711 0.58594-1.416 0.58594t-1.416-0.58594q-1.416-1.416 0-2.7832c10.173-10.205 22.888-22.961 30.518-30.615-7.6294-7.6172-22.888-22.852-30.518-30.469q-1.416-1.5137 0-2.8809 1.416-1.3672 2.9297-0.048829c10.173 10.205 22.888 22.961 30.518 30.615 7.6416-7.6538 22.925-22.961 30.566-30.615q0.48828-0.58594 1.3672-0.58594t1.4648 0.58594q1.416 1.416 0 2.832c-10.205 10.189-22.961 22.925-30.615 30.566 7.6294 7.6294 22.888 22.888 30.518 30.518q0.58594 0.53711 0.58594 1.416z"
										stroke-width="0px"></path></svg><span class="vx_a11yText">Close</span></span>
								<img style="pointer-events: none" class="notifications-icon"
									src="https://www.paypalobjects.com/ui-web/icons/1-0-0/notifications.svg"
									width="32px" height="32px" style="margin-top:10px;">
								<div id="cw_tab-list" class="cw_tab-list">
									<button id="cw_tab-notifications"
										data-panel="cw_panel-notifications"
										class="cw_tab cw_tab_notifications cw_tab_selected"
										data-pagename="main:notifications:toggleNotifs">
										알림(<span id="notificationCount">0</span>)
									</button>
									<button id="cw_tab-messages" data-panel="cw_panel-messages"
										class="cw_tab cw_tab_messages"
										data-pagename="main:notifications:toggleSMC">
										메시지(<span id="messageCount">0</span>)
									</button>
								</div>
								<div class="cw_tab-list-shadow"></div>
								</header>
								<div class="cw_popover-body">
									<ul class="cw_panel cw_panel_notifications cw_panel_selected"
										id="cw_panel-notifications">
										<li class="cw_notification"><div
												class="cw_notification-subheader">알림</div>
											<div class="cw_notification-description">새로운 알림이 없습니다.</div></li>
									</ul>
									<ul class="cw_panel cw_panel_messages" id="cw_panel-messages">
										<li class="cw_notification"><div
												class="cw_notification-subheader">메시지</div>
											<div class="cw_notification-description">새로운 메시지가 없습니다.</div>
											<a href="/selfhelp/smc/" class="cw_notification-link">메시지
												보기</a></li>
									</ul>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<section class="vx_mainContent contents" id="contents" role="main">
		<div class="row accountPage-container js_accountPage-container"
			aria-label="PayPal: 요약">
			<script nonce="" type="text/javascript">
				window.__EVENTS__ = {
					'events' : [],
					'isMobile' : false,
					'isTablet' : false,
					'eventNames' : [],
					'contentCarousel' : {
						'previousA11y' : '\uC774\uC804',
						'nextA11y' : '\uB2E4\uC74C',
						'ofA11y' : '{currentPage}/{maxPage}'
					}
				}
			</script>
			<div class="col-sm-12 noGutter">
				<div class="row">
					<br><br>
	<div class="container">
		<div class="row">

			<div class="col-md-8 col-md-offset-2">
				<form id="joinBlock" name="joinBlock" role="form1" method="POST"
					action="memberInsert.do">

					<legend class="text-center">Register</legend>

					<fieldset>
						<legend>Account Details</legend>
						
						<div class="form-group col-md-12">
							<label for="">Email</label> 
							<input type="email"
							class="form-control" name="m_email" id="m_email"
							placeholder="Email" title="Email을 입력하세요" maxlength="30" style="width:70%;" required>
							<button type="button" id="btnCheckId" onclick="registerCheckFucntion();">Email 중복확인</button>
							<!-- ajax 아이디 중복 확인 -->
							<!-- <div class="check_font" id="id_check"></div> -->
						</div>


						<!-- <input type="hidden"  -->

						<div class="form-group col-md-6">
							<label for="first_name">First name</label> <input type="text"
								class="form-control error" name="m_fname" id="m_fname"
								placeholder="First Name" required  title="Email을 입력하세요">
						</div>

						<div class="form-group col-md-6">
							<label for="last_name">Last name</label> <input type="text"
								class="form-control error" name="m_lname" id="last_name"
								placeholder="Last Name" required>
						</div>


						<!-- 					<div class="form-group col-md-10">
							<label for="">Email</label> <input type="email"
								class="form-control" name="m_email" id="" placeholder="Email">
						</div>
						아이디 체크 버튼 
						<div class="form-group">
							<div class="col-md-2">
								<button type="submit" class="btn btn-primary">ID check</button>
							</div>
						</div>
 -->
						<!-- <div class="form-group"> -->
						<!-- 	<div>
							<div class="col-md-8">
								<label for="">Email</label> <input type="email"
									class="form-control" name="m_email" id="" placeholder="Email">
							</div>
							<div class="col-md-2">
							<label for="btnCheckID"></label> 
								<button type="button" class="btn" name="btnCheckID" id="btnCheckID" style="margin-top:25px">ID check</button>
							</div>

						</div>

 -->
						

						<!-- ------------------------------------------------ -->

						<!--체크버튼 -->
						<!-- 	<div class="form-group col-md-12">
						<button id="btnCheckId">Email Check</button>
						안녕하세요
						
						</div> -->

						<!-- 체크 버튼 -->
						<!-- <div class="col-md-2">
							<label for="btnCheckID"></label>
							<button type="button" class="btn" name="btnCheckID"
								id="btnCheckID" style="margin-top: 25px">ID check</button>
						</div> -->



						<div class="form-group col-md-6">
							<label for="password">Password</label> <input type="password"
								class="form-control" name="m_pw" id="m_pw"
								placeholder="Password" maxlength="20" required >
						</div>



						<div class="form-group col-md-6">
							<label for="confirm_password">Confirm Password</label> <input
								type="password" class="form-control" name="m_pw_check"
								id="m_pw_check" placeholder="Password Check" equalTo="#m_pw"
								data-msg-equalTo="패스워드가 일치하지 않습니다." required>
						</div>

						<div class="form-group col-md-6">
							<label for="Phone">Phone</label> <input type="text"
								class="form-control" name="m_hp" id="m_hp"
								placeholder="Your Cell Phone Number" required>
						</div>


						<div class="form-group col-md-6">
							<label for="country">Country of Residence</label> <select
								class="form-control" name="m_nation" id="m_nation">
								<option value="korea" selected="selected">KOREA</option>
								<option value="uk">United Kingdom</option>
								<option value="us">United America</option>
								<option value="australia">Australia</option>
								<option value="austria">Austria</option>
								<option value="belize">Belize</option>
								<option value="benin">Benin</option>
								<option value="brz">Brazil</option>
								<option value="canada">Canada</option>
								<option value="china">China</option>
								<option value="colombia">Colombia</option>
								<option value="dominica">Dominica</option>
								<option value="eqypt">Eqypt</option>
								<option value="finland">Finland</option>
								<option value="fr">France</option>
								<option value="germany">Germany</option>
								<option value="iceland">Iceland</option>
								<option value="india">India</option>
								<option value="japan">Japan</option>
								<option value="mexico">Mexico</option>
								<option value="hongkong">Hongkong</option>
								<option value="italy">Italy</option>
								<option value="monaco">Monaco</option>
								<option value="newzealand">New Zealand</option>
								<option value="resia">Resia</option>
								<option value="switzerland">Switzerland</option>
							</select>
						</div>



						<div class="form-group col-md-6">
							<label for="Post_Number">Post Number</label> <input type="text"
								class="form-control" name="zipcode" id="post_code" readonly 
								placeholder="Post Number">
						</div>

						<div class="form-group col-md-6">
							<!-- <div class="form-group"> -->
								<!-- <div class="col-md-2"> -->
									<div><label for="buttonpost" style="color:white">우편번호찾기</label></div>
									<input type="button" value="Find post number" onclick="showPostcode()" name="buttonpost" id="buttonpost" class="btn btn-primary">
								<!-- </div> -->
							<!-- </div> -->
							<!-- <label for="last_name">Last name</label> <input type="text"
								class="form-control" name="m_lname" id="last_name"
								placeholder="Last Name" required> -->
						</div>


						<div class="form-group col-md-8">
							<label for="m_addr">Address</label> <input type="text"
								class="form-control" name="m_addr" id="m_addr"
								placeholder="Your address" required>

						</div>

						<div class="form-group col-md-12">
								<label for="m_addr2">Detail Address</label> <input type="text" class="form-control"
								name="m_addr2" id="m_addr2" placeholder="detail address"
								required>
						</div>




					</fieldset>


					<div class="form-group">
						<div class="col-md-12">
							<div class="checkbox">
								<label> <input type="checkbox" value="" id=""name="check"> 
									I accept the 
									<a href="Form_conditions.do">terms and conditions</a>.
								</label>
							</div>
						</div>
					</div>
<br><br><br>

					<div class="form-group">
						<div class="col-md-12">
							<button type="submit" class="btn btn-primary" id="reg_submit" onclick="doJoin();">Register</button>
							<a href="loginForm.do">Already have an account?</a>
						</div>
					</div>
					

				</form>
			</div>

		</div>
	</div>
<br><br><br><br>

	<script>
		// 아이디 유효성 검사(1 = 중복 / 0 
on() {
		 // id = "id_reg" / name = "userId"
		 var m_email = $('#m_email').val();
		 $.ajax({
		 url : '${pageContext.request.contextPath}/idCheck.do?m_email='+ m_email,
		 type : 'get',
		 success : function(data) {
		 console.log("1 = 중복o / 0 = 중복x : "+ data);							
		
		 if (data == 1) {
		 // 1 : 아이디가 중복되는 문구
		 $("#id_check").text("사용중인 아이디입니다 :p");
		 $("#id_check").css("color", "red");
		 $("#reg_submit").attr("disabled", true);
		 } else {
		
		 if(idJ.test(m_email)){
		 // 0 : 아이디 길이 / 문자열 검사
		 $("#id_check").text("");
		 $("#reg_submit").attr("disabled", false);
		
		 } else if(m_email == ""){
		
		 $('#id_check').text('아이디를 입력해주세요 :)');
		 $('#id_check').css('color', 'red');
		 $("#reg_submit").attr("disabled", true);				
		
		 } else {
		
		 $('#id_check').text("아이디는 소문자와 숫자 4~12자리만 가능합니다 :) :)");
		 $('#id_check').css('color', 'red');
		 $("#reg_submit").attr("disabled", true);
		 }
		
		 }
		 }, error : function() {
		 console.log("실패");
		 }
		 });
		 }); */
	</script>



					
				</div>
			</div>
		</div>
		</section>
		<div>
			<div>
				<div class="vx_globalFooter globalFooter-container">
					<div class="vx_globalFooter-content">
						<ul class="vx_globalFooter-list">
							<li><a href="/smarthelp/home" class="js_contextualHelp"
								data-pagename="" data-name="footer-help" name="footer-help"
								id="footer-help" style="font-size:15px;">회사소개</a></li>
							<li ><a href="/smarthelp/contact-us" data-pagename=""
								data-name="footer-contact" name="footer-contact"
								id="footer-contact" style="font-size:15px;">이용방법</a></li>
							<li><a href="/webapps/mpp/paypal-safety-and-security"
								data-pagename="" data-name="footer-security"
								name="footer-security" id="footer-security" style="font-size:15px;">고객센터</a></li>
						</ul>
						<div class="vx_globalFooter_secondary">
							<p class="vx_globalFooter-copyright" style="font-size:13px;">
								Copyright ©<span dir="ltr">2019</span> PayLog. FinalProject
							</p>
							<ul class="vx_globalFooter-list_secondary">
								<li style="font-size:13px;"><a href="/webapps/mpp/ua/privacy-full" data-pagename=""
									data-name="footer-privacy" name="footer-privacy"
									id="footer-privacy">개인정보</a></li>
								<li style="font-size:13px;"><a href="/webapps/mpp/ua/legalhub-full"
									data-pagename="" data-name="footer-legal" name="footer-legal"
									id="footer-legal">이용약관</a></li>
							</ul>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div class="vx_modal-flow" role="dialog" id="extendSessionModal"
		tabindex="-1" aria-labelledby="_extendSession-header">
		<div class="vx_modal-wrapper">
			<div class="vx_modal-content">
				<div class="extendSession-container">
					<span
						class="vx_icon vx_icon-large vx_icon-attention-large extendSession-icon"></span>
					<h2 class="vx_h2 extendSession-header" id="_extendSession-header">모두
						완료되었나요?</h2>
					<p class="extendSession-message">잠시 후 로그아웃됩니다.</p>
					<button name="extendSession" id="extendSession-btn"
						class="btn vx_btn vx_btn-block">로그인 유지</button>
				</div>
			</div>
		</div>
	</div>

	<script nonce="" type="text/javascript"
		src="https://www.paypalobjects.com/ui-web/vx-pattern-lib/2-3-2/vx-lib.min.js"
		defer=""></script>
	<script nonce="" type="text/javascript">window.__GLOBAL__ = {"name":{"firstName":"MinJeong","lastName":"Kim","fullName":"MinJeong Kim"},"encryptedAccountNumber":"XVUMEX9MVAQP4","isBusinessUser":false,"noBalance":false,"pxpTracking":{"xe":"100170,100175,100091,100083,100193,100044,100562,100420,100985,100272,100328,100911,100528,100904,100719,100860,100532,100510,100323,100613,100268,4114,2149,4275,4430,4545,4650,4669,2709,4860,2983,3136,3159,3194,3203,3236,3358,3583,3635,3743,3982,4016,2012","xt":"100413,100422,100217,100199,100461,100096,101488,101051,102847,100651,100824,102629,102283,102612,101917,102452,102136,102135,100814,101615,100643,9813,5123,10207,10633,10920,11202,11263,6527,11763,7145,7488,7542,7621,7644,7715,8017,8546,8667,9364,9508,9581,5847"},"layout":"netNewActive","sessionRefreshTimer":7,"rsta":"ko_KR","ccpg":"KR","correlationId":"61f471d09da62"}</script>
	<script nonce="" type="text/javascript">var dataLayer =  {'contentCountry':'ko_kr','contentLanguage':'ko','FptiId':'e1be5aaf16c0ac033d2849c3fff9c3c5'}</script>
	<script nonce="" type="text/javascript"
		src="https://www.paypalobjects.com/tagmgmt/bs-chunk.js" defer=""></script>
	<script nonce="" type="text/javascript"
		src="https://www.paypalobjects.com/web/res/e4f/1a1579d736d19980dcf0cfd3f2f37/js/cw-lib.js"
		defer=""></script>
	<script nonce="" type="text/javascript"
		src="https://www.paypalobjects.com/web/res/e4f/1a1579d736d19980dcf0cfd3f2f37/js/bundle.js"
		defer=""></script>
	<div>
		<script data-test="ieScript" nonce="">var isLessthanIE10 = false; window.onload = function() { if (isLessthanIE10) { document.getElementById('js_foreground').className += ' vx_hasNavAlert'; } }</script>
		<script nonce="">var helpCenterSpark = function () {}; var mountElement; var mountData = function(retry) { mountElement = document.getElementById('hc-contextual-help-app'); if (typeof mountElement !== 'undefined' && mountElement) { mountElement.dataset.locale = 'ko_KR'; mountElement.dataset.country = 'KR'; } else if (retry >= 0) { return setTimeout(function() { mountData(retry - 1); }, 200); } }; mountData(10); document.addEventListener('DOMContentLoaded', function () { var helpLinks = document.querySelectorAll('.js_contextualHelp'); for (var i = 0; i < helpLinks.length; i++) { helpLinks[i].addEventListener('click', function(event) { if (helpCenterSpark) { event.preventDefault(); helpCenterSpark('show'); } }); } })</script>
		<script async="" defer=""
			src="https://www.paypalobjects.com/helpcenter/helpcenter-8ball-spark.min.js"></script>
		<script defer=""
			src="https://www.paypalobjects.com/ui-web/notifications/1.29.0/notifications.min.js"></script>
	</div>
	<script crossorigin="anonymous"
		src="https://www.paypalobjects.com/pa/mi/miconfig.js"></script>
	<script crossorigin="anonymous"
		src="https://www.paypalobjects.com/gajs/analytics.js"></script>
	<script crossorigin="anonymous"
		src="https://www.paypalobjects.com/gajs/gtag.js"></script>
	<script crossorigin="anonymous"
		src="https://www.paypalobjects.com/pa/tl/patleaf.js"></script>
	<script crossorigin="anonymous"
		src="https://www.paypalobjects.com/pa/tl/patlcfg.js"></script>
</body>
</html>