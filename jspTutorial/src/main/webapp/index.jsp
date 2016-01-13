<%@page import="java.util.*" %>

<%! String cadena="Bienvenidos a JSP"; %>
<%! Date primeracceso=new Date(); %>
<%! int contador=0; %>

<html>
<body>

<%= "la pagina ha sido accedida "+(++contador)+"veces" %>
El primer acceso fue:<%= primeracceso  %>
<jsp:include page="Hola.jsp"></jsp:include>
</body>



</html>
