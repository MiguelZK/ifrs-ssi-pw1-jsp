<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page errorPage="paginaErro.jsp"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<title>Exclusão de Registro</title>
</head>
<body>
	<jsp:useBean id="programadorBean" class="classes.Programador"
		scope="request" />
	<jsp:setProperty name="programadorBean" property="idFuncionario"
		param="idFuncionario" />
	<%
	if (programadorBean.remove()) {
	%>
	<jsp:forward page="index.jsp?msg=Registro excluido com sucesso" />
	<%
	} else {
	%>
	<jsp:forward page="index.jsp?msg=Erro ao excluir registro" />
	<%
	}
	%>
</body>
</html>