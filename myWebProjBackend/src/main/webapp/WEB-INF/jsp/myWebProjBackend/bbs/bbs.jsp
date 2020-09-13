<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form"   uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="ui"     uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%
  
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
%>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Portfolio Website - 게시판</title>
    <link rel="stylesheet" href="../../../../css/projbackend/main/main.css">
    <script type="module" src="../../../../js/bbs/bbs_general.js" defer></script>

    <script src="https://kit.fontawesome.com/7a9a4a18bf.js" crossorigin="anonymous"></script>
</head>

<body>
    <!-- navbar -->
    <div id="bbs__navbar">
        <div class="bbs__navbar__logo">
            <i class="fab fa-snapchat-ghost"></i>
            <a href="/main/main.do">메인 화면</a>
        </div>
        <ul class="bbs__navbar__menu">
            <li class="bbs__navbar__menu__item" data-link="#board">공지사항</li>
            <li class="bbs__navbar__menu__item" data-link="#free">자유게시판</li>
            <li class="bbs__navbar__menu__item" data-link="#visit">방명록</li>
        </ul>
    </div>



    <!-- https://m.blog.naver.com/PostView.nhn?blogId=javaking75&logNo=220055136733&proxyReferer=https:%2F%2Fwww.google.com%2F -->
    <!-- Section : BBS -->
    <Section id="bbs">
        <div class="section__container">
            <div id="mainWrapper">

                <ul>
                    <!-- 게시판 제목 -->
                    <li>게시판 Title </li>

                    <!-- 게시판 목록  -->
                    <li>
                        Table
                        <ul id="ulTable">
                            <li>
                                <ul>
                                    <li>No</li>
                                    <li>제목</li>
                                    <li>작성일</li>
                                    <li>작성자</li>
                                    <li>조회수</li>
                                </ul>
                            </li>
                            <!-- 게시물이 출력될 영역 -->
                            <li>
                                <ul>
                                    <li>1</li>
                                    <li class="left">제목제목제목제목1</li>
                                    <li>2014.07.09</li>
                                    <li>자바킹</li>
                                    <li>0</li>
                                </ul>
                            </li>

                            <li>
                                <ul>
                                    <li>2</li>
                                    <li class="left">제목제목제목제목1</li>
                                    <li>2014.07.09</li>
                                    <li>자바킹</li>
                                    <li>0</li>
                                </ul>
                            </li>

                            <li>
                                <ul>
                                    <li>3</li>
                                    <li class="left">제목제목제목제목1</li>
                                    <li>2014.07.09</li>
                                    <li>자바킹</li>
                                    <li>0</li>
                                </ul>
                            </li>

                            <li>
                                <ul>
                                    <li>4</li>
                                    <li class="left">제목제목제목제목1</li>
                                    <li>2014.07.09</li>
                                    <li>자바킹</li>
                                    <li>0</li>
                                </ul>
                            <li>
                        </ul>
                    </li>

                    <!-- 게시판 페이징 영역 -->
                    <li>
                        <div id="divPaging">
                            <div>◀</div>
                            <div><b>1</b></div>
                            <div>2</div>
                            <div>3</div>
                            <div>4</div>
                            <div>5</div>
                            <div>▶</div>
                        </div>
                    </li>

                    <!-- 검색 폼 영역 -->
                    <li id='liSearchOption'>
                        <div>
                            <select id='selSearchOption'>
                                <option value='A'>제목+내용</option>
                                <option value='T'>제목</option>
                                <option value='C'>내용</option>
                            </select>
                            <input id='txtKeyWord' />
                            <input type='button' value='검색' />
                        </div>
                    </li>

                </ul>
            </div>
        </div>
    </Section>

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