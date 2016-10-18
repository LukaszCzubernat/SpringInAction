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
            Name: <sf:input path="firstName"/><br/>
            Surname: <sf:input path="lastName"/><br/>
            E-mail: <sf:input path="email" type="email"/><br/>
            User name: <sf:input path="userName"/><br/>
            Password: <sf:password path="password"/><br/>
            <input type="submit" value="Register">
        </sf:form>
    </body>
</html>