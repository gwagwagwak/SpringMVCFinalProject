<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%-- <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c-rt"%>
<%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="fmt-rt"%> --%>

 <%-- <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
	<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ page import="java.util.*"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> --%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ page import="java.util.*"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link rel="stylesheet" type="text/css"
		href="//netdna.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css">

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



<!-- jquery 추가 -->
<%-- <script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/js/jquery-3.1.1.js"></script>


<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>

<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/js/main.js"></script>
 --%>


<!-- 댓글 작성 추가문  -->
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<script
	src="//netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<link
	href="//netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">


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
				document.form1.action = "qnaDelete.do?q_no=${qna.q_no}";
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
				/* <a href="qnaRead2.do?q_no=${row.q_no}&curPage=${map.pager.curPage}"> */
				alert("댓글이 등록되었습니다.");
				location.href="qnaRead2.do?q_no=${qna.q_no}&curPage=1";
				//listReply("1");
			}/* ,
			dataType : 'json', 		
			data : param,																			error: function(req, status, errThrown) {
																												alert("network error occur");
																											} */
		});
	}
	<%-- <%=board.getContent().replaceAll(" ", "&nbsp;").replaceAll("<", "&lt;").replaceAll(">", "&gt;")
    .replaceAll("\n", "<br>")%> --%>
	
	
	
	
	  function listReply(num) {
			$.ajax({
				type : "post",
				url : "getCommentList.do?q_no=${qna.q_no}&curPage=" + num,
				dataType:'json',
				async:false,
				
				success : function(data, status, xhr) {
					console.log(data);
					
					//alert("댓글리스트 가져오기 성공  " + data);
				
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


<!--네브바 시작 ===================================================================== -->


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
					data-pa-click="true" class="vx_globalNav-brand_desktop"><span
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
							width="26px" height="26px"><span class="vx_a11yText">설정</span></a>
					</div>
					<div>
						<p class="vx_h5 vx_globalNav-displayName">이름</p>
					</div>
				</div>
				<div class="vx_globalNav-navContainer">
					<nav class="vx_globalNav-nav" role="navigation">
					<ul class="vx_globalNav-list">
						<li class="vx_isActive"><a href="/myaccount/summary"
							target="_self" id="header-newSummary" name="header-newSummary"
							data-name="header-newSummary" data-pagename="main:header"
							data-pa-click="true" class="vx_globalNav-links js_summary"
							style="font-size: 15px;">요약</a></li>
						<li class=""><a href="/myaccount/transactions/"
							target="_self" id="header-activity" name="header-activity"
							data-name="header-activity" data-pagename="main:header"
							data-pa-click="true" class="vx_globalNav-links js_activity"
							style="font-size: 15px;">활동내역</a></li>
						<li class=""><a href="/myaccount/transfer?from=Header"
							target="_self" id="header-transfer" name="header-transfer"
							data-name="header-transfer" data-pagename="main:header"
							data-pa-click="true" class="vx_globalNav-links js_sendMoney"
							style="font-size: 15px;">카드</a></li>

					</ul>
					<ul class="vx_globalNav-list_secondary">
						<li class="vx_hidden-phone" data-autodisplay="false"
							style="margin-top: 10px;"><a href="#"
							id="header-notifications" data-name="header-notifications"
							class="vx_globalNav-svgIcon vx_globalNav-link_notifications vx_isCritical js_notifications js_notificationDesktopBtn cw_popover-trigger"
							data-popover-autodisplay="false"
							data-popover-id="notifications-popover" data-popover-offset="15"
							data-pagename="main:notifications::toggle"
							data-popover-pagename-show="main:notifications:toggle"
							data-popover-pagename-hide="main:notifications:toggle"
							data-pa-click="true"><img style="pointer-events: none"
								class="notifications-icon"
								src="https://www.paypalobjects.com/ui-web/icons/1-0-0/notifications.svg"
								width="32px" height="32px" style="margin-top:10px;"><span
								class="vx_a11yText">알림</span></a>
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
						<li style="margin-top: 10px;">
						<a href="userInformation.do?m_email=${loginMember.m_email}"
							id="header-settings" name="header-settings"
							data-name="header-settings" data-pagename="main:header"
							data-pa-click="true"
							class="vx_globalNav-svgIcon vx_globalNav-link_settings js_settings"><img
								src="https://www.paypalobjects.com/ui-web/icons/1-0-0/settings.svg"
								width="26px" height="26px"><span class="vx_a11yText">설정</span></a></li>
						<li class="vx_globalNav-listItem_logout" style="margin-top: 10px;"><a
							href="/signout" id="header-logout" name="header-logout"
							data-name="header-logout" data-pagename="main:header"
							data-pa-click="true" class="vx_globalNav-link_logout js_logout"
							style="font-size: 15px;">로그아웃</a></li>
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
							width="32px" height="32px" style="margin-top:10px;"><span
							class="vx_a11yText">알림</span></a></li>
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
										data-id="cw_notifications-mobile-dismiss"> <path
										stroke="#2C2E2F" fill="#2C2E2F"
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

<!--네브바 끝 ===================================================================== -->


	
	
	
	
	
	
	
	
	
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
							<%-- <fmt:parseDate value="${qna.q_date}" var="q_date"  pattern="yyyy-MM-dd HH:mm:ss.S" scope="page"/> --%>
            				<fmt:formatDate value="${qna.q_date}" pattern="yyyy.MM.dd"/> 
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
						<c:when test="${loginMember.m_email eq qna.q_writer}">
						
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
										placeholder="Write in your wall" >
						</textarea>
						
						<span class="input-group-addon"> 
							<a href="#" id="btnReply" >
								<!-- <i class="fa fa-edit"></i> -->
								<span class="glyphicon glyphicon-pencil"></span>
							</a> 
						</span>
					</div>
<!--관리자 댓글 리스트  -->	
			<%-- <c:if test="" > --%>					
					<ul class="comments-list">
						<li class="comment">
						<a class="pull-left" href="#"> 
							<img class="avatar" src="http://bootdey.com/img/Content/user_1.jpg" alt="avatar">
						</a>
							<div class="comment-body">
								<div class="comment-heading">
									<h4 class="user">Administrator</h4>
									<h5 class="time">
										댓글 단 시간
									</h5>
								</div>
								<p>댓글 내용</p>
							</div>
								
						
			
<!-- 일반 댓글 리스트 반복문 -->	
			
	<!-- 
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
							</ul> -->
							
<!-- 댓글 반복문  -->		
	
				<c:if test="${not empty map.commentlist}">
					<c:forEach var="row" items="${map.commentlist}">
							<ul class="comments-list">
								
								<li class="comment">
								<a class="pull-left" href="#"> 
									<img class="avatar" src="http://bootdey.com/img/Content/user_3.jpg" alt="avatar">
								</a>
									<div class="comment-body">
										<div class="comment-heading">
											<h4 class="user"> ${row.comt_writer}</h4>
											<h5 class="time">
												<fmt:formatDate value="${row.comt_date}" pattern="yyyy.MM.dd"/> 
											</h5>
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