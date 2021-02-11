<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page contentType="text/html; charset=windows-1251" %>

<html>
<head>
    <title>Физические лица</title>
    <link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
          rel="stylesheet">
</head>
<body>
<br>
<br>
<br>
<div class="container">
    <div>
        <a type="button" class="btn btn-primary btn-md " href="/add-individual">Добавить физическое лицо</a>
        <a type="button" class="btn btn-primary btn-md " href="/inn-request{id}">запрос ИНН</a>
    </div>
    <br>
    <div class="panel panel-primary">
        <div class="panel-heading">
            <h3>Список физических лиц</h3>
        </div>
        <div class="panel-body">
            <table class="table table-striped table-hover" id="mtable">
                <thead>
                <tr>
<%--                    <th width="0%">ID</th>--%>
                    <th width="17%">Имя</th>
                    <th width="17%">Фамилия</th>
                    <th width="17%">Отчество</th>
                    <th width="17%">Дата рождения</th>
                    <th width="15%">ИНН</th>
                    <th></th>
                </tr>
                </thead>
                <tbody>
                <jsp:useBean id="persons" scope="request" type="java.util.List"/>
                <c:forEach items="${persons}" var="person">
                    <tr>
<%--                        <td hidden >${person.id}</td>--%>
                        <td>${person.name}</td>
                        <td>${person.surname}</td>
                        <td>${person.patronymic}</td>
                        <td>${person.dateOfBirth}</td>
                        <td>${person.inn}</td>
                        <td><a type="button" class="btn btn-success"
                               href="/update-individual?id=${person.id}">Изменить</a>
                            <a type="button" class="btn btn-warning"
                               href="/delete-individual?id=${person.id}">Удалить</a></td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>

</div>
<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<script src="webjars/bootstrap-datepicker/1.0.1/js/bootstrap-datepicker.js"></script>
<script type="text/javascript">
    $('#mtable').on('click', 'tbody tr', function(event) {
        console.log(this);
    });
</script>
<%--<script>--%>
<%--    $('#targetDate').datepicker({--%>
<%--        format: 'dd/mm/yyyy'--%>
<%--    });--%>
<%--</script>--%>
<div class="footer">
</div>
</body>

</html>