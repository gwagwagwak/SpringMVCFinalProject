/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.5
 * Generated at: 2019-09-01 15:17:00 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registerForm_005f03_005fb_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link\r\n");
      out.write("\thref=\"//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css\"\r\n");
      out.write("\trel=\"stylesheet\" id=\"bootstrap-css\">\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script src=\"//code.jquery.com/jquery-1.11.1.min.js\"></script>\r\n");
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
      out.write("</style>\r\n");
      out.write("<script>\r\n");
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
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"col-md-8 col-md-offset-2\">\r\n");
      out.write("\t\t\t\t<form role=\"form\" method=\"POST\" action=\"#\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<legend class=\"text-center\">Register</legend>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<fieldset>\r\n");
      out.write("\t\t\t\t\t\t<legend>Account Details</legend>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group col-md-6\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"first_name\">First name</label> <input type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"form-control\" name=\"\" id=\"first_name\"\r\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"First Name\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group col-md-6\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"last_name\">Last name</label> <input type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"form-control\" name=\"last_name\" id=\"\"\r\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"Last Name\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group col-md-12\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"\">Email</label> <input type=\"email\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"form-control\" name=\"\" id=\"\" placeholder=\"Email\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group col-md-6\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"password\">Password</label> <input type=\"password\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"form-control\" name=\"\" id=\"password\"\r\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"Password\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group col-md-6\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"confirm_password\">Confirm Password</label> <input\r\n");
      out.write("\t\t\t\t\t\t\t\ttype=\"password\" class=\"form-control\" name=\"\"\r\n");
      out.write("\t\t\t\t\t\t\t\tid=\"confirm_password\" placeholder=\"Confirm Password\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group col-md-6\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"Phone\">Phone</label> <input type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"form-control\" name=\"\" id=\"phone\"\r\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"Your Cell Phone Number\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group col-md-6\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"country\">Country of Residence</label> <select\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"form-control\" name=\"\" id=\"country\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<option>KOREA</option>\r\n");
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
      out.write("\t\t\t\t\t\t\t<label for=\"addr1\">Address</label> <input type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"form-control\" name=\"addr1\" id=\"addr1\"\r\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"Your address\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group col-md-12\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"addr2\"></label> <input type=\"text\" class=\"form-control\"\r\n");
      out.write("\t\t\t\t\t\t\t\tname=\"\" id=\"\" placeholder=\"detail address\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group col-md-6\">\r\n");
      out.write("\t\t\t\t\t\t<label for=\"b_type\"> Business Type     </label>      \r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"radio\" name=\"chk_info\" value=\"1\">개인사업자 <input\r\n");
      out.write("\t\t\t\t\t\t\t\ttype=\"radio\" name=\"chk_info\" value=\"2\">상장회사 <input\r\n");
      out.write("\t\t\t\t\t\t\t\ttype=\"radio\" name=\"chk_info\" value=\"3\">비상장회사\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group col-md-12\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"b_number\">Business Number</label> <input type=\"text\" class=\"form-control\"\r\n");
      out.write("\t\t\t\t\t\t\t\tname=\"b_number\" id=\"b_number\" placeholder=\"Your Business Number\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</fieldset>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group col-md-12 hidden\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"specify\">Please Specify</label>\r\n");
      out.write("\t\t\t\t\t\t\t<textarea class=\"form-control\" id=\"specify\" name=\"\"></textarea>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"checkbox\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label> <input type=\"checkbox\" value=\"\" id=\"\"> I\r\n");
      out.write("\t\t\t\t\t\t\t\t\taccept the <a href=\"#\">terms and conditions</a>.\r\n");
      out.write("\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-primary\">Register</button>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"log_v19.jsp\">Already have an account?</a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
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
