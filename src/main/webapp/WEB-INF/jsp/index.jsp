<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html; charset=windows-1251" %>

<!DOCTYPE HTML>
<html>
<head>
    <meta charset="UTF-8" />
    <title>Person List</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css"/>
</head>
<body>
<h1>���������� ����</h1>

<br/><br/>
<div class="btn-group">
    <button>��������</button>
    <button>��������</button>
    <button>�������</button>
    <button>��������� ���</button>
</div>
<div>
    <table  id="myTable">
        <tr class="header">
            <th>���</th>
            <th>�������</th>
            <th>��������</th>
            <th>���� ��������</th>
            <th>���</th>
        </tr>
        <jsp:useBean id="persons" scope="request" type="java.util.List"/>
        <c:forEach items="${persons}" var ="person">
            <tr>
                <td >${person.name}</td>
                <td>${person.surname}</td>
                <td>${person.patronymic}</td>
                <td>${person.dateOfBirth}</td>
                <td>${person.inn}</td>
            </tr>
        </c:forEach>
    </table>

</div>
</body>

</html>