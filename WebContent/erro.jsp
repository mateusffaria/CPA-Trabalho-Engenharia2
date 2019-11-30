<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script>
	function funcao(){
		<%
			//response.sendRedirect("index.jsp");
		%>
		window.location="index.jsp";
	}
</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>não salvou mano =/</h1>
<h2>Você é burro? </h2>
<h3>Tenta de novo</h3>
<button onclick="funcao()">Voltar</button>
</body>
</html>