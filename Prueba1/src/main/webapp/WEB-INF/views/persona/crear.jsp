<%@include file="/resources/templates/header.jsp" %>
<h2>Formulario de registro de personas</h2>
<form method="post">
	<label>Nombre: </label>
	<input type="text" name="nombrePersona" placeholder="Escribe tu nombre completo" autofocus><br>
	<label>Apellidos: </label>
	<input type="text" name="apellidosPersona" placeholder="Escribe tus apellidos"><br>
	<fieldset>
		<legend>Procedencia</legend>
		<label>Nombre del pais: </label>
		<input type="text" name="nombrePais"><br>
		<label>Continente: </label>
		<select name="continente">
			<option value="europa">Europa</option>
			<option value="asia">Asia</option>
			<option value="africa">Africa</option>
			<option value="oceania">Oceania</option>
			<option value="america">America</option>
		</select>
	</fieldset><br>
	<input type="submit" value="Registrar Persona">
	<input type="submit" value="Limpiar Formulario">
</form>
<%@include file="/resources/templates/footer.jsp" %>