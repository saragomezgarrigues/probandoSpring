<%@include file="/resources/templates/header.jsp" %>
<fieldset>
	<legend>Formulario de registro de paises</legend>
	<form method="post">
		<label>Nombre del pa&iacute;s</label>
		<input type="text" name="nombrePais" placeholder="Escribe el nombre del pais" autofocus><br>
		<label>Continente: </label>
		<select name="contiente">
			<option value="europa">Europa</option>
			<option value="asia">Asia</option>
			<option value="africa">Africa</option>
			<option value="oceania">Oceania</option>
			<option value="america">America</option>
		</select><br>
		<input type="submit" value="Registrar Pais">
		<input type="reset" value="Limpiar Formulario">
	</form>
</fieldset>
<%@include file="/resources/templates/footer.jsp" %>