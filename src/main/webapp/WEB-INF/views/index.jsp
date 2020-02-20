<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Damian
  Date: 18.02.2020
  Time: 20:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Strona główna</title>
    <link rel="stylesheet" href="/resources/style.css"/>
</head>
<body>

<form:form action="/add" modelAttribute="advertisement">

    <form:input path="company" />


</form:form>



</body>
</html>
