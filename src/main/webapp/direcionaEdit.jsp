<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="classes.Programador"%>
<%@page import="java.util.*"%>
<%@page errorPage="paginaErro.jsp"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<title>Direcionamento de Edição</title>
</head>
<body>
	<jsp:useBean id="programadorBean" class="classes.Programador"
		scope="request" />
	<jsp:setProperty name="programadorBean" property="*" />
	<%
	if (programadorBean.update()) {
	%>
	<jsp:forward page="index.jsp?msg=Registro editado com sucesso"></jsp:forward>
	<%
	} else {
	%>
	<jsp:forward page="index.jsp?msg=Erro ao editar registro"></jsp:forward>
	<%
	}
	%>
</body>
</html>