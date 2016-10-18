<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" session="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>

<html>
    <head>
        <title>Spittr</title>
        <link rel="stylesheet" type="text/css" href="<c:url value="/resources/style.css" />">
    </head>
    <body>
        <h1>Register</h1>
        <sf:form method="POST" commandName="spitter">
            <sf:errors path="*" element="div" cssClass="errors"/>

            <sf:label path="firstName" cssErrorClass="error">Name</sf:label>
            <sf:input path="firstName" cssErrorClass="error"/></br>

            <sf:label path="lastName" cssErrorClass="error">Surname</sf:label>
            <sf:input path="lastName" cssErrorClass="error"/></br>

            <sf:label path="email" cssErrorClass="error">E-mail</sf:label>
            <sf:input path="email" cssErrorClass="error"/></br>

            <sf:label path="userName" cssErrorClass="error">User name</sf:label>
            <sf:input path="userName" cssErrorClass="error"/></br>

            <sf:label path="password" cssErrorClass="error">Password</sf:label>
            <sf:input path="password" cssErrorClass="error"/></br>
            <input type="submit" value="Register">
        </sf:form>
    </body>
</html>