<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page errorPage="paginaErro.jsp"%>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Encerrar Sessão</title>
    </head>
    <body>    
        <%
            session.invalidate();
        %>
        <jsp:forward page = "login.html" /> 
    </body>
</html>
