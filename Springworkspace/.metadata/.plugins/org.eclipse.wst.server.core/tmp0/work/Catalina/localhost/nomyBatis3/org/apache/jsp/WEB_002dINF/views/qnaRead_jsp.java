/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.5
 * Generated at: 2019-09-03 09:17:31 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class qnaRead_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/D:/SpringMVCProject/Springworkspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/8.29home/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1567346802003L));
  }

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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- jQuery -->\r\n");
      out.write("\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\"\r\n");
      out.write("\tintegrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\"\r\n");
      out.write("\tcrossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap CSS -->\r\n");
      out.write("<!-- href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css\" -->\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css\"\r\n");
      out.write("\tintegrity=\"sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS\"\r\n");
      out.write("\tcrossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<title>board</title>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\t$(document).on('click', '#btnSave', function(e) {\r\n");
      out.write("\r\n");
      out.write("\t\te.preventDefault();\r\n");
      out.write("\r\n");
      out.write("\t\t$(\"#form\").submit();\r\n");
      out.write("\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("\t$(document)\r\n");
      out.write("\t\t\t.on(\r\n");
      out.write("\t\t\t\t\t'click',\r\n");
      out.write("\t\t\t\t\t'#btnList',\r\n");
      out.write("\t\t\t\t\tfunction(e) {\r\n");
      out.write("\t\t\t\t\t\te.preventDefault();\r\n");
      out.write("\t\t\t\t\t\tlocation.href = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/board/getBoardList\";\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("</script>\r\n");
      out.write("<style>\r\n");
      out.write("body {\r\n");
      out.write("\tpadding-top: 70px;\r\n");
      out.write("\tpadding-bottom: 30px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<article>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"container\" role=\"main\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<h2>Q&A</h2>\r\n");
      out.write("\t\t\t<hr>\r\n");
      out.write("\t\t\t<br> <br>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<form name=\"form\" id=\"form\" role=\"form\" method=\"post\"\r\n");
      out.write("\t\t\t\taction=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/board/saveBoard\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"mb-3\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<label for=\"title\">제목</label> <input type=\"text\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"form-control\" name=\"title\" id=\"title\"\r\n");
      out.write("\t\t\t\t\t\tplaceholder=\"제목을 입력해 주세요\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"mb-3\">\r\n");
      out.write("\t\t\t\t\t<label for=\"reg_id\">질문 유형</label>\r\n");
      out.write("\t\t\t\t\t<div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<form>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<select class=\"form-control\" id=\"sel1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option>비밀번호</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option>계정 설정</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option>계정 제한</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option>결제</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option>비즈니스 솔루션</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"mb-3\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<label for=\"content\">내용</label>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<textarea class=\"form-control\" rows=\"5\" name=\"content\"\r\n");
      out.write("\t\t\t\t\t\t\tid=\"content\" placeholder=\"내용을 입력해 주세요\"></textarea>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"mb-3\">\r\n");
      out.write("\t\t\t\t\t\t<label for=\"tag\">TAG</label> <input type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"form-control\" name=\"tag\" id=\"tag\"\r\n");
      out.write("\t\t\t\t\t\t\tplaceholder=\"태그를 입력해 주세요\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"mb-3\">\r\n");
      out.write("\t\t\t\t\t\t<label for=\"tag\">비밀 글</label>\r\n");
      out.write("\t\t\t\t\t\t<!-- <input type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"form-control\" name=\"tag\" id=\"tag\"\r\n");
      out.write("\t\t\t\t\t\t\tplaceholder=\"태그를 입력해 주세요\"> -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"radio\">\r\n");
      out.write("\t\t\t\t\t\t\t<label> <input type=\"radio\" name=\"optionsRadios\"\r\n");
      out.write("\t\t\t\t\t\t\t\tid=\"optionsRadios1\" value=\"option1\" checked> 공개\r\n");
      out.write("\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"radio\">\r\n");
      out.write("\t\t\t\t\t\t\t<label> <input type=\"radio\" name=\"optionsRadios\"\r\n");
      out.write("\t\t\t\t\t\t\t\tid=\"optionsRadios2\" value=\"option2\"> 비공개\r\n");
      out.write("\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"mb-3\">\r\n");
      out.write("\t\t\t\t\t\t<label for=\"tag\">답변 유형</label>\r\n");
      out.write("\t\t\t\t\t\t<!-- <input type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"form-control\" name=\"tag\" id=\"tag\"\r\n");
      out.write("\t\t\t\t\t\t\tplaceholder=\"태그를 입력해 주세요\"> -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<div class=\"checkbox\">\r\n");
      out.write("\t\t\t\t\t<label> <input type=\"checkbox\" value=\"\" name=\"\"> 답변\r\n");
      out.write("\t\t\t\t\t\t이메일로 수신\r\n");
      out.write("\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t<!-- \r\n");
      out.write("\t\t\t\t<div class=\"checkbox disabled\">\r\n");
      out.write("\t\t\t\t\t<label> <input type=\"checkbox\" value=\"\" disabled>\r\n");
      out.write("\t\t\t\t\t\tOption two is disabled\r\n");
      out.write("\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write(" \t\t\t-->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<h3>비밀글 선택</h3>\r\n");
      out.write("\t\t\t\t<div class=\"radio\">\r\n");
      out.write("\t\t\t\t\t<label> <input type=\"radio\" name=\"optionsRadios\"\r\n");
      out.write("\t\t\t\t\t\tid=\"optionsRadios1\" value=\"option1\" checked> 공개\r\n");
      out.write("\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"radio\">\r\n");
      out.write("\t\t\t\t\t<label> <input type=\"radio\" name=\"optionsRadios\"\r\n");
      out.write("\t\t\t\t\t\tid=\"optionsRadios2\" value=\"option2\"> 비공개\r\n");
      out.write("\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"radio disabled\">\r\n");
      out.write("\t\t\t\t\t<label> <input type=\"radio\" name=\"optionsRadios\"\r\n");
      out.write("\t\t\t\t\t\tid=\"optionsRadios3\" value=\"option3\" disabled> Option three\r\n");
      out.write("\t\t\t\t\t\tis disabled\r\n");
      out.write("\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"btn btn-sm btn-primary\" id=\"btnSave\">저장</button>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"btn btn-sm btn-primary\" id=\"btnList\">목록</button>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t</article>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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