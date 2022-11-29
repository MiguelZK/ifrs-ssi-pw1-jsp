<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="classes.*"%>
<%@page import="java.util.List"%>
<%@page import="dao.*"%>
<%@page errorPage="paginaErro.jsp"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String email = request.getParameter("email");
	String senha = request.getParameter("senha");
	String msg = "";
	String imgsrc = "";
	%>

	<jsp:useBean id="userDao" class="dao.UsuarioDAO" scope="request" /><br>

	<%
	if (userDao.confirmUser(email, senha)) {
	%>

	<jsp:forward page="index.jsp"></jsp:forward>

	<%
	} else
	%>
	<jsp:forward page="senhaErrada.jsp"></jsp:forward>

</body>
</html>