<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tabla Productos</title>
</head>
<body>
	<table border="4">
		<tr style="background-color:blue; color:white;">
			<td>Nombre Producto</td>
			<td>Catalogo</td>
			<td>Marca</td>
			<td>Precio</td>
			<td>Descripcion</td>
			<td>Existencia</td>
		</tr>
<c:forEach var="pro" items="${listP}">
		<tr>
			<td>${pro.nombreProducto}</td>
			<td>${pro.idCat}</td>
			<td>${pro.idMarc}</td>
			<td>${pro.precio}</td>
			<td>${pro.descripcion}</td>
			<c:choose>
				<c:when test = "${pro.existencia==1}">
					<td style="background-color:#148F77;">Si hay existencia</td>
				</c:when>
				<c:otherwise>
					<td style="background-color:#E22A18;">No hay existencia</td>
				</c:otherwise>	
			</c:choose>
			<td><a href="<c:url value='/eliminar/${pro.idProducto}' />">Eliminar</a></td>
		</tr>
</c:forEach>
	</table>
</body>
</html>