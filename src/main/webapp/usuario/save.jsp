<%--
  Created by IntelliJ IDEA.
  User: Leo
  Date: 31/10/2019
  Time: 09:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Cadastro Usuario Edit</title>
    <link rel="stylesheet" href="estilo.css">
</head>
<body>
</center>
<form method="post" action="<%=request.getContextPath()%>/usuario/edit">
    Name:
    <c:out value="${usuario.name}"/>
    <input type="hidden" name="name" value="${usuario.name}">
    <br><br>
    Email:
    <input type="text" name="Email" value="${usuario.email}">
    <br><br>
    Senha:
    <input type="password" name="senha" value="${usuario.senha}">
    <br><br>
    <input type="hidden" name="typeAction" value="edit">
    <input type="submit" value="Save"/>
</form>
<br><br>
<form method="post" action="<%=request.getContextPath()%>/usuario/edit">
    <input type="hidden" name="name" value="${usuario.name}">
    <input type="hidden" name="typeAction" value="delete">
    <input type="submit" value="Delete"/>
</form>
</center>
</body>
</html>
