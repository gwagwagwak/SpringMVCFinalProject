/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.5
 * Generated at: 2019-08-21 01:15:29 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class NewFile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\"\r\n");
      out.write("\trel=\"stylesheet\" id=\"bootstrap-css\">\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("\t\r\n");
      out.write("<style>\r\n");
      out.write("\t.project-tab {\r\n");
      out.write("    padding: 10%;\r\n");
      out.write("    margin-top: -8%;\r\n");
      out.write("}\r\n");
      out.write(".project-tab #tabs{\r\n");
      out.write("    background: #007b5e;\r\n");
      out.write("    color: #eee;\r\n");
      out.write("}\r\n");
      out.write(".project-tab #tabs h6.section-title{\r\n");
      out.write("    color: #eee;\r\n");
      out.write("}\r\n");
      out.write(".project-tab #tabs .nav-tabs .nav-item.show .nav-link, .nav-tabs .nav-link.active {\r\n");
      out.write("    color: #0062cc;\r\n");
      out.write("    background-color: transparent;\r\n");
      out.write("    border-color: transparent transparent #f3f3f3;\r\n");
      out.write("    border-bottom: 3px solid !important;\r\n");
      out.write("    font-size: 16px;\r\n");
      out.write("    font-weight: bold;\r\n");
      out.write("}\r\n");
      out.write(".project-tab .nav-link {\r\n");
      out.write("    border: 1px solid transparent;\r\n");
      out.write("    border-top-left-radius: .25rem;\r\n");
      out.write("    border-top-right-radius: .25rem;\r\n");
      out.write("    color: #0062cc;\r\n");
      out.write("    font-size: 16px;\r\n");
      out.write("    font-weight: 600;\r\n");
      out.write("}\r\n");
      out.write(".project-tab .nav-link:hover {\r\n");
      out.write("    border: none;\r\n");
      out.write("}\r\n");
      out.write(".project-tab thead{\r\n");
      out.write("    background: #f3f3f3;\r\n");
      out.write("    color: #333;\r\n");
      out.write("}\r\n");
      out.write(".project-tab a{\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("    color: #333;\r\n");
      out.write("    font-weight: 600;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<section id=\"tabs\" class=\"project-tab\">\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t\t<nav>\r\n");
      out.write("\t\t\t\t<div class=\"nav nav-tabs nav-fill\" id=\"nav-tab\" role=\"tablist\">\r\n");
      out.write("\t\t\t\t\t<a class=\"nav-item nav-link active\" id=\"nav-home-tab\"\r\n");
      out.write("\t\t\t\t\t\tdata-toggle=\"tab\" href=\"#nav-home\" role=\"tab\"\r\n");
      out.write("\t\t\t\t\t\taria-controls=\"nav-home\" aria-selected=\"true\">Project Tab 1</a> <a\r\n");
      out.write("\t\t\t\t\t\tclass=\"nav-item nav-link\" id=\"nav-profile-tab\" data-toggle=\"tab\"\r\n");
      out.write("\t\t\t\t\t\thref=\"#nav-profile\" role=\"tab\" aria-controls=\"nav-profile\"\r\n");
      out.write("\t\t\t\t\t\taria-selected=\"false\">Project Tab 2</a> <a\r\n");
      out.write("\t\t\t\t\t\tclass=\"nav-item nav-link\" id=\"nav-contact-tab\" data-toggle=\"tab\"\r\n");
      out.write("\t\t\t\t\t\thref=\"#nav-contact\" role=\"tab\" aria-controls=\"nav-contact\"\r\n");
      out.write("\t\t\t\t\t\taria-selected=\"false\">Project Tab 3</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</nav>\r\n");
      out.write("\t\t\t\t<div class=\"tab-content\" id=\"nav-tabContent\">\r\n");
      out.write("\t\t\t\t\t<div class=\"tab-pane fade show active\" id=\"nav-home\"\r\n");
      out.write("\t\t\t\t\t\trole=\"tabpanel\" aria-labelledby=\"nav-home-tab\">\r\n");
      out.write("\t\t\t\t\t\t<table class=\"table\" cellspacing=\"0\">\r\n");
      out.write("\t\t\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>Project Name</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>Employer</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>Awards</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td><a href=\"#\">Work 1</a></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>Doe</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>john@example.com</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td><a href=\"#\">Work 2</a></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>Moe</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>mary@example.com</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td><a href=\"#\">Work 3</a></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>Dooley</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>july@example.com</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"tab-pane fade\" id=\"nav-profile\" role=\"tabpanel\"\r\n");
      out.write("\t\t\t\t\t\taria-labelledby=\"nav-profile-tab\">\r\n");
      out.write("\t\t\t\t\t\t<table class=\"table\" cellspacing=\"0\">\r\n");
      out.write("\t\t\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>Project Name</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>Employer</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>Time</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td><a href=\"#\">Work 1</a></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>Doe</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>john@example.com</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td><a href=\"#\">Work 2</a></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>Moe</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>mary@example.com</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td><a href=\"#\">Work 3</a></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>Dooley</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>july@example.com</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"tab-pane fade\" id=\"nav-contact\" role=\"tabpanel\"\r\n");
      out.write("\t\t\t\t\t\taria-labelledby=\"nav-contact-tab\">\r\n");
      out.write("\t\t\t\t\t\t<table class=\"table\" cellspacing=\"0\">\r\n");
      out.write("\t\t\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>Contest Name</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>Date</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>Award Position</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td><a href=\"#\">Work 1</a></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>Doe</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>john@example.com</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td><a href=\"#\">Work 2</a></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>Moe</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>mary@example.com</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td><a href=\"#\">Work 3</a></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>Dooley</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>july@example.com</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</section>\r\n");
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
