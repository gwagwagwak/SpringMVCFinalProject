/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.5
 * Generated at: 2019-09-05 00:51:24 UTC
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<!--qnaWrite란~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~  -->\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<h2>Q&A\t</h2>\r\n");
      out.write("\t\t<hr>\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\r\n");
      out.write("\t\t<!-- <form action=\"qnaWrite.do\"> -->\r\n");
      out.write("\t\t<form action=\"qnaWrite.do\" method=\"post\">\r\n");
      out.write("\t\t\t<div class=\"container mt-3\">\r\n");
      out.write("\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<strong><label>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loginMember.m_lname}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</label></strong>\r\n");
      out.write("\t\t\t\t\t<strong><label for=\"title\">Title</label></strong> <input\r\n");
      out.write("\t\t\t\t\t\ttype=\"text\" class=\"form-control\" id=\"q_title\" placeholder=\"Title\"\r\n");
      out.write("\t\t\t\t\t\tname=\"q_title\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- \r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<strong><label for=\"sel1\">Answer Division</label></strong>\r\n");
      out.write("\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"title\" placeholder=\"Division\" name=\"division\">\r\n");
      out.write("\t\t\t\t<select class=\"form-control\" id=\"sel1\" name=\"division\">\r\n");
      out.write("\t\t\t\t\t<option>비밀번호</option>\r\n");
      out.write("\t\t\t\t\t<option>계정 설정</option>\r\n");
      out.write("\t\t\t\t\t<option>계정 제한</option>\r\n");
      out.write("\t\t\t\t\t<option>결제</option>\r\n");
      out.write("\t\t\t\t\t<option>비즈니스 솔루션</option>\r\n");
      out.write("\t\t\t\t</select>\r\n");
      out.write("\t\t\t</div> -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"container mt-3\">\r\n");
      out.write("\t\t\t\t<strong><label for=\"sel1\">Answer Division</label></strong> <select\r\n");
      out.write("\t\t\t\t\tname=\"q_divide\" id=\"q_divide\" class=\"custom-select mb-3\">\r\n");
      out.write("\t\t\t\t\t<option value=\"비밀번호\">비밀번호</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"계정 설정\">계정 설정</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"계정 제한\">계정 제한</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"결제\">결제</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"비즈니스\">비즈니스</option>\r\n");
      out.write("\t\t\t\t</select>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"container mt-3\">\r\n");
      out.write("\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t<strong><label for=\"content\">Content</label></strong>\r\n");
      out.write("\t\t\t\t\t<textarea class=\"form-control\" rows=\"10\" id=\"content\"\r\n");
      out.write("\t\t\t\t\t\tplaceholder=\"Content\" name=\"q_content\"></textarea>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"container mt-3\">\r\n");
      out.write("\t\t\t\t<strong><label for=\"private\">Private</label></strong><br>\r\n");
      out.write("\t\t\t\t<div class=\"form-check-inline\"></div>\r\n");
      out.write("\t\t\t\t<div class=\"custom-control custom-radio custom-control-inline\">\r\n");
      out.write("\t\t\t\t\t<input type=\"radio\" class=\"custom-control-input\" id=\"customRadio11\"\r\n");
      out.write("\t\t\t\t\t\tname=\"q_private\" value=\"private\"> <label class=\"custom-control-label\"\r\n");
      out.write("\t\t\t\t\t\tfor=\"customRadio11\">Private</label>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"form-check-inline\"></div>\r\n");
      out.write("\t\t\t\t<div class=\"form-check-inline\"></div>\r\n");
      out.write("\t\t\t\t<div class=\"custom-control custom-radio custom-control-inline\">\r\n");
      out.write("\t\t\t\t\t<input type=\"radio\" class=\"custom-control-input\" id=\"customRadio22\"\r\n");
      out.write("\t\t\t\t\t\tname=\"q_private\" value=\"public\"> <label class=\"custom-control-label\"\r\n");
      out.write("\t\t\t\t\t\tfor=\"customRadio22\">public</label>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- <div class=\"container mt-3\">\r\n");
      out.write("\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t<strong><label for=\"pwd\">How to Answer</label></strong><br>\r\n");
      out.write("\t\t\t\t\t<div class=\"form-check-inline\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"form-check-inline\">\r\n");
      out.write("\t\t\t\t\t\t<label class=\"form-check-label\" for=\"radio1\"> <input\r\n");
      out.write("\t\t\t\t\t\t\ttype=\"radio\" class=\"form-check-input\" id=\"radio1\" name=\"optradio\"\r\n");
      out.write("\t\t\t\t\t\t\tvalue=\"Private\" checked>by Email\r\n");
      out.write("\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"form-check-inline\">\r\n");
      out.write("\t\t\t\t\t\t<label class=\"form-check-label\" for=\"radio2\"> <input\r\n");
      out.write("\t\t\t\t\t\t\ttype=\"radio\" class=\"form-check-input\" id=\"radio2\" name=\"optradio\"\r\n");
      out.write("\t\t\t\t\t\t\tvalue=\"Unprivate\">by Website\r\n");
      out.write("\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div> -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"container mt-3\">\r\n");
      out.write("\t\t\t\t<strong><label for=\"private\">How to Answer</label></strong><br>\r\n");
      out.write("\t\t\t\t<div class=\"form-check-inline\"></div>\r\n");
      out.write("\t\t\t\t<div class=\"custom-control custom-radio custom-control-inline\">\r\n");
      out.write("\t\t\t\t\t<input type=\"radio\" class=\"custom-control-input\" id=\"customRadio1\"\r\n");
      out.write("\t\t\t\t\t\tname=\"q_replytype\" value=\"Email\"> <label class=\"custom-control-label\"\r\n");
      out.write("\t\t\t\t\t\tfor=\"customRadio1\">by Email</label>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"form-check-inline\"></div>\r\n");
      out.write("\t\t\t\t<div class=\"form-check-inline\"></div>\r\n");
      out.write("\t\t\t\t<div class=\"custom-control custom-radio custom-control-inline\">\r\n");
      out.write("\t\t\t\t\t<input type=\"radio\" class=\"custom-control-input\" id=\"customRadio2\"\r\n");
      out.write("\t\t\t\t\t\tname=\"q_replytype\" value=\"Website\"> <label class=\"custom-control-label\"\r\n");
      out.write("\t\t\t\t\t\tfor=\"customRadio2\">by Website</label>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- \r\n");
      out.write("\t\t\t<div class=\"container mt-3\">\r\n");
      out.write("\t\t\t\t<strong><label for=\"example1\">How to Answer</label></strong><br>\r\n");
      out.write("\t\t\t\t<div class=\"form-check-inline\"></div>\r\n");
      out.write("\t\t\t\t<div class=\"custom-control custom-radio custom-control-inline\">\r\n");
      out.write("\t\t\t\t\t<input type=\"radio\" class=\"custom-control-input\" id=\"customRadio1\"\r\n");
      out.write("\t\t\t\t\t\tname=\"example1\"> <label class=\"custom-control-label\"\r\n");
      out.write("\t\t\t\t\t\tfor=\"customRadio1\">by Email</label>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"form-check-inline\"></div>\r\n");
      out.write("\t\t\t\t<div class=\"custom-control custom-radio custom-control-inline\">\r\n");
      out.write("\t\t\t\t\t<input type=\"radio\" class=\"custom-control-input\" id=\"customRadio2\"\r\n");
      out.write("\t\t\t\t\t\tname=\"example1\"> <label class=\"custom-control-label\"\r\n");
      out.write("\t\t\t\t\t\tfor=\"customRadio2\">by Website</label>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div> -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"container mt-3\"></div>\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t<div class=\"container mt-3\">\r\n");
      out.write("\t\t\t\t<button type=\"submit\" class=\"btn btn-primary\">Submit</button>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
