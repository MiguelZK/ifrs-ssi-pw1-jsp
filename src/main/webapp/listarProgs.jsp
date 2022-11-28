<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="java.util.*"%>
<%@page import="classes.*"%>
<%@page errorPage="paginaErro.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="programadorBean" class="classes.Programador"
		scope="request" />
	<%
	List<Programador> lista = programadorBean.listAll();
	request.setAttribute("lista", lista);
	%>
	<table border="1">
		<c:forEach var="programador" items="${lista}">
			<tr>
				<td>${programador.getNome()}</td>
				<td>${programador.getEndereco()}</td>
				<td>${programador.getEmail()}</td>
				<td>${programador.getSalario()}</td>
				<td>${programador.getCpf()}</td>
				<td>${programador.getLinguagemProg()}</td>
				<td>${programador.getProjetos()}</td>
				<td><a
					href="excluirProgramador.jsp?idProgramador=${programador.getIdFuncionario()}">
						Excluir </a></td>
				<td><a
					href="editProgramador.jsp?idProgramador=${programador.getIdFuncionario()}">
						Editar </a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>