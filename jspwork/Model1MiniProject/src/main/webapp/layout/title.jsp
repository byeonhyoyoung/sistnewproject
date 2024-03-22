<%@page import="data.dao.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
<link href="https://fonts.googleapis.com/css2?family=Dongle&family=Gaegu&family=Nanum+Pen+Script&family=Noto+Sans+KR:wght@100..900&family=Noto+Serif+KR&display=swap" rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.7.0.js"></script>
<title>Insert title here</title>
</head>
<%
  //프로젝트 절대경로
  String root=request.getContextPath();
%>
<body>
   <!-- root변수는 사용자가 요청한 특정 웹 애플리케이션의 경로를 나타내므로 동적이다 -->
   <a href="<%=root%>" style="color: black; text-decoration: none;">
   <img alt="" src="<%=root%>/image/title.png">
   			JSP & JQuery 미니프로젝트
   </a>
   
   <!-- loginaction에서.. -->
   <div style="float: right; padding-right: 50px;">
     <%
       //로그인 세션얻기
       String loginok=(String)session.getAttribute("loginok");
       //아이디 얻기
       String myid=(String)session.getAttribute("myid");
       
       MemberDao dao=new MemberDao();
       String name=dao.getName(myid);
       
       //↓로그아웃 상태임(로그인버튼필요함)
       if(loginok==null){%>
    	   <button type="button" class="btn btn-success"
    	   style="width: 100px;"
    	   onclick="location.href='index.jsp?main=login/loginform.jsp'">Login</button> <!-- 이거 누르면 로그인창 나옴 -->
       <%}else{%>
    	   
    	   <b><%=name %>님 로그인중..</b>
    	   <button type="button" class="btn btn-danger"
    	   style="width: 100px;"
    	   onclick="location.href='login/logoutaction.jsp'">Logout</button> <!-- 가운데 띡 나타낼필요없는 아이 -->
       <%}
     %>
   </div>
</body>
</html>