<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page errorPage="paginaErro.jsp"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="ISO-8859-1">
<meta name="viewport"
	content="width=device-width, initial-scale = 1, shrink-to-fit=no">
<title>Senha Errada</title>
<link rel="stylesheet" type="text/css"
	href="bibliotecas/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css"
	href="bibliotecas/font-awesome/css/font-awesome.min.css">
<link rel="stylesheet" type="text/css" href="css/sb-admin.min.css">
</head>
<body class="bg-dark">

	<div class="container">
		<div class="card card-login mx-auto mt-5">
			<div class="card-header">Algo errado entre usuário e senha</div>
			<div class="card-body">
				<img src="https://media.giphy.com/media/puOukoEvH4uAw/giphy.gif"
					alt="Cara de estranhamento.gif"
					style="display: block; margin-left: auto; margin-right: auto;">
				<br> <a href="<c:url value='login.html' />">Tente
					novamente.</a>
			</div>
		</div>
	</div>


	<script src="bibliotecas/jquery/jquery.min.js"></script>
	<script src="bibliotecas/bootstrap/js/bootstrap.bundle.min.js"></script>
	<script src="bibliotecas/jquery-easing/jquery.easing.min.js"></script>
</body>
</html>