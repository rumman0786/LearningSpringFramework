<%--
  @author rumman
  @since 10/9/18
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" session="false" %>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
    <title>Show Form</title>
</head>
<body>
    <h1>Add New User</h1>

    <form:form method="POST" action="/spring/save" modelAttribute="authUser">
        <table >
            <tr>
                <td>Username : </td>
                <td><form:input path="username"/></td>
            </tr>
            <tr>
                <td>Address :</td>
                <td><form:input path="address"/></td>
            </tr>

            <tr>
                <td> </td>
                <td><input type="submit" value="Save" /></td>
            </tr>
        </table>
    </form:form>
</body>
</html>
