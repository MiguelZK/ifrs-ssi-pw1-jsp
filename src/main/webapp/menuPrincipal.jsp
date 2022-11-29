<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<title>Menu Principal</title>
</head>
<body>
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
								<th class="sorting_asc_disabled sorting_desc_disabled">Exclusão</th>
								<th class="sorting_asc_disabled sorting_desc_disabled">Edição</th>
							</tr>
						</thead>
						<tfoot>
							<tr>
								<th>Nome</th>
								<th>Endereço</th>
								<th>Exclusão</th>
								<th>Edição</th>
							</tr>
						</tfoot>
						<tbody>
					     	<c:forEach var="pessoa" items="${listaReq}">
						    	<tr>
						           <td>${pessoa.getNome()}</td>
						    	   <td>${pessoa.getEndereco()}</td>
						   	   	   <td><a href="excluirPessoa.jsp?idPessoa=${pessoa.getIdPessoa()}"> Excluir </a></td>
						   	   	   <td><a href="editPessoa.jsp?idPessoa=${pessoa.getIdPessoa()}"> Editar </a></td>
						    	</tr>
  					       </c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</div>
</body>
</html>