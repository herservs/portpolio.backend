/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.9
 * Generated at: 2020-09-18 14:30:07 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.myWebProjBackend.main;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(7);
    _jspx_dependants.put("jar:file:/C:/Dropbox%20DATA/Dropbox/03_개발%20자료/03_자바%20프로젝트%20백업/25_MyWebProject_backend/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/myWebProjBackend/WEB-INF/lib/spring-webmvc-4.3.16.RELEASE.jar!/META-INF/spring.tld", Long.valueOf(1523252374000L));
    _jspx_dependants.put("/WEB-INF/lib/egovframework.rte.ptl.mvc-3.8.0.jar", Long.valueOf(1595381404429L));
    _jspx_dependants.put("jar:file:/C:/Dropbox%20DATA/Dropbox/03_개발%20자료/03_자바%20프로젝트%20백업/25_MyWebProject_backend/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/myWebProjBackend/WEB-INF/lib/egovframework.rte.ptl.mvc-3.8.0.jar!/META-INF/taglib.tld", Long.valueOf(1539665194000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1591800885898L));
    _jspx_dependants.put("jar:file:/C:/Dropbox%20DATA/Dropbox/03_개발%20자료/03_자바%20프로젝트%20백업/25_MyWebProject_backend/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/myWebProjBackend/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("jar:file:/C:/Dropbox%20DATA/Dropbox/03_개발%20자료/03_자바%20프로젝트%20백업/25_MyWebProject_backend/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/myWebProjBackend/WEB-INF/lib/spring-webmvc-4.3.16.RELEASE.jar!/META-INF/spring-form.tld", Long.valueOf(1523252374000L));
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
   * @Class Name : main.jsp
   * @Description : 메인화면, 첫 시작 화면
   * @Modification Information
   * @
   * @  	수정일				수정자				수정내용
   * @ ----------------------------------------------------------
   * @ 2020.09.11			Kim-Jeonghun			최초 생성
   *
   * @author Kim-Jeonghun
   * @since 2020.09.11
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
      out.write("    <title>Portfolio Website</title>\r\n");
      out.write("    <!-- <link rel=\"stylesheet\" href=\"../css/main.css\"> -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../../../../css/projbackend/main/main.css\">\r\n");
      out.write("    <script type=\"module\" src=\"../../../../js/general.js\" defer></script>\r\n");
      out.write("    <script src=\"https://kit.fontawesome.com/7a9a4a18bf.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <!-- navbar -->\r\n");
      out.write("    <nav id=\"navbar\">\r\n");
      out.write("        <div class=\"navbar__logo\">\r\n");
      out.write("            <i class=\"fab fa-snapchat-ghost\"></i>\r\n");
      out.write("            <a href=\"#\">El Camino</a>\r\n");
      out.write("        </div>\r\n");
      out.write("        <ul class=\"navbar__menu\">\r\n");
      out.write("            <li class=\"navbar__menu__item\" data-link=\"#home\">Home</li>\r\n");
      out.write("            <li class=\"navbar__menu__item\" data-link=\"#about\">About</li>\r\n");
      out.write("            <li class=\"navbar__menu__item\" data-link=\"#skills\">Skills</li>\r\n");
      out.write("            <li class=\"navbar__menu__item\" data-link=\"#work\">Work</li>\r\n");
      out.write("<!--             <li class=\"navbar__menu__item\" data-link=\"#board\">Board</li> -->\r\n");
      out.write("            <li class=\"navbar__menu__item\" data-link=\"#contect\">Contect</li>\r\n");
      out.write("        </ul>\r\n");
      out.write("        <div class=\"navbar__toggle-btn\">\r\n");
      out.write("            <i class=\"fas fa-bars\"></i>\r\n");
      out.write("        </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("\r\n");
      out.write("    <!-- Section : Home -->\r\n");
      out.write("    <Section id=\"home\">\r\n");
      out.write("        <div class=\"home__container\">\r\n");
      out.write("            <img src=\"../imgs/profile_imgs/myProfileImage.png\" alt=\"My profile image\" class=\"home__avatar\">\r\n");
      out.write("            <h1 class=\"home__title\">I'm very pleased to meet you!</h1>\r\n");
      out.write("            <h2 class=\"home__description\">Let me tell you a bit about myself.</h2>\r\n");
      out.write("            <button class=\"home__contect\">Contect Me</button>\r\n");
      out.write("        </div>\r\n");
      out.write("    </Section>\r\n");
      out.write("\r\n");
      out.write("    <!-- Section : About -->\r\n");
      out.write("    <section id=\"about\" class=\"section\">\r\n");
      out.write("        <div class=\"section__container\">\r\n");
      out.write("            <h1 class=\"about__title\">About Me</h1>\r\n");
      out.write("            <h2 class=\"about__description\">업무 경험</h2>\r\n");
      out.write("            <div class=\"about__majors\">\r\n");
      out.write("                <!-- firmware -->\r\n");
      out.write("                <div class=\"about__major\">\r\n");
      out.write("                    <div class=\"about__major__icon\">\r\n");
      out.write("                        <i class=\"fas fa-robot\"></i>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"about__major__title\">Firmware</div>\r\n");
      out.write("                    <div class=\"about__major__description\">펌웨어</div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- IoT Network Programing -->\r\n");
      out.write("                <div class=\"about__major\">\r\n");
      out.write("                    <div class=\"about__major__icon\">\r\n");
      out.write("                        <i class=\"fas fa-network-wired\"></i>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"about__major__title\">IoT Network programing</div>\r\n");
      out.write("                    <div class=\"about__major__description\">네트워크 프로그래밍</div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- System Maintenance -->\r\n");
      out.write("                <div class=\"about__major\">\r\n");
      out.write("                    <div class=\"about__major__icon\">\r\n");
      out.write("                        <i class=\"fas fa-tools\"></i>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"about__major__title\">System Maintenance</div>\r\n");
      out.write("                    <div class=\"about__major__description\">유지보수 업무</div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"about__jobs\">\r\n");
      out.write("                <div class=\"about__job\">\r\n");
      out.write("                    <i class=\"fas fa-building\" alt=\"Company\"></i>\r\n");
      out.write("                    <div class=\"job__description\">\r\n");
      out.write("                        <p class=\"job__name\">주식회사 유솔</p>\r\n");
      out.write("                        <p class=\"job__period\">2014.09 ~ 2019.12, 5년 4개월</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </section>\r\n");
      out.write("\r\n");
      out.write("    <!-- Section : Skills -->\r\n");
      out.write("    <section id=\"skills\" class=\"section\">\r\n");
      out.write("        <div class=\"section__container\">\r\n");
      out.write("            <h1 class=\"skills__title\">Skills</h1>\r\n");
      out.write("            <h2 class=\"skills__description\">Skills & Attributes</h2>\r\n");
      out.write("            <div class=\"skills__set\">\r\n");
      out.write("                <div class=\"skills__set__list\">\r\n");
      out.write("                    <h2 class=\"skills__set__list__title\">Languages</h2>\r\n");
      out.write("                    <div class=\"skills__set__list__description\">\r\n");
      out.write("                        <div class=\"skill\">\r\n");
      out.write("                            <div class=\"skill__set__description\">\r\n");
      out.write("                                <span class=\"skill__title\">C</span>\r\n");
      out.write("                                <span class=\"skill__level\">80%</span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"skill__bar\">\r\n");
      out.write("                                <div class=\"skill__bar__value\" style=\"width: 80%;\"></div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"skill\">\r\n");
      out.write("                            <div class=\"skill__set__description\">\r\n");
      out.write("                                <span class=\"skill__title\">JAVA</span>\r\n");
      out.write("                                <span class=\"skill__level\">80%</span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"skill__bar\">\r\n");
      out.write("                                <div class=\"skill__bar__value\" style=\"width: 80%;\"></div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"skill\">\r\n");
      out.write("                            <div class=\"skill__set__description\">\r\n");
      out.write("                                <span class=\"skill__title\">HTML</span>\r\n");
      out.write("                                <span class=\"skill__level\">50%</span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"skill__bar\">\r\n");
      out.write("                                <div class=\"skill__bar__value\" style=\"width: 50%;\"></div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"skill\">\r\n");
      out.write("                            <div class=\"skill__set__description\">\r\n");
      out.write("                                <span class=\"skill__title\">CSS</span>\r\n");
      out.write("                                <span class=\"skill__level\">50%</span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"skill__bar\">\r\n");
      out.write("                                <div class=\"skill__bar__value\" style=\"width: 50%;\"></div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"skill\">\r\n");
      out.write("                            <div class=\"skill__set__description\">\r\n");
      out.write("                                <span class=\"skill__title\">JAVASCRIPT</span>\r\n");
      out.write("                                <span class=\"skill__level\">50%</span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"skill__bar\">\r\n");
      out.write("                                <div class=\"skill__bar__value\" style=\"width: 50%;\"></div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"skills__set__frameworks__tools\">\r\n");
      out.write("                    <div class=\"skills__set__frameworks\">\r\n");
      out.write("                        <h2 class=\"frameworks__title\">Frameworks & DBMS</h2>\r\n");
      out.write("                        <div class=\"frameworks__description\">\r\n");
      out.write("                            <h3 class=\"framework__title\">Spring Framework</h3>\r\n");
      out.write("                            <h3 class=\"framework__title\">Netty Framework</h3>\r\n");
      out.write("                            <h3 class=\"framework__title\">MyBatis Framework</h3>\r\n");
      out.write("                            <h3 class=\"framework__title\">SWT/JFACE Framework</h3>\r\n");
      out.write("                            <h3 class=\"framework__title\">Mysql</h3>\r\n");
      out.write("                            <h3 class=\"framework__title\">MariaDB</h3>\r\n");
      out.write("                            <h3 class=\"framework__title\">Redis</h3>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"skills__set__tools\">\r\n");
      out.write("                        <h2 class=\"tools__title\">tools</h2>\r\n");
      out.write("                        <div class=\"tools__description\">\r\n");
      out.write("                            <h3 class=\"tool__title\">Eclipse</h3>\r\n");
      out.write("                            <h3 class=\"tool__title\">Visual Studio Code</h3>\r\n");
      out.write("                            <h3 class=\"tool__title\">Git, Github</h3>\r\n");
      out.write("                            <h3 class=\"tool__title\">IAR</h3>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </section>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- Section : MyWork-->\r\n");
      out.write("\r\n");
      out.write("    <!-- IoT\r\n");
      out.write("                1. 데이터 수신 서버 : Netty : 개인 프로젝트 PPT -->\r\n");
      out.write("\r\n");
      out.write("    <!-- 펌웨어\r\n");
      out.write("                1. 통신 모듈 제어(800, 400), 제원\r\n");
      out.write("                2. 암호화 : LEA, VPN\r\n");
      out.write("                 -->\r\n");
      out.write("\r\n");
      out.write("    <!-- SM\r\n");
      out.write("                1. DBMS : Redis, MySql, DB 서비스 이전                                \r\n");
      out.write("                2. 스케쥴러\r\n");
      out.write("                3. 사용자 응용프로그램\r\n");
      out.write("                  -->\r\n");
      out.write("\r\n");
      out.write("    <section id=\"work\" class=\"section\">\r\n");
      out.write("        <div class=\"section__container\">\r\n");
      out.write("            <h1>My work</h1>\r\n");
      out.write("            <h3>참여 프로젝트</h3>\r\n");
      out.write("            <div class=\"work__categories\">\r\n");
      out.write("                <button class=\"work__categories__btn selected\" data-filter=\"*\">ALL\r\n");
      out.write("                    <span class=\"category__count\">6</span></button>\r\n");
      out.write("                <button class=\"work__categories__btn\" data-filter=\"IoT\">IoT\r\n");
      out.write("                    <span class=\"category__count\">1</span></button>\r\n");
      out.write("                <button class=\"work__categories__btn\" data-filter=\"Firmware\">Firmware\r\n");
      out.write("                    <span class=\"category__count\">2</span></button>\r\n");
      out.write("                <button class=\"work__categories__btn\" data-filter=\"SM\">System Maintenance\r\n");
      out.write("                    <span class=\"category__count\">3</span></button>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"work__project\">\r\n");
      out.write("                <!-- project 1 -->\r\n");
      out.write("                <!-- <a href=\"\" class=\"project\" target=\"_blank\" data-type=\"IoT\"> -->\r\n");
      out.write("                <a href=\"../data/IoT_Server.pdf\" class=\"project\" target=\"_blank\" data-type=\"IoT\">\r\n");
      out.write("                    <!-- <img src=\"../imgs/project/projectSampleImg_r75.png\" alt=\"project1\" class=\"project__img\" /> -->\r\n");
      out.write("                    <img src=\"../imgs/etc/IoT-359.jpg\" alt=\"project1\" class=\"project__img\" />\r\n");
      out.write("                    <div class=\"project__description\">\r\n");
      out.write("                        <h3>데이터 수신 서버</h3>\r\n");
      out.write("                        <span>IoT</span>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </a>\r\n");
      out.write("                <!-- project 2 -->\r\n");
      out.write("                <a href=\"\" class=\"project\" target=\"_blank\" data-type=\"Firmware\">\r\n");
      out.write("                    <img src=\"../imgs/etc/firmware-1.jpg\" alt=\"project2\" class=\"project__img\" />\r\n");
      out.write("                    <div class=\"project__description\">\r\n");
      out.write("                        <h3>수도 계량기 신호처리</h3>\r\n");
      out.write("                        <span>Firmware</span>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </a>\r\n");
      out.write("\r\n");
      out.write("                <!-- project 3 -->\r\n");
      out.write("                <a href=\"\" class=\"project\" target=\"_blank\" data-type=\"Firmware\">\r\n");
      out.write("                    <img src=\"../imgs/etc/firmware-2.jpg\" alt=\"project3\" class=\"project__img\" />\r\n");
      out.write("                    <div class=\"project__description\">\r\n");
      out.write("                        <h3>RF 통신 모듈 제어</h3>\r\n");
      out.write("                        <span>Firmware</span>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </a>\r\n");
      out.write("\r\n");
      out.write("                <!-- project 4 -->\r\n");
      out.write("                <a href=\"\" class=\"project\" target=\"_blank\" data-type=\"SM\">\r\n");
      out.write("                    <img src=\"/imgs/etc/crypto-1.jpg\" alt=\"project4\" class=\"project__img\" />\r\n");
      out.write("                    <div class=\"project__description\">\r\n");
      out.write("                        <h3>암호화</h3>\r\n");
      out.write("                        <span>SM</span>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </a>\r\n");
      out.write("\r\n");
      out.write("                <!-- project 5 -->\r\n");
      out.write("                <a href=\"\" class=\"project\" target=\"_blank\" data-type=\"SM\">\r\n");
      out.write("                    <img src=\"/imgs/etc/databases-1.jpg\" alt=\"project5\" class=\"project__img\" />\r\n");
      out.write("                    <div class=\"project__description\">\r\n");
      out.write("                        <h3>데이터베이스 관리</h3>\r\n");
      out.write("                        <span>SM</span>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </a>\r\n");
      out.write("\r\n");
      out.write("                <!-- project 6 -->\r\n");
      out.write("                <a href=\"\" class=\"project\" target=\"_blank\" data-type=\"SM\">\r\n");
      out.write("                    <img src=\"/imgs/etc/repair-1.png\" alt=\"project6\" class=\"project__img\" />\r\n");
      out.write("                    <div class=\"project__description\">\r\n");
      out.write("                        <h3>유지, 보수</h3>\r\n");
      out.write("                        <span>SM</span>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </a>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </section>\r\n");
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
