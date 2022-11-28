<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page errorPage="paginaErro.jsp" %>
<%@ page import="java.util.*"%>
<%@ page import="classes.*"%>

<!DOCTYPE html>
<html lang="pt-br">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale = 1, shrink-to-fit=no">
	<title>Página Principal</title>
	<link rel="stylesheet" type="text/css" href="bibliotecas/bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="bibliotecas/font-awesome/css/font-awesome.min.css">
	<link rel="stylesheet" type="text/css" href="bibliotecas/datatables/dataTables.bootstrap4.css">
	<link rel="stylesheet" type="text/css" href="css/sb-admin.min.css">
</head>
<body class="bg-dark fixed-nav sticky-footer" id="page-top">
	<jsp:useBean id="programadorBean" class="classes.Programador" scope="request"/>
    <%  
        List<Programador> lista=programadorBean.listAll();  
        request.setAttribute("listaReq",lista);  
    %>  
	<div class="content-wrapper">
		<div class="container-fluid">
			
			<div class="row">
				<div class="col-12">
					<h1>Pessoas Cadastradas</h1>
				</div>
			</div>
			<div class="card mb-3">
				<div class="card-header">
					<i class="fa fa-table"></i> Pessoas Cadastradas
				</div>
				<div class="card-body">
	
					<table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
						<thead>
							<tr>
								<th>Nome</th>
								<th>Endereço</th>
								<th>Email</th>
								<th>Salário</th>
								<th>CPF</th>
								<th>Linguagem</th>
								<th>Projetos</th>
								<th class="sorting_asc_disabled sorting_desc_disabled">Exclusão</th>
								<th class="sorting_asc_disabled sorting_desc_disabled">Edição</th>
							</tr>
						</thead>
						<tfoot>
							<tr>
								<th>Nome</th>
								<th>Endereço</th>
								<th>Email</th>
								<th>Salário</th>
								<th>CPF</th>
								<th>Linguagem</th>
								<th>Projetos</th>
								<th>Exclusão</th>
								<th>Edição</th>
							</tr>
						</tfoot>
						<tbody>
					     	<c:forEach var="programador" items="${listaReq}">
						    	<tr>
						           <td>${programador.getNome()}</td>
						    	   <td>${programador.getEndereco()}</td>
						    	   <td>${programador.getEmail()}</td>
						    	   <td>${programador.getSalario()}</td>
						    	   <td>${programador.getCpf()}</td>
						    	   <td>${programador.getLinguagem()}</td>
						    	   <td>${programador.getProjetos()}</td>
						   	   	   <td><a href="excluirProgramador.jsp?idProgramador=${programador.getIdPessoa()}"> Excluir </a></td>
						   	   	   <td><a href="editProgramador.jsp?idProgramador=${programador.getIdPessoa()}"> Editar </a></td>
						    	</tr>
  					       </c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</div>
		<footer class="sticky-footer">
			<div class="container">
				<div class="text-center">
					<small>Copyright Seu Site 2017</small>
				</div>
			</div>
		</footer>
	</div>
	
	<script src="bibliotecas/jquery/jquery.min.js"></script>
	<script src="bibliotecas/bootstrap/js/bootstrap.bundle.min.js"></script>
	<script src="bibliotecas/jquery-easing/jquery.easing.min.js"></script>
	<script src="bibliotecas/datatables/jquery.dataTables.js"></script>
	<script src="bibliotecas/datatables/dataTables.bootstrap4.js"></script>
	<script src="js/sb-admin.min.js" type="text/javascript"></script>
	<script src="js/sb-admin-datatables.min.js" type="text/javascript"></script>
</body>
</html>