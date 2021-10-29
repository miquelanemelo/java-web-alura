<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/novaEmpresa" var= "linkServletNovaEmpresa"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastrando Nova Empresa</title>
</head>
<body>	
	<form action="${linkServletNovaEmpresa}" method="post">
		<!-- action define a url na qual vai enviar a requisi��o do formulario
		method post manipula informa��es, get tbm manipula mas n�o � o mais indicado -->
		
		Nome: <input type= "text" name= "nome" />
		Data Abertura: <input type= "text" name= "data" />
		
		<input type = "submit"/>
	</form>
	
</body>
</html> 