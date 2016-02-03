package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class userForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fform_005fmethod_005fcommandName;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005finput_005fpath_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fpassword_005fpath_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fradiobutton_005fvalue_005fpath_005flabel_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fselect_005fpath;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005foption_005fvalue_005flabel_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005foptions_005fitems_005fitemValue_005fitemLabel_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005ftextarea_005fpath_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fcheckboxes_005fpath_005fitems_005fitemValue_005fitemLabel_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fcheckbox_005fpath_005flabel_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fform_005fform_005fmethod_005fcommandName = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005finput_005fpath_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005fpassword_005fpath_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005fradiobutton_005fvalue_005fpath_005flabel_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005fselect_005fpath = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005foption_005fvalue_005flabel_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005foptions_005fitems_005fitemValue_005fitemLabel_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005ftextarea_005fpath_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005fcheckboxes_005fpath_005fitems_005fitemValue_005fitemLabel_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005fcheckbox_005fpath_005flabel_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fform_005fform_005fmethod_005fcommandName.release();
    _005fjspx_005ftagPool_005fform_005finput_005fpath_005fnobody.release();
    _005fjspx_005ftagPool_005fform_005fpassword_005fpath_005fnobody.release();
    _005fjspx_005ftagPool_005fform_005fradiobutton_005fvalue_005fpath_005flabel_005fnobody.release();
    _005fjspx_005ftagPool_005fform_005fselect_005fpath.release();
    _005fjspx_005ftagPool_005fform_005foption_005fvalue_005flabel_005fnobody.release();
    _005fjspx_005ftagPool_005fform_005foptions_005fitems_005fitemValue_005fitemLabel_005fnobody.release();
    _005fjspx_005ftagPool_005fform_005ftextarea_005fpath_005fnobody.release();
    _005fjspx_005ftagPool_005fform_005fcheckboxes_005fpath_005fitems_005fitemValue_005fitemLabel_005fnobody.release();
    _005fjspx_005ftagPool_005fform_005fcheckbox_005fpath_005flabel_005fnobody.release();
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
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Registration Page</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      //  form:form
      org.springframework.web.servlet.tags.form.FormTag _jspx_th_form_005fform_005f0 = (org.springframework.web.servlet.tags.form.FormTag) _005fjspx_005ftagPool_005fform_005fform_005fmethod_005fcommandName.get(org.springframework.web.servlet.tags.form.FormTag.class);
      _jspx_th_form_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_form_005fform_005f0.setParent(null);
      // /WEB-INF/jsp/userForm.jsp(12,0) name = method type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fform_005f0.setMethod("POST");
      // /WEB-INF/jsp/userForm.jsp(12,0) name = commandName type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fform_005f0.setCommandName("user");
      int[] _jspx_push_body_count_form_005fform_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_form_005fform_005f0 = _jspx_th_form_005fform_005f0.doStartTag();
        if (_jspx_eval_form_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("\t<table>\r\n");
            out.write("\t\t<tr>\r\n");
            out.write("\t\t\t<td>User Name :</td>\r\n");
            out.write("\t\t\t<td>");
            if (_jspx_meth_form_005finput_005f0(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("</td>\r\n");
            out.write("\t\t</tr>\r\n");
            out.write("\t\t<tr>\r\n");
            out.write("\t\t\t<td>Password :</td>\r\n");
            out.write("\t\t\t<td>");
            if (_jspx_meth_form_005fpassword_005f0(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("</td>\r\n");
            out.write("\t\t</tr>\r\n");
            out.write("\t\t<tr>\r\n");
            out.write("\t\t\t<td>Gender :</td>\r\n");
            out.write("\t\t\t<td>");
            if (_jspx_meth_form_005fradiobutton_005f0(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write(' ');
            if (_jspx_meth_form_005fradiobutton_005f1(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("</td>\r\n");
            out.write("\t\t</tr>\r\n");
            out.write("\t\t<tr>\r\n");
            out.write("\t\t\t<td>Country :</td>\r\n");
            out.write("\t\t\t<td>");
            //  form:select
            org.springframework.web.servlet.tags.form.SelectTag _jspx_th_form_005fselect_005f0 = (org.springframework.web.servlet.tags.form.SelectTag) _005fjspx_005ftagPool_005fform_005fselect_005fpath.get(org.springframework.web.servlet.tags.form.SelectTag.class);
            _jspx_th_form_005fselect_005f0.setPageContext(_jspx_page_context);
            _jspx_th_form_005fselect_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
            // /WEB-INF/jsp/userForm.jsp(29,7) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005fselect_005f0.setPath("country");
            int[] _jspx_push_body_count_form_005fselect_005f0 = new int[] { 0 };
            try {
              int _jspx_eval_form_005fselect_005f0 = _jspx_th_form_005fselect_005f0.doStartTag();
              if (_jspx_eval_form_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n");
                  out.write("\t\t\t\t");
                  //  form:option
                  org.springframework.web.servlet.tags.form.OptionTag _jspx_th_form_005foption_005f0 = (org.springframework.web.servlet.tags.form.OptionTag) _005fjspx_005ftagPool_005fform_005foption_005fvalue_005flabel_005fnobody.get(org.springframework.web.servlet.tags.form.OptionTag.class);
                  _jspx_th_form_005foption_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_form_005foption_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fselect_005f0);
                  // /WEB-INF/jsp/userForm.jsp(30,4) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_form_005foption_005f0.setValue(new String("0"));
                  // /WEB-INF/jsp/userForm.jsp(30,4) name = label type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_form_005foption_005f0.setLabel("Select");
                  int[] _jspx_push_body_count_form_005foption_005f0 = new int[] { 0 };
                  try {
                    int _jspx_eval_form_005foption_005f0 = _jspx_th_form_005foption_005f0.doStartTag();
                    if (_jspx_th_form_005foption_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      return;
                    }
                  } catch (Throwable _jspx_exception) {
                    while (_jspx_push_body_count_form_005foption_005f0[0]-- > 0)
                      out = _jspx_page_context.popBody();
                    _jspx_th_form_005foption_005f0.doCatch(_jspx_exception);
                  } finally {
                    _jspx_th_form_005foption_005f0.doFinally();
                    _005fjspx_005ftagPool_005fform_005foption_005fvalue_005flabel_005fnobody.reuse(_jspx_th_form_005foption_005f0);
                  }
                  out.write("\r\n");
                  out.write("\t\t\t\t");
                  if (_jspx_meth_form_005foptions_005f0(_jspx_th_form_005fselect_005f0, _jspx_page_context, _jspx_push_body_count_form_005fselect_005f0))
                    return;
                  out.write("\r\n");
                  out.write("\t\t\t");
                  int evalDoAfterBody = _jspx_th_form_005fselect_005f0.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_form_005fselect_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_005fselect_005f0[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_005fselect_005f0.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_005fselect_005f0.doFinally();
              _005fjspx_005ftagPool_005fform_005fselect_005fpath.reuse(_jspx_th_form_005fselect_005f0);
            }
            out.write("</td>\r\n");
            out.write("\t\t</tr>\r\n");
            out.write("\t\t<tr>\r\n");
            out.write("\t\t\t<td>About you :</td>\r\n");
            out.write("\t\t\t<td>");
            if (_jspx_meth_form_005ftextarea_005f0(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("</td>\r\n");
            out.write("\t\t</tr>\r\n");
            out.write("\t\t<tr>\r\n");
            out.write("\t\t\t<td>Community :</td>\r\n");
            out.write("\t\t\t<td>");
            if (_jspx_meth_form_005fcheckboxes_005f0(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("</td>\r\n");
            out.write("\t\t</tr>\r\n");
            out.write("\t\t<tr>\r\n");
            out.write("\t\t\t<td></td>\r\n");
            out.write("\t\t\t<td>");
            if (_jspx_meth_form_005fcheckbox_005f0(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("</td>\r\n");
            out.write("\t\t</tr>\r\n");
            out.write("\t\t<tr>\r\n");
            out.write("\t\t\t<td colspan=\"2\"><input type=\"submit\"></td>\r\n");
            out.write("\t\t</tr>\r\n");
            out.write("\t</table>\r\n");
            int evalDoAfterBody = _jspx_th_form_005fform_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_form_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_form_005fform_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_form_005fform_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_form_005fform_005f0.doFinally();
        _005fjspx_005ftagPool_005fform_005fform_005fmethod_005fcommandName.reuse(_jspx_th_form_005fform_005f0);
      }
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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

  private boolean _jspx_meth_form_005finput_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f0 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f0.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/jsp/userForm.jsp(16,7) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f0.setPath("name");
    int[] _jspx_push_body_count_form_005finput_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_form_005finput_005f0 = _jspx_th_form_005finput_005f0.doStartTag();
      if (_jspx_th_form_005finput_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005finput_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005finput_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005finput_005f0.doFinally();
      _005fjspx_005ftagPool_005fform_005finput_005fpath_005fnobody.reuse(_jspx_th_form_005finput_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_form_005fpassword_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:password
    org.springframework.web.servlet.tags.form.PasswordInputTag _jspx_th_form_005fpassword_005f0 = (org.springframework.web.servlet.tags.form.PasswordInputTag) _005fjspx_005ftagPool_005fform_005fpassword_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.PasswordInputTag.class);
    _jspx_th_form_005fpassword_005f0.setPageContext(_jspx_page_context);
    _jspx_th_form_005fpassword_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/jsp/userForm.jsp(20,7) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fpassword_005f0.setPath("password");
    int[] _jspx_push_body_count_form_005fpassword_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_form_005fpassword_005f0 = _jspx_th_form_005fpassword_005f0.doStartTag();
      if (_jspx_th_form_005fpassword_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005fpassword_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005fpassword_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005fpassword_005f0.doFinally();
      _005fjspx_005ftagPool_005fform_005fpassword_005fpath_005fnobody.reuse(_jspx_th_form_005fpassword_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_form_005fradiobutton_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:radiobutton
    org.springframework.web.servlet.tags.form.RadioButtonTag _jspx_th_form_005fradiobutton_005f0 = (org.springframework.web.servlet.tags.form.RadioButtonTag) _005fjspx_005ftagPool_005fform_005fradiobutton_005fvalue_005fpath_005flabel_005fnobody.get(org.springframework.web.servlet.tags.form.RadioButtonTag.class);
    _jspx_th_form_005fradiobutton_005f0.setPageContext(_jspx_page_context);
    _jspx_th_form_005fradiobutton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/jsp/userForm.jsp(24,7) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fradiobutton_005f0.setPath("gender");
    // /WEB-INF/jsp/userForm.jsp(24,7) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fradiobutton_005f0.setValue(new String("M"));
    // /WEB-INF/jsp/userForm.jsp(24,7) name = label type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fradiobutton_005f0.setLabel(new String("M"));
    int[] _jspx_push_body_count_form_005fradiobutton_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_form_005fradiobutton_005f0 = _jspx_th_form_005fradiobutton_005f0.doStartTag();
      if (_jspx_th_form_005fradiobutton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005fradiobutton_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005fradiobutton_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005fradiobutton_005f0.doFinally();
      _005fjspx_005ftagPool_005fform_005fradiobutton_005fvalue_005fpath_005flabel_005fnobody.reuse(_jspx_th_form_005fradiobutton_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_form_005fradiobutton_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:radiobutton
    org.springframework.web.servlet.tags.form.RadioButtonTag _jspx_th_form_005fradiobutton_005f1 = (org.springframework.web.servlet.tags.form.RadioButtonTag) _005fjspx_005ftagPool_005fform_005fradiobutton_005fvalue_005fpath_005flabel_005fnobody.get(org.springframework.web.servlet.tags.form.RadioButtonTag.class);
    _jspx_th_form_005fradiobutton_005f1.setPageContext(_jspx_page_context);
    _jspx_th_form_005fradiobutton_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/jsp/userForm.jsp(24,62) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fradiobutton_005f1.setPath("gender");
    // /WEB-INF/jsp/userForm.jsp(24,62) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fradiobutton_005f1.setValue(new String("F"));
    // /WEB-INF/jsp/userForm.jsp(24,62) name = label type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fradiobutton_005f1.setLabel(new String("F"));
    int[] _jspx_push_body_count_form_005fradiobutton_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_form_005fradiobutton_005f1 = _jspx_th_form_005fradiobutton_005f1.doStartTag();
      if (_jspx_th_form_005fradiobutton_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005fradiobutton_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005fradiobutton_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005fradiobutton_005f1.doFinally();
      _005fjspx_005ftagPool_005fform_005fradiobutton_005fvalue_005fpath_005flabel_005fnobody.reuse(_jspx_th_form_005fradiobutton_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_form_005foptions_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fselect_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fselect_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:options
    org.springframework.web.servlet.tags.form.OptionsTag _jspx_th_form_005foptions_005f0 = (org.springframework.web.servlet.tags.form.OptionsTag) _005fjspx_005ftagPool_005fform_005foptions_005fitems_005fitemValue_005fitemLabel_005fnobody.get(org.springframework.web.servlet.tags.form.OptionsTag.class);
    _jspx_th_form_005foptions_005f0.setPageContext(_jspx_page_context);
    _jspx_th_form_005foptions_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fselect_005f0);
    // /WEB-INF/jsp/userForm.jsp(31,4) name = items type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005foptions_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${countryList}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/jsp/userForm.jsp(31,4) name = itemValue type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005foptions_005f0.setItemValue("countryId");
    // /WEB-INF/jsp/userForm.jsp(31,4) name = itemLabel type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005foptions_005f0.setItemLabel("countryName");
    int[] _jspx_push_body_count_form_005foptions_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_form_005foptions_005f0 = _jspx_th_form_005foptions_005f0.doStartTag();
      if (_jspx_th_form_005foptions_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005foptions_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005foptions_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005foptions_005f0.doFinally();
      _005fjspx_005ftagPool_005fform_005foptions_005fitems_005fitemValue_005fitemLabel_005fnobody.reuse(_jspx_th_form_005foptions_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_form_005ftextarea_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:textarea
    org.springframework.web.servlet.tags.form.TextareaTag _jspx_th_form_005ftextarea_005f0 = (org.springframework.web.servlet.tags.form.TextareaTag) _005fjspx_005ftagPool_005fform_005ftextarea_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.TextareaTag.class);
    _jspx_th_form_005ftextarea_005f0.setPageContext(_jspx_page_context);
    _jspx_th_form_005ftextarea_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/jsp/userForm.jsp(36,7) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005ftextarea_005f0.setPath("aboutYou");
    int[] _jspx_push_body_count_form_005ftextarea_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_form_005ftextarea_005f0 = _jspx_th_form_005ftextarea_005f0.doStartTag();
      if (_jspx_th_form_005ftextarea_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005ftextarea_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005ftextarea_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005ftextarea_005f0.doFinally();
      _005fjspx_005ftagPool_005fform_005ftextarea_005fpath_005fnobody.reuse(_jspx_th_form_005ftextarea_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_form_005fcheckboxes_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:checkboxes
    org.springframework.web.servlet.tags.form.CheckboxesTag _jspx_th_form_005fcheckboxes_005f0 = (org.springframework.web.servlet.tags.form.CheckboxesTag) _005fjspx_005ftagPool_005fform_005fcheckboxes_005fpath_005fitems_005fitemValue_005fitemLabel_005fnobody.get(org.springframework.web.servlet.tags.form.CheckboxesTag.class);
    _jspx_th_form_005fcheckboxes_005f0.setPageContext(_jspx_page_context);
    _jspx_th_form_005fcheckboxes_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/jsp/userForm.jsp(40,7) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fcheckboxes_005f0.setPath("communityList");
    // /WEB-INF/jsp/userForm.jsp(40,7) name = items type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fcheckboxes_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${communityList}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/jsp/userForm.jsp(40,7) name = itemValue type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fcheckboxes_005f0.setItemValue("key");
    // /WEB-INF/jsp/userForm.jsp(40,7) name = itemLabel type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fcheckboxes_005f0.setItemLabel("value");
    int[] _jspx_push_body_count_form_005fcheckboxes_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_form_005fcheckboxes_005f0 = _jspx_th_form_005fcheckboxes_005f0.doStartTag();
      if (_jspx_th_form_005fcheckboxes_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005fcheckboxes_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005fcheckboxes_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005fcheckboxes_005f0.doFinally();
      _005fjspx_005ftagPool_005fform_005fcheckboxes_005fpath_005fitems_005fitemValue_005fitemLabel_005fnobody.reuse(_jspx_th_form_005fcheckboxes_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_form_005fcheckbox_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:checkbox
    org.springframework.web.servlet.tags.form.CheckboxTag _jspx_th_form_005fcheckbox_005f0 = (org.springframework.web.servlet.tags.form.CheckboxTag) _005fjspx_005ftagPool_005fform_005fcheckbox_005fpath_005flabel_005fnobody.get(org.springframework.web.servlet.tags.form.CheckboxTag.class);
    _jspx_th_form_005fcheckbox_005f0.setPageContext(_jspx_page_context);
    _jspx_th_form_005fcheckbox_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/jsp/userForm.jsp(44,7) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fcheckbox_005f0.setPath("mailingList");
    // /WEB-INF/jsp/userForm.jsp(44,7) name = label type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fcheckbox_005f0.setLabel(new String("Would you like to join our mailinglist?"));
    int[] _jspx_push_body_count_form_005fcheckbox_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_form_005fcheckbox_005f0 = _jspx_th_form_005fcheckbox_005f0.doStartTag();
      if (_jspx_th_form_005fcheckbox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005fcheckbox_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005fcheckbox_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005fcheckbox_005f0.doFinally();
      _005fjspx_005ftagPool_005fform_005fcheckbox_005fpath_005flabel_005fnobody.reuse(_jspx_th_form_005fcheckbox_005f0);
    }
    return false;
  }
}
