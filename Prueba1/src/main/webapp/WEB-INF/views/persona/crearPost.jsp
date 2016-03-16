<%@include file="/resources/templates/header.jsp" %>
<h2>Datos registrados correctamente.</h2>
<p>Nombre de la persona: ${persona.nombre}</p>
<p>Apellidos de la persona: ${persona.apellidos}</p>
<p>Pais de procedencia: ${persona.pais.nombre}</p>
<p>Continente: ${persona.pais.continente}</p>
<%@include file="/resources/templates/footer.jsp" %>