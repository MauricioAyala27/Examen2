<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Marcas</title>
</head>
<body>
<h2><a href="listarM">Mostrar Lista de marcas</a></h2>
<h2>Marcas</h2>
	<form action="insertM" method="post">
		<table>
			<tr>
				<td>Marca:</td>
				<td><input type="text" name="nombre"></td>
			</tr>
			<tr>
				<td>Descripcion:</td>
				<td><input type="text" name="descripcion"></td>
			</tr>		
			<tr>
				<td>Pais Emsamblaje:</td>
				<td><input type="text" name="paisEmsamblaje"></td>
			</tr>		
			<tr>
				<td>Proveedor:</td>
				<td><input type="number" name="idProveedor"></td>
			</tr>
			<tr>
				<td><input type="submit" name="enviar" value="Enviar"></td>
			</tr>			
		</table>
	</form>

</body>
</html>