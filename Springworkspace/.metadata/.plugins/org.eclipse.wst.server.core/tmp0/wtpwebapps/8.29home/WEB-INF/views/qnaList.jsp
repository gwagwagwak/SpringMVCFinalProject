<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>Home</title>

<!-- 
<link
	href="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/css/bootstrap-combined.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
 -->

<!-- 부트스트랩 3 -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>



<script>
	/*  글쓰기 버튼 작동 jquery*/
	$(function() {
		$("#btnWrite").click(function() {
			/* location.href="${path}/qna/qnaWrite.do"; */
			location.href = "qnaWritePage.do";
			/* location.href = "&{path}/qna/qnaWritePage.do"; */
		})
	});

	/* 페이징 처리 스크립트 */
	function list(page) {
		location.href = "getQnaList.do?curPage=" + page;

	};
	
	/*페이징 글 번호   */
	/* ${map.count}, ${map.pager.curPage} */
	
</script>



<!-- 부트스트랩 4 버전 -->
<!-- <link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css" 
		integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>

 -->

<!-- include로 헤더 포함 -->
<%-- 	<%@ include file="../include/header.jsp" %> --%>


<style>
thead {
	background-color: #ADD8E6;
	font-size: 20px;
}

td.number_dot:after {
	content: ". ";
	margin-right: 10px;
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
						<li style="margin-top:10px;"><a href="userInformation.do?m_email=${loginMember.m_email}" id="header-settings"
							name="header-settings" data-name="header-settings"
							data-pagename="main:header" data-pa-click="true"
							class="vx_globalNav-svgIcon vx_globalNav-link_settings js_settings"><img
								src="https://www.paypalobjects.com/ui-web/icons/1-0-0/settings.svg"
								width="26px" height="26px" ><span class="vx_a11yText">설정</span></a></li>
						<li class="vx_globalNav-listItem_logout" style="margin-top:10px;"><a href="logout.do"
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
					
					



	<!-- include로 네비바 추가 -->
	<%-- <%@ include file="../include/menu.jsp" %> --%>

	<!-- 네비게이션 바~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~  -->
<!-- 
	<nav class="navbar navbar-inverse">
	<div class="container-fluid">

		<div class="navbar-header">
			<a class="navbar-brand" href="#">PayLog</a>
		</div>

		<ul class="nav navbar-nav ">
			<li class="active"><a href="#">개인</a></li>
			<li class="dropdown"><a class="dropdown-toggle"
				data-toggle="dropdown" href="#">구매 <span class="caret"></span></a>
				<ul class="dropdown-menu">
					<li><a href="#">모바일 구매</a></li>
					<li><a href="#">온라인 구매</a></li>
				</ul></li>

			<li><a href="#">카드</a></li>
		</ul>
		<ul class="nav navbar-nav navbar-right">
			<li><a href="#"><span class="glyphicon glyphicon-user"></span>
					Sign Up</a></li>
			<li><a href="#"><span class="glyphicon glyphicon-log-in"></span>
					Login</a></li>
		</ul>
	</div>
	</nav>

 -->
	<!--qna list table~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~  -->

	<div class="container">

		<!-- 완료, 미완료 구분 버튼 ===================================================================== -->
		<!--
	 <div class="btn-toolbar">
		<button class="btn btn-primary">New User</button>

		<button class="btn disabled">
			<strong>Complete</strong>
		</button>
		<button class="btn">
			<strong>Incomplete</strong>
		</button>
	</div>
	
 -->


		<h2>Q&A</h2>
		<hr>
		<h3></h3>
		<br>
		<!-- <ul class="nav nav-tabs">
			<li class="active"><a href="#">Complete</a></li>
			<li><a href="#">Incomplete</a></li>
		</ul>
		<br> -->
		
		<!--글 작성 버튼  -->
		<div class="container">
            <div class="container-fluid full-width">
				
				<button type="button" id="btnWrite" class="btn btn-info pull-right" style="align:right">글 작성</button>
			</div>
		</div>
		<%-- <div>
			총 ${map.count}개의 게시물이 있습니다.<button type="button" id="btnWrite" class="btn btn-info" style="align:right">글 작성</button>   
		</div> --%>
		
		<!-- 테이블 리스트 =============================================================================== -->
		
		

		<!-- test table -->
		<br>
		<div class="well">
			<table class="table">
				<thead>
					<tr>
						<th style="width: 70px">No.</th>
						<th style="width: 150px">Division</th>
						<th style="width: 670px">Title</th>
						<th style="width: 180px">Writer</th>
						<th style="width: 160px">Date</th>
						<th style="width: 60px">check</th>
					</tr>
				</thead>
				<!-- <span class="glyphicon glyphicon-pencil"></span>
				<span class="glyphicon glyphicon-ok"></span> -->
				<tbody>
					<c:forEach var="row" items="${map.list}" varStatus="i">
						<tr>
							<!--글번호  -->
							<!--
								!!!!!!!!!!!!!!!!!!!!!!!게시물 순번
								전체 레코드 수 - ( (현재 페이지 번호 - 1) * 한 페이지당 보여지는 레코드 수 + 현재 게시물 출력 순서 )
							  	${count} -(${pager.curPage}-1) * 10 + 0(0번부터 9번까지 한페이지에 들어감) 
							  -->
							<%-- <td class="number_dot">${row.q_no}</td> --%>
							<td class="number_dot">
								<strong>${map.count -((map.pager.curPage - 1)*10 + i.index)}</strong>
							</td>
							<%-- <td class="number_dot">${row.q_no}</td> --%>

							<td><strong>${row.q_divide}</strong></td>
							<td>
								<c:choose>
									<c:when test="${row.q_writer eq loginMember.m_email}">
										<strong><a href="qnaRead2.do?q_no=${row.q_no}&curPage=${map.pager.curPage}">${row.q_title}</a></strong>
									</c:when>
									<c:when test="${row.q_private eq 'private'}">
										 <strong>${row.q_title} &nbsp;<span class="glyphicon glyphicon-lock"></span></strong>
									</c:when>
									<c:otherwise>
										<strong><a href="qnaRead2.do?q_no=${row.q_no}&curPage=${map.pager.curPage}">${row.q_title}</a></strong>
									</c:otherwise>
								</c:choose>
								<%-- <c:if test="${row.q_private eq 'private'}">
										${row.q_title} <span class="glyphicon glyphicon-lock"></span>
								</c:if> 
								<c:if test="${row.q_private eq 'public'}">
									<a
										href="qnaRead.do?q_no=${row.q_no}&curPage=${map.pager.curPage}">${row.q_title}
										href="qnaRead2.do?q_no=${row.q_no}&curPage=${map.pager.curPage}">${row.q_title}
									</a>
								</c:if> --%>
							</td>
							<td>
								<c:set var="dott" value="...."/>
								<Strong>${fn:substring(row.q_writer,0,5)}${dott}</Strong>
								
							</td>
							<td>
								<fmt:formatDate value="${row.q_date}" pattern="yyyy-MM-dd" />
							</td>
							<!--pattern="yyyy-MM-dd HH:mm:ss"  -->
							<td>
								<c:choose>
									<c:when test="${row.q_complete eq '답변미완료'}">
								  		<span class="glyphicon glyphicon-remove"></span>
									</c:when>
									<c:otherwise>
										<span class="glyphicon glyphicon-ok"></span>
									</c:otherwise>
								</c:choose>
							</td>
						</tr>
					</c:forEach>

					<!--페이징 :pager  -->
					<%--  <tr>
						<td colsapn="5" align="center">
							<c:if test="${map.pager.curBlock > 1}">
								<a href="javascript:list('1')">[처음]</a>
							</c:if>
							
							<c:if test="${map.pager.curBlock > 1}">
								<a href="javascript:list('${map.pager.prevPage}')">[이전]</a>
							</c:if>
							
							<c:forEach var="num" begin="${map.pager.blockBegin}" end="${map.pager.blockEnd}">
								<c:choose>
									<c:when test="${num == map.pager.curPage}">
										<sapn style="clolr:red;">${num}</span>&nbsp;
									</c:when>
									<c:otherwise>
										<a href="javascript:list('${num}')">${num}</a>&nbsp;
									</c:otherwise>
								</c:choose>
							</c:forEach>
							
							<c:if test="${map.pager.curBlock <= map.pager.totBlock}">
								<a href="javascript:list('${map.pager.nextPage}')">[다음]</a>
							</c:if>
								
							<c:if test="${map.pager.curPage <= map.pager.totPage}">
								<a href="javascript:list('${map.pager.totPage}')">[끝]</a>
							</c:if>
							
						</td>
					</tr>  --%>
					<%-- 페이징 처리 기초 예시 
							<c:forEach var="num" begin="1"
								end="${map.pager.totPage}">
								<a href="javascript:list('${num}')">${num}</a>
							</c:forEach> --%>
				</tbody>
			</table>




			<!-- ================== -->
			<div class="container" align="center">
				<ul class="pagination">

					<!-- 페이징 부분 -->
					<c:if test="${map.pager.curBlock > 1}">
						<li><a href="javascript:list('1')">[처음]</a></li>
					</c:if>

					<c:if test="${map.pager.curBlock > 1}">
						<li><a href="javascript:list('${map.pager.prevPage}')">[이전]</a></li>
					</c:if>

					<c:forEach var="num" begin="${map.pager.blockBegin}"
						end="${map.pager.blockEnd}">
						<c:choose>
							<c:when test="${num == map.pager.curPage}">
								<%-- <li><span style="clolr:red;">${num}</span>&nbsp;</li> --%>
								<%-- 								<li><a href="#" target="blank" style="color: red; font-weight: bold">${num}</a>&nbsp;</li> --%>
								<li><span style="color: #FF6347; font-weight: bold">${num}</span>&nbsp;</li>
							</c:when>
							<c:otherwise>
								<li><a href="javascript:list('${num}')">${num}</a>&nbsp;</li>
							</c:otherwise>
						</c:choose>
					</c:forEach>

					<c:if test="${map.pager.curBlock <= map.pager.totBlock}">
						<li><a href="javascript:list('${map.pager.nextPage}')">[다음]</a></li>
					</c:if>

					<c:if test="${map.pager.curPage <= map.pager.totPage}">
						<li><a href="javascript:list('${map.pager.totPage}')">[끝]</a></li>
					</c:if>
				</ul>
			</div>




			<!--페이징 처리 : Pager  -->
			<!-- <div class="container" align="center">
				<ul class="pagination">
					<li><a href="#">Prev</a></li>
					<li><a href="#">1</a></li>
					<li class="active"><a href="#">2</a></li>
					<li><a href="#">3</a></li>
					<li><a href="#">4</a></li>
					<li><a href="#">5</a></li>
					<li><a href="#">Next</a></li>
				</ul>
			</div> -->
		</div>

		<!-- 페이지네이션~!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! -->
		<!-- <div class="pagination" align="center">
		<ul>
			<li><a href="#">Prev</a></li>
			<li><a href="#">1</a></li>
			<li><a href="#">2</a></li>
			<li><a href="#">3</a></li>
			<li><a href="#">4</a></li>
			<li><a href="#">Next</a></li>
		</ul>
	</div> -->




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