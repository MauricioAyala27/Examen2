<html>
<body>
<h2><a href="listar">Mostrar Lista de productos</a></h2>
<h4><a href="marca">Insertar Marca</a></h4>
<h2>Productos</h2>
	<form action="insert" method="post">
		<table>
			<tr>
			<td>Producto:</td>
			<td><input type="text" name="nombre"></td>
			</tr>
			<tr>
			<td>Catalogo:</td>
			<td>
			<input type="number" name="idCatalogo"></td>
			</tr>
			<tr>
			<td>Marca:</td>
			<td><input type="number" name="idMarca"></td>
			</tr>
			<tr>
			<td>Precio:</td>
			<td><input type="number" name="precio"></td>
			</tr>
			<tr>
			<td>Descripcion:</td>
			<td><input type="text" name="descripcion"></td>
			</tr>
			<tr>
			<td colspan="2" align="center"><input type="submit" name="enviar" value="Enviar"></td>
			</tr>
		</table>
	</form>
</body>
</html>
