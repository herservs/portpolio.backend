<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form"   uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="ui"     uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%
  
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
%>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Portfolio Website</title>
    <link rel="stylesheet" href="../css/main.css">
    <script type="module" src="../js/general.js" defer></script>
    <script src="https://kit.fontawesome.com/7a9a4a18bf.js" crossorigin="anonymous"></script>
</head>

<body>
    <!-- navbar -->
    <nav id="navbar">
        <div class="navbar__logo">
            <i class="fab fa-snapchat-ghost"></i>
            <a href="#">El Camino</a>
        </div>
        <ul class="navbar__menu">
            <li class="navbar__menu__item" data-link="#home">Home</li>
            <li class="navbar__menu__item" data-link="#about">About</li>
            <li class="navbar__menu__item" data-link="#skills">Skills</li>
            <li class="navbar__menu__item" data-link="#work">Work</li>
            <li class="navbar__menu__item" data-link="#contect">Contect</li>
        </ul>
        <div class="navbar__toggle-btn">
            <i class="fas fa-bars"></i>
        </div>
    </nav>

    <!-- Section : Home -->
    <Section id="home">
        <div class="home__container">
            <img src="../imgs/profile_imgs/myProfileImage.png" alt="My profile image" class="home__avatar">
            <h1 class="home__title">I'm very pleased to meet you!</h1>
            <h2 class="home__description">Let me tell you a bit about myself.</h2>
            <button class="home__contect">Contect Me</button>
        </div>
    </Section>

    <!-- Section : About -->
    <section id="about" class="section">
        <div class="section__container">
            <h1 class="about__title">About Me</h1>
            <h2 class="about__description">업무 경험</h2>
            <div class="about__majors">
                <!-- firmware -->
                <div class="about__major">
                    <div class="about__major__icon">
                        <i class="fas fa-robot"></i>
                    </div>
                    <div class="about__major__title">Firmware</div>
                    <div class="about__major__description">펌웨어</div>
                </div>
                <!-- IoT Network Programing -->
                <div class="about__major">
                    <div class="about__major__icon">
                        <i class="fas fa-network-wired"></i>
                    </div>
                    <div class="about__major__title">IoT Network programing</div>
                    <div class="about__major__description">네트워크 프로그래밍</div>
                </div>
                <!-- System Maintenance -->
                <div class="about__major">
                    <div class="about__major__icon">
                        <i class="fas fa-tools"></i>
                    </div>
                    <div class="about__major__title">System Maintenance</div>
                    <div class="about__major__description">유지보수 업무</div>
                </div>
            </div>
            <div class="about__jobs">
                <div class="about__job">
                    <i class="fas fa-building" alt="Company"></i>
                    <div class="job__description">
                        <p class="job__name">주식회사 유솔</p>
                        <p class="job__period">2014.09 ~ 2019.12, 5년 4개월</p>
                    </div>
                </div>
            </div>
        </div>
    </section>

    <!-- Section : Skills -->
    <section id="skills" class="section">
        <div class="section__container">
            <h1 class="skills__title">Skills</h1>
            <h2 class="skills__description">Skills & Attributes</h2>
            <div class="skills__set">
                <div class="skills__set__list">
                    <h2 class="skills__set__list__title">Languages</h2>
                    <div class="skills__set__list__description">
                        <div class="skill">
                            <div class="skill__set__description">
                                <span class="skill__title">C</span>
                                <span class="skill__level">80%</span>
                            </div>
                            <div class="skill__bar">
                                <div class="skill__bar__value" style="width: 80%;"></div>
                            </div>
                        </div>
                        <div class="skill">
                            <div class="skill__set__description">
                                <span class="skill__title">JAVA</span>
                                <span class="skill__level">80%</span>
                            </div>
                            <div class="skill__bar">
                                <div class="skill__bar__value" style="width: 80%;"></div>
                            </div>
                        </div>
                        <div class="skill">
                            <div class="skill__set__description">
                                <span class="skill__title">HTML</span>
                                <span class="skill__level">50%</span>
                            </div>
                            <div class="skill__bar">
                                <div class="skill__bar__value" style="width: 50%;"></div>
                            </div>
                        </div>
                        <div class="skill">
                            <div class="skill__set__description">
                                <span class="skill__title">CSS</span>
                                <span class="skill__level">50%</span>
                            </div>
                            <div class="skill__bar">
                                <div class="skill__bar__value" style="width: 50%;"></div>
                            </div>
                        </div>
                        <div class="skill">
                            <div class="skill__set__description">
                                <span class="skill__title">JAVASCRIPT</span>
                                <span class="skill__level">50%</span>
                            </div>
                            <div class="skill__bar">
                                <div class="skill__bar__value" style="width: 50%;"></div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="skills__set__frameworks__tools">
                    <div class="skills__set__frameworks">
                        <h2 class="frameworks__title">Frameworks & DBMS</h2>
                        <div class="frameworks__description">
                            <h3 class="framework__title">Spring Framework</h3>
                            <h3 class="framework__title">Netty Framework</h3>
                            <h3 class="framework__title">MyBatis Framework</h3>
                            <h3 class="framework__title">SWT/JFACE Framework</h3>
                            <h3 class="framework__title">Mysql</h3>
                            <h3 class="framework__title">MariaDB</h3>
                            <h3 class="framework__title">Redis</h3>
                        </div>
                    </div>
                    <div class="skills__set__tools">
                        <h2 class="tools__title">tools</h2>
                        <div class="tools__description">
                            <h3 class="tool__title">Eclipse</h3>
                            <h3 class="tool__title">Visual Studio Code</h3>
                            <h3 class="tool__title">Git, Github</h3>
                            <h3 class="tool__title">IAR</h3>
                        </div>

                    </div>

                </div>
            </div>
        </div>
        </div>
    </section>


    <!-- Section : MyWork-->

    <!-- IoT
                1. 데이터 수신 서버 : Netty : 개인 프로젝트 PPT -->

    <!-- 펌웨어
                1. 통신 모듈 제어(800, 400), 제원
                2. 암호화 : LEA, VPN
                 -->

    <!-- SM
                1. DBMS : Redis, MySql, DB 서비스 이전                                
                2. 스케쥴러
                3. 사용자 응용프로그램
                  -->

    <section id="work" class="section">
        <div class="section__container">
            <h1>My work</h1>
            <h3>참여 프로젝트</h3>
            <div class="work__categories">
                <button class="work__categories__btn selected" data-filter="*">ALL
                    <span class="category__count">6</span></button>
                <button class="work__categories__btn" data-filter="IoT">IoT
                    <span class="category__count">1</span></button>
                <button class="work__categories__btn" data-filter="Firmware">Firmware
                    <span class="category__count">2</span></button>
                <button class="work__categories__btn" data-filter="SM">System Maintenance
                    <span class="category__count">3</span></button>
            </div>
            <div class="work__project">
                <!-- project 1 -->
                <!-- <a href="" class="project" target="_blank" data-type="IoT"> -->
                <a href="../data/IoT_Server.pdf" class="project" target="_blank" data-type="IoT">
                    <!-- <img src="../imgs/project/projectSampleImg_r75.png" alt="project1" class="project__img" /> -->
                    <img src="../imgs/etc/IoT-359.jpg" alt="project1" class="project__img" />
                    <div class="project__description">
                        <h3>데이터 수신 서버</h3>
                        <span>IoT</span>
                    </div>
                </a>
                <!-- project 2 -->
                <a href="" class="project" target="_blank" data-type="Firmware">
                    <img src="../imgs/etc/firmware-1.jpg" alt="project2" class="project__img" />
                    <div class="project__description">
                        <h3>수도 계량기 신호처리</h3>
                        <span>Firmware</span>
                    </div>
                </a>

                <!-- project 3 -->
                <a href="" class="project" target="_blank" data-type="Firmware">
                    <img src="../imgs/etc/firmware-2.jpg" alt="project3" class="project__img" />
                    <div class="project__description">
                        <h3>RF 통신 모듈 제어</h3>
                        <span>Firmware</span>
                    </div>
                </a>

                <!-- project 4 -->
                <a href="" class="project" target="_blank" data-type="SM">
                    <img src="/imgs/etc/crypto-1.jpg" alt="project4" class="project__img" />
                    <div class="project__description">
                        <h3>암호화</h3>
                        <span>SM</span>
                    </div>
                </a>

                <!-- project 5 -->
                <a href="" class="project" target="_blank" data-type="SM">
                    <img src="/imgs/etc/databases-1.jpg" alt="project5" class="project__img" />
                    <div class="project__description">
                        <h3>데이터베이스 관리</h3>
                        <span>SM</span>
                    </div>
                </a>

                <!-- project 6 -->
                <a href="" class="project" target="_blank" data-type="SM">
                    <img src="/imgs/etc/repair-1.png" alt="project6" class="project__img" />
                    <div class="project__description">
                        <h3>유지, 보수</h3>
                        <span>SM</span>
                    </div>
                </a>
            </div>

        </div>
    </section>
    <!-- Section : Contect -->
    <div id="contect" class="section">
        <div class="section__container">
            <h1 class="contect__title">Let's talk</h1>
            <h2 class="contect__email">camino0411@gmail.com</h2>
            <div class="contect__links">
                <a href="https://github.com/herservs/portfolio.frontend.git" target="_blank">
                    <!-- <img src="imgs/contect/contectSampleImg_r75.png" alt="github" /> -->
                    <!-- <i class="fab fa-snapchat-ghost"></i> -->
                    <i class="fab fa-github"></i>
                </a>
                <p class="contect__rights">
                    2020 Hola Mundo! - All rights reserved
                </p>
            </div>
        </div>
    </div>
</body>

</html>