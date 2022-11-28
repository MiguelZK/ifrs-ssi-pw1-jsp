<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="classes.*"%>
<%@page import="java.util.List"%>
<%@page import="dao.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String login = request.getParameter("email");
	String senha = request.getParameter("senha");
	String msg = "";
	String imgsrc = "";
	%>

	<jsp:useBean id="userDao" class="dao.UsuarioDAO" scope="request" /><br>
	<%=userDao.findEmail(login)%>

	<%
	List<Usuario> usuarios = new UsuarioDAO().findEmail(login);
	for (Usuario u : usuarios) {
		if (u.getSenha().equals(senha)) {
	%>

	<jsp:forward page="menuPrincipal.jsp"></jsp:forward>

	<%
	} else
	/* 		msg = "Achou que essa era a senha?";
			imgsrc = "https://media.tenor.com/IbLb7hkzwpIAAAAC/choque-choque-de-cultura.gif"; */
	%>
	<jsp:forward page="senhaErrada.jsp"></jsp:forward>
	<%
	}
	%>
</body>
</html>