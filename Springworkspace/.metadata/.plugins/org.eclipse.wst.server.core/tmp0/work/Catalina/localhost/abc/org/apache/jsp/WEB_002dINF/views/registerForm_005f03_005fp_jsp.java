/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.5
 * Generated at: 2019-09-10 05:28:15 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registerForm_005f03_005fp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"kr\">\r\n");
      out.write("<head>\r\n");
      out.write("<title>Login V19</title>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\r\n");
      out.write("<!-- js -->\r\n");
      out.write("<!-- <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script> -->\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/js/jquery-3.1.1.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/js/plugins/validate/jquery.validate.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/js/plugins/validate/additional-methods.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/js/plugins/validate/messages_ko.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/js/main.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- css -->\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css\"\r\n");
      out.write("\trel=\"stylesheet\" id=\"bootstrap-css\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("<!-- 다음 도로명 주소 api  -->\r\n");
      out.write("<script src=\"http://dmaps.daum.net/map_js_init/postcode.v2.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!------ Include the above in your HEAD tag ---------->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("form * {\r\n");
      out.write("\tborder-radius: 1 !important;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("form>fieldset>legend {\r\n");
      out.write("\tfont-size: 120%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* \r\n");
      out.write("/* label.error{\r\n");
      out.write("\tcolor:red;\r\n");
      out.write("\tfont-style: italic;\r\n");
      out.write("}\r\n");
      out.write("input.error{\r\n");
      out.write("\tborder : 1px dotted red !important;\r\n");
      out.write("}\r\n");
      out.write("  */\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\t/* 다음 도로명 주소 코드  */\r\n");
      out.write("\tfunction showPostcode(){\r\n");
      out.write("\t\tnew daum.Postcode({\r\n");
      out.write("\t\t\toncomplete : function(data){\r\n");
      out.write("\t\t\t\tvar fullAddr = '';\r\n");
      out.write("\t\t\t\tvar extrAddr = '';\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t//사용자가 선택한 주소 타입에 따라 해당 주소 값을 가져온다.\r\n");
      out.write("\t\t\t\tif(data.userSelectedType == 'R'){\r\n");
      out.write("\t\t\t\t\t//사용자가 도로명 주소를 선택했을 경우\r\n");
      out.write("\t\t\t\t\tfullAddr = data.roadAddress;\r\n");
      out.write("\t\t\t\t}else{ //사용자가 지번 주소를 선택했을 경우(J)\r\n");
      out.write("\t\t\t\t\tfullAddr = data.jibunAddress;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t//사용자가 선택한 주소가 도로명 타입일때 조합한다\r\n");
      out.write("\t\t\t\tif(data.userSelectedType == 'R'){\r\n");
      out.write("\t\t\t\t\t//법정동명이 있을 경우 추가함\r\n");
      out.write("\t\t\t\t\tif(data.bname !== ''){\r\n");
      out.write("\t\t\t\t\t\textrAddr += data.bname;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t//법정동명이 있을 경우 추가함\r\n");
      out.write("\t\t\t\t\tif(data.buildingName !== ''){\r\n");
      out.write("\t\t\t\t\t\textrAddr += (extrAddr !== '' ? ', '\r\n");
      out.write("\t\t\t\t\t\t\t+ data.buildingName : data.buildingName);\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t//조합형 주소의 유무에 따라 양쪽 괄호를 추가하여 최종 주소를 만든다.\r\n");
      out.write("\t\t\t\t\tfullAddr += (extrAddr !== '' ? ' (' +extrAddr\r\n");
      out.write("\t\t\t\t\t\t+ ')' : '');\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t//우편번호와 주소 정보를 해당 필드에 넣는다. &  5자리 새 우편 번호 사용\r\n");
      out.write("\t\t\t\tdocument.getElementById('post_code').value = data.zonecode;  \t//우편번호5자리\r\n");
      out.write("\t\t\t\tdocument.getElementById('m_addr').value = fullAddr;\t\t\t\t//주소값\r\n");
      out.write("\t\t\t\t//커서를 상세주소 필드로 이동\r\n");
      out.write("\t\t\t\tdocument.getElementById('m_addr2').focus();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}).open();\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t/* 에이젝스 회원가입 이메일 중복확인                                 */\r\n");
      out.write("\t/* $(function(){\r\n");
      out.write("\t\t$(\"#btnCheckId\").click(function(){\r\n");
      out.write("\t\t\tvar m_email = $(\"#m_email\").val();\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif(m_email == \"\" || m_email==\" \"){\r\n");
      out.write("\t\t\t\talert(\"이메일을 입력해 주세요.\")\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\tvar url = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${_ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/user/id/available\";\r\n");
      out.write("\t\t\t\t$.post(url, {m_email : m_email}, function(json){\r\n");
      out.write("\t\t\t\t\tconsole.log(json) \r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("\t */\r\n");
      out.write("\r\n");
      out.write("\t/* 회원가입 란 validate  */\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\t$(\"#joinBlock\").validate();\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t/* $(\"#btnCheckId\").click(function(){\r\n");
      out.write("\t\t\tvar m_email = $(\"#m_email\").val();\r\n");
      out.write("\t\t\tif(m_email == \"\" || m_email == \" \"){\r\n");
      out.write("\t\t\t\talert(\"Email을 입력해 주세요\")\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\tvar url = \"emailputcheck.do\"\r\n");
      out.write("\t\t\t\t//map 키값 형태로  데이터를 url경로로 보낸다\r\n");
      out.write("\t\t\t\t$.post(url, {m_email : m_email}, function(){\t\r\n");
      out.write("\t\t\t\t\tconsole\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}); */\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("\t function registerCheckFucntion(){\r\n");
      out.write("\t\t var m_email = $(\"#m_email\").val();\r\n");
      out.write("\t\t $.ajax({\r\n");
      out.write("\t\t\t type : \"post\",\r\n");
      out.write("\t\t\turl : \"emailputcheck.do\",\r\n");
      out.write("\t\t\tdata : {m_email : m_email},\r\n");
      out.write("\t\t\tsuccess: function(result){\r\n");
      out.write("\t\t\t\tif(result ==1){\r\n");
      out.write("\t\t\t\t\t$(\"#checkMessage\").html('사용할 수 있는 이메일입니다.');\r\n");
      out.write("\t\t\t\t\t$(\"#checkType\").attr(\"class\", \"modal-content panel-success\");\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t$(\"#checkMessage\").html('사용할 수 없는 이메일입니다.');\r\n");
      out.write("\t\t\t\t\t$(\"#checkType\").attr(\"class\", \"modal-content panel-warning\");\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t$(\"#checkModal\").modal(\"show\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t });\t\t \r\n");
      out.write("\t }\r\n");
      out.write("\t \r\n");
      out.write("\t \r\n");
      out.write("\tfunction doJoin() {\r\n");
      out.write("\t\tif ($(\"#joinBlock\").valid()) {\r\n");
      out.write("\t\t\talert(11);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t/* \r\n");
      out.write("\t\t\r\n");
      out.write("\t\tjQuery.validator.setDefaults({\r\n");
      out.write("\t\t\tdebug: true\r\n");
      out.write("\t\t\tsuccess: \"valid\"\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t$(\"joinBlock\").validate({\r\n");
      out.write("\t\t\trules:{\r\n");
      out.write("\t\t\t\tm_pw: \"required\"\r\n");
      out.write("\t\t\t\tm_pw_check:{\r\n");
      out.write("\t\t\t\t\tequalTo: #\"m_pw\";\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t */\r\n");
      out.write("\r\n");
      out.write("\t$(document).ready(\r\n");
      out.write("\t\t\tfunction() {\r\n");
      out.write("\t\t\t\t$('#found_site').on(\r\n");
      out.write("\t\t\t\t\t\t'change',\r\n");
      out.write("\t\t\t\t\t\tfunction() {\r\n");
      out.write("\t\t\t\t\t\t\t$(this).val() == \"other\" ? $('#specify').closest(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t'.form-group').show() : $('#specify')\r\n");
      out.write("\t\t\t\t\t\t\t\t\t.closest('.form-group').hide();\r\n");
      out.write("\t\t\t\t\t\t})\r\n");
      out.write("\t\t\t})\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<br><br><br><br>\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"col-md-8 col-md-offset-2\">\r\n");
      out.write("\t\t\t\t<form id=\"joinBlock\" name=\"joinBlock\" role=\"form1\" method=\"POST\"\r\n");
      out.write("\t\t\t\t\taction=\"memberInsert.do\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<legend class=\"text-center\">\r\n");
      out.write("\t\t\t\t\t<h2>Register</h2>\r\n");
      out.write("\t\t\t\t\t</legend>\r\n");
      out.write("\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<fieldset>\r\n");
      out.write("\t\t\t\t\t\t<legend>Account Details</legend>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group col-md-12\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"\">Email</label> \r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"email\"\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"form-control\" name=\"m_email\" id=\"m_email\"\r\n");
      out.write("\t\t\t\t\t\t\tplaceholder=\"Email\" title=\"Email을 입력하세요\" maxlength=\"30\" style=\"width:70%;\" required>\r\n");
      out.write("\t\t\t\t\t\t\t<button type=\"button\" id=\"btnCheckId\" onclick=\"registerCheckFucntion();\">Email 중복확인</button>\r\n");
      out.write("\t\t\t\t\t\t\t<!-- ajax 아이디 중복 확인 -->\r\n");
      out.write("\t\t\t\t\t\t\t<!-- <div class=\"check_font\" id=\"id_check\"></div> -->\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!-- <input type=\"hidden\"  -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group col-md-6\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"first_name\">First name</label> <input type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"form-control error\" name=\"m_fname\" id=\"m_fname\"\r\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"First Name\" required  title=\"Email을 입력하세요\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group col-md-6\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"last_name\">Last name</label> <input type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"form-control error\" name=\"m_lname\" id=\"last_name\"\r\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"Last Name\" required>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!-- \t\t\t\t\t<div class=\"form-group col-md-10\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"\">Email</label> <input type=\"email\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"form-control\" name=\"m_email\" id=\"\" placeholder=\"Email\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t아이디 체크 버튼 \r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-primary\">ID check</button>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write(" -->\r\n");
      out.write("\t\t\t\t\t\t<!-- <div class=\"form-group\"> -->\r\n");
      out.write("\t\t\t\t\t\t<!-- \t<div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-8\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"\">Email</label> <input type=\"email\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"form-control\" name=\"m_email\" id=\"\" placeholder=\"Email\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-2\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"btnCheckID\"></label> \r\n");
      out.write("\t\t\t\t\t\t\t\t<button type=\"button\" class=\"btn\" name=\"btnCheckID\" id=\"btnCheckID\" style=\"margin-top:25px\">ID check</button>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write(" -->\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!-- ------------------------------------------------ -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!--체크버튼 -->\r\n");
      out.write("\t\t\t\t\t\t<!-- \t<div class=\"form-group col-md-12\">\r\n");
      out.write("\t\t\t\t\t\t<button id=\"btnCheckId\">Email Check</button>\r\n");
      out.write("\t\t\t\t\t\t안녕하세요\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</div> -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!-- 체크 버튼 -->\r\n");
      out.write("\t\t\t\t\t\t<!-- <div class=\"col-md-2\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"btnCheckID\"></label>\r\n");
      out.write("\t\t\t\t\t\t\t<button type=\"button\" class=\"btn\" name=\"btnCheckID\"\r\n");
      out.write("\t\t\t\t\t\t\t\tid=\"btnCheckID\" style=\"margin-top: 25px\">ID check</button>\r\n");
      out.write("\t\t\t\t\t\t</div> -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group col-md-6\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"password\">Password</label> <input type=\"password\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"form-control\" name=\"m_pw\" id=\"m_pw\"\r\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"Password\" maxlength=\"20\" required >\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group col-md-6\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"confirm_password\">Confirm Password</label> <input\r\n");
      out.write("\t\t\t\t\t\t\t\ttype=\"password\" class=\"form-control\" name=\"m_pw_check\"\r\n");
      out.write("\t\t\t\t\t\t\t\tid=\"m_pw_check\" placeholder=\"Password Check\" equalTo=\"#m_pw\"\r\n");
      out.write("\t\t\t\t\t\t\t\tdata-msg-equalTo=\"패스워드가 일치하지 않습니다.\" required>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group col-md-6\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"Phone\">Phone</label> <input type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"form-control\" name=\"m_hp\" id=\"m_hp\"\r\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"Your Cell Phone Number\" required>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group col-md-6\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"country\">Country of Residence</label> <select\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"form-control\" name=\"m_nation\" id=\"m_nation\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"korea\" selected=\"selected\">KOREA</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"uk\">United Kingdom</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"us\">United America</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"australia\">Australia</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"austria\">Austria</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"belize\">Belize</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"benin\">Benin</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"brz\">Brazil</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"canada\">Canada</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"china\">China</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"colombia\">Colombia</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"dominica\">Dominica</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"eqypt\">Eqypt</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"finland\">Finland</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"fr\">France</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"germany\">Germany</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"iceland\">Iceland</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"india\">India</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"japan\">Japan</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"mexico\">Mexico</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"hongkong\">Hongkong</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"italy\">Italy</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"monaco\">Monaco</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"newzealand\">New Zealand</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"resia\">Resia</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"switzerland\">Switzerland</option>\r\n");
      out.write("\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group col-md-6\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"Post_Number\">Post Number</label> <input type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"form-control\" name=\"zipcode\" id=\"post_code\" readonly \r\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"Post Number\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group col-md-6\">\r\n");
      out.write("\t\t\t\t\t\t\t<!-- <div class=\"form-group\"> -->\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- <div class=\"col-md-2\"> -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div><label for=\"buttonpost\" style=\"color:white\">우편번호찾기</label></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"button\" value=\"Find post number\" onclick=\"showPostcode()\" name=\"buttonpost\" id=\"buttonpost\" class=\"btn btn-primary\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- </div> -->\r\n");
      out.write("\t\t\t\t\t\t\t<!-- </div> -->\r\n");
      out.write("\t\t\t\t\t\t\t<!-- <label for=\"last_name\">Last name</label> <input type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"form-control\" name=\"m_lname\" id=\"last_name\"\r\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"Last Name\" required> -->\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group col-md-8\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"m_addr\">Address</label> <input type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"form-control\" name=\"m_addr\" id=\"m_addr\"\r\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"Your address\" required>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group col-md-12\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"m_addr2\">Detail Address</label> <input type=\"text\" class=\"form-control\"\r\n");
      out.write("\t\t\t\t\t\t\t\tname=\"m_addr2\" id=\"m_addr2\" placeholder=\"detail address\"\r\n");
      out.write("\t\t\t\t\t\t\t\trequired>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</fieldset>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"checkbox\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label> <input type=\"checkbox\" value=\"\" id=\"\"name=\"check\"> \r\n");
      out.write("\t\t\t\t\t\t\t\t\tI accept the \r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"Form_conditions.do\">terms and conditions</a>.\r\n");
      out.write("\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-primary\" id=\"reg_submit\" onclick=\"doJoin();\">Register</button>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"loginForm.do\">Already have an account?</a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\t// 아이디 유효성 검사(1 = 중복 / 0 != 중복)\r\n");
      out.write("\t\t/* \t$(\"#m_email\").blur(function() {\r\n");
      out.write("\t\t // id = \"id_reg\" / name = \"userId\"\r\n");
      out.write("\t\t var m_email = $('#m_email').val();\r\n");
      out.write("\t\t $.ajax({\r\n");
      out.write("\t\t url : '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/idCheck.do?m_email='+ m_email,\r\n");
      out.write("\t\t type : 'get',\r\n");
      out.write("\t\t success : function(data) {\r\n");
      out.write("\t\t console.log(\"1 = 중복o / 0 = 중복x : \"+ data);\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t if (data == 1) {\r\n");
      out.write("\t\t // 1 : 아이디가 중복되는 문구\r\n");
      out.write("\t\t $(\"#id_check\").text(\"사용중인 아이디입니다 :p\");\r\n");
      out.write("\t\t $(\"#id_check\").css(\"color\", \"red\");\r\n");
      out.write("\t\t $(\"#reg_submit\").attr(\"disabled\", true);\r\n");
      out.write("\t\t } else {\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t if(idJ.test(m_email)){\r\n");
      out.write("\t\t // 0 : 아이디 길이 / 문자열 검사\r\n");
      out.write("\t\t $(\"#id_check\").text(\"\");\r\n");
      out.write("\t\t $(\"#reg_submit\").attr(\"disabled\", false);\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t } else if(m_email == \"\"){\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t $('#id_check').text('아이디를 입력해주세요 :)');\r\n");
      out.write("\t\t $('#id_check').css('color', 'red');\r\n");
      out.write("\t\t $(\"#reg_submit\").attr(\"disabled\", true);\t\t\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t } else {\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t $('#id_check').text(\"아이디는 소문자와 숫자 4~12자리만 가능합니다 :) :)\");\r\n");
      out.write("\t\t $('#id_check').css('color', 'red');\r\n");
      out.write("\t\t $(\"#reg_submit\").attr(\"disabled\", true);\r\n");
      out.write("\t\t }\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t }\r\n");
      out.write("\t\t }, error : function() {\r\n");
      out.write("\t\t console.log(\"실패\");\r\n");
      out.write("\t\t }\r\n");
      out.write("\t\t });\r\n");
      out.write("\t\t }); */\r\n");
      out.write("\t</script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
