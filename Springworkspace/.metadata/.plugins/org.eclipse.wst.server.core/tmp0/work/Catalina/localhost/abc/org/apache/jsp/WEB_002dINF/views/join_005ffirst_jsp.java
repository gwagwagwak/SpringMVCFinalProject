/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.5
 * Generated at: 2019-09-05 16:01:09 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class join_005ffirst_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link\r\n");
      out.write("\thref=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\"\r\n");
      out.write("\trel=\"stylesheet\" id=\"bootstrap-css\">\r\n");
      out.write("\t\r\n");
      out.write("<!-- jquery 추가 -->\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/js/jquery-3.1.1.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"http:code.jquery.com/jquery-1.8.3.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/js/main.js\"></script>\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\t$(\"#btnBusiness\").click(function() {\r\n");
      out.write("\t\t\tlocation.href = \"registerForm_03_b.do\";\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t$(\"#btnPersonal\").click(function() {\r\n");
      out.write("\t\t\tlocation.href = \"registerForm_03_p.do\";\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("<style>\r\n");
      out.write(".card-pricing.popular {\r\n");
      out.write("\tz-index: 1;\r\n");
      out.write("\tborder: 3px solid #007bff;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".card-pricing .list-unstyled li {\r\n");
      out.write("\tpadding: .5rem 0;\r\n");
      out.write("\tcolor: #6c757d;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("\t<!------ Include the above in your HEAD tag ---------->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"container mb-5 mt-5\">\r\n");
      out.write("\t\t<div class=\"pricing card-deck flex-column flex-md-row mb-3\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"card card-pricing text-center px-3 mb-4\">\r\n");
      out.write("\t\t\t\t<span\r\n");
      out.write("\t\t\t\t\tclass=\"h6 w-60 mx-auto px-4 py-1 rounded-bottom bg-primary text-white shadow-sm\">Business</span>&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t<div class=\"bg-transparent card-header pt-4 border-0\">\r\n");
      out.write("\t\t\t\t\t&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t<h1 class=\"h1 font-weight-normal text-primary text-center mb-0\"\r\n");
      out.write("\t\t\t\t\t\tdata-pricing-value=\"45\">\r\n");
      out.write("\t\t\t\t\t\t<img\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/img/66838.png\"\r\n");
      out.write("\t\t\t\t\t\t\talt=\"\" />&nbsp;<br />\r\n");
      out.write("\t\t\t\t\t</h1>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t&nbsp;\r\n");
      out.write("\t\t\t\t<div class=\"card-body pt-0\">\r\n");
      out.write("\t\t\t\t\t<!-- <ul class=\"list-unstyled mb-4\"> -->\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li>가입 수수료나 월 수수료가 없습니다. 결제 금액을 수령할 때마다 <a href=\"#\"\">거래\r\n");
      out.write("\t\t\t\t\t\t\t\t수수료</a>만 지급하면 됩니다.\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>202개 국가의 25가지 통화로 전 세계에서 결제대금을 받을 수 있습니다.</li>\r\n");
      out.write("\t\t\t\t\t\t<li>적합한 판매는 PayLog의 판매자 보호 프로그램이 적용됩니다.</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" id=\"btnBusiness\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"btn btn-outline-secondary mb-3\">기업 회원가입</button>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"card card-pricing text-center px-3 mb-4\">\r\n");
      out.write("\t\t\t\t<span\r\n");
      out.write("\t\t\t\t\tclass=\"h6 w-60 mx-auto px-4 py-1 rounded-bottom bg-primary text-white shadow-sm\">Personal</span>\r\n");
      out.write("\t\t\t\t<div class=\"bg-transparent card-header pt-4 border-0\">\r\n");
      out.write("\t\t\t\t\t<h1 class=\"h1 font-weight-normal text-primary text-center mb-0\"\r\n");
      out.write("\t\t\t\t\t\tdata-pricing-value=\"60\">\r\n");
      out.write("\t\t\t\t\t\t<img\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/img/60367.png\"\r\n");
      out.write("\t\t\t\t\t\t\talt=\"\" />\r\n");
      out.write("\t\t\t\t\t</h1>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"card-body pt-0\">\r\n");
      out.write("\t\t\t\t\t<!--  <ul class=\"list-unstyled mb-4\"> -->\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li>일반적으로 구매는 무료입니다. 해외 거래는 환전 수수료가 적용될 수 있습니다.</li>\r\n");
      out.write("\t\t\t\t\t\t<li>전세계 수백만개의 온라인 매장에서 구매하면서 신용카드 포인트도 계속 적립할 수 있습니다.</li>\r\n");
      out.write("\t\t\t\t\t\t<li>적합한 구매는 PayLog의 구매자 보호 프로그램에 따라 보호됩니다.</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" id=\"btnPersonal\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"btn btn-outline-secondary mb-3\">개인 회원가입</button>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
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