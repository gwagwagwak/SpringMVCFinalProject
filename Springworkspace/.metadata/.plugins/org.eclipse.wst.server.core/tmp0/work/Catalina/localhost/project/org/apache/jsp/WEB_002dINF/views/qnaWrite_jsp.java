/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.5
 * Generated at: 2019-08-21 00:38:10 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class qnaWrite_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<!-- 체크박스  css ============ -->\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css\"\r\n");
      out.write("\trel=\"stylesheet\" id=\"bootstrap-css\">\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script src=\"//code.jquery.com/jquery-1.11.1.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!--                             -->\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<!-- body\\==================================================================== -->\r\n");
      out.write("<body class=\"landing-page landing-page1\">\r\n");
      out.write("\r\n");
      out.write("\t<!-- 네비게이션 -->\r\n");
      out.write("\r\n");
      out.write("\t<!-- <nav class=\"navbar navbar-transparent navbar-fixed-top\" role=\"navigation\"> -->\r\n");
      out.write("\t<nav class=\"navbar navbar-dark bg-primary\">\r\n");
      out.write("\t<div class=\"navbar-header navbar-dark\">\r\n");
      out.write("\t\t<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\"\r\n");
      out.write("\t\t\tdata-target=\".navbar-collapse\">\r\n");
      out.write("\t\t\t<span class=\"icon-bar\"></span> <span class=\"icon-bar\"></span> <span\r\n");
      out.write("\t\t\t\tclass=\"icon-bar\"></span>\r\n");
      out.write("\t\t</button>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"navbar-collapse collapse\">\r\n");
      out.write("\r\n");
      out.write("\t\t<ul class=\"nav navbar-nav navbar-left\">\r\n");
      out.write("\t\t\t<li><a href=\"#\">PayLog</a></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t\t<ul class=\"nav navbar-nav navbar-center\">\r\n");
      out.write("\t\t\t<li><a href=\"#\">개인</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"#\">고객</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"#\">구매</a></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t\t<ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("\t\t\t<li><a href=\"#\">로그인</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"#\">회원가입</a></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</nav>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!--  -->\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"section section-gray section-clients\"\r\n");
      out.write("\t\tstyle=\"margin-top: 100px\">\r\n");
      out.write("\t\t<div class=\"container text-center\">\r\n");
      out.write("\t\t\t<h4 class=\"header-text\">Friends in high places</h4>\r\n");
      out.write("\t\t\t<p>\r\n");
      out.write("\t\t\t\tBuild customer confidence by listing your users! Anyone who has used\r\n");
      out.write("\t\t\t\tyour service and has been pleased with it should have a place here!\r\n");
      out.write("\t\t\t\tFrom Fortune 500 to start-ups, all your app enthusiasts will be glad\r\n");
      out.write("\t\t\t\tto be featured in this section. Moreover, users will feel confident\r\n");
      out.write("\t\t\t\tseing someone vouching for your product!<br>\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t\t<div class=\"logos\">\r\n");
      out.write("\t\t\t\t<ul class=\"list-unstyled\">\r\n");
      out.write("\t\t\t\t\t<li><img\r\n");
      out.write("\t\t\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/img/adobe.png\" /></li>\r\n");
      out.write("\t\t\t\t\t<li><img\r\n");
      out.write("\t\t\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/img/zendesk.png\" /></li>\r\n");
      out.write("\t\t\t\t\t<li><img\r\n");
      out.write("\t\t\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/img/ebay.png\" /></li>\r\n");
      out.write("\t\t\t\t\t<li><img\r\n");
      out.write("\t\t\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/img/evernote.png\" /></li>\r\n");
      out.write("\t\t\t\t\t<li><img\r\n");
      out.write("\t\t\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/img/airbnb.png\" /></li>\r\n");
      out.write("\t\t\t\t\t<li><img\r\n");
      out.write("\t\t\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/img/zappos.png\" /></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<hr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!-- 글쓰기 구간 =====================================================================================================================  -->\r\n");
      out.write("\t<div align=center style=\"margin-top: 50px\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<form method=\"post\" action=\"writeAction.do\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<table class=\"table\">\r\n");
      out.write("\t\t\t\t\t<thead>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<tr\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"text-align: left; height: 60px; background-color: #fec503; font-size: 20px; border-color: #1a1a1a; border: 1px\">\r\n");
      out.write("\t\t\t\t\t\t\t<th colspan=\"2\"\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"text-align: center; height: 60px; background-color: #777799; font-size: 20px; width: 8%; color: white;\">\r\n");
      out.write("\t\t\t\t\t\t\t\tQnA</th>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td bgcolor=\"#5D5D5D\" width=\"15%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div align=\"CENTER\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<strong>닉네임</strong>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td style=\"background-color: #f7f7f7;\"><input type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"form-control\" name=\"nickname\" maxlength=\"50\"\r\n");
      out.write("\t\t\t\t\t\t\t\tvalue=");
      out.write(" readonly></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"80\" bgcolor=\"#5D5D5D\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<strong>타입</strong>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td style=\"background-color: #f7f7f7;\"><input type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"form-control\" value=\"게시판\" name=\"b_type\" maxlength=\"50\"\r\n");
      out.write("\t\t\t\t\t\t\t\treadonly></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"80\" bgcolor=\"#5D5D5D\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<strong>제목</strong>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td bgcolor=\"#f7f7f7\"><input type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"form-control\" placeholder=\"글 제목\" name=\"title\"\r\n");
      out.write("\t\t\t\t\t\t\t\tmaxlength=\"50\"></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"80\" bgcolor=\"#5D5D5D\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<strong>내용</strong>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td bgcolor=\"#f7f7f7\"><textarea class=\"form-control\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tplaceholder=\"글 내용\" name=\"content\" maxlength=\"2000\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"height: 350px\"></textarea></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- 체크 박스 -->\r\n");
      out.write("\t\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col\" align=\"left\">\r\n");
      out.write("\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<strong>Checkbox</strong>\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"custom-control custom-checkbox\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"checkbox\" id=\"jb-checkbox\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"custom-control-input\"> <label\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"custom-control-label\" for=\"jb-checkbox\">이메일로 답변\r\n");
      out.write("\t\t\t\t\t\t\t\t\t받기</label>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<strong>Radio Button</strong>\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"custom-control custom-radio\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"radio\" name=\"jb-radio\" id=\"jb-radio-1\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"custom-control-input\"> <label\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"custom-control-label\" for=\"jb-radio-1\">공개</label>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"custom-control custom-radio\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"radio\" name=\"jb-radio\" id=\"jb-radio-2\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"custom-control-input\"> <label\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"custom-control-label\" for=\"jb-radio-2\">비공개</label>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<br> <br>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!--  0000000000000000000000000000000000000000-->\r\n");
      out.write("\t\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-6\">\r\n");
      out.write("\t\t\t\t\t\t<h4>Radio Buttons</h4>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"funkyradio\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"funkyradio-default\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"radio\" name=\"radio\" id=\"radio1\" /> <label\r\n");
      out.write("\t\t\t\t\t\t\t\t\tfor=\"radio1\">First Option default</label>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"funkyradio-primary\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"radio\" name=\"radio\" id=\"radio2\" checked /> <label\r\n");
      out.write("\t\t\t\t\t\t\t\t\tfor=\"radio2\">Second Option primary</label>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"funkyradio-success\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"radio\" name=\"radio\" id=\"radio3\" /> <label\r\n");
      out.write("\t\t\t\t\t\t\t\t\tfor=\"radio3\">Third Option success</label>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"funkyradio-danger\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"radio\" name=\"radio\" id=\"radio4\" /> <label\r\n");
      out.write("\t\t\t\t\t\t\t\t\tfor=\"radio4\">Fourth Option danger</label>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"funkyradio-warning\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"radio\" name=\"radio\" id=\"radio5\" /> <label\r\n");
      out.write("\t\t\t\t\t\t\t\t\tfor=\"radio5\">Fifth Option warning</label>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"funkyradio-info\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"radio\" name=\"radio\" id=\"radio6\" /> <label\r\n");
      out.write("\t\t\t\t\t\t\t\t\tfor=\"radio6\">Sixth Option info</label>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- <a href=\"bbsAction.do?pageNumber=1\" class=\"btn btn-success btn-arraw-left\">목록</a> -->\r\n");
      out.write("\t\t\t\t<a href=\"bbsAction.do?pageNumber=1\"\r\n");
      out.write("\t\t\t\t\tclass=\"btn btn-primary pull-left\">목록</a> <input type=\"submit\"\r\n");
      out.write("\t\t\t\t\tclass=\"btn btn-primary pull-right\" value=\"글쓰기\">\r\n");
      out.write("\t\t\t\t<!-- <input type=\"button\" class=\"btn btn-warning pull-right\" value=\"\"> -->\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!-- 그림 ===================================================================-->\r\n");
      out.write("\t<div class=\"section section-presentation\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-md-6\">\r\n");
      out.write("\t\t\t\t\t<div class=\"description\">\r\n");
      out.write("\t\t\t\t\t\t<h4 class=\"header-text\">It's beautiful</h4>\r\n");
      out.write("\t\t\t\t\t\t<p>And your app is also probably social, awesome, easy-to-use\r\n");
      out.write("\t\t\t\t\t\t\tand vital to users. This is the place to enlist all the good\r\n");
      out.write("\t\t\t\t\t\t\tthings that your app has to share. Focus on the benefits that the\r\n");
      out.write("\t\t\t\t\t\t\tuers will receive. Try to combine imaginery with text and show\r\n");
      out.write("\t\t\t\t\t\t\tmeaningful printscreens from your app, that will make it clear\r\n");
      out.write("\t\t\t\t\t\t\twhat exactly the basic functions are.</p>\r\n");
      out.write("\t\t\t\t\t\t<p>Try to make it very clear for the people browsing the page\r\n");
      out.write("\t\t\t\t\t\t\tthat this product will enrich their life and will make a nice\r\n");
      out.write("\t\t\t\t\t\t\taddition to the homescreen.\r\n");
      out.write("\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-5 col-md-offset-1 hidden-xs\">\r\n");
      out.write("\t\t\t\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/img/mac.png\" />\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"section section-demo\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-md-6\">\r\n");
      out.write("\t\t\t\t\t<div id=\"description-carousel\" class=\"carousel fade\"\r\n");
      out.write("\t\t\t\t\t\tdata-ride=\"carousel\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"carousel-inner\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"item\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img\r\n");
      out.write("\t\t\t\t\t\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/img/home_33.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\talt=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"item active\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img\r\n");
      out.write("\t\t\t\t\t\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/img/home_22.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\talt=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"item\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img\r\n");
      out.write("\t\t\t\t\t\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/img/home_11.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\talt=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<ol class=\"carousel-indicators carousel-indicators-blue\">\r\n");
      out.write("\t\t\t\t\t\t\t<li data-target=\"#description-carousel\" data-slide-to=\"0\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"\"></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li data-target=\"#description-carousel\" data-slide-to=\"1\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"active\"></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li data-target=\"#description-carousel\" data-slide-to=\"2\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"\"></li>\r\n");
      out.write("\t\t\t\t\t\t</ol>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-5 col-md-offset-1\">\r\n");
      out.write("\t\t\t\t\t<h4 class=\"header-text\">Easy to integrate</h4>\r\n");
      out.write("\t\t\t\t\t<p>With all the apps that users love! Make it easy for users to\r\n");
      out.write("\t\t\t\t\t\tshare, like, post and tweet their favourite things from the app.\r\n");
      out.write("\t\t\t\t\t\tBe sure to let users know they continue to remain connected while\r\n");
      out.write("\t\t\t\t\t\tusing your app!</p>\r\n");
      out.write("\t\t\t\t\t<a href=\"http://www.creative-tim.com/product/awesome-landing-page\"\r\n");
      out.write("\t\t\t\t\t\tid=\"Demo3\" class=\"btn btn-fill btn-info\" data-button=\"info\">Get\r\n");
      out.write("\t\t\t\t\t\tFree Demo</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"section section-features\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<h4 class=\"header-text text-center\">Features</h4>\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t\t<div class=\"card card-blue\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"icon\">\r\n");
      out.write("\t\t\t\t\t\t\t<i class=\"pe-7s-note2\"></i>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"text\">\r\n");
      out.write("\t\t\t\t\t\t\t<h4>Online Customers Management</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<p>All appointments sync with your Google calendar so your\r\n");
      out.write("\t\t\t\t\t\t\t\tavailability is always up to date. See your schedule at a glance\r\n");
      out.write("\t\t\t\t\t\t\t\tfrom any device.</p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t\t<div class=\"card card-blue\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"icon\">\r\n");
      out.write("\t\t\t\t\t\t\t<i class=\"pe-7s-bell\"></i>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<h4>Smart Notifications on hands</h4>\r\n");
      out.write("\t\t\t\t\t\t<p>Automatic text and email reminders make sure customers\r\n");
      out.write("\t\t\t\t\t\t\talways remember their upcoming appointments.</p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t\t<div class=\"card card-blue\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"icon\">\r\n");
      out.write("\t\t\t\t\t\t\t<i class=\"pe-7s-graph1\"></i>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<h4>Know your business better now</h4>\r\n");
      out.write("\t\t\t\t\t\t<p>Take payments and run your business on the go, in your\r\n");
      out.write("\t\t\t\t\t\t\tstore and then see how it all adds up with analytics.</p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"section section-testimonial\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<h4 class=\"header-text text-center\">What people think</h4>\r\n");
      out.write("\t\t\t<div id=\"carousel-example-generic\" class=\"carousel fade\"\r\n");
      out.write("\t\t\t\tdata-ride=\"carousel\">\r\n");
      out.write("\t\t\t\t<!-- Wrapper for slides -->\r\n");
      out.write("\t\t\t\t<div class=\"carousel-inner\" role=\"listbox\">\r\n");
      out.write("\t\t\t\t\t<div class=\"item\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"mask\">\r\n");
      out.write("\t\t\t\t\t\t\t<img\r\n");
      out.write("\t\t\t\t\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/img/face-4.jpg\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"carousel-testimonial-caption\">\r\n");
      out.write("\t\t\t\t\t\t\t<p>Jay Z, Producer</p>\r\n");
      out.write("\t\t\t\t\t\t\t<h3>\"I absolutely love your app! It's truly amazing and\r\n");
      out.write("\t\t\t\t\t\t\t\tlooks awesome!\"</h3>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"item active\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"mask\">\r\n");
      out.write("\t\t\t\t\t\t\t<img\r\n");
      out.write("\t\t\t\t\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/img/face-3.jpg\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"carousel-testimonial-caption\">\r\n");
      out.write("\t\t\t\t\t\t\t<p>Drake, Artist</p>\r\n");
      out.write("\t\t\t\t\t\t\t<h3>\"This is one of the most awesome apps I've ever seen!\r\n");
      out.write("\t\t\t\t\t\t\t\tWish you luck Creative Tim!\"</h3>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"item\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"mask\">\r\n");
      out.write("\t\t\t\t\t\t\t<img\r\n");
      out.write("\t\t\t\t\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/img/face-2.jpg\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"carousel-testimonial-caption\">\r\n");
      out.write("\t\t\t\t\t\t\t<p>Rick Ross, Musician</p>\r\n");
      out.write("\t\t\t\t\t\t\t<h3>\"Loving this! Just picked it up the other day. Thank you\r\n");
      out.write("\t\t\t\t\t\t\t\tfor the work you put into this.\"</h3>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<ol class=\"carousel-indicators carousel-indicators-blue\">\r\n");
      out.write("\t\t\t\t\t<li data-target=\"#carousel-example-generic\" data-slide-to=\"0\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"active\"></li>\r\n");
      out.write("\t\t\t\t\t<li data-target=\"#carousel-example-generic\" data-slide-to=\"1\"></li>\r\n");
      out.write("\t\t\t\t\t<li data-target=\"#carousel-example-generic\" data-slide-to=\"2\"></li>\r\n");
      out.write("\t\t\t\t</ol>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"section section-no-padding\">\r\n");
      out.write("\t\t<div class=\"parallax filter-gradient blue\" data-color=\"blue\">\r\n");
      out.write("\t\t\t<div class=\"parallax-background\">\r\n");
      out.write("\t\t\t\t<img class=\"parallax-background-image\"\r\n");
      out.write("\t\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/img/bg3.jpg\" />\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"info\">\r\n");
      out.write("\t\t\t\t<h1>Download this landing page for free!</h1>\r\n");
      out.write("\t\t\t\t<p>Beautiful multipurpose bootstrap landing page.</p>\r\n");
      out.write("\t\t\t\t<a href=\"http://www.creative-tim.com/product/awesome-landing-page\"\r\n");
      out.write("\t\t\t\t\tclass=\"btn btn-neutral btn-lg btn-fill\">DOWNLOAD</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"plusfriend-chat-button\"\r\n");
      out.write("\t\tstyle=\"position: fixed; bottom: 5px; right: 5px;\"></div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<footer class=\"footer\">\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<nav class=\"pull-left\">\r\n");
      out.write("\t\t<ul>\r\n");
      out.write("\t\t\t<li><a href=\"#\"> Home </a></li>\r\n");
      out.write("\t\t\t<li><a href=\"#\"> Company </a></li>\r\n");
      out.write("\t\t\t<li><a href=\"#\"> Portfolio </a></li>\r\n");
      out.write("\t\t\t<li><a href=\"#\"> Blog </a></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t\t</nav>\r\n");
      out.write("\t\t<div class=\"social-area pull-right\">\r\n");
      out.write("\t\t\t<a class=\"btn btn-social btn-facebook btn-simple\"> <i\r\n");
      out.write("\t\t\t\tclass=\"fa fa-facebook-square\"></i>\r\n");
      out.write("\t\t\t</a> <a class=\"btn btn-social btn-twitter btn-simple\"> <i\r\n");
      out.write("\t\t\t\tclass=\"fa fa-twitter\"></i>\r\n");
      out.write("\t\t\t</a> <a class=\"btn btn-social btn-pinterest btn-simple\"> <i\r\n");
      out.write("\t\t\t\tclass=\"fa fa-pinterest\"></i>\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"copyright\">\r\n");
      out.write("\t\t\t&copy; 2016 <a href=\"http://www.creative-tim.com\">Creative Tim</a>,\r\n");
      out.write("\t\t\tmade with love\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</footer>\r\n");
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
      out.write("<script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/js/jquery-1.10.2.js\"\r\n");
      out.write("\ttype=\"text/javascript\"></script>\r\n");
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
