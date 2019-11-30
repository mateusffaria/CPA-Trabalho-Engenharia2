<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Formulario</h1>
<form method="post" action="criarFormulario">
<label>Texto da questão: </label>
<input type="text" name='questao'><br>
<label>Tipo: </label>
<select name="tipoQuestao">
	<option value="1">Dissertativa</option>
	<option value="2">Likert</option>
	<option value="3">Alternativa</option>
	<option value="4">Multi-Resposta</option>
</select><br>
<label>Obrigatoriedade: </label>
<input type="checkbox" name="obrigatorio">
<button>Enviar</button>
</form>
<button>Cancelar</button>
</body>
</html>