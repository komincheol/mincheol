/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.15
 * Generated at: 2017-07-27 05:36:17 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class userJoin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/standard.jar", Long.valueOf(1501047187136L));
    _jspx_dependants.put("jar:file:/C:/dev/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Danceple-proto/WEB-INF/lib/standard.jar!/META-INF/c.tld", Long.valueOf(1098678690000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

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

      out.write("\n");
      out.write("\n");
      out.write("\t\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<meta name=\"description\" content=\"\">\n");
      out.write("<meta name=\"author\" content=\"\">\n");
      out.write("<script src=\"");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("<script src=\"");
      if (_jspx_meth_c_005furl_005f1(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("<title>Danceple - Template</title>\n");
      out.write("\n");
      out.write("<link rel=\"Shortcut icon\" href=\"/favicon.ico\" />\n");
      out.write("\n");
      out.write("<!-- Bootstrap Core CSS -->\n");
      out.write("<link href=\"../css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<!-- Custom CSS -->\n");
      out.write("<link href=\"../css/sb-admin.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<!-- Morris Charts CSS -->\n");
      out.write("<link href=\"../css/plugins/morris.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<!-- Custom Fonts -->\n");
      out.write("<link href=\"../font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\"\n");
      out.write("\ttype=\"text/css\">\n");
      out.write("\n");
      out.write("<script  type=\"text/javascript\">\n");
      out.write("\n");
      out.write("\t$(document).ready(function(){\n");
      out.write("\t\tvar idchecked = -1;\t// -1:확인요망, 1:id존재함, 0:사용가능\n");
      out.write("\t\t\n");
      out.write("\t\t$('#memberId').change(function(){\t// 아이디 중복 체크 메시지\n");
      out.write("\t\t\tidcheck = -1;\n");
      out.write("\t\t\t$('#check_id_result').html('아이디 중복체크를 하세요');\n");
      out.write("\t\t});\n");
      out.write("\t\t\n");
      out.write("\t\t$('#memberId').click(function(){\t// 아이디 중복 체크 처리\n");
      out.write("\t\t\tvar memberId = $('#memberId').val().trim();\n");
      out.write("\t\t\n");
      out.write("\t\t\tif (memberId === '') {\n");
      out.write("\t\t\t\talert('체크할 아이디를 입력하세요');\n");
      out.write("\t\t\t\t$('#memberId').focus();\n");
      out.write("\t\t\t\treturn;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t$.getJSON('checkID',{\"memberId\":memberId},\n");
      out.write("\t\t\t\tfunction(data){\n");
      out.write("\t\t\t\t\tconsole.log(data);\n");
      out.write("\t\t\t\t\tconsole.log('id  : ' + data.id);\n");
      out.write("\t\t\t\t\tconsole.log('cnt : ' + data.cnt);\n");
      out.write("\t\t\t\t\tconsole.log('msg : ' + data.msg);\n");
      out.write("\t\t\t\t\t$('#check_id_result').html(data.msg);\n");
      out.write("\t\t\t\t\tidchecked = 0;\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t});\n");
      out.write("\t\t\n");
      out.write("\t\t$('#user_form').bind('submit',function(){\t// 회원가입 완료 처리\n");
      out.write("\t\t\tif ($('#memberId').val().length === 0) {\n");
      out.write("\t\t\t\talert('가입할 아이디를 입력하세요');\n");
      out.write("\t\t\t\t$('#memberId').focus();\n");
      out.write("\t\t\t\treturn false;\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t});\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("<script language=\"javascript\">\n");
      out.write(" function memChk() // 데이터 입력유무 확인 스크립트\n");
      out.write("{\n");
      out.write("   var f = document.frm;\n");
      out.write(" \n");
      out.write("   f.phone.value = f.memMobile01.value + f.memMobile02.value + f.memMobile03.value;\n");
      out.write("   \n");
      out.write("   if(f.memberId.value == \"\")\n");
      out.write("   {\n");
      out.write("    alert(\"아이디를 입력하세요\")\n");
      out.write("    f.memberId.focus();\n");
      out.write("    return false;\n");
      out.write("   }\n");
      out.write("   \n");
      out.write("\n");
      out.write("\n");
      out.write("   if(f.memberPwd.value == \"\")\n");
      out.write("   {\n");
      out.write("    alert(\"비밀번호를 입력하세요\")\n");
      out.write("    f.memberPwd.focus();\n");
      out.write("    return false;\n");
      out.write("   }\n");
      out.write("  if(f.memberPwdchk.value == \"\")\n");
      out.write("   {\n");
      out.write("    alert(\"비밀번호를 다시한번 입력해주세요\")\n");
      out.write("    f.memberPwdChk.focus();\n");
      out.write("    return false;\n");
      out.write("   } \n");
      out.write("if(f.memberPwd.value != f.memberPwdchk.value) \n");
      out.write("   {\n");
      out.write("    alert(\"비밀번호가 다릅니다.\");\n");
      out.write("    f.memberPwd.value = \"\"; \n");
      out.write("    f.memberPwdChk.value = \"\"; \n");
      out.write("    f.memberPwd.focus(); \n");
      out.write("    return false;\n");
      out.write("   } \n");
      out.write("   \n");
      out.write("   if(f.memberName.value == \"\")\n");
      out.write("   {\n");
      out.write("    alert(\"이름이 없는건가..\") \n");
      out.write("    f.memberName.focus(); \n");
      out.write("    return false;\n");
      out.write("   }\n");
      out.write("\n");
      out.write("\n");
      out.write("   if(f.birthday.value == \"\" )\n");
      out.write("   {\n");
      out.write("    alert(\"생년월일을 입력하세요.\") \n");
      out.write("    f.birthday.focus(); \n");
      out.write("    return false;\n");
      out.write("   }\n");
      out.write("   /* if(document.frm.memSung.value == \"\")\n");
      out.write("   {\n");
      out.write("    alert(\"성별을 선택하세요\") \n");
      out.write("    return false; \n");
      out.write("   } 라디오버튼값 체크 유무 확인 방법??*/\n");
      out.write("   if(f.email.value == \"\")\n");
      out.write("   {\n");
      out.write("    alert(\"이메일을 입력하세요\") \n");
      out.write("    f.email.focus(); \n");
      out.write("    return false;\n");
      out.write("   }\n");
      out.write("   // 메일 수신은 수신동의 selected\n");
      out.write("   \n");
      out.write("   if (f.memMobile01.value == \"Not\")\n");
      out.write("   {\n");
      out.write("    alert(\"핸드폰번호를 선택하세요\")\n");
      out.write("    return false;\n");
      out.write("   }\n");
      out.write("   if (f.memMobile02.value == \"\")\n");
      out.write("   {\n");
      out.write("    alert(\"핸드폰번호를 입력하세요\")\n");
      out.write("   f.memMobile02.focus();\n");
      out.write("    return false;\n");
      out.write("   }\n");
      out.write("   if (f.memMobile03.value == \"\")\n");
      out.write("   {\n");
      out.write("    alert(\"핸드폰번호를 입력하세요\")\n");
      out.write("    f.memMobile03.focus();\n");
      out.write("    return false;\n");
      out.write("   }\n");
      out.write("\n");
      out.write("\t\t   if (f.imgUrl.value == \"\")\n");
      out.write("\t\t\t\t   {\n");
      out.write("\t\t\t\t    alert(\"사진을 등록하세요\")\n");
      out.write("\t\t\t\t    f.imgUrl.focus();\n");
      out.write("\t\t\t\t    return false;\n");
      out.write("\t\t\t\t   }\n");
      out.write("  f.submit(); // 버튼으로 쓸 땐 return true; 대신 이걸 쓰고 form시작 구문에 onsubmit=\"return memChk()\" 는 불필요하여 삭제\n");
      out.write("\n");
      out.write(" } \n");
      out.write("  </script>\n");
      out.write("<script>\"undefined\"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:\"54402\",secure:\"54411\"},c={nonSecure:\"http://\",secure:\"https://\"},r={nonSecure:\"127.0.0.1\",secure:\"gapdebug.local.genuitec.com\"},n=\"https:\"===window.location.protocol?\"secure\":\"nonSecure\";script=e.createElement(\"script\"),script.type=\"text/javascript\",script.async=!0,script.src=c[n]+r[n]+\":\"+t[n]+\"/codelive-assets/bundle.js\",e.getElementsByTagName(\"head\")[0].appendChild(script)}(document),CODE_LIVE=!0);</script></head>\n");
      out.write("<body data-genuitec-lp-enabled=\"false\" data-genuitec-file-id=\"wc1-30\" data-genuitec-path=\"/Danceple-proto/WebContent/WEB-INF/member/userJoin.jsp\">\n");
      out.write("\n");
      out.write("\t<div id=\"wrapper\" data-genuitec-lp-enabled=\"false\" data-genuitec-file-id=\"wc1-30\" data-genuitec-path=\"/Danceple-proto/WebContent/WEB-INF/member/userJoin.jsp\">\n");
      out.write("\n");
      out.write("\t\t<!-- Navigation -->\n");
      out.write("\t\t<nav class=\"navbar navbar-inverse navbar-fixed-top\" role=\"navigation\">\n");
      out.write("\t\t\t<!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("\t\t\t<!-- 왼쪽 위 Danceple-->\n");
      out.write("\t\t\t<div class=\"navbar-header\">\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\"\n");
      out.write("\t\t\t\t\tdata-target=\".navbar-ex1-collapse\">\n");
      out.write("\t\t\t\t\t<span class=\"sr-only\">Toggle navigation</span> <span\n");
      out.write("\t\t\t\t\t\tclass=\"icon-bar\"></span> <span class=\"icon-bar\"></span> <span\n");
      out.write("\t\t\t\t\t\tclass=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t</button>\n");
      out.write("\t\t\t\t<a class=\"navbar-brand\" href=\"../index.jsp\">Danceple</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!-- Top Menu Items -->\n");
      out.write("\t\t\t<ul class=\"nav navbar-right top-nav\">\n");
      out.write("\t\t\t\t<li class=\"dropdown\"><a href=\"#\" class=\"dropdown-toggle\"\n");
      out.write("\t\t\t\t\tdata-toggle=\"dropdown\"><i class=\"fa fa-user\"></i> John Smith <b\n");
      out.write("\t\t\t\t\t\tclass=\"caret\"></b></a>\n");
      out.write("\t\t\t\t\t<ul class=\"dropdown-menu\">\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-fw fa-user\"></i> Profile</a>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-fw fa-envelope\"></i>\n");
      out.write("\t\t\t\t\t\t\t\tInbox</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-fw fa-gear\"></i> Settings</a>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li class=\"divider\"></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-fw fa-power-off\"></i> Log\n");
      out.write("\t\t\t\t\t\t\t\tOut</a></li>\n");
      out.write("\t\t\t\t\t</ul></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t\t<!-- Sidebar Menu Items - These collapse to the responsive navigation menu on small screens -->\n");
      out.write("            <div class=\"collapse navbar-collapse navbar-ex1-collapse\">\n");
      out.write("                <ul class=\"nav navbar-nav side-nav\">\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"../info/menu\"><i class=\"fa fa-fw fa-edit\"></i> Info Page(도영)</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"../manage/menu\"><i class=\"fa fa-fw fa-edit\"></i> Manage Page(주연)</a>\n");
      out.write("                        <ul id=\"manage\" class=\"collapse in\" aria-expanded=\"true\">\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"../manage/menu#team\">팀 관리</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"../manage/menu#grere\">장르 관리</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"../manage/menu#grade\">등급 관리</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"../apply/insertApply\"><i class=\"fa fa-fw fa-edit\"></i> Apply Page(현정)</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"active\">\n");
      out.write("                        <a href=\"menu\"><i class=\"fa fa-fw fa-edit\"></i> Member Page(민철)</a>\n");
      out.write("                        <ul id=\"member\" class=\"collapse in\" aria-expanded=\"true\">\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"login\">로그인</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li class=\"active\"><a href=\"memberInsert\">회원가입</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <!-- /.navbar-collapse -->\n");
      out.write("\t\t</nav>\n");
      out.write("\n");
      out.write("\t\t<div id=\"page-wrapper\">\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"container-fluid\">\n");
      out.write("\n");
      out.write("\t\t\t\t<!-- Page Heading -->\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-12\">\n");
      out.write("\t\t\t\t\t\t<h3 class=\"page-header\">\n");
      out.write("\t\t\t\t\t\t\t회원가입 <small>*표시 항목은 필수 입력 항목입니다.</small>\n");
      out.write("\t\t\t\t\t\t</h3>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- /.row -->\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-7\">\n");
      out.write("\t\t\t\t\t\t<div class=\"col-lg-12\">\n");
      out.write("\t\t\t\t\t\t\t<form id=\"user_form\" action=\"memberInsertAction\" method=\"post\" name=\"frm\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-lg-2\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label>아이디</label> \n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-lg-8\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" id= \"memberId\"name=\"memberId\" class=\"form-control\">  \n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-lg-2\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"button\" id=\"check_id\" value=\"아이디 중복 체크\" autofocus=\"autofocus\" onClick=\"winOpen()\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t<span id=\"check_id_result\"></span>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</br>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p class=\"help-block\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t아이디는 영문,숫자 조합으로 하셔야 합니다.[4자리이상 12자리이하]<br> 아이디는 소문자로 저장\n");
      out.write("\t\t\t\t\t\t\t\t\t\t됩니다.\n");
      out.write("\t\t\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-lg-2\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label>비밀번호</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-lg-10\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"password\" name=\"memberPwd\" class=\"form-control\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t<p class=\"help-block\">비밀번호는 4자리이상 12자리이하로 입력해주세요.</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t<!-- 비밀번호 문자와 숫자 혼합사용 체크....? -ㅅ-a -->\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-lg-2\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label>비밀번호 확인</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-lg-10\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"password\" name=\"memberPwdchk\" class=\"form-control\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-lg-2\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label>이름</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-lg-10\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"memberName\" class=\"form-control\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\" >\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-lg-2\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label>생년월일</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-lg-10\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"birthday\" maxlength=\"8\" class=\"form-control\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t<p class=\"help-block\">ex)19920611</p>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<!-- 주민번호 입력에 따른 생년월일 적용 체크 -.-a -->\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\" >\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-lg-2\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label>성별</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-lg-10\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label class=\"radiobox\"><input type=\"radio\" name=\"gender\" value=\"man\">남자</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label class=\"radiobox\"><input type=\"radio\" name=\"gender\" value=\"woman\">여자</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\" >\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-lg-2\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label>E - mail</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-lg-10\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"email\" class=\"form-control\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\" >\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-lg-2\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label>메일수신</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-lg-10\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label class=\"radiobox\"><input type=\"radio\" name=\"memEmailYes\" value=\"mailYes\" checked>수신동의</label> \n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label class=\"radiobox\"><input type=\"radio\" name=\"memEmailNo\" value=\"mailNo\">수신거부</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\" >\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-lg-2\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label>핸드폰</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-lg-10\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<select name=\"memMobile01\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"selectpicker\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"010\">010</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"011\">011</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"016\">016</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"017\">017</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"019\">019</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"070\">070</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t- <input type=\"text\" name=\"memMobile02\" size=\"5\" maxlength=\"4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t- <input type=\"text\" name=\"memMobile03\" size=\"5\" maxlength=\"4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"phone\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<!-- 숫자만 입력가능?? -.-a -->\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\" >\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-lg-2\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label>사진 업로드</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-lg-10\">\n");
      out.write("\t\t\t\t\t\t\t\t\t  <input name= \"imgUrl\" type = \"file\" >\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\" >\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-lg-2\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label>자기소개</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-lg-10\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<textarea name=\"memIntro\" class=\"form-control\"></textarea>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\" >\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-lg-12\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label>개인정보 동의</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-lg-10\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p class=\"navbar-text\">회원님의 개인정보는 댄스플동아리카페에서 회원수집 목적으로만 사용됩니다.</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-lg-2\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label class=\"radiobox\"><input type=\"radio\" name=\"yes\" value=\"yes\" checked>동의</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label class=\"radiobox\"><input type=\"radio\" name=\"no\" value=\"no\">거부</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\" >\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-lg-12\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"button\" value=\"등록\" onclick=\"memChk()\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<!-- 핸드폰까지 입력 후 등록버튼을 누르면\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t   함수의 액션(action=\"#\")이 실행되어 버린다.\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t    #이 실행되면 reset이 됨...;\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t    이유인즉 직업은 필수 선택이 아니고\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t   취미에 체크박스의 선택 유무를 따져 value값을\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t   넘겨받아 메시지를 띄우는 방법을 모르기 때문...\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t    인터넷을 찾아봐도 무슨말인지 영 모르겠다;;\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t    그래서 onClick=\"memChk()\" 을 빼야 중간에 리셋이 안되지만\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t   그렇다고 빼면 데이터 입력유무값이 체크가 안된다... \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t   알게 되면 추가하여 올릴예정!-->\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"reset\" value=\"취소\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!-- /.container-fluid -->\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- /#page-wrapper -->\n");
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\t<!-- /#wrapper -->\n");
      out.write("\n");
      out.write("\t<input type=\"button\" value=\"등록\" onclick=\"memChk()\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<!-- jQuery -->\n");
      out.write("\t<script src=\"../js/jquery.js\"></script>\n");
      out.write("\n");
      out.write("\t<!-- Bootstrap Core JavaScript -->\n");
      out.write("\t<script src=\"../js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("\t<!-- Morris Charts JavaScript -->\n");
      out.write("\t<script src=\"../js/plugins/morris/raphael.min.js\"></script>\n");
      out.write("\t<script src=\"../js/plugins/morris/morris.min.js\"></script>\n");
      out.write("\t<script src=\"../js/plugins/morris/morris-data.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f0_reused = false;
    try {
      _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f0.setParent(null);
      // /WEB-INF/member/userJoin.jsp(13,13) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f0.setValue("/resources/js/jquery-3.2.1.js");
      int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
      if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      _jspx_th_c_005furl_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f0, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f1_reused = false;
    try {
      _jspx_th_c_005furl_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f1.setParent(null);
      // /WEB-INF/member/userJoin.jsp(14,13) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f1.setValue("/resources/js/bootstrap.min.js");
      int _jspx_eval_c_005furl_005f1 = _jspx_th_c_005furl_005f1.doStartTag();
      if (_jspx_th_c_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
      _jspx_th_c_005furl_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f1, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f1_reused);
    }
    return false;
  }
}
