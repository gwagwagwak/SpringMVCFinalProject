/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.5
 * Generated at: 2019-09-02 15:55:32 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\" />\r\n");
      out.write("<link rel=\"icon\" type=\"image/png\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/img/favicon.ico\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\" />\r\n");
      out.write("<title>Awesome Landing Page by Creative Tim</title>\r\n");
      out.write("<meta\r\n");
      out.write("\tcontent='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0'\r\n");
      out.write("\tname='viewport' />\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width\" />\r\n");
      out.write("\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/css/bootstrap.css\"\r\n");
      out.write("\trel=\"stylesheet\" />\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/css/landing-page.css\"\r\n");
      out.write("\trel=\"stylesheet\" />\r\n");
      out.write("\r\n");
      out.write("<!--     Fonts and icons     -->\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("<link\r\n");
      out.write("\thref='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400,300'\r\n");
      out.write("\trel='stylesheet' type='text/css'>\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/css/pe-icon-7-stroke.css\"\r\n");
      out.write("\trel=\"stylesheet\" />\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script src=\"//developers.kakao.com/sdk/js/kakao.min.js\"></script>\r\n");
      out.write("<style>\r\n");
      out.write(".input-group-addon.primary {\r\n");
      out.write("\tcolor: rgb(255, 255, 255);\r\n");
      out.write("\tbackground-color: rgb(50, 118, 177);\r\n");
      out.write("\tborder-color: rgb(40, 94, 142);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".input-group-addon.success {\r\n");
      out.write("\tcolor: rgb(255, 255, 255);\r\n");
      out.write("\tbackground-color: rgb(92, 184, 92);\r\n");
      out.write("\tborder-color: rgb(76, 174, 76);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".input-group-addon.info {\r\n");
      out.write("\tcolor: rgb(255, 255, 255);\r\n");
      out.write("\tbackground-color: rgb(57, 179, 215);\r\n");
      out.write("\tborder-color: rgb(38, 154, 188);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".input-group-addon.warning {\r\n");
      out.write("\tcolor: rgb(255, 255, 255);\r\n");
      out.write("\tbackground-color: rgb(240, 173, 78);\r\n");
      out.write("\tborder-color: rgb(238, 162, 54);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".input-group-addon.danger {\r\n");
      out.write("\tcolor: rgb(255, 255, 255);\r\n");
      out.write("\tbackground-color: rgb(217, 83, 79);\r\n");
      out.write("\tborder-color: rgb(212, 63, 58);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".green-border-focus .form-control:focus {\r\n");
      out.write("\tborder: 1px solid #8bc34a;\r\n");
      out.write("\tbox-shadow: 0 0 0 0.2rem rgba(54, 188, 155, .25);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#sendButton {\r\n");
      out.write("\tfloat: right;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@media ( min-width : 768px) {\r\n");
      out.write("\t.navbar-nav.navbar-center {\r\n");
      out.write("\t\tposition: absolute;\r\n");
      out.write("\t\tleft: 50%;\r\n");
      out.write("\t\ttransform: translatex(-50%);\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"landing-page landing-page1\">\r\n");
      out.write("\r\n");
      out.write("\t<nav class=\"navbar navbar-transparent navbar-fixed-top\"\r\n");
      out.write("\t\trole=\"navigation\">\r\n");
      out.write("\t<div class=\"navbar-header navbar-dark\">\r\n");
      out.write("\t\t<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\"\r\n");
      out.write("\t\t\tdata-target=\".navbar-collapse\">\r\n");
      out.write("\t\t\t<span class=\"icon-bar\"></span> <span class=\"icon-bar\"></span> <span\r\n");
      out.write("\t\t\t\tclass=\"icon-bar\"></span>\r\n");
      out.write("\t\t</button>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"navbar-collapse collapse\">\r\n");
      out.write("\r\n");
      out.write("\t\t<ul class=\"nav navbar-nav\">\r\n");
      out.write("\t\t\t<li><a href=\"#\">PayLog</a></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t\t<ul class=\"nav navbar-nav navbar-center\">\r\n");
      out.write("\t\t\t<!-- \t\t\t<li><a href=\"qnaList.do\">개인</a></li> -->\r\n");
      out.write("\t\t\t<li><a href=\"getQnaList.do\">qna리스트 작동</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"getMemberList.do\">멤버 목록 작동 </a></li>\r\n");
      out.write("\t\t\t<li><a href=\"qnaWritePage.do\">작성 페이지로 이동</a></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t\t<ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("\t\t\t<li><a href=\"loginForm.do\">로그인</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"join_first.do\">회원가입</a></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</nav>\r\n");
      out.write("\t<div class=\"wrapper\">\r\n");
      out.write("\t\t<div class=\"parallax filter-gradient blue\" data-color=\"blue\">\r\n");
      out.write("\t\t\t<div class=\"parallax-background\">\r\n");
      out.write("\t\t\t\t<img class=\"parallax-background-image\"\r\n");
      out.write("\t\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/img/bg3.jpg\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-5 hidden-xs\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"parallax-image\">\r\n");
      out.write("\t\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-6 col-md-offset-1\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"description\">\r\n");
      out.write("\t\t\t\t\t\t\t<h2>PayLog</h2>\r\n");
      out.write("\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t<h4>Send money in seconds, pay with PayLog Credit or enjoy\r\n");
      out.write("\t\t\t\t\t\t\t\tfast checkouts with One Touch™. We are here.</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<p>Subject to status.T&Cs apply.</p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"buttons\">\r\n");
      out.write("\t\t\t\t\t\t\t<form action=\"new.do\" method=\"get\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"login.do\" class=\"btn btn-neutral btn-lg btn-fill\">Get\r\n");
      out.write("\t\t\t\t\t\t\t\t\tStarted</a>\r\n");
      out.write("\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t\t<!-- <button class=\"btn btn-simple btn-neutral\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"fa fa-android\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t<button class=\"btn btn-simple btn-neutral\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"fa fa-windows\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t</button> -->\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"section section-presentation\">\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-6\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"description\">\r\n");
      out.write("\t\t\t\t\t\t\t아이디 : ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.loginID}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("님\t\t<!-- 아이디 임시 표시 -->\r\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"header-text\">Pay Your Way</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\tOur digital wallet lets you add credit, debit and bank accounts\r\n");
      out.write("\t\t\t\t\t\t\t\tso you decide how to pay.<br>A payment request is a tool\r\n");
      out.write("\t\t\t\t\t\t\t\tthat guides you through the process of making a payment.<br>You\r\n");
      out.write("\t\t\t\t\t\t\t\tcan make payments any way you want, so you don't have to worry\r\n");
      out.write("\t\t\t\t\t\t\t\tabout how to pay.\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t<p>There are several ways you can choose.</p>\r\n");
      out.write("\t\t\t\t\t\t\t<br> <br> <br>\r\n");
      out.write("\t\t\t\t\t\t\t<p style=\"color: blue\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"login.do\">모바일로 구매하기</a>&nbsp;&nbsp;&nbsp;&nbsp;<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"login.do\">온라인으로 구매하기</a>\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-5 col-md-offset-1 hidden-xs\">\r\n");
      out.write("\t\t\t\t\t\t<img\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/img/mac.png\" />\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<!--  \t<result property=\"qm_no\" column=\"qm_no\" />\r\n");
      out.write("\t\t<result property=\"qm_sendername\" column=\"qm_sendername\" />\r\n");
      out.write("\t\t<result property=\"qm_sendermail\" column=\"qm_sendermail\" />\r\n");
      out.write("\t\t<result property=\"qm_receivcemail\" column=\"qm_receivcemail\" />\r\n");
      out.write("\t\t<result property=\"qm_title\" column=\"qm_title\" />\r\n");
      out.write("\t\t<result property=\"qm_content\" column=\"qm_content\" />\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!--이메일 문의하기  -->\r\n");
      out.write("\t\t<div class=\"section section-features\">\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<h4 class=\"header-text text-center\">문의하기</h4>\r\n");
      out.write("\t\t\t\t<br> <br>\r\n");
      out.write("\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-6\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"validate-text\">제목 입력</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"input-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"validate-text\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tid=\"validate-text\" placeholder=\"제목을 입력하세요\" required> <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"input-group-addon danger\"><span\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-remove\"></span></span>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-6\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"validate-text\">이메일 입력</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"input-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"validate-text\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tid=\"validate-text\" placeholder=\"이메일을 입력하세요\" required> <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"input-group-addon danger\"><span\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-remove\"></span></span>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"form-group green-border-focus\">\r\n");
      out.write("\t\t\t\t\t<label for=\"exampleFormControlTextarea5\">문의내용</label>\r\n");
      out.write("\t\t\t\t\t<textarea class=\"form-control\" id=\"exampleFormControlTextarea5\"\r\n");
      out.write("\t\t\t\t\t\trows=\"3\" placeholder=\"문의글을 입력하세요\"></textarea>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<a href=\"qnamainwrite.do\" id=\"sendButton\" class=\"btn btn-primary btn-sm btn-fill\">Send</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<span style=\"color: red;\"> 메시지 결과 : ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${message}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- 이메일 qna 문의 끝!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! -->\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"section section-no-padding\">\r\n");
      out.write("\t\t\t<div class=\"parallax filter-gradient blue\" data-color=\"blue\">\r\n");
      out.write("\t\t\t\t<div class=\"parallax-background\">\r\n");
      out.write("\t\t\t\t\t<img class=\"parallax-background-image\"\r\n");
      out.write("\t\t\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/img/bg3.jpg\" />\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"info\">\r\n");
      out.write("\t\t\t\t\t<h1>Sign up and get started.</h1>\r\n");
      out.write("\t\t\t\t\t<p>Create your PayLog free account</p>\r\n");
      out.write("\t\t\t\t\t<a href=\"login.do\" class=\"btn btn-neutral btn-lg btn-fill\">Get\r\n");
      out.write("\t\t\t\t\t\tStarted</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"plusfriend-chat-button\"\r\n");
      out.write("\t\t\tstyle=\"position: fixed; bottom: 5px; right: 5px;\"></div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<footer class=\"footer\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<nav class=\"pull-left\">\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li><a href=\"companyIntroduce.do\"> 회사소개 </a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"privacy.do\"> 이용방법 </a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"serviceCenter.do\"> 고객센터 </a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t</nav>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"social-area pull-right\">\r\n");
      out.write("\t\t\t\t<a class=\"btn btn-social btn-facebook btn-simple\"\r\n");
      out.write("\t\t\t\t\thref=\"https://www.facebook.com/\"> <i\r\n");
      out.write("\t\t\t\t\tclass=\"fa fa-facebook-square\"></i>\r\n");
      out.write("\t\t\t\t</a> <a class=\"btn btn-social btn-twitter btn-simple\"\r\n");
      out.write("\t\t\t\t\thref=\"https://twitter.com/?lang=ko\"> <i class=\"fa fa-twitter\"></i>\r\n");
      out.write("\t\t\t\t</a> <a class=\"btn btn-social btn-pinterest btn-simple\"\r\n");
      out.write("\t\t\t\t\thref=\"https://www.pinterest.co.kr/\"> <i class=\"fa fa-pinterest\"></i>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"copyright\">\r\n");
      out.write("\t\t\t\t&copy; 2019 <a href=\"http://localhost:8055/project/\">PayLog</a>,\r\n");
      out.write("\t\t\t\tFinal Project\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t</footer>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("<script type='text/javascript'>\r\n");
      out.write("\t//<![CDATA[\r\n");
      out.write("\t// 사용할 앱의 JavaScript 키를 설정해 주세요.\r\n");
      out.write("\tKakao.init('15bec6ab92e405aaac398891fbd4cb2f');\r\n");
      out.write("\t// 스토리 공유 버튼을 생성합니다.\r\n");
      out.write("\tKakao.PlusFriend.createChatButton({\r\n");
      out.write("\t\tcontainer : '#plusfriend-chat-button',\r\n");
      out.write("\t\tplusFriendId : '_xcjxbiT',\r\n");
      out.write("\t\ttitle : 'consult',\r\n");
      out.write("\t\tsize : 'small',\r\n");
      out.write("\t\tcolor : 'yellow',\r\n");
      out.write("\t\tshape : 'pc',\r\n");
      out.write("\t\tsupportMultipleDensities : true\r\n");
      out.write("\t});\r\n");
      out.write("\t//]]>\r\n");
      out.write("</script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/js/jquery-1.10.2.js\"\r\n");
      out.write("\ttype=\"text/javascript\"></script>\r\n");
      out.write("<script type='text/javascript'>\r\n");
      out.write("\t$(document)\r\n");
      out.write("\t\t\t.ready(\r\n");
      out.write("\t\t\t\t\tfunction() {\r\n");
      out.write("\t\t\t\t\t\t$(\r\n");
      out.write("\t\t\t\t\t\t\t\t'.input-group input[required], .input-group textarea[required], .input-group select[required]')\r\n");
      out.write("\t\t\t\t\t\t\t\t.on(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t'keyup change',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tfunction() {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tvar $form = $(this).closest('form'), $group = $(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tthis).closest(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t'.input-group'), $addon = $group\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t.find('.input-group-addon'), $icon = $addon\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t.find('span'), state = false;\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tif (!$group.data('validate')) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tstate = $(this).val() ? true\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t: false;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t} else if ($group.data('validate') == \"email\") {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tstate = /^([a-zA-Z0-9_\\.\\-])+\\@(([a-zA-Z0-9\\-])+\\.)+([a-zA-Z0-9]{2,4})+$/\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t.test($(this).val())\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t} else if ($group.data('validate') == 'phone') {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tstate = /^[(]{0,1}[0-9]{3}[)]{0,1}[-\\s\\.]{0,1}[0-9]{3}[-\\s\\.]{0,1}[0-9]{4}$/\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t.test($(this).val())\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t} else if ($group.data('validate') == \"length\") {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tstate = $(this).val().length >= $group\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t.data('length') ? true\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t: false;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t} else if ($group.data('validate') == \"number\") {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tstate = !isNaN(parseFloat($(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tthis).val()))\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t&& isFinite($(this)\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val());\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tif (state) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t$addon.removeClass('danger');\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t$addon.addClass('success');\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t$icon\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t.attr('class',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'glyphicon glyphicon-ok');\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t$addon.removeClass('success');\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t$addon.addClass('danger');\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t$icon\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t.attr('class',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'glyphicon glyphicon-remove');\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tif ($form\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t.find('.input-group-addon.danger').length == 0) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t$form\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t.find('[type=\"submit\"]')\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t.prop('disabled', false);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t$form.find('[type=\"submit\"]')\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t.prop('disabled', true);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t$(\r\n");
      out.write("\t\t\t\t\t\t\t\t'.input-group input[required], .input-group textarea[required], .input-group select[required]')\r\n");
      out.write("\t\t\t\t\t\t\t\t.trigger('change');\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t$(\"#original\").click(function() {\r\n");
      out.write("\t\t$(\"#paste\").val($(this).text());\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/js/jquery-ui-1.10.4.custom.min.js\"\r\n");
      out.write("\ttype=\"text/javascript\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/js/bootstrap.js\"\r\n");
      out.write("\ttype=\"text/javascript\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/js/awesome-landing-page.js\"\r\n");
      out.write("\ttype=\"text/javascript\"></script>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}