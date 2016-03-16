<%@include file="/resources/templates/header.jsp" %>
<fieldset>
	<legend>Formulario de registro de mascotas</legend>
	<form method="post">
		<label>Nombre de la mascota: </label>
		<input type="text" name="nombreMascota" required autofocus><br>
		<label>Tipo de mascota: </label>
		<select name="tipoMascota">
			<option value="perro">Perro</option>
			<option value="gato">Gato</option>
			<option value="canario">Canario</option>
			<option value="hamster">Hamster</option>
			<option value="chichilla">Chinchilla</option>
		</select><br>
		<label>Genero: </label>
		<label>&male;</label><input type="radio" name="generoMascota" value="&male;">
		<label>&female;</label><input type="radio" name="generoMascota" value="&female;"><br>
		<input type="submit" value="Registrar Mascota">
		<input type="reset" value="Limpiar Formulario">
	</form>

</fieldset>
<%@include file="/resources/templates/footer.jsp" %>