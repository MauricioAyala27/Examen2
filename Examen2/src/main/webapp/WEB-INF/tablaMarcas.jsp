<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tabla Marcas</title>
</head>
<body>
	<table border="4">
		<tr style="background-color:blue; color:white;">
			<td>Nombre Marca</td>
			<td>Descripcion</td>
			<td>Pais Emsamblaje</td>
			<td>Proveedor</td>
		</tr>
<c:forEach var="marc" items="${listM}">
		<tr>
			<td>${marc.nombreMarca}</td>
			<td>${marc.descripcion}</td>
			<td>${marc.paisEmsamblaje}</td>
			<td>${marc.idProv}</td>
		</tr>
</c:forEach>	
	</table>
</body>
</html>