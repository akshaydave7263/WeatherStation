/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-04-09 15:46:58 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class welcome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Welcome</title>\r\n");
      out.write("<script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.4.2/jquery.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("welcome ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" \r\n");
      out.write("<center>\r\n");
      out.write("Weather Station Center\r\n");
      out.write("\r\n");
      out.write("</form>\r\n");
      out.write("<div id=\"dispData\">\r\n");
      out.write("\t<span>ID:</span> <input class=\"val\" type = \"text\" />\r\n");
      out.write("\t<button class=\"btn\">submit</button> <br/><br/>\r\n");
      out.write("\t<p class=\"disp\"></p>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("/*$( \"#sub\" ).click(function() {\r\n");
      out.write("\t $.ajax({\r\n");
      out.write("\t\t  type: \"GET\",\r\n");
      out.write("\t\t  dataType: \"xml\",\r\n");
      out.write("\t\t  url:\"http://localhost:8080/web/messages\",\r\n");
      out.write("\t\t  success: function(){\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t     alert(\"success\");\r\n");
      out.write("\t\t     \r\n");
      out.write("\t\t  }\r\n");
      out.write("\t\t });\r\n");
      out.write("\t}); */\r\n");
      out.write("$(\".btn\").click(function() {\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\tvar x = new XMLHttpRequest();\r\n");
      out.write("\tx.open(\"GET\", \"http://localhost:8080/web/messages\", true);\r\n");
      out.write("\tx.onreadystatechange = function () {\r\n");
      out.write("\t  if (x.readyState == 4 && x.status == 200)\r\n");
      out.write("\t  {\r\n");
      out.write("\t    var doc = x.responseXML;\r\n");
      out.write("\t    console.log(doc);\r\n");
      out.write("\t  //  console.log(doc.getElementsByTagName(\"messages\")[0].childNodes[0].childNodes[0]);\r\n");
      out.write("\t    //alert(doc.getElementsByTagName(\"messages\")[0].childNodes[0]);\r\n");
      out.write("\t    if($(\".val\").val() == 1){\r\n");
      out.write("\t\t\t$(\"p\").html(doc.getElementsByTagName(\"messages\")[0].childNodes[0].childNodes[0]);\r\n");
      out.write("\t\t\t$(\"p\").append(\"<br/>\");\r\n");
      out.write("\t\t\t$(\"p\").append(doc.getElementsByTagName(\"messages\")[0].childNodes[0].childNodes[1]);\r\n");
      out.write("\t\t\t$(\"p\").append(\"<br/>\");\r\n");
      out.write("\t\t\t$(\"p\").append(doc.getElementsByTagName(\"messages\")[0].childNodes[0].childNodes[2]);\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t    else if($(\".val\").val() == 2){\r\n");
      out.write("\t\t\t$(\"p\").html(doc.getElementsByTagName(\"messages\")[0].childNodes[1].childNodes[0]);\r\n");
      out.write("\t\t\t$(\"p\").append(\"<br/>\");\r\n");
      out.write("\t\t\t$(\"p\").append(doc.getElementsByTagName(\"messages\")[0].childNodes[1].childNodes[1]);\r\n");
      out.write("\t\t\t$(\"p\").append(\"<br/>\");\r\n");
      out.write("\t\t\t$(\"p\").append(doc.getElementsByTagName(\"messages\")[0].childNodes[1].childNodes[2]);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t    \r\n");
      out.write("\t  }\r\n");
      out.write("\t  \r\n");
      out.write("\t};\r\n");
      out.write("\tx.send(null);\r\n");
      out.write("\r\n");
      out.write("});\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
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
