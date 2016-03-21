<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
int j=0;
out.println("<div align=\"center\" id=\"holaNumero\"><table  bgcolor=\"#3366FF\" border=\"2px\" >");
out.println("<tr><td>Interaccion</td><td>Numero par</td><td>Numero impar</td> </tr> ");
for(int i=0; i<=10;i++){
	j=i;
	if(i%2==0){
		out.println("<tr><td>"+j+"</td><td>"+i+"</td><td>--</td></tr>");
	}
	else{
		out.println("<tr><td>"+j+"</td><td>--</td><td>"+i+"</td></tr>");
	}

}
out.println("</div></table>");
%>
<div ></div>
</body>
</html>