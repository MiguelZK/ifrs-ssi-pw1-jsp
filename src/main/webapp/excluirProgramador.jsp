<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="programadorBean" class="classes.Programador" scope="request" />
	<jsp:setProperty name="programadorBean" property="idFuncionario" param="idFuncionario" />
	<%
	if (programadorBean.remove()) {
	%>
	<jsp:forward page="index.jsp" />
	<%
	} else {
	out.println("<br/>Erro ao excluir programador!");
	out.println("<br/><a href=listarProgs.jsp> Voltar para a lista </a>");
	}
	%>
</body>
</html>