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
    <title>Cadastro Usuario Create</title>
    <link rel="stylesheet" href="estilo.css">
</head>
<body>
<center>
    <form method="post" action="<%=request.getContextPath()%>/usuario/create">
        Name:
        <input type="text" name="nome">
        <br><br>
        Email:
        <input type="text" name="email">
        <br><br>
        Senha:
        <input type="password" name="senha">
        <br><br>
        <input type="submit" value="Save"/>
    </form>
</center>>

</body>
</html>
