<%@page import="team.model.TeamDao"%>
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
<body>
<%
	//num
	String num=request.getParameter("num");
	
	//dao선언
	TeamDao dao=new TeamDao();
	
	//삭제 메서드 호출
	dao.deleteTeam(num);
	
	//리스트로 이동
	response.sendRedirect("teamList.jsp");
%>

</body>
</html>