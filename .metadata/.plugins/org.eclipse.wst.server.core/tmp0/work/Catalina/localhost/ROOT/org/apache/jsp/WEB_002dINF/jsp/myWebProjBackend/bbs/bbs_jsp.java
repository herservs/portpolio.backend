/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.9
 * Generated at: 2020-09-13 19:08:41 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.myWebProjBackend.bbs;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class bbs_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(7);
    _jspx_dependants.put("jar:file:/C:/Dropbox%20DATA/Dropbox/03_개발%20자료/03_자바%20프로젝트%20백업/25_MyWebProject_backend/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/myWebProjBackend/WEB-INF/lib/spring-webmvc-4.3.16.RELEASE.jar!/META-INF/spring.tld", Long.valueOf(1523252374000L));
    _jspx_dependants.put("/WEB-INF/lib/egovframework.rte.ptl.mvc-3.8.0.jar", Long.valueOf(1595381404429L));
    _jspx_dependants.put("jar:file:/C:/Dropbox%20DATA/Dropbox/03_개발%20자료/03_자바%20프로젝트%20백업/25_MyWebProject_backend/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/myWebProjBackend/WEB-INF/lib/egovframework.rte.ptl.mvc-3.8.0.jar!/META-INF/taglib.tld", Long.valueOf(1539665194000L));
    _jspx_dependants.put("jar:file:/C:/Dropbox%20DATA/Dropbox/03_개발%20자료/03_자바%20프로젝트%20백업/25_MyWebProject_backend/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/myWebProjBackend/WEB-INF/lib/spring-webmvc-4.3.16.RELEASE.jar!/META-INF/spring-form.tld", Long.valueOf(1523252374000L));
    _jspx_dependants.put("/WEB-INF/lib/standard-1.1.2.jar", Long.valueOf(1592306829864L));
    _jspx_dependants.put("jar:file:/C:/Dropbox%20DATA/Dropbox/03_개발%20자료/03_자바%20프로젝트%20백업/25_MyWebProject_backend/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/myWebProjBackend/WEB-INF/lib/standard-1.1.2.jar!/META-INF/c.tld", Long.valueOf(1098678690000L));
    _jspx_dependants.put("/WEB-INF/lib/spring-webmvc-4.3.16.RELEASE.jar", Long.valueOf(1595381416251L));
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
      response.setContentType("text/html; charset=utf-8");
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

  
  /**
   * @Class Name : bbs.jsp
   * @Description : 게시판 화면
   * @Modification Information
   * @
   * @  	수정일				수정자				수정내용
   * @ ----------------------------------------------------------
   * @ 2020.09.12			Kim-Jeonghun			최초 생성
   *
   * @author Kim-Jeonghun
   * @since 2020.09.12
   * @version 1.0
   * @see
   *
   *  Copyright 2020. Kim-Jeonghun. All codes can be used without copyright permission.
   */

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>Portfolio Website - 게시판</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../../../../css/projbackend/main/main.css\">\r\n");
      out.write("    <script type=\"module\" src=\"../../../../js/bbs/bbs_general.js\" defer></script>\r\n");
      out.write("\r\n");
      out.write("    <script src=\"https://kit.fontawesome.com/7a9a4a18bf.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <!-- navbar -->\r\n");
      out.write("    <div id=\"bbs__navbar\">\r\n");
      out.write("        <div class=\"bbs__navbar__logo\">\r\n");
      out.write("            <i class=\"fab fa-snapchat-ghost\"></i>\r\n");
      out.write("            <a href=\"/main/main.do\">메인 화면</a>\r\n");
      out.write("        </div>\r\n");
      out.write("        <ul class=\"bbs__navbar__menu\">\r\n");
      out.write("            <li class=\"bbs__navbar__menu__item\" data-link=\"#board\">공지사항</li>\r\n");
      out.write("            <li class=\"bbs__navbar__menu__item\" data-link=\"#free\">자유게시판</li>\r\n");
      out.write("            <li class=\"bbs__navbar__menu__item\" data-link=\"#visit\">방명록</li>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- https://m.blog.naver.com/PostView.nhn?blogId=javaking75&logNo=220055136733&proxyReferer=https:%2F%2Fwww.google.com%2F -->\r\n");
      out.write("    <!-- Section : BBS -->\r\n");
      out.write("    <Section id=\"bbs\">\r\n");
      out.write("        <div class=\"section__container\">\r\n");
      out.write("            <div id=\"mainWrapper\">\r\n");
      out.write("\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <!-- 게시판 제목 -->\r\n");
      out.write("                    <li>게시판 Title </li>\r\n");
      out.write("\r\n");
      out.write("                    <!-- 게시판 목록  -->\r\n");
      out.write("                    <li>\r\n");
      out.write("                        Table\r\n");
      out.write("                        <ul id=\"ulTable\">\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <ul>\r\n");
      out.write("                                    <li>No</li>\r\n");
      out.write("                                    <li>제목</li>\r\n");
      out.write("                                    <li>작성일</li>\r\n");
      out.write("                                    <li>작성자</li>\r\n");
      out.write("                                    <li>조회수</li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <!-- 게시물이 출력될 영역 -->\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <ul>\r\n");
      out.write("                                    <li>1</li>\r\n");
      out.write("                                    <li class=\"left\">제목제목제목제목1</li>\r\n");
      out.write("                                    <li>2014.07.09</li>\r\n");
      out.write("                                    <li>자바킹</li>\r\n");
      out.write("                                    <li>0</li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </li>\r\n");
      out.write("\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <ul>\r\n");
      out.write("                                    <li>2</li>\r\n");
      out.write("                                    <li class=\"left\">제목제목제목제목1</li>\r\n");
      out.write("                                    <li>2014.07.09</li>\r\n");
      out.write("                                    <li>자바킹</li>\r\n");
      out.write("                                    <li>0</li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </li>\r\n");
      out.write("\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <ul>\r\n");
      out.write("                                    <li>3</li>\r\n");
      out.write("                                    <li class=\"left\">제목제목제목제목1</li>\r\n");
      out.write("                                    <li>2014.07.09</li>\r\n");
      out.write("                                    <li>자바킹</li>\r\n");
      out.write("                                    <li>0</li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </li>\r\n");
      out.write("\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <ul>\r\n");
      out.write("                                    <li>4</li>\r\n");
      out.write("                                    <li class=\"left\">제목제목제목제목1</li>\r\n");
      out.write("                                    <li>2014.07.09</li>\r\n");
      out.write("                                    <li>자바킹</li>\r\n");
      out.write("                                    <li>0</li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            <li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("\r\n");
      out.write("                    <!-- 게시판 페이징 영역 -->\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <div id=\"divPaging\">\r\n");
      out.write("                            <div>◀</div>\r\n");
      out.write("                            <div><b>1</b></div>\r\n");
      out.write("                            <div>2</div>\r\n");
      out.write("                            <div>3</div>\r\n");
      out.write("                            <div>4</div>\r\n");
      out.write("                            <div>5</div>\r\n");
      out.write("                            <div>▶</div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </li>\r\n");
      out.write("\r\n");
      out.write("                    <!-- 검색 폼 영역 -->\r\n");
      out.write("                    <li id='liSearchOption'>\r\n");
      out.write("                        <div>\r\n");
      out.write("                            <select id='selSearchOption'>\r\n");
      out.write("                                <option value='A'>제목+내용</option>\r\n");
      out.write("                                <option value='T'>제목</option>\r\n");
      out.write("                                <option value='C'>내용</option>\r\n");
      out.write("                            </select>\r\n");
      out.write("                            <input id='txtKeyWord' />\r\n");
      out.write("                            <input type='button' value='검색' />\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </li>\r\n");
      out.write("\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </Section>\r\n");
      out.write("\r\n");
      out.write("    <!-- Section : Contect -->\r\n");
      out.write("    <div id=\"contect\" class=\"section\">\r\n");
      out.write("        <div class=\"section__container\">\r\n");
      out.write("            <h1 class=\"contect__title\">Let's talk</h1>\r\n");
      out.write("            <h2 class=\"contect__email\">camino0411@gmail.com</h2>\r\n");
      out.write("            <div class=\"contect__links\">\r\n");
      out.write("                <a href=\"https://github.com/herservs/portfolio.frontend.git\" target=\"_blank\">\r\n");
      out.write("                    <!-- <img src=\"imgs/contect/contectSampleImg_r75.png\" alt=\"github\" /> -->\r\n");
      out.write("                    <!-- <i class=\"fab fa-snapchat-ghost\"></i> -->\r\n");
      out.write("                    <i class=\"fab fa-github\"></i>\r\n");
      out.write("                </a>\r\n");
      out.write("                <p class=\"contect__rights\">\r\n");
      out.write("                    2020 Hola Mundo! - All rights reserved\r\n");
      out.write("                </p>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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
}
