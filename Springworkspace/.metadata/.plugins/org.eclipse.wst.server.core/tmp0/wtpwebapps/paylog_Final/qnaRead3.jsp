<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
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
	src="http:code.jquery.com/jquery-1.8.3.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/js/main.js"></script>

<!-- 댓글 작성 추가문  -->
<link
	href="//netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<title>PayPal: 요약</title>

<style>
body {
	padding-top: 30px;
}

.widget .panel-body {
	padding: 0px;
}

.widget .list-group {
	margin-bottom: 0;
}

.widget .panel-title {
	display: inline
}

.widget .label-info {
	float: right;
}

.widget li.list-group-item {
	border-radius: 0;
	border: 0;
	border-top: 1px solid #ddd;
}

.widget li.list-group-item:hover {
	background-color: rgba(86, 61, 124, .1);
}

.widget .mic-info {
	color: #666666;
	font-size: 11px;
}

.widget .action {
	margin-top: 5px;
}

.widget .comment-text {
	font-size: 12px;
}

.widget .btn-block {
	border-top-left-radius: 0px;
	border-top-right-radius: 0px;
}

.ui-group-buttons .or {
	position: relative;
	float: left;
	width: .3em;
	height: 1.3em;
	z-index: 3;
	font-size: 12px
}

.ui-group-buttons .or:before {
	position: absolute;
	top: 50%;
	left: 50%;
	content: '';
	background-color: #5a5a5a;
	margin-top: -.1em;
	margin-left: -.9em;
	width: 1.8em;
	height: 1.8em;
	line-height: 1.55;
	color: #fff;
	font-style: normal;
	font-weight: 400;
	text-align: center;
	border-radius: 500px;
	-webkit-box-shadow: 0 0 0 1px rgba(0, 0, 0, 0.1);
	box-shadow: 0 0 0 1px rgba(0, 0, 0, 0.1);
	-webkit-box-sizing: border-box;
	-moz-box-sizing: border-box;
	-ms-box-sizing: border-box;
	box-sizing: border-box
}

.ui-group-buttons .or:after {
	position: absolute;
	top: 0;
	left: 0;
	content: ' ';
	width: .3em;
	height: 2.84em;
	background-color: rgba(0, 0, 0, 0);
	border-top: .6em solid #5a5a5a;
	border-bottom: .6em solid #5a5a5a
}

.ui-group-buttons .or.or-lg {
	height: 1.3em;
	font-size: 16px
}

.ui-group-buttons .or.or-lg:after {
	height: 2.85em
}

.ui-group-buttons .or.or-sm {
	height: 1em
}

.ui-group-buttons .or.or-sm:after {
	height: 2.5em
}

.ui-group-buttons .or.or-xs {
	height: .25em
}

.ui-group-buttons .or.or-xs:after {
	height: 1.84em;
	z-index: -1000
}

.ui-group-buttons {
	display: inline-block;
}

.ui-group-buttons:after {
	content: ".";
	display: block;
	height: 0;
	clear: both;
	visibility: hidden
}

.ui-group-buttons .btn {
	float: left;
	border-radius: 0
}

.ui-group-buttons .btn:first-child {
	margin-left: 0;
	border-top-left-radius: .25em;
	border-bottom-left-radius: .25em;
	padding-right: 15px
}

.ui-group-buttons .btn:last-child {
	border-top-right-radius: .25em;
	border-bottom-right-radius: .25em;
	padding-left: 15px
}
</style>

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
				</div>

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
				<br> <br>
				
				
				<div>
					<input type="hidden" name="q_no" value="${qna.q_no}">
					<%-- <c:if test="${sessionScope.userid == qna.writer}"> --%>
					<c:if test="${loginMember.m_email == qna.q_writer}">
						<button type="button" id="btnUpdate">수정</button>
						<button type="button" id="btnDelete">삭제</button>
					</c:if>
					<button type="button" id="btnList">목록</button>
				</div>



			</form>

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

			<div class="panel panel-default widget">
				<div class="panel-heading">
					<span class="glyphicon glyphicon-comment"></span>
					<h3 class="panel-title">Comment</h3>


				</div>

				<!--WRITE-->
				<button type="button" id="btnReply" class="[ btn btn-info ]"
					data-loading-text="Loading...">Post reply</button>
				<br>
				<div class="col">
					<div class="panel-body">
						<form role="form">
							<fieldset>
								<div class="form-group">
									<textarea class="form-control" rows="3"
										placeholder="Write in your wall" autofocus=""></textarea>
								</div>
							</fieldset>
						</form>
					</div>
				</div>


				<!-- ajax로 불러온 댓글 -->
				<!-- 	<div class="panel-body">
				<div id="listReply"></div>
			</div> -->



				<!--REPLY-->

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