package org.apache.jsp.WEB_002dINF.tiles;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class baseLayout_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ftiles_005finsertAttribute_005fname_005fignore_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ftiles_005finsertAttribute_005fname_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005ftiles_005finsertAttribute_005fname_005fignore_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ftiles_005finsertAttribute_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005ftiles_005finsertAttribute_005fname_005fignore_005fnobody.release();
    _005fjspx_005ftagPool_005ftiles_005finsertAttribute_005fname_005fnobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("            <title>");
      if (_jspx_meth_tiles_005finsertAttribute_005f0(_jspx_page_context))
        return;
      out.write("</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <table border=\"1\" cellpadding=\"2\" cellspacing=\"2\" align=\"center\">\n");
      out.write("            <tr>\n");
      out.write("                <td height=\"30\" colspan=\"2\">\n");
      out.write("                    ");
      if (_jspx_meth_tiles_005finsertAttribute_005f1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td height=\"250\">\n");
      out.write("                    ");
      if (_jspx_meth_tiles_005finsertAttribute_005f2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                </td>\n");
      out.write("                <td width=\"350\">\n");
      out.write("                    ");
      if (_jspx_meth_tiles_005finsertAttribute_005f3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td height=\"30\" colspan=\"2\">\n");
      out.write("                    ");
      if (_jspx_meth_tiles_005finsertAttribute_005f4(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_tiles_005finsertAttribute_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tiles:insertAttribute
    org.apache.tiles.jsp.taglib.InsertAttributeTag _jspx_th_tiles_005finsertAttribute_005f0 = (org.apache.tiles.jsp.taglib.InsertAttributeTag) _005fjspx_005ftagPool_005ftiles_005finsertAttribute_005fname_005fignore_005fnobody.get(org.apache.tiles.jsp.taglib.InsertAttributeTag.class);
    _jspx_th_tiles_005finsertAttribute_005f0.setPageContext(_jspx_page_context);
    _jspx_th_tiles_005finsertAttribute_005f0.setParent(null);
    // /WEB-INF/tiles/baseLayout.jsp(8,19) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_tiles_005finsertAttribute_005f0.setName("title");
    // /WEB-INF/tiles/baseLayout.jsp(8,19) name = ignore type = boolean reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_tiles_005finsertAttribute_005f0.setIgnore(true);
    int[] _jspx_push_body_count_tiles_005finsertAttribute_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_tiles_005finsertAttribute_005f0 = _jspx_th_tiles_005finsertAttribute_005f0.doStartTag();
      if (_jspx_th_tiles_005finsertAttribute_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_tiles_005finsertAttribute_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_tiles_005finsertAttribute_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_tiles_005finsertAttribute_005f0.doFinally();
      _005fjspx_005ftagPool_005ftiles_005finsertAttribute_005fname_005fignore_005fnobody.reuse(_jspx_th_tiles_005finsertAttribute_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_tiles_005finsertAttribute_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tiles:insertAttribute
    org.apache.tiles.jsp.taglib.InsertAttributeTag _jspx_th_tiles_005finsertAttribute_005f1 = (org.apache.tiles.jsp.taglib.InsertAttributeTag) _005fjspx_005ftagPool_005ftiles_005finsertAttribute_005fname_005fnobody.get(org.apache.tiles.jsp.taglib.InsertAttributeTag.class);
    _jspx_th_tiles_005finsertAttribute_005f1.setPageContext(_jspx_page_context);
    _jspx_th_tiles_005finsertAttribute_005f1.setParent(null);
    // /WEB-INF/tiles/baseLayout.jsp(14,20) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_tiles_005finsertAttribute_005f1.setName("header");
    int[] _jspx_push_body_count_tiles_005finsertAttribute_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_tiles_005finsertAttribute_005f1 = _jspx_th_tiles_005finsertAttribute_005f1.doStartTag();
      if (_jspx_th_tiles_005finsertAttribute_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_tiles_005finsertAttribute_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_tiles_005finsertAttribute_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_tiles_005finsertAttribute_005f1.doFinally();
      _005fjspx_005ftagPool_005ftiles_005finsertAttribute_005fname_005fnobody.reuse(_jspx_th_tiles_005finsertAttribute_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_tiles_005finsertAttribute_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tiles:insertAttribute
    org.apache.tiles.jsp.taglib.InsertAttributeTag _jspx_th_tiles_005finsertAttribute_005f2 = (org.apache.tiles.jsp.taglib.InsertAttributeTag) _005fjspx_005ftagPool_005ftiles_005finsertAttribute_005fname_005fnobody.get(org.apache.tiles.jsp.taglib.InsertAttributeTag.class);
    _jspx_th_tiles_005finsertAttribute_005f2.setPageContext(_jspx_page_context);
    _jspx_th_tiles_005finsertAttribute_005f2.setParent(null);
    // /WEB-INF/tiles/baseLayout.jsp(19,20) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_tiles_005finsertAttribute_005f2.setName("menu");
    int[] _jspx_push_body_count_tiles_005finsertAttribute_005f2 = new int[] { 0 };
    try {
      int _jspx_eval_tiles_005finsertAttribute_005f2 = _jspx_th_tiles_005finsertAttribute_005f2.doStartTag();
      if (_jspx_th_tiles_005finsertAttribute_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_tiles_005finsertAttribute_005f2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_tiles_005finsertAttribute_005f2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_tiles_005finsertAttribute_005f2.doFinally();
      _005fjspx_005ftagPool_005ftiles_005finsertAttribute_005fname_005fnobody.reuse(_jspx_th_tiles_005finsertAttribute_005f2);
    }
    return false;
  }

  private boolean _jspx_meth_tiles_005finsertAttribute_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tiles:insertAttribute
    org.apache.tiles.jsp.taglib.InsertAttributeTag _jspx_th_tiles_005finsertAttribute_005f3 = (org.apache.tiles.jsp.taglib.InsertAttributeTag) _005fjspx_005ftagPool_005ftiles_005finsertAttribute_005fname_005fnobody.get(org.apache.tiles.jsp.taglib.InsertAttributeTag.class);
    _jspx_th_tiles_005finsertAttribute_005f3.setPageContext(_jspx_page_context);
    _jspx_th_tiles_005finsertAttribute_005f3.setParent(null);
    // /WEB-INF/tiles/baseLayout.jsp(22,20) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_tiles_005finsertAttribute_005f3.setName("body");
    int[] _jspx_push_body_count_tiles_005finsertAttribute_005f3 = new int[] { 0 };
    try {
      int _jspx_eval_tiles_005finsertAttribute_005f3 = _jspx_th_tiles_005finsertAttribute_005f3.doStartTag();
      if (_jspx_th_tiles_005finsertAttribute_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_tiles_005finsertAttribute_005f3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_tiles_005finsertAttribute_005f3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_tiles_005finsertAttribute_005f3.doFinally();
      _005fjspx_005ftagPool_005ftiles_005finsertAttribute_005fname_005fnobody.reuse(_jspx_th_tiles_005finsertAttribute_005f3);
    }
    return false;
  }

  private boolean _jspx_meth_tiles_005finsertAttribute_005f4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tiles:insertAttribute
    org.apache.tiles.jsp.taglib.InsertAttributeTag _jspx_th_tiles_005finsertAttribute_005f4 = (org.apache.tiles.jsp.taglib.InsertAttributeTag) _005fjspx_005ftagPool_005ftiles_005finsertAttribute_005fname_005fnobody.get(org.apache.tiles.jsp.taglib.InsertAttributeTag.class);
    _jspx_th_tiles_005finsertAttribute_005f4.setPageContext(_jspx_page_context);
    _jspx_th_tiles_005finsertAttribute_005f4.setParent(null);
    // /WEB-INF/tiles/baseLayout.jsp(27,20) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_tiles_005finsertAttribute_005f4.setName("footer");
    int[] _jspx_push_body_count_tiles_005finsertAttribute_005f4 = new int[] { 0 };
    try {
      int _jspx_eval_tiles_005finsertAttribute_005f4 = _jspx_th_tiles_005finsertAttribute_005f4.doStartTag();
      if (_jspx_th_tiles_005finsertAttribute_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_tiles_005finsertAttribute_005f4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_tiles_005finsertAttribute_005f4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_tiles_005finsertAttribute_005f4.doFinally();
      _005fjspx_005ftagPool_005ftiles_005finsertAttribute_005fname_005fnobody.reuse(_jspx_th_tiles_005finsertAttribute_005f4);
    }
    return false;
  }
}
