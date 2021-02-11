<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page contentType="text/html; charset=windows-1251" %>

<html>
<head>
    <title>Физические лица </title>
    <link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
          rel="stylesheet">
</head>
<body>
<br>
<br>
<br>


<div class="container">
    <div class="row">
        <div class="col-md-6 col-md-offset-3 ">
            <div class="panel panel-primary">
                <div class="panel-heading">Добавить физическое лицо</div>
                <div class="panel-body">
                    <%--@elvariable id="individual" type="com.project.register.model.Individual"--%>
                    <form:form method="post" modelAttribute="individual">
                        <form:hidden path="id" />
                        <fieldset class="form-group">
                            <form:label path="name">Имя</form:label>
                            <form:input path="name" type="text" class="form-control"
                                        required="required" />
                            <form:errors path="name" cssClass="text-warning" />
                        </fieldset>
                        <fieldset class="form-group">
                            <form:label path="surname">Фамилия</form:label>
                            <form:input path="surname" type="text" class="form-control"
                                        required="required" />
                            <form:errors path="surname" cssClass="text-warning" />
                        </fieldset>
                        <fieldset class="form-group">
                            <form:label path="patronymic">Отчество</form:label>
                            <form:input path="patronymic" type="text" class="form-control"
                                        required="required" />
                            <form:errors path="patronymic" cssClass="text-warning" />
                        </fieldset>
                        <fieldset class="form-group">
                            <form:label path="dateOfBirth">Дата рождения</form:label>
                            <form:input path="dateOfBirth" type="text" class="form-control"
                                        required="required" />
                            <form:errors path="dateOfBirth" cssClass="text-warning" />
                        </fieldset>

                        <button type="submit" class="btn btn-success">Сохранить</button>
                    </form:form>
                </div>
            </div>
        </div>
    </div>
</div>

<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<script src="webjars/bootstrap-datepicker/1.0.1/js/bootstrap-datepicker.js"></script>

</body>

</html>
