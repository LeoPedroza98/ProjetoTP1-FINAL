<%@ page import ="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<body>
<center>
    <h1>
       Lista de pessoas
    </h1>

    <table>
        <tr>
            <th>
                Name
            </th>
            <th>
                email
            </th>

        </tr>
        <c:forEach var="person" items="${usuarioList}">
            <tr>
                <td>
                    <c:out value="${person.nome}" />
                </td>
                <td>
                    <c:out value="${person.email}" />
                </td>

            </tr>
        </c:forEach>
    </table>


    <a href="<%=request.getContextPath()%>/usuario/create">Adicionar pessoa</a>
</center>
</body>
</html>