<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page errorPage="paginaErro.jsp"%>
<%@page isErrorPage="true"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<title>Erro 🤔 - algo não saiu como esperado</title>
</head>
<body>
	<h1>Sentimos muito (de verdade). Parece que algo deu errado.</h1>
	<p>Vamos colocar abaixo a descrição do erro para um dos nossos
		entender o que está havendo.</p>
	<br />
	<h2>
		Descrição do erro:
		<%=exception.getMessage()%></h2>
	<br />
	<%
	exception.printStackTrace(new java.io.PrintWriter(out));
	%>
</body>
</html>
