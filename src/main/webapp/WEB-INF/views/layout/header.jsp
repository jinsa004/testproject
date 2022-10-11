<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <!DOCTYPE html>
    <html>

    <head>
      <meta charset="UTF-8" />
      <meta http-equiv="X-UA-Compatible" content="IE=edge" />
      <meta name="viewport" content="width=device-width, initial-scale=1.0" />
      <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css" rel="stylesheet" />
      <link rel="stylesheet" href="/css/reset.css" />
      <link rel="stylesheet" href="/css/main.css" />
      <script type="text/javascript" src="/js/main.js"></script>
      <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>

      <title>4조 PROJECT</title>
    </head>

    <body>
      <div id="user_wrap">
        <div class="header_wrap">
          <header>
            <div class="logo">
              <a href="/main">PROJECT_4</a>
            </div>
            <!-- .logo -->

            <div class="search_bar">
              <form class="cf">
                <input type="text" id="search" title="검색어 입력" name="search" placeholder="검색어를 입력해주세요." maxlength="50" />
                <!-- <button type="submit" class="btn_search">검색</button> -->
              </form>
            </div>
            <!-- .search_bar -->

            <div class="login_box">
              <button class="btn_login" type="button" onClick="javascript:popOpen();">
                로그인
              </button>

              <button class="btn_join" type="button" onClick="javascript:popOpen2();" id="btnJoin">
                회원가입
              </button>
              <a href="/mainCompany" class="btn_company">기업 서비스</a><!-- .btn_company -->
            </div>
            <!-- .login_box -->

            <nav>
              <ul>
                <li>
                  <a href="/main">채용공고</a>
                </li>
                <li>
                  <a href="/matching">매칭리스트</a>
                </li>
                <li>
                  <a href="/subscription">구독기업공고</a>
                </li>
                <li>
                  <a href="/companyList">기업정보</a>
                </li>
              </ul>
            </nav>
            <!-- nav -->
          </header>
          <!-- header -->
        </div>
        <!-- .header_wrap -->

        <div class="modal_login_bg" onClick="javascript:popClose();"></div>
        <div class="modal_login_wrap">
          <h2>로그인</h2>
          <div class="form_box">
            <form action="/login" method="post">
              <input id="username" type="text" placeholder="아이디를 입력하세요." value="${username}" />
              <input id="password" type="password" placeholder="패스워드를 입력하세요." name="password" />
            </form>
            <label class="btn_check">
              <input type="checkbox" class="login_check" id="user_remember" name="" checked />
              <span class="login_check_icon"></span>
              <span class="login_check_text">로그인 상태 유지</span>
            </label>
            <button id="btn_login" type="button" class="btn btn-primary">
              로그인
            </button>
          </div>
        </div>

        <div class="modal_join_bg" onClick="javascript:popClose2();" id="add_data_Modal"></div>
        <div class="modal_join_wrap">
          <h2>회원가입</h2>
          <div class="form_box cf">
            <input type="hidden" name="employeeId" id="employeeId" />
            <form action="/join" method="post" itemref="insert_form">
              <div class="join_left">
                <div class="join_id join_box">
                  <h3>
                    <label for="id">아이디</label>
                  </h3>
                  <span>
                    <input id="id" type="text" placeholder="아이디를 입력하세요." value="${employeeUsername}" maxlength="20" />
                  </span>
                </div>

                <div class="join_pw join_box">
                  <h3>
                    <label for="password">비밀번호</label>
                  </h3>
                  <span>
                    <input id="password" type="password" placeholder="패스워드를 입력하세요." name="password" maxlength="20" />
                  </span>
                </div>
                <div class="join_sex join_box">
                  <h3>
                    <label for="sex">성별</label>
                  </h3>
                  <span>
                    <input id="sex" type="text" placeholder="성별을 입력하세요." name="sex" maxlength="10" />
                  </span>
                </div>
                <div class="join_email join_box">
                  <h3>
                    <label for="email">이메일</label>
                  </h3>
                  <span>
                    <input id="email" type="email" placeholder="이메일을 입력하세요." name="email" maxlength="30" />
                  </span>
                </div>

                <div class="user_info">
                  <div class="join_name join_box">
                    <h3>
                      <label for="u_name">이름</label>
                    </h3>
                    <span>
                      <input id="u_name" type="text" placeholder="이름을 입력하세요." name="userName" maxlength="10" />
                    </span>
                  </div>
                  <div class="join_birth join_box">
                    <h3>
                      <label for="u_birth">생년월일</label>
                    </h3>
                    <span>
                      <input id="u_birth" type="date" placeholder="생년월일을 입력하세요." name="userBirth" maxlength="40" />
                    </span>
                  </div>
                  <div class="join_phone join_box">
                    <h3>
                      <label for="u_phone">휴대폰번호</label>
                    </h3>
                    <span>
                      <input id="u_phone" type="tel" placeholder="휴대폰번호를 입력하세요." name="userPhone" maxlength="40" />
                    </span>
                  </div>
                  <div class="join_adress join_box">
                    <h3>
                      <label for="u_adress">주소</label>
                    </h3>
                    <span>
                      <input id="u_adress" type="text" placeholder="주소를 입력하세요." name="userAdress" maxlength="100" />
                    </span>
                  </div>
                </div>
              </div>

              <div class="join_right">
                <div class="career_part">
                  <h2>관심분야</h2>
                  <div class="career_part1 part_box">
                    <input type="checkbox" class="login_check" id="c_part_front" name="" checked />
                    <em>
                      <label for="c_part_front">프론트엔드</label>
                    </em>
                  </div>
                  <div class="career_part2 part_box">
                    <input type="checkbox" class="login_check" id="c_part_back" name="" checked />
                    <em>
                      <label for="c_part_back">백엔드</label>
                    </em>
                  </div>
                  <div class="career_part3 part_box">
                    <input type="checkbox" class="login_check" id="c_part_full" name="" />
                    <em>
                      <label for="c_part_full">풀스택</label>
                    </em>
                  </div>
                  <div class="career_part4 part_box">
                    <input type="checkbox" class="login_check" id="c_part_android" name="" />
                    <em>
                      <label for="c_part_android">안드로이드</label>
                    </em>
                  </div>
                  <div class="career_part5 part_box">
                    <input type="checkbox" class="login_check" id="c_part_ios" name="" />
                    <em>
                      <label for="c_part_ios">IOS</label>
                    </em>
                  </div>
                </div>
              </div>
            </form>
            <button id="btn_join" type="button" class="btn btn-primary" onclick="joinSave()">
              회원가입
            </button>
          </div>
        </div>
      </div>





      
    </body>


    </html>